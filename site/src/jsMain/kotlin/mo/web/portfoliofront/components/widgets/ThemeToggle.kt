package mo.web.portfoliofront.components.widgets

import androidx.compose.runtime.*
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.silk.components.icons.fa.FaMoon
import com.varabyte.kobweb.silk.components.icons.fa.FaSun
import kotlinx.browser.window
import org.jetbrains.compose.web.dom.Button

@Composable
fun ThemeToggle() {
    val currentTheme = remember {
        mutableStateOf(
            window.localStorage.getItem("theme") ?: if (window.matchMedia("(prefers-color-scheme: dark)").matches) "dark" else "light"
        )
    }

    // Initialize theme on first load
    LaunchedEffect(Unit) {
        window.document.documentElement?.setAttribute("data-theme", currentTheme.value)
    }

    Button(
        attrs = {
            classes("theme-toggle-button")
            onClick {
                val newTheme = if (currentTheme.value == "dark") "light" else "dark"
                currentTheme.value = newTheme
                window.document.documentElement?.setAttribute("data-theme", newTheme)
                window.localStorage.setItem("theme", newTheme)
            }
        }
    ) {
        if (currentTheme.value == "dark") {
            FaSun(modifier = Modifier)
        } else {
            FaMoon(modifier = Modifier)
        }
    }
}
