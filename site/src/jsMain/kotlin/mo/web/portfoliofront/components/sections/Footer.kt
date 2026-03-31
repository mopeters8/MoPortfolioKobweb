package mo.web.portfoliofront.components.sections

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.attrsModifier
import com.varabyte.kobweb.silk.components.icons.fa.FaEnvelope
import com.varabyte.kobweb.silk.components.icons.fa.FaFile
import com.varabyte.kobweb.silk.components.icons.fa.FaGithub
import com.varabyte.kobweb.silk.components.icons.fa.FaInstagram
import com.varabyte.kobweb.silk.components.icons.fa.FaLinkedin
import com.varabyte.kobweb.silk.components.icons.fa.IconSize
import com.varabyte.kobweb.silk.components.navigation.Link
import mo.web.portfoliofront.utility.AttrClasses
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
            Link(
                path = "https://instagram.com/yourusername",
                modifier = Modifier.attrsModifier {
                    classes("footer-social-link")
                    title("Check out my Instagram!")
                    attr("target", "_blank")
                    attr("rel", "noopener noreferrer")
                    attr("aria-label", "Instagram")
                }
            ) {
                FaInstagram(size = IconSize.LG)
            }

            // LinkedIn
            Link(
                path = "https://linkedin.com/in/yourusername",
                modifier = Modifier.attrsModifier {
                    classes("footer-social-link")
                    title("Connect with me on LinkedIn!")
                    attr("target", "_blank")
                    attr("rel", "noopener noreferrer")
                    attr("aria-label", "LinkedIn")
                }
            ) {
                FaLinkedin(size = IconSize.LG)
            }

            // GitHub
            Link(
                path = "https://github.com/yourusername",
                modifier = Modifier.attrsModifier {
                    classes("footer-social-link")
                    title("Check out my Github contributions!")
                    attr("target", "_blank")
                    attr("rel", "noopener noreferrer")
                    attr("aria-label", "GitHub")
                }
            ) {
                FaGithub(size = IconSize.LG)
            }

            // Resume
            Link(
                path = "/resume.pdf",
                modifier = Modifier.attrsModifier {
                    classes("footer-social-link")
                    title("Download my resume!")
                    attr("download", "")
                    attr("aria-label", "Download Resume")
                }
            ) {
                FaFile(size = IconSize.LG)
            }

            // Email
            Link(
                path = "/#contact",
                modifier = Modifier.attrsModifier {
                    classes("footer-social-link")
                    title("Get in touch!")
                    attr("aria-label", "Email")
                }
            ) {
                FaEnvelope(size = IconSize.LG)
            }
        }
    }
}

