package mo.web.portfoliofront.components.sections

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.silk.components.icons.fa.FaEnvelope
import com.varabyte.kobweb.silk.components.icons.fa.FaFile
import com.varabyte.kobweb.silk.components.icons.fa.FaGithub
import com.varabyte.kobweb.silk.components.icons.fa.FaInstagram
import com.varabyte.kobweb.silk.components.icons.fa.FaLinkedin
import com.varabyte.kobweb.silk.components.icons.fa.IconSize
import mo.web.portfoliofront.utility.AttrClasses
import org.jetbrains.compose.web.dom.A
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Footer
import org.jetbrains.compose.web.dom.Text

@Composable
fun FooterSection() {
    Footer(Modifier.AttrClasses("footer-container")) {
        Div(attrs = {
            classes("footer-copyright")
        }) {
            Text("© 2026 Owen Peters. All rights reserved.")
        }

        Div(Modifier.AttrClasses("footer-social-row")) {
            // Instagram
            A(href = "https://instagram.com/yourusername", attrs = {
                classes("footer-social-link")
                attr("target", "_blank")
                attr("rel", "noopener noreferrer")
                attr("aria-label", "Instagram")
            }) {
                FaInstagram(size = IconSize.LG)
            }

            // LinkedIn
            A(href = "https://linkedin.com/in/yourusername", attrs = {
                classes("footer-social-link")
                attr("target", "_blank")
                attr("rel", "noopener noreferrer")
                attr("aria-label", "LinkedIn")
            }) {
                FaLinkedin(size = IconSize.LG)
            }

            // GitHub
            A(href = "https://github.com/yourusername", attrs = {
                classes("footer-social-link")
                attr("target", "_blank")
                attr("rel", "noopener noreferrer")
                attr("aria-label", "GitHub")
            }) {
                FaGithub(size = IconSize.LG)
            }

            // Resume
            A(href = "/resume.pdf", attrs = {
                classes("footer-social-link")
                attr("download", "")
                attr("aria-label", "Download Resume")
            }) {
                FaFile(size = IconSize.LG)
            }

            // Email
            A(href = "mailto:youremail@example.com", attrs = {
                classes("footer-social-link")
                attr("aria-label", "Email")
            }) {
                FaEnvelope(size = IconSize.LG)
            }
        }
    }
}

