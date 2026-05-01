package mo.web.portfoliofront.components.layout

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.key
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.attrsModifier
import com.varabyte.kobweb.silk.components.icons.fa.FaBullseye
import com.varabyte.kobweb.silk.components.icons.fa.FaChevronDown
import com.varabyte.kobweb.silk.components.icons.fa.FaCode
import com.varabyte.kobweb.silk.components.icons.fa.FaGamepad
import com.varabyte.kobweb.silk.components.icons.fa.FaMusic
import com.varabyte.kobweb.silk.components.icons.fa.FaSquareUpRight
import com.varabyte.kobweb.silk.components.navigation.Link
import mo.web.portfoliofront.components.GameCard
import mo.web.portfoliofront.components.sections.BlogDisplay
import mo.web.portfoliofront.components.widgets.SectionLink
import mo.web.portfoliofront.infrastructure.data.BLOG_LIST
import mo.web.portfoliofront.infrastructure.data.FEATURED_GAMES
import mo.web.portfoliofront.infrastructure.data.MUSIC_LIST
import mo.web.portfoliofront.infrastructure.data.SPORTS_TEAMS_LIST
import mo.web.portfoliofront.infrastructure.models.SportsTeam
import mo.web.portfoliofront.infrastructure.models.personalBlogs
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Em
import org.jetbrains.compose.web.dom.H2
import org.jetbrains.compose.web.dom.H5
import org.jetbrains.compose.web.dom.Hr
import org.jetbrains.compose.web.dom.Img
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Section
import org.jetbrains.compose.web.dom.Span
import org.jetbrains.compose.web.dom.Text

@Composable
private fun HobbyCard(
    title: String,
    description: String,
    linkUrl: String,
    linkText: String,
    isExternal: Boolean = false,
    icon: @Composable () -> Unit
) {
    Div(attrs = { classes("hobby-card") }) {
        Div(attrs = { classes("hobby-card-icon-wrap") }) { icon() }
        H5(attrs = { classes("hobby-card-title") }) { Text(title) }
        P(attrs = { classes("hobby-card-desc-preview") }) { Text(description) }
        P(attrs = { classes("hobby-card-desc-full") }) { Text(description) }
        Link(
            path = linkUrl,
            modifier = Modifier.attrsModifier {
                classes("hobby-card-link")
                if (isExternal) {
                    attr("target", "_blank")
                    attr("rel", "noopener noreferrer")
                }
                onClick { it.stopPropagation() }
            }
        ) {
            Text(linkText)
            if (isExternal) {
                FaSquareUpRight(modifier = Modifier)
            }
        }
    }
}

@Composable
private fun TeamCard(
    team: SportsTeam,
    isSelected: Boolean,
    onClick: () -> Unit,
) {
    val gradientStyle = "background: linear-gradient(145deg, ${team.primaryColor}b3, ${team.secondaryColor}80)"

    Div(attrs = {
        classes("team-card-wrapper")
    }) {
        if (isSelected) {
            Div(attrs = { classes("team-card-arrow") }) {
                FaChevronDown(modifier = Modifier)
            }
        }
        Div(attrs = {
            if (isSelected) classes("team-card", "team-card--selected")
            else classes("team-card")
            attr("style", gradientStyle)
            onClick { onClick() }
        }) {
            team.secondImage?.let { src ->
                Img(
                    src = src,
                    alt = "${team.name} personal photo",
                    attrs = { classes("team-card-secondary-img") }
                )
            }
            Img(
                src = team.logoPath,
                alt = "${team.name} logo",
                attrs = { classes("team-card-logo") }
            )
            Div(attrs = { classes("team-card-meta") }) {
                P(attrs = { classes("team-card-name") }) { Text(team.name) }
                P(attrs = { classes("team-card-sport") }) { Text(team.sport) }
            }
        }
    }
}

@Composable
fun AboutPersonalView(
    isTransitioning: Boolean
) {
    val fadeClass = if (isTransitioning) "u-fade u-fade--hidden" else "u-fade"
    val fadeList = fadeClass.split(" ").toTypedArray()

    var selectedTeam by remember { mutableStateOf(SPORTS_TEAMS_LIST.first()) }

    Section(attrs = { classes(*fadeList, "about-intro-paragraph") }) {
        P(attrs = { classes("about-paragraph") }) {
            Text("Halo 2 - Very first game my dad showed me and the first piece of tech that really clicked. That moment sparked a curiosity that has stuck with me ever since, leading me into gaming, PCs, and eventually development. A lot of my interest in technology goes back to that early question of")
            Em { Text(" 'what more is there?'.") }
        }
        P(attrs = { classes("about-paragraph") }) {
            Text("Take a look at my current interests and what I enjoy. It's a snapshot of how I think, what I care about, and the kind of teammate I am.")
        }
    }

    Section(attrs = { classes(*fadeList, "about-interests-section", "sec-pad") }) {
        H2({
            id("hobbies")
            classes("section-header")
        }) {
            Text("Current Hobbies")
        }
        Hr()

        Div(attrs = { classes("hobby-cards-row") }) {
            HobbyCard(
                title = "Random Sites",
                description = "Developers get too many ideas with too little time. I try to implement quick, fun ideas and you can check them out here!",
                linkUrl = "/projects",
                linkText = "View Projects"
            ) {
                FaCode(modifier = Modifier)
            }
            HobbyCard(
                title = "Disc Golf",
                description = "A relaxing but still competitive sport that balances personal improvement and competition. Check out our club website!",
                linkUrl = "https://fdcdisc.golf",
                linkText = "fdcdisc.golf",
                isExternal = true
            ) {
                FaBullseye(modifier = Modifier)
            }
            HobbyCard(
                title = "Gaming",
                description = "PC, console, card games, servers — I am game for all of it. Avid PC enthusiast with a PC building side hustle. Check out my favorites!",
                linkUrl = "#games",
                linkText = "Favorite Games"
            ) {
                FaGamepad(modifier = Modifier)
            }
            HobbyCard(
                title = "Music",
                description = "Loving music more than ever. In the car, through headphones, or at events! Bigger shows, better crowds, same great friends!",
                linkUrl = "#music",
                linkText = "Favorite Music"
            ) {
                FaMusic(modifier = Modifier)
            }
        }
    }

    Section(attrs = { classes(*fadeList, "about-blog-section", "sec-pad") }) {
        H2({
            id("blog")
            classes("section-header")
        }) {
            Text("Blog")
        }
        Hr()

        BlogDisplay(blogList = BLOG_LIST.personalBlogs())

        SectionLink(
            path = "/blog",
            text = "View more write ups",
            hoverText = "/blogs"
        )
    }

    Section(attrs = { classes(*fadeList, "about-teams-section", "sec-pad") }) {
        H2({
            id("teams")
            classes("section-header")
        }) {
            Text("Favorite Sports Teams")
        }
        Hr()

        Div(attrs = { classes("team-cards-row") }) {
            SPORTS_TEAMS_LIST.forEach { team ->
                val isSelected = selectedTeam.name == team.name
                TeamCard(
                    team = team,
                    isSelected = isSelected,
                    onClick = { selectedTeam = team }
                )
            }
        }

        Div(attrs = { classes("team-description-panel") }) {
            key(selectedTeam.name) {
                P(attrs = { classes("team-description-text") }) {
                    Text(selectedTeam.description)
                }
            }
        }
    }

    Section(attrs = { classes(*fadeList, "about-games-section", "sec-pad") }) {
        H2({
            id("games")
            classes("section-header")
        }) {
            Text("Favorite Games")
        }
        Hr()

        Div(attrs = { classes("game-cards-row") }) {
            FEATURED_GAMES.forEach { game -> GameCard(game) }
        }

        SectionLink(
            path = "/games",
            text = "View all games",
            hoverText = "/games"
        )
    }

    Section(attrs = { classes(*fadeList, "about-music-section", "sec-pad") }) {
        H2({
            id("music")
            classes("section-header")
        }) {
            Text("Favorite Music")
        }
        Hr()

        Div(attrs = { classes("music-embeds-list") }) {
            MUSIC_LIST.forEach { embed ->
                Div(attrs = { classes("music-embed-item") }) {
                    Div(attrs = { classes("music-embed-label") }) {
                        Span(attrs = { classes("music-embed-title") }) { Text(embed.title) }
                        Span(attrs = { classes("music-embed-artist") }) { Text(embed.artist) }
                    }
                    Div(attrs = {
                        classes("music-embed-wrapper")
                        ref { el ->
                            el.innerHTML = embed.iframeCode
                            onDispose { el.innerHTML = "" }
                        }
                    })
                }
            }
        }
    }
}
