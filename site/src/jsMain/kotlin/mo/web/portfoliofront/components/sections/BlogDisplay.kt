package mo.web.portfoliofront.components.sections

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.ui.Modifier
import mo.web.portfoliofront.components.BlogCard
import mo.web.portfoliofront.infrastructure.models.Blog
import mo.web.portfoliofront.utility.AttrClasses
import org.jetbrains.compose.web.dom.Div

@Composable
fun BlogDisplay(
    blogList: List<Blog>
) {
    Div(Modifier.AttrClasses("blog-container")) {
        blogList.forEach { blog ->
            BlogCard(blog = blog)
        }
    }
}