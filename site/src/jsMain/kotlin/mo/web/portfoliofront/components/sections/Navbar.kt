package mo.web.portfoliofront.components.sections

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.id
import com.varabyte.kobweb.silk.components.navigation.Link
import mo.web.portfoliofront.utility.AttrClasses
import mo.web.portfoliofront.utility.Constants
import mo.web.portfoliofront.utility.ModClasses
import org.jetbrains.compose.web.dom.Nav
import org.jetbrains.compose.web.dom.Ul

@Composable
fun Navbar() {
    Nav(Modifier.AttrClasses("navbar")) {
        Link(
            path = Constants.PATH_HOME,
            text = "Owen Peters",
            modifier = Modifier.ModClasses("nav-item").id("nav-name"),
        )

        Ul(Modifier.AttrClasses("nav-items-list")) {
            Link(
                path = Constants.PATH_ABOUT,
                text = "About",
                modifier = Modifier.ModClasses("nav-item"),
            )
            Link(
                path = Constants.PATH_PROJECTS,
                text = "Projects",
                modifier = Modifier.ModClasses("nav-item"),
            )
            Link(
                path = Constants.LINK_BLOG,
                text = "Blog",
                modifier = Modifier.ModClasses("nav-item"),
            )
        }
    }
}