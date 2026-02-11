package mo.web.portfoliofront.components

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.silk.components.icons.fa.FaSquareUpRight
import com.varabyte.kobweb.silk.components.icons.fa.IconSize
import com.varabyte.kobweb.silk.components.navigation.Link
import mo.web.portfoliofront.utility.AttrClasses
import mo.web.portfoliofront.utility.ModClasses
import org.jetbrains.compose.web.dom.H3
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text

@Composable
fun SectionHeader(
    title: String,
    link: String? = null,
    linkText: String? = null
) {
    if (link != null) {
        Link(
            path = link,
            modifier = Modifier.ModClasses("section-header")
        ) {
            Text(title)
            linkText?.let { P { Text(it) } }
            FaSquareUpRight()
        }
    } else {
        H3(
            attrs = Modifier.AttrClasses("section-header")
        ) {
            Text(title)
        }
    }
}