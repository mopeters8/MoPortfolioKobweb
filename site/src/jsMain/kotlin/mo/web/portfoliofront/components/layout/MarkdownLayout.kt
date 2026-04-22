package mo.web.portfoliofront.components.layout

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.attrsModifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.core.layout.Layout
import com.varabyte.kobweb.core.rememberPageContext
import com.varabyte.kobweb.silk.components.icons.fa.FaArrowLeft
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobwebx.markdown.markdown
import kotlinx.browser.document
import mo.web.portfoliofront.components.sections.FooterSection
import mo.web.portfoliofront.components.sections.Navbar
import mo.web.portfoliofront.utility.ModClasses
import org.jetbrains.compose.web.css.fr
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.vh
import org.jetbrains.compose.web.dom.Article
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.H1
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Span
import org.jetbrains.compose.web.dom.Text

@Composable
@Layout
fun MarkdownLayout(content: @Composable () -> Unit) {
    val ctx = rememberPageContext()

    val fm = ctx.markdown!!.frontMatter
    val title    = fm["title"]?.singleOrNull() ?: ""
    val subtitle = fm["subtitle"]?.singleOrNull()
    val created  = fm["created"]?.singleOrNull()
    val readtime = fm["readtime"]?.singleOrNull()
    val blogType = fm["blogType"]?.singleOrNull()

    LaunchedEffect(Unit) {
        document.title = "Owen Peters — $title"
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
                Article(attrs = { classes("markdown-article") }) {

                    // ── Header ────────────────────────────────────────────
                    Div(attrs = { classes("markdown-header") }) {

                        // Back arrow inline with the title
                        Div(attrs = { classes("markdown-title-row") }) {
                            Link(
                                path = "/blog",
                                modifier = Modifier.attrsModifier { classes("markdown-back") }
                            ) {
                                FaArrowLeft()
                            }
                            H1(attrs = { classes("markdown-title") }) { Text(title) }
                        }

                        // Subtitle sits below the title row
                        if (subtitle != null) {
                            P(attrs = { classes("markdown-subtitle") }) { Text(subtitle) }
                        }

                        // Meta: readtime · type · date
                        Div(attrs = { classes("markdown-meta") }) {
                            if (readtime != null) {
                                Span(attrs = { classes("markdown-meta-item") }) {
                                    Text("$readtime min read")
                                }
                            }
                            if (blogType != null) {
                                Span(attrs = { classes("markdown-meta-dot") }) { Text("·") }
                                Span(attrs = { classes("markdown-meta-item") }) { Text(blogType) }
                            }
                            if (created != null) {
                                Span(attrs = { classes("markdown-meta-dot") }) { Text("·") }
                                Span(attrs = { classes("markdown-meta-item") }) { Text(created) }
                            }
                        }
                    }

                    // ── Body ──────────────────────────────────────────────
                    Div(attrs = { classes("markdown-content") }) {
                        content()
                    }
                }
            }

            FooterSection()
        }
    }
}
