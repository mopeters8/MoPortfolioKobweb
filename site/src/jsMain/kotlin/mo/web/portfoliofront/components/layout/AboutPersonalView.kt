package mo.web.portfoliofront.components.layout

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.attrsModifier
import com.varabyte.kobweb.silk.components.icons.fa.FaBullseye
import com.varabyte.kobweb.silk.components.icons.fa.FaCode
import com.varabyte.kobweb.silk.components.icons.fa.FaGamepad
import com.varabyte.kobweb.silk.components.icons.fa.FaMusic
import com.varabyte.kobweb.silk.components.icons.fa.FaSquareUpRight
import com.varabyte.kobweb.silk.components.navigation.Link
import org.jetbrains.compose.web.dom.A
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.H2
import org.jetbrains.compose.web.dom.H5
import org.jetbrains.compose.web.dom.Hr
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Section
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
fun AboutPersonalView(
    isTransitioning: Boolean
) {
    val fadeClass = if (isTransitioning) "u-fade u-fade--hidden" else "u-fade"
    val fadeList = fadeClass.split(" ").toTypedArray()

    Section(attrs = { classes(*fadeList, "about-intro-paragraph") }) {
        P(attrs = { classes("about-paragraph") }) {
            Text("My Dad's original Xbox is what set me down this path of development, gaming and PC's. All my love for technology can be traced back to Halo 2.")
        }
        P(attrs = { classes("about-paragraph") }) {
            Text("Take a look at my current interests and joys. Here you'll see how I can be a great teammate, coworker and friend.")
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
                linkUrl = "#gaming",
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
            id("hobbies")
            classes("section-header")
        }) {
            Text("Blog")
        }
        Hr()

        /*
            Design: Like other Blog Section

            - Why I keep changing Blogs
            - Disc Golf: How its affected me
            -
         */
    }

    Section(attrs = { classes(*fadeList, "about-teams-section", "sec-pad") }) {
        H2({
            id("hobbies")
            classes("section-header")
        }) {
            Text("Favorite Sports Teams")
        }
        Hr()

        /*
            Design:

            - Raiders
            - Warriors
            - MLS: Earthquakes
            - Premiere League: Liverpool
            - Gaming: Optic Gaming
            - Disc Golf: Gannon Buhr
         */
    }

    Section(attrs = { classes(*fadeList, "about-games-section", "sec-pad") }) {
        H2({
            id("games")
            classes("section-header")
        }) {
            Text("Favorite Games")
        }
        Hr()
        /*
            Design: https://dribbble.com/shots/24913252-Melissa-Travel-Portal

            My Top favorites:
            - Halo, Call of Duty, Minecraft, Team Fortress 2
            - Here to Slay

            Then I want a page thats full of cards of games that I have played, my personal rating.
            - Way to rank and view them.
            - Add Notes for each one.
         */
    }

    Section(attrs = { classes(*fadeList, "about-music-section", "sec-pad") }) {
        H2({
            id("music")
            classes("section-header")
        }) {
            Text("Favorite Music")
        }
        Hr()

        /*
            Genres: Reggae, EDM (Bass/Techno/House), HipHop, Old
            Few Songs: Pick them out

            Spotify embed links
         */
    }



}
