package mo.web.portfoliofront.pages

import androidx.compose.runtime.*
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.core.data.add
import com.varabyte.kobweb.core.init.InitRoute
import com.varabyte.kobweb.core.init.InitRouteContext
import com.varabyte.kobweb.core.layout.Layout
import mo.web.portfoliofront.components.GameCard
import mo.web.portfoliofront.components.GameModal
import mo.web.portfoliofront.components.ModalOverlay
import mo.web.portfoliofront.components.layout.PageLayoutData
import mo.web.portfoliofront.infrastructure.data.GAMES_LIST
import mo.web.portfoliofront.infrastructure.models.Game
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.H1
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Section
import org.jetbrains.compose.web.dom.Text

@InitRoute
fun initGamesPage(ctx: InitRouteContext) {
    ctx.data.add(PageLayoutData(title = "Owen Peters - Games"))
}

@Page
@Layout(".components.layout.PageLayout")
@Composable
fun GamesPage() {
    var openedGame by remember { mutableStateOf<Game?>(null) }

    ModalOverlay(
        isOpen = openedGame != null,
        onClose = { openedGame = null },
    ) {
        openedGame?.let { game ->
            GameModal(
                game = game,
                onClose = { openedGame = null }
            )
        }
    }

    Section(attrs = { classes("games-page-hero") }) {
        H1 { Text("Games") }
        P(attrs = { classes("games-page-hero-desc") }) {
            Text("Every game I've played and rated — from childhood classics to current obsessions.")
        }
    }

    Section(attrs = { classes("content-section", "fade-in-slow") }) {
        Div(attrs = { classes("game-cards-wrap") }) {
            GAMES_LIST.forEach { game ->
                GameCard(game = game, onGameClick = { openedGame = it })
            }
        }
    }
}
