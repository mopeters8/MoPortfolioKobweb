package mo.web.portfoliofront.components.sections

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.silk.components.icons.fa.FaDownload
import kotlinx.browser.document
import mo.web.portfoliofront.infrastructure.email.sendContactEmail
import mo.web.portfoliofront.utility.AttrClasses
import mo.web.portfoliofront.utility.Constants.EMAIL_JS_SERVICE_ID
import mo.web.portfoliofront.utility.Constants.EMAIL_JS_TEMPLATE_ID
import org.jetbrains.compose.web.attributes.InputType
import org.jetbrains.compose.web.attributes.onSubmit
import org.jetbrains.compose.web.dom.A
import org.jetbrains.compose.web.dom.Button
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Form
import org.jetbrains.compose.web.dom.Input
import org.jetbrains.compose.web.dom.Span
import org.jetbrains.compose.web.dom.Text
import org.jetbrains.compose.web.dom.TextArea
import org.w3c.dom.HTMLInputElement
import org.w3c.dom.HTMLTextAreaElement

@Composable
fun ContactResume() {
    var isSending by remember { mutableStateOf(false) }
    var statusMessage by remember { mutableStateOf<String?>(null) }
    var isError by remember { mutableStateOf(false) }

    fun handleSubmit() {
        val name    = (document.getElementById("contact-name") as HTMLInputElement).value
        val email   = (document.getElementById("contact-email") as HTMLInputElement).value
        val message = (document.getElementById("contact-message") as HTMLTextAreaElement).value

        isSending = true
        statusMessage = null

        sendContactEmail(
            serviceId = EMAIL_JS_SERVICE_ID,
            templateId = EMAIL_JS_TEMPLATE_ID,
            name = name,
            email = email,
            message = message,
            onSuccess = {
                isSending = false
                isError = false
                statusMessage = "Message sent! I'll get back to you soon."
            },
            onError = { err ->
                isSending = false
                isError = true
                statusMessage = "Something went wrong: $err"
            }
        )
    }

    Div(Modifier.AttrClasses("contact-resume-container")) {
        // Welcoming message
        Div(attrs = { classes("contact-message") }) {
            Text("Have a question or opportunity? Drop me a message below, or grab my resume.")
        }

        Form(attrs = {
            classes("contact-form")
            onSubmit {
                it.preventDefault()
                handleSubmit()
            }
        }) {
            // Name + Email row
            Div(Modifier.AttrClasses("form-row form-row-split")) {
                Input(
                    attrs = {
                        classes("contact-input")
                        id("contact-name")
                        attr("placeholder", "Your name")
                        attr("required", "")
                    },
                    type = InputType.Text
                )
                Input(
                    attrs = {
                        classes("contact-input")
                        id("contact-email")
                        attr("placeholder", "you@example.com")
                        attr("required", "")
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

            // Status message (success / error)
            statusMessage?.let { msg ->
                Div(attrs = {
                    classes("contact-status", if (isError) "contact-status-error" else "contact-status-success")
                }) {
                    Text(msg)
                }
            }

            // Button row
            Div(Modifier.AttrClasses("button-row")) {
                Button(attrs = {
                    classes("action-button", "action-button-primary")
                    attr("type", "submit")
                    if (isSending) attr("disabled", "")
                }) {
                    Text(if (isSending) "Sending..." else "Send Message")
                }

                // "or" divider
                Div(attrs = { classes("button-divider") }) {
                    Text("or")
                }

                // Resume download button
                A(href = "/OwenPetersResume.pdf", attrs = {
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
