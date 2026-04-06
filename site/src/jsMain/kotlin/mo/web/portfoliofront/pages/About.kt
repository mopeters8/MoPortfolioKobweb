package mo.web.portfoliofront.pages

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.core.data.add
import com.varabyte.kobweb.core.init.InitRoute
import com.varabyte.kobweb.core.init.InitRouteContext
import com.varabyte.kobweb.core.layout.Layout
import kotlinx.coroutines.delay
import mo.web.portfoliofront.components.layout.AboutPersonalView
import mo.web.portfoliofront.components.layout.AboutProfessionalView
import mo.web.portfoliofront.components.layout.PageLayoutData
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.H1
import org.jetbrains.compose.web.dom.Span
import org.jetbrains.compose.web.dom.Text

@InitRoute
fun initAboutPage(ctx: InitRouteContext) {
    ctx.data.add(PageLayoutData(title = "Owen Peters - About"))
}

@Page
@Layout(".components.layout.PageLayout")
@Composable
fun AboutPage() {
    var isPersonal by remember { mutableStateOf(false) }
    var isTransitioning by remember { mutableStateOf(false) }
    var displayPersonal by remember { mutableStateOf(false) }
    var initialized by remember { mutableStateOf(false) }

    LaunchedEffect(isPersonal) {
        if (!initialized) {
            initialized = true
            return@LaunchedEffect
        }
        isTransitioning = true
        delay(400)
        displayPersonal = isPersonal
        isTransitioning = false
    }

    val modeClass = if (isPersonal) "about-mode--personal" else "about-mode--professional"
    val contentClass = "about-page-content"

    // Floating toggle
    Div(attrs = { classes("about-toggle-row", modeClass) }) {
        Div(attrs = { classes("about-toggle-widget") }) {

            // Label — fades between modes
            Div(attrs = { classes("about-toggle-label") }) {
                Div(attrs = { classes("about-toggle-label-item", "about-toggle-label-professional") }) {
                    Span(attrs = { classes("about-toggle-label-name") }) { Text("Professional") }
                    Span(attrs = { classes("about-toggle-label-sub") }) { Text("Career & work") }
                }
                Div(attrs = { classes("about-toggle-label-item", "about-toggle-label-personal") }) {
                    Span(attrs = { classes("about-toggle-label-name") }) { Text("Personal") }
                    Span(attrs = { classes("about-toggle-label-sub") }) { Text("Owen's interests") }
                }
            }

            // Switch
            Div(attrs = {
                classes("about-toggle-switch")
                onClick { isPersonal = !isPersonal }
            }) {
                Div(attrs = { classes("about-toggle-track") })
                Div(attrs = { classes("about-toggle-thumb") })
            }
        }
    }

    // Page content
    Div(attrs = { classes(*contentClass.split(" ").toTypedArray()) }) {
        SectionSwapper(
            displayPersonal = displayPersonal,
            isPersonal = isPersonal,
            isTransitioning = isTransitioning,
        )
    }
}

@Composable
fun SectionSwapper(
    displayPersonal: Boolean,
    isPersonal: Boolean,
    isTransitioning: Boolean,
) {
    val modeClass = if (isPersonal) "switcher-header--personal" else "switcher-header--professional"
    val fadeList = if (isTransitioning) arrayOf("u-fade", "u-fade--hidden") else arrayOf("u-fade")

    H1(attrs = { classes("switcher-header", modeClass) }) {
        Span(attrs = { classes("about-hero-letter") }) { Text("O") }
        Span(attrs = { classes("about-hero-text", *fadeList) }) {
            if (displayPersonal) Text("utside the\u00A0") else Text("wning the\u00A0")
        }
        Span(attrs = { classes("about-hero-letter") }) { Text("P") }
        Span(attrs = { classes("about-hero-text", *fadeList) }) {
            if (displayPersonal) Text("ractice") else Text("rocess")
        }
    }

    Div(attrs = { classes("about-hero-subtitle", *fadeList) }) {
        if (displayPersonal) {
            Text("Take a look at my interests and hobbies.")
        } else {
            Text("Take a look at my track record and my aspirations for the future.")
        }
    }

    if (displayPersonal) {
        AboutPersonalView(isTransitioning = isTransitioning)
    } else {
        AboutProfessionalView(isTransitioning = isTransitioning)
    }
}
