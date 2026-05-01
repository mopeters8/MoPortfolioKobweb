package mo.web.portfoliofront.pages

import androidx.compose.runtime.*
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.core.data.add
import com.varabyte.kobweb.core.init.InitRoute
import com.varabyte.kobweb.core.init.InitRouteContext
import com.varabyte.kobweb.core.layout.Layout
import mo.web.portfoliofront.components.ModalOverlay
import mo.web.portfoliofront.components.PhotoModal
import mo.web.portfoliofront.components.layout.PageLayoutData
import mo.web.portfoliofront.infrastructure.data.PHOTOS_LIST
import mo.web.portfoliofront.infrastructure.models.Photo
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.H1
import org.jetbrains.compose.web.dom.Img
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Section
import org.jetbrains.compose.web.dom.Text

@InitRoute
fun initPhotosPage(ctx: InitRouteContext) {
    ctx.data.add(PageLayoutData(title = "Owen Peters - Photos"))
}

@Page
@Layout(".components.layout.PageLayout")
@Composable
fun PhotosPage() {

    val photos = PHOTOS_LIST
    var openedPhoto by remember { mutableStateOf<Photo?>(null) }

    ModalOverlay(
        isOpen = openedPhoto != null,
        onClose = { openedPhoto = null },
    ) {
        openedPhoto?.let { photo ->
            PhotoModal(
                photo = photo,
                onClose = { openedPhoto = null }
            )
        }
    }

    Section(attrs = { classes("photos-hero") }) {
        H1 { Text("Photos") }
        P(attrs = { classes("photos-hero-desc") }) {
            Text("A running collection of moments I've captured.")
        }
    }

    Section(attrs = { classes("content-section", "fade-in-slow") }) {
        if (photos.isEmpty()) {
            P(attrs = { classes("photos-empty") }) {
                Text("Photos coming soon.")
            }
        } else {
            Div(attrs = { classes("photos-grid") }) {
                photos.forEach { photo ->
                    Div(attrs = { classes("photo-item") }) {
                        Img(
                            src = photo.imageUrl,
                            alt = photo.alt,
                            attrs = {
                                classes("photo-img")
                                onClick { openedPhoto = photo }
                            }
                        )
                        photo.caption?.let { caption ->
                            P(attrs = { classes("photo-caption") }) {
                                Text(caption)
                            }
                        }
                    }
                }
            }
        }
    }
}
