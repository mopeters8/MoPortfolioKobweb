package mo.web.portfoliofront.components.layout

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.core.layout.Layout
import kotlinx.browser.document
import mo.web.portfoliofront.components.sections.FooterSection
import mo.web.portfoliofront.components.sections.Navbar
import mo.web.portfoliofront.utility.ModClasses
import org.jetbrains.compose.web.css.fr
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.vh
import org.jetbrains.compose.web.dom.Article
import org.jetbrains.compose.web.dom.Div

@Composable
@Layout
fun MarkdownLayout(content: @Composable () -> Unit) {
    LaunchedEffect(Unit) {
        document.title = "Owen Peters - Blog"
    }

    Box(
        Modifier
            .fillMaxWidth()
            .minHeight(100.vh)
            .gridTemplateRows { size(1.fr); size(minContent) },
        contentAlignment = Alignment.Center
    ) {
        Column(
            Modifier.gridRow(1).ModClasses("capped-width").height(100.percent),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Navbar()
            Div(Modifier.classNames("pageContentStyle").toAttrs()) {
                Article(attrs = { classes("markdown-content") }) {
                    content()
                }
            }
            FooterSection()
        }
    }
}
