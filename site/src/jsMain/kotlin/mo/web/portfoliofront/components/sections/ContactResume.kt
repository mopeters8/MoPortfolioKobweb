package mo.web.portfoliofront.components.sections

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.browser.uri.encodeURIComponent
import com.varabyte.kobweb.compose.ui.Modifier
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Form
import org.jetbrains.compose.web.dom.Input
import org.jetbrains.compose.web.dom.TextArea
import org.jetbrains.compose.web.dom.Button
import org.jetbrains.compose.web.dom.A
import org.jetbrains.compose.web.dom.Text
import kotlinx.browser.document
import kotlinx.browser.window
import mo.web.portfoliofront.utility.AttrClasses
import mo.web.portfoliofront.utility.ModClasses
import org.jetbrains.compose.web.attributes.InputType
import org.jetbrains.compose.web.attributes.onSubmit

@Composable
fun ContactResume() {
    Div(Modifier.AttrClasses("contact-resume-container")) {
        // Contact form column
        Div(Modifier.AttrClasses("contact-column")) {
            // Use AttrClasses with a trailing attrs block to combine classes + onSubmit
            Form(attrs = {
                Modifier.AttrClasses("contact-form")
                onSubmit { it.preventDefault() } // avoid page reload
            }) {
                // Email input
                Div(Modifier.AttrClasses("form-row")) {
                    Text("Your email")
                    Input(
                        attrs = {
                            attr("id", "contact-email")
                            attr("placeholder", "you@example.com")
                            attr("class", "contact-input") // keep local class on input via attrs
                        },
                        type = InputType.Email
                    )
                }

                // Message textarea
                Div(Modifier.AttrClasses("form-row")) {
                    Text("Message")
                    TextArea(attrs = {
                        attr("id", "contact-message")
                        attr("placeholder", "Write your message here...")
                        attr("class", "contact-textarea")
                        attr("rows", "6")
                    })
                }

                // Submit button: constructs mailto: with provided values
                Button(attrs = Modifier.AttrClasses("submit-button") {
                        attr("type", "button")
                        onClick {
                            val email = document.getElementById("contact-email")?.asDynamic()?.value ?: ""
                            val message = document.getElementById("contact-message")?.asDynamic()?.value ?: ""
                            val subject = "Contact from $email"
                            val body = message
                            val mailto = "mailto:youremail@example.com?subject=${encodeURIComponent(subject)}&body=${encodeURIComponent(body)}"
                            window.location.href = mailto
                        }
                }) {
                    Text("Send Message")
                }
            }
        }

        // Resume column
        Div(Modifier.AttrClasses("resume-column")) {
            // Link to resume file (adjust path as needed, /resume.pdf assumed)
            A(href = "/resume.pdf", attrs = {
                attr("download", "") // hint to download
            }) {
                // Use AttrClasses with trailing attrs block on the Button
                Button(attrs = Modifier.AttrClasses("resume-button") {
                    attr("type", "button")
                }) {
                    Text("Download Resume")
                }
            }
        }
    }
}
