package mo.web.portfoliofront.components.layout

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.dom.Br
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.H1
import org.jetbrains.compose.web.dom.H2
import org.jetbrains.compose.web.dom.Img
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Section
import org.jetbrains.compose.web.dom.Text

@Composable
fun AboutProfessionalView() {
    Section(attrs = { classes("hero") }) {
        Div(attrs = { classes("hero-content") }) {
            H1 {
                Text("Driven By Curiosity, Courage and Code")
            }
            P {
                Text("Take a look at my track record and my aspirations for the future.")
            }
        }
    }

    // TODO: add interests, hobbies, and personal sections
}
