package mo.web.portfoliofront.components

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.style.KobwebComposeStyleSheet.attr
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.attrsModifier
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.components.text.SpanText
import mo.web.portfoliofront.infrastructure.models.Blog
import mo.web.portfoliofront.utility.AttrClasses
import mo.web.portfoliofront.utility.ModClasses
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.H4
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Span
import org.jetbrains.compose.web.dom.Text

@Composable
fun BlogRow(
    blog: Blog
) {
    Link(
        path = blog.url,
        modifier = Modifier.attrsModifier {
            classes("blog-row-link")
            attr("target", "_blank") // Open in new tab
        },
    ) {
        Div(Modifier.AttrClasses("blog-row")) {
            // Read time on the left
            Div(attrs = { classes("blog-readtime") }) {
                Span { Text(blog.readtime.toString()) }
                P { Text("min.") }
            }

            // Title and subtitle in the middle
            Div(Modifier.AttrClasses("blog-content")) {
                H4(Modifier.AttrClasses("blog-title")) {
                    Text(blog.title)
                }
                SpanText(
                    text = blog.subtitle,
                    modifier = Modifier.ModClasses("blog-subtitle subtle")
                )
            }

            // Date on the far right
            SpanText(
                text = blog.created,
                modifier = Modifier.ModClasses("blog-date subtle")
            )
        }
    }
}