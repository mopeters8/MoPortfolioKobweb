package mo.web.portfoliofront.components.layout

import androidx.compose.runtime.Composable
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
        P {
            Text("Coding and web dev fell into my lap at a young age. Through various school programs, I was given an early look int the core building blocks: HTML and CSS. Of course, nothing of real value was built but the combination of creativity freedom and the idea of contributing to the web that we interact with everyday staid logged into me.")
            Text("Through my experiences obtaining my Bachelors, past jobs, and side projects I have developed a solid mindset of constant forward movement, troubleshooting and unyielding curiosity.")
            Text("Humbly, I know I am not the best at this craft but with my hopeful attitude, relentless work ethic, and desire to never stop learning I know I can be an asset to any team that values growth and improvement")
        }
    }


    // TODO: add interests, hobbies, and personal sections
}
