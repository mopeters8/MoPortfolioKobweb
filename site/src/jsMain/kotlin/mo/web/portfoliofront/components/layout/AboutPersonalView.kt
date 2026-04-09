package mo.web.portfoliofront.components.layout

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Section
import org.jetbrains.compose.web.dom.Text

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
        // TODO: Current Interests
        /*
            Design: https://dribbble.com/shots/24913252-Melissa-Travel-Portal

            - Developing Random Sites: Developers get too many ideas, with too little time. I try to implement quick and fast ideas that you can also checkout in my /projects.
            - Disc Golf: Relaxing yet competitive game that has a solid balance of personal improvement and competition with friends. I have spent countless hours (and $$$ on discs)
            - Gaming: Gaming of all kinds, PC, console, card/board game - I am game! I am avid PC enthusiast and have a PC building side hustle (site coming...)
            - Music: My Spotify is filled with a random assortment of genres. Lately, I have been enjoying EDM in a renaissance sense for my personally. With it getting bigger, and a lot of friends with same interest I have been going to more shows!
         */
    }

    Section(attrs = { classes(*fadeList, "about-blog-section", "sec-pad") }) {
        // TODO: Link to Blog Section - link a few personal for fun blogs.
        /*
            Design: Like other Blog Section

            - Why I keep changing Blogs
            - Disc Golf: How its affected me
            -
         */
    }

    Section(attrs = { classes(*fadeList, "about-teams-section", "sec-pad") }) {
        // TODO: Favorite Sports Teams
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

    Section(attrs = { classes(*fadeList, "about-music-section", "sec-pad") }) {
        // TODO: Favorite Music
        /*
            Genres: Reggae, EDM (Bass/Techno/House), HipHop, Old
            Few Songs: Pick them out

            Spotify embed links
         */
    }

    Section(attrs = { classes(*fadeList, "about-games-section", "sec-pad") }) {
        // TODO: Favorite Games
        /*
            Design: https://dribbble.com/shots/24913252-Melissa-Travel-Portal

            My Top favorites:
            - Halo, Call of Duty, Minecraft, Team Fortress 2

            Then I want a page thats full of cards of games that I have played, my personal rating.
            - Way to rank and view them.
            - Add Notes for each one.
         */
    }

}
