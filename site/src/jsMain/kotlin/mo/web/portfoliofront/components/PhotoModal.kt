package mo.web.portfoliofront.components

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.silk.components.icons.fa.FaX
import mo.web.portfoliofront.infrastructure.models.Photo
import org.jetbrains.compose.web.dom.Button
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Img
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text

@Composable
fun PhotoModal(
    photo: Photo,
    onClose: () -> Unit,
) {
    Div(attrs = { classes("photo-modal") }) {
        Div(attrs = { classes("photo-modal-header") }) {
            Button(attrs = {
                classes("photo-modal-close")
                onClick { onClose() }
            }) {
                FaX()
            }
        }
        Img(
            src = photo.imageUrl,
            alt = photo.alt,
            attrs = { classes("photo-modal-img") }
        )
        photo.caption?.let { caption ->
            P(attrs = { classes("photo-modal-caption") }) {
                Text(caption)
            }
        }
    }
}
