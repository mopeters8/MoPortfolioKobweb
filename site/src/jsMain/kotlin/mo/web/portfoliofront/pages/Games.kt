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
import mo.web.portfoliofront.infrastructure.models.GameType
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.H1
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Section
import org.jetbrains.compose.web.dom.Text

private sealed class GameFilter {
    object All : GameFilter()
    object MosPicks : GameFilter()
    class ByType(val type: GameType) : GameFilter()
}

private fun GameType.label() = when (this) {
    GameType.VideoGame -> "Video Game"
    GameType.BoardGame -> "Board Game"
    GameType.CardGame -> "Card Game"
}

@InitRoute
fun initGamesPage(ctx: InitRouteContext) {
    ctx.data.add(PageLayoutData(title = "Owen Peters - Games"))
}

@Page
@Layout(".components.layout.PageLayout")
@Composable
fun GamesPage() {
    var openedGame by remember { mutableStateOf<Game?>(null) }
    var activeFilter by remember { mutableStateOf<GameFilter>(GameFilter.All) }

    val filteredGames = when (val f = activeFilter) {
        is GameFilter.All -> GAMES_LIST
        is GameFilter.MosPicks -> GAMES_LIST.filter { it.mosPick }
        is GameFilter.ByType -> GAMES_LIST.filter { it.type == f.type }
    }

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
        Div(attrs = { classes("game-filter-tabs") }) {
            Div(attrs = {
                classes("game-type-chip")
                if (activeFilter is GameFilter.All) classes("active")
                onClick { activeFilter = GameFilter.All }
            }) { Text("All") }

            Div(attrs = {
                classes("game-type-chip")
                if (activeFilter is GameFilter.MosPicks) classes("active")
                onClick {
                    activeFilter = if (activeFilter is GameFilter.MosPicks) GameFilter.All else GameFilter.MosPicks
                }
            }) { Text("Mo's Picks") }

            GameType.values().forEach { type ->
                val isActive = activeFilter is GameFilter.ByType && (activeFilter as GameFilter.ByType).type == type
                Div(attrs = {
                    classes("game-type-chip")
                    if (isActive) classes("active")
                    onClick { activeFilter = if (isActive) GameFilter.All else GameFilter.ByType(type) }
                }) { Text(type.label()) }
            }
        }

        Div(attrs = { classes("game-cards-wrap") }) {
            filteredGames.forEach { game ->
                GameCard(game = game, onGameClick = { openedGame = it })
            }
        }
    }
}
