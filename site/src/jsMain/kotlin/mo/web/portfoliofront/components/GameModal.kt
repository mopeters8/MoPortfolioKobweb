package mo.web.portfoliofront.components

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.silk.components.icons.fa.FaX
import mo.web.portfoliofront.infrastructure.models.Game
import mo.web.portfoliofront.infrastructure.models.GameType
import org.jetbrains.compose.web.dom.Button
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.H2
import org.jetbrains.compose.web.dom.Img
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Span
import org.jetbrains.compose.web.dom.Text

private fun GameType.label() = when (this) {
    GameType.VideoGame -> "Video Game"
    GameType.BoardGame -> "Board Game"
    GameType.CardGame -> "Card Game"
}

@Composable
fun GameModal(
    game: Game,
    onClose: () -> Unit,
) {
    val ratingClass = when {
        game.rating >= 9 -> "game-rating-badge--high"
        game.rating >= 7 -> "game-rating-badge--mid"
        else -> "game-rating-badge--low"
    }

    Div(attrs = { classes("game-modal") }) {
        Div(attrs = { classes("game-modal-header") }) {
            H2(attrs = { classes("game-modal-title") }) { Text(game.title) }
            Button(attrs = {
                classes("game-modal-close")
                onClick { onClose() }
            }) {
                FaX(modifier = Modifier)
            }
        }

        Div(attrs = { classes("game-modal-body") }) {
            // Cover image — floated right on desktop, stacks top on mobile
            Div(attrs = { classes("game-modal-cover") }) {
                Img(
                    src = game.coverImageUrl,
                    alt = "${game.title} cover",
                    attrs = { classes("game-modal-cover-img") }
                )
            }

            // Badges — floated right below cover on desktop, full-width row on mobile
            Div(attrs = { classes("game-modal-cover-meta") }) {
                if (game.mosPick) {
                    Span(attrs = { classes("game-badge", "game-mospick-badge") }) {
                        Text("★ Mo's Pick")
                    }
                }
                Span(attrs = { classes("game-badge", ratingClass) }) {
                    Text("${game.rating}/10")
                }
                Span(attrs = { classes("game-badge", "game-type-badge") }) {
                    Text(game.type.label())
                }
            }

            // Text content flows to the left of the floats on desktop
            if (game.platform != null) {
                P(attrs = { classes("game-modal-platform") }) { Text(game.platform) }
            }
            if (game.review.isNotEmpty()) {
                P(attrs = { classes("game-modal-review") }) { Text(game.review) }
            }

            Div(attrs = { classes("game-modal-clearfix") })
        }
    }
}
