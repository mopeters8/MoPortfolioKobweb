package mo.web.portfoliofront.components

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.silk.components.icons.fa.FaStar
import com.varabyte.kobweb.silk.components.icons.fa.FaSquareUpRight
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.components.text.SpanText
import mo.web.portfoliofront.infrastructure.models.Project
import mo.web.portfoliofront.utility.ModClasses
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.H5
import org.jetbrains.compose.web.dom.Img
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text

@Composable
fun ProjectCardFeatured(
    project: Project,
    onProjectClick: (Project) -> Unit,
) {
    Div(attrs = {
        classes("project-featured")
        onClick { onProjectClick(project) }
    }) {
        // Left side - content
        Div(attrs = {
            classes("project-featured-content")
        }) {
            // Featured badge
            Div(attrs = {
                classes("featured-badge")
            }) {
                FaStar(modifier = Modifier)
                SpanText(text = "Featured Project")
            }

            H5 { Text(project.title) }

            SpanText(
                text = project.date,
                modifier = Modifier.ModClasses("subtle")
            )

            P() { Text(project.description) }

            Link(
                path = project.linkInfo.url,
                modifier = Modifier.ModClasses("subtle")
            ) {
                Text(project.linkInfo.presentation)
                FaSquareUpRight(modifier = Modifier)
            }
        }

        // Right side - image
        Div(attrs = {
            classes("project-featured-image")
        }) {
            Img(
                src = project.imageURLs[0].src,
                alt = project.imageURLs[0].alt
            )
        }
    }
}

