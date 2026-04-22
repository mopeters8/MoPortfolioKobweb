package mo.web.portfoliofront.components.sections

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.attrsModifier
import com.varabyte.kobweb.compose.ui.modifiers.id
import com.varabyte.kobweb.core.rememberPageContext
import com.varabyte.kobweb.silk.components.navigation.Link
import mo.web.portfoliofront.utility.AttrClasses
import mo.web.portfoliofront.utility.CONSTANTS
import mo.web.portfoliofront.utility.ModClasses
import org.jetbrains.compose.web.dom.Nav
import org.jetbrains.compose.web.dom.Ul
import org.jetbrains.compose.web.dom.Li

@Composable
fun Navbar() {
    val pageContext = rememberPageContext()
    val currentPath = pageContext.route.path

    Nav(attrs = { classes("navbar", "fade-in-slow") } ) {
        Link(
            path = CONSTANTS.PATH_HOME,
            text = "Owen Peters",
            modifier = Modifier.ModClasses("nav-item").id("nav-name"),
        )

        Ul(Modifier.AttrClasses("nav-items-list")) {
            Li {
                val aboutClasses = if (currentPath == CONSTANTS.PATH_ABOUT) {
                    "nav-item nav-item--active"
                } else {
                    "nav-item"
                }
                Link(
                    path = CONSTANTS.PATH_ABOUT,
                    text = "/about",
                    modifier = Modifier.ModClasses(aboutClasses),
                )
            }
            Li {
                val projectClasses = if (currentPath == CONSTANTS.PATH_PROJECTS) {
                    "nav-item nav-item--active"
                } else {
                    "nav-item"
                }
                Link(
                    path = CONSTANTS.PATH_PROJECTS,
                    text = "/projects",
                    modifier = Modifier.ModClasses(projectClasses),
                )
            }
            Li {
                val blogClasses = if (currentPath == CONSTANTS.PATH_BLOG) {
                    "nav-item nav-item--active"
                } else {
                    "nav-item"
                }
                Link(
                    text = "/blog",
                    path = CONSTANTS.PATH_BLOG,
                    modifier = Modifier.attrsModifier { classes(*blogClasses.split(" ").toTypedArray()) },
                )
            }
            Li {
                val blogClasses = if (currentPath == CONSTANTS.PATH_PHOTOS) {
                    "nav-item nav-item--active"
                } else {
                    "nav-item"
                }
                Link(
                    text = "/photos",
                    path = CONSTANTS.PATH_PHOTOS,
                    modifier = Modifier.attrsModifier { classes(*blogClasses.split(" ").toTypedArray()) },
                )
            }

        }
    }
}