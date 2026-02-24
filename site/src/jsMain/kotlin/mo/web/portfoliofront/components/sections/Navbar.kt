package mo.web.portfoliofront.components.sections

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.id
import com.varabyte.kobweb.silk.components.icons.fa.FaSquareUpRight
import com.varabyte.kobweb.silk.components.navigation.Link
import mo.web.portfoliofront.components.widgets.ThemeToggle
import mo.web.portfoliofront.utility.AttrClasses
import mo.web.portfoliofront.utility.Constants
import mo.web.portfoliofront.utility.ModClasses
import org.jetbrains.compose.web.dom.Nav
import org.jetbrains.compose.web.dom.Ul
import org.jetbrains.compose.web.dom.Li
import org.jetbrains.compose.web.dom.Text

@Composable
fun Navbar() {
    Nav(attrs = { classes("navbar", "fade-in-slow") } ) {
        Link(
            path = Constants.PATH_HOME,
            text = "Owen Peters",
            modifier = Modifier.ModClasses("nav-item").id("nav-name"),
        )

        Ul(Modifier.AttrClasses("nav-items-list")) {
            Li {
                Link(
                    path = Constants.PATH_ABOUT,
                    text = "/about",
                    modifier = Modifier.ModClasses("nav-item"),
                )
            }
            Li {
                Link(
                    path = Constants.PATH_PROJECTS,
                    text = "/projects",
                    modifier = Modifier.ModClasses("nav-item"),
                )
            }
            Li {
                Link(
                    path = Constants.LINK_BLOG,
                    modifier = Modifier.ModClasses("nav-item nav-blog"),
                ) {
                    Text("blog.")
                    FaSquareUpRight()
                }
            }
        }
    }
}