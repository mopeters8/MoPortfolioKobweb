package mo.web.portfoliofront.pages

import androidx.compose.runtime.*
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.core.data.add
import com.varabyte.kobweb.core.init.InitRoute
import com.varabyte.kobweb.core.init.InitRouteContext
import com.varabyte.kobweb.core.layout.Layout
import mo.web.portfoliofront.components.layout.PageLayoutData
import mo.web.portfoliofront.components.sections.BlogDisplay
import mo.web.portfoliofront.infrastructure.models.BlogType
import mo.web.portfoliofront.infrastructure.data.BLOG_LIST
import mo.web.portfoliofront.infrastructure.models.sortedByNewest
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.H1
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Section
import org.jetbrains.compose.web.dom.Text

@InitRoute
fun initBlogPage(ctx: InitRouteContext) {
    ctx.data.add(PageLayoutData(title = "Owen Peters - Blogs"))
}

@Page
@Layout(".components.layout.PageLayout")
@Composable
fun BlogPage() {
    var activeFilter by remember { mutableStateOf<BlogType?>(null) }

    val allBlogs = BLOG_LIST.sortedByNewest()
    val filteredBlogs = if (activeFilter == null) allBlogs
    else allBlogs.filter { it.blogType == activeFilter }

    Section(attrs = { classes("blogs-hero") }) {
        H1 { Text("Blogs") }
        P(attrs = { classes("blogs-hero-desc") }) {
            Text("Writing about the things I find interesting in my life and virtually.")
        }
    }

    Section(attrs = { classes("content-section", "fade-in-slow") }) {
        Div(attrs = { classes("blog-filter-tabs") }) {
            Div(attrs = {
                classes("blog-type-chip")
                if (activeFilter == null) classes("active")
                onClick { activeFilter = null }
            }) { Text("All") }

            BlogType.entries.forEach { type ->
                Div(attrs = {
                    classes("blog-type-chip")
                    if (activeFilter == type) classes("active")
                    onClick { activeFilter = if (activeFilter == type) null else type }
                }) {
                    Text(type.name)
                }
            }
        }

        BlogDisplay(blogList = filteredBlogs)
    }
}
