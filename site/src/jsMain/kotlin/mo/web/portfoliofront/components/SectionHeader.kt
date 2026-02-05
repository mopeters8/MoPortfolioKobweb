package mo.web.portfoliofront.components

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.silk.components.navigation.Link
import mo.web.portfoliofront.utility.AttrClasses
import mo.web.portfoliofront.utility.ModClasses
import org.jetbrains.compose.web.dom.H3
import org.jetbrains.compose.web.dom.Text

@Composable
fun SectionHeader(
    title: String,
    link: String? = null
) {
    if (link != null) {
        Link(
            path = link,
            text = title,
            modifier = Modifier.ModClasses("section-header")
        )
    } else {
        H3(
            attrs = Modifier.AttrClasses("section-header")
        ) {
            Text(title)
        }
    }
}