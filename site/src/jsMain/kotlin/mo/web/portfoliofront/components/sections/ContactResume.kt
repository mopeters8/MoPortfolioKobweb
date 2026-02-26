package mo.web.portfoliofront.components.sections

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.browser.uri.encodeURIComponent
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.silk.components.icons.fa.FaDownload
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Form
import org.jetbrains.compose.web.dom.Input
import org.jetbrains.compose.web.dom.TextArea
import org.jetbrains.compose.web.dom.Button
import org.jetbrains.compose.web.dom.A
import org.jetbrains.compose.web.dom.Text
import org.jetbrains.compose.web.dom.Span
import kotlinx.browser.document
import kotlinx.browser.window
import mo.web.portfoliofront.utility.AttrClasses
import org.jetbrains.compose.web.attributes.InputType
import org.jetbrains.compose.web.attributes.onSubmit

@Composable
fun ContactResume() {
    Div(Modifier.AttrClasses("contact-resume-container")) {
        // Welcoming message
        Div(attrs = {
            classes("contact-message")
        }) {
            Text("Have a question or opportunity? Drop me a message below, or grab my resume.")
        }

        // Use AttrClasses with a trailing attrs block to combine classes + onSubmit
        Form(attrs = {
            classes("contact-form")
            onSubmit { it.preventDefault() } // avoid page reload
        }) {
            // Email input
            Div(Modifier.AttrClasses("form-row")) {
                Input(
                    attrs = {
                        classes("contact-input")
                        id("contact-email")
                        attr("placeholder", "you@example.com")
                    },
                    type = InputType.Email
                )
            }

            // Message textarea
            Div(Modifier.AttrClasses("form-row")) {
                TextArea(attrs = {
                    classes("contact-textarea")
                    id("contact-message")
                    attr("placeholder", "Write your message here...")
                    attr("rows", "4")
                })
            }

            // Button row container
            Div(Modifier.AttrClasses("button-row")) {
                // Submit button: constructs mailto: with provided values
                Button(attrs = {
                    classes("action-button", "action-button-primary")
                    attr("type", "button")
                    onClick {
                        val email = document.getElementById("contact-email")?.asDynamic()?.value ?: ""
                        val message = document.getElementById("contact-message")?.asDynamic()?.value ?: ""
                        val subject = "Contact from $email"
                        val body = message
                    }
                }) {
                    Text("Send Message")
                }

                // "or" divider
                Div(attrs = { classes("button-divider") }) {
                    Text("or")
                }

                // Resume download button
                A(href = "/resume.pdf", attrs = {
                    attr("download", "")
                    classes("action-button", "action-button-secondary")
                }) {
                    Span(attrs = { classes("download-text-full") }) {
                        Text("Download Resume")
                    }
                    Span(attrs = { classes("download-text-mobile") }) {
                        FaDownload()
                        Text("Resume")
                    }
                }
            }
        }
    }
}
