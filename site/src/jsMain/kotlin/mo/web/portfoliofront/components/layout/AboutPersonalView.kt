package mo.web.portfoliofront.components.layout

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.ColumnScope
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.silk.components.text.SpanText
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.H1
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Section
import org.jetbrains.compose.web.dom.Text

@Composable
fun AboutPersonalView(
    content: @Composable () -> Unit
) {
//    Section(attrs = { classes("about-hero") }) {
//        Div(attrs = { classes("about-hero-content") }) {
//        }
//
//    }

    SpanText("Take a look at my interests and hobbies.")
    // TODO: add interests, hobbies, and personal sections
}
