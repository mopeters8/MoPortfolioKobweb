package mo.web.portfoliofront.components

import androidx.compose.runtime.Composable
import mo.web.portfoliofront.infrastructure.models.Game
import mo.web.portfoliofront.infrastructure.models.toSlug
import org.jetbrains.compose.web.dom.A
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.H5
import org.jetbrains.compose.web.dom.Img
import org.jetbrains.compose.web.dom.Span
import org.jetbrains.compose.web.dom.Text

@Composable
fun GameCard(game: Game) {
    val ratingClass = when {
        game.rating >= 9 -> "game-rating-badge--high"
        game.rating >= 7 -> "game-rating-badge--mid"
        else -> "game-rating-badge--low"
    }

    A(
        href = "/games#${game.toSlug()}",
        attrs = { classes("game-card-link") }
    ) {
        Div(attrs = { classes("game-card") }) {
            Img(
                src = game.coverImageUrl,
                alt = "${game.title} cover",
                attrs = { classes("game-card-img") }
            )
            Div(attrs = { classes("game-card-footer") }) {
                H5(attrs = { classes("game-card-title") }) { Text(game.title) }
                Div(attrs = { classes("game-card-badges") }) {
                    if (game.mosPick) {
                        Span(attrs = { classes("game-badge", "game-mospick-badge") }) {
                            Text("★ Mo's Pick")
                        }
                    }
                    Span(attrs = { classes("game-badge", ratingClass) }) {
                        Text("${game.rating}/10")
                    }
                }
            }
        }
    }
}
