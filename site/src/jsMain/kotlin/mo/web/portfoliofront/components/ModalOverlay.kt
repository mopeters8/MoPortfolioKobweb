package mo.web.portfoliofront.components

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.dom.Div

@Composable
fun ModalOverlay(
    isOpen: Boolean,
    onClose: () -> Unit,
    content: @Composable () -> Unit
) {
    if (isOpen) {
        // Overlay backdrop with centered content inside
        Div(
            attrs = {
                classes("modal-overlay")
                onClick { onClose() }
            }
        ) {
            // Modal content - centered within overlay
            Div(
                attrs = {
                    classes("modal-content")
                    onClick {
                        it.preventDefault()
                        it.stopPropagation()
                    }
                }
            ) {
                content()
            }

        }
    }
}



