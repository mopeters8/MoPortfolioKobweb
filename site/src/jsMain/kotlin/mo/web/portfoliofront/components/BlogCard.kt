package mo.web.portfoliofront.components

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.silk.components.icons.fa.FaSquareUpRight
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.components.text.SpanText
import mo.web.portfoliofront.infrastructure.models.Blog
import mo.web.portfoliofront.utility.AttrClasses
import mo.web.portfoliofront.utility.ModClasses
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.H5
import org.jetbrains.compose.web.dom.Img
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text

@Composable
fun BlogCard(
    blog: Blog
) {
    Div(Modifier.AttrClasses("blog-card subtle")) {
        // Only show image if available
        blog.imageUrl?.let {
            Img(
                src = it,
                alt = "${blog.title} image"
            )
        }

        H5() { Text(blog.title) }

        SpanText(
            text = blog.date,
            modifier = Modifier.ModClasses("subtle")
        )

        P() { Text(blog.description) }

        // Only show link if available
        blog.link?.let {
            Link(
                path = it.url,
                modifier = Modifier.ModClasses("subtle")
            ) {
                Text(it.presentation)
                FaSquareUpRight(modifier = Modifier)
            }
        }
    }
}