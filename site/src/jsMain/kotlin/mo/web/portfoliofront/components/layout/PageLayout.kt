package mo.web.portfoliofront.components.layout

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.ColumnScope
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.gridRow
import com.varabyte.kobweb.compose.ui.modifiers.gridTemplateRows
import com.varabyte.kobweb.compose.ui.modifiers.minHeight
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.core.PageContext
import com.varabyte.kobweb.core.data.getValue
import com.varabyte.kobweb.core.layout.Layout
import kotlinx.browser.document
import mo.web.portfoliofront.components.sections.Navbar
import mo.web.portfoliofront.components.sections.FooterSection
import mo.web.portfoliofront.utility.AttrClasses
import mo.web.portfoliofront.utility.ModClasses
import org.jetbrains.compose.web.css.LineStyle
import org.jetbrains.compose.web.css.fr
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.vh
import org.jetbrains.compose.web.dom.Div

class PageLayoutData(
    val title: String
)

@Composable
@Layout
fun PageLayout(
    ctx: PageContext,
    content: @Composable ColumnScope.() -> Unit
) {
    val data = ctx.data.getValue<PageLayoutData>()
    LaunchedEffect(data.title) {
        document.title = data.title
    }

    Box(
        Modifier
            .fillMaxWidth()
            .minHeight(100.vh)
            .gridTemplateRows {
                size(1.fr);
                size(minContent)
            },
        contentAlignment = Alignment.Center
    ) {
        Column(
            Modifier.gridRow(1).ModClasses("capped-width").height(100.percent),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Navbar()
            Div(Modifier.classNames("pageContentStyle").toAttrs()) {
                content()
            }
            FooterSection()
        }
    }
}
