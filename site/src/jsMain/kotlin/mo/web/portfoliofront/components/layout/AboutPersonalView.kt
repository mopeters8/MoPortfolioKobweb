package mo.web.portfoliofront.components.layout

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.H1
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Section
import org.jetbrains.compose.web.dom.Text

@Composable
fun AboutPersonalView() {
    Section(attrs = { classes("hero") }) {
        Div(attrs = { classes("hero-content") }) {
            H1 {
                Text("Outside the editor.")
            }
            P {
                // TODO: write your personal intro — hobbies, interests, personality
                Text("There's more to me than pull requests. Here's a bit of who I actually am.")
            }
        }
    }

    // TODO: add interests, hobbies, and personal sections
}
