package mo.web.portfoliofront.components.widgets

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.attrsModifier
import com.varabyte.kobweb.silk.components.navigation.Link
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Span
import org.jetbrains.compose.web.dom.Text

@Composable
fun SectionLink(
    path: String,
    text: String,
    hoverText: String? = null
) {
    Div(attrs = { classes("section-link-row") }) {
        Link(
            path = path,
            modifier = Modifier.attrsModifier {
                classes("cta-link-blogs")
                if (hoverText != null) classes("cta-link-swap")
            }
        ) {
            if (hoverText != null) {
                Span(attrs = { classes("cta-link-text-swap") }) {
                    Span(attrs = { classes("cta-link-text") }) {
                        Text(text)
                    }
                    Span(attrs = { classes("cta-link-text-hover") }) {
                        Text(hoverText)
                    }
                }
            } else {
                Span(attrs = { classes("cta-link-text") }) {
                    Text(text)
                }
            }
        }
    }
}
