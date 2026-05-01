package mo.web.portfoliofront.components.sections

import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.id
import com.varabyte.kobweb.core.rememberPageContext
import com.varabyte.kobweb.silk.components.navigation.Link
import kotlinx.browser.document
import mo.web.portfoliofront.utility.AttrClasses
import mo.web.portfoliofront.utility.CONSTANTS
import mo.web.portfoliofront.utility.ModClasses
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Li
import org.jetbrains.compose.web.dom.Nav
import org.jetbrains.compose.web.dom.Span
import org.jetbrains.compose.web.dom.Text
import org.jetbrains.compose.web.dom.Ul
import org.w3c.dom.events.Event

@Composable
fun Navbar() {
    val pageContext = rememberPageContext()
    val currentPath = pageContext.route.path
    var dropdownOpen by remember { mutableStateOf(false) }

    DisposableEffect(Unit) {
        val handler: (Event) -> Unit = { dropdownOpen = false }
        document.addEventListener("click", handler)
        onDispose { document.removeEventListener("click", handler) }
    }

    Nav(attrs = { classes("navbar", "fade-in-slow") }) {
        Link(
            path = CONSTANTS.PATH_HOME,
            text = "Owen Peters",
            modifier = Modifier.ModClasses("nav-item").id("nav-name"),
        )

        Ul(Modifier.AttrClasses("nav-items-list")) {
            Li {
                val aboutClasses = if (currentPath == CONSTANTS.PATH_ABOUT) "nav-item nav-item--active" else "nav-item"
                Link(
                    path = CONSTANTS.PATH_ABOUT,
                    text = "/about",
                    modifier = Modifier.ModClasses(aboutClasses),
                )
            }
            Li {
                val projectClasses = if (currentPath == CONSTANTS.PATH_PROJECTS) "nav-item nav-item--active" else "nav-item"
                Link(
                    path = CONSTANTS.PATH_PROJECTS,
                    text = "/projects",
                    modifier = Modifier.ModClasses(projectClasses),
                )
            }
            Li {
                val blogClasses = if (currentPath.startsWith(CONSTANTS.PATH_BLOG)) "nav-item nav-item--active" else "nav-item"
                Link(
                    text = "/blog",
                    path = CONSTANTS.PATH_BLOG,
                    modifier = Modifier.ModClasses(blogClasses),
                )
            }
            Li {
                val moreActive = currentPath == CONSTANTS.PATH_PHOTOS || currentPath == CONSTANTS.PATH_GAMES
                NavDropdown(
                    label = "~/more",
                    items = listOf(
                        NavDropdownItem("/photos", CONSTANTS.PATH_PHOTOS),
                        NavDropdownItem("/games", CONSTANTS.PATH_GAMES),
                    ),
                    isActive = moreActive,
                    isOpen = dropdownOpen,
                    onToggle = { dropdownOpen = !dropdownOpen },
                    onClose = { dropdownOpen = false },
                )
            }
        }
    }
}

data class NavDropdownItem(val label: String, val path: String)

@Composable
fun NavDropdown(
    label: String,
    items: List<NavDropdownItem>,
    isActive: Boolean = false,
    isOpen: Boolean,
    onToggle: () -> Unit,
    onClose: () -> Unit,
) {
    Div(attrs = {
        classes("nav-dropdown")
        onClick { it.stopPropagation() }
    }) {
        Span(attrs = {
            classes("nav-item", "nav-dropdown-trigger")
            if (isActive) classes("nav-item--active")
            onClick { onToggle() }
        }) {
            Text(label)
        }
        Ul(attrs = {
            classes("nav-dropdown-menu")
            if (isOpen) classes("nav-dropdown-menu--open")
        }) {
            items.forEach { item ->
                Li {
                    Link(
                        path = item.path,
                        text = item.label,
                        modifier = Modifier.ModClasses("nav-dropdown-item"),
                    )
                }
            }
        }
    }
}
