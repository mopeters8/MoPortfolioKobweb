package mo.web.portfoliofront.components.layout

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.attrsModifier
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.silk.components.icons.fa.FaBriefcase
import com.varabyte.kobweb.silk.components.icons.fa.FaLocationDot
import com.varabyte.kobweb.silk.components.icons.fa.IconSize
import mo.web.portfoliofront.components.SectionHeader
import mo.web.portfoliofront.components.sections.ContactResume
import mo.web.portfoliofront.components.widgets.BridgeAscii
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.H2
import org.jetbrains.compose.web.dom.Hr
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Section
import org.jetbrains.compose.web.dom.Text

@Composable
fun AboutProfessionalView(
    isTransitioning: Boolean
) {
    val fadeClass = if (isTransitioning) "u-fade u-fade--hidden" else "u-fade"
    val fadeList = fadeClass.split(" ").toTypedArray()

    Section(attrs = { classes(*fadeList, "about-intro-paragraph") }) {
        P(attrs = { classes("about-paragraph") }) {
            Text("I’m a full-stack web developer who enjoys building practical, reliable, and efficient websites and webapps. ")
        }
        P(attrs = { classes("about-paragraph") }) {
            Text("Before going full-time into web development, I taught, worked customer service, and was pursuing my education. My experiences helped me develop strong a problem solving, communicative, and technical troubleshooting mindset.")
        }
        P(attrs = { classes("about-paragraph") }) {
            Text("Humbly, I know I am not the best at this craft but with my hopeful attitude, relentless work ethic, and desire to never stop learning I know I can be an asset to any team that values growth and improvement")
        }
    }

    Section(attrs = { classes(*fadeList, "about-location-section", "sec-pad") }) {

        Div(attrs = { classes("about-location-header")}) {
            Div(attrs =  { classes("about-ascii-art") }) {
                BridgeAscii()
            }

            P({ classes("about-subtitle") }) {
                Text("Based In ")
                FaLocationDot(modifier = Modifier.margin(left = 2.px), size = IconSize.XS)
            }
            H2({ classes("about-title") }) {
                Text("San Francisco, California")
            }

            P(attrs = { classes("about-paragraph") }) {
                Text("I grew up admiring San Francisco. The ocean side peninsula with rolling hills and bridges connecting worlds together. ")

            }

            P(attrs = { classes("about-paragraph") }) {
                Text("I knew one day I would aspire to create a story here - and here I am. The city has been great to me and blessed me with many opportunities and memories. ")
            }

            P(attrs = { classes("about-paragraph") }) {
                Text("Here are some of those key events: ")
            }
        }
    }


    Section(attrs = { classes(*fadeList, "about-events-section", "sec-pad") }) {
        H2({ classes("section-header") }) {
            Text("Key Events and Opportunities")
        }
        Hr()


    }

    Section(attrs = { classes(*fadeList, "about-events-section", "sec-pad") }) {
        H2({ classes("section-header") }) {
            Text("Technical Skills")
        }
        Hr()


    }

    Section(attrs = { classes("contact-section", "content-section", "sec-pad") }) {
        SectionHeader(title = "Contact & Resume")
        Hr()

        ContactResume()
    }



    // TODO: add interests, hobbies, and personal sections
}
