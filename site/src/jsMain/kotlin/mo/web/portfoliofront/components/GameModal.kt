package mo.web.portfoliofront.components

import androidx.compose.runtime.Composable
import mo.web.portfoliofront.infrastructure.models.Game
import org.jetbrains.compose.web.dom.Button
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Text
import com.varabyte.kobweb.silk.components.icons.fa.FaX
import com.varabyte.kobweb.compose.ui.Modifier

@Composable
fun GameModal(
    game: Game,
    onClose: () -> Unit,
) {
    Div(attrs = { classes("game-modal") }) {
        Div(attrs = { classes("game-modal-header") }) {
            Button(attrs = {
                classes("game-modal-close")
                onClick { onClose() }
            }) {
                FaX(modifier = Modifier)
            }
        }

        // TODO: Build out game modal content (cover, rating, review, platform, etc.)
    }
}
