package mo.web.portfoliofront.components

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.silk.components.icons.fa.FaSquareUpRight
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.components.text.SpanText
import mo.web.portfoliofront.infrastructure.models.Project
import mo.web.portfoliofront.utility.AttrClasses
import mo.web.portfoliofront.utility.ModClasses
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.H5
import org.jetbrains.compose.web.dom.Img
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text

@Composable
fun ProjectCard(
    proj: Project
) {
    Div(Modifier.AttrClasses("project-card subtle")) {
        Img(
            src = proj.imageURLs[0].src,
            alt = proj.imageURLs[0].alt
        )

        H5() { Text(proj.title) }

        SpanText(
            text = proj.date,
            modifier = Modifier.ModClasses("subtle")
        )

        P() { Text(proj.description) }

        Link(
            path = proj.linkInfo.url,
            modifier = Modifier.ModClasses("subtle")
        ) {
            Text(proj.linkInfo.presentation)
            FaSquareUpRight(modifier = Modifier)
        }
    }
}