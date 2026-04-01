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
        P {
            Text("THIS ABOUT ME NOW")
        }
    }

}
