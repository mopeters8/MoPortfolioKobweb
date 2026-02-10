package mo.web.portfoliofront.components

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.silk.components.icons.fa.FaSquareUpRight
import com.varabyte.kobweb.silk.components.icons.fa.FaX
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.components.text.SpanText
import mo.web.portfoliofront.infrastructure.models.Project
import mo.web.portfoliofront.utility.AttrClasses
import mo.web.portfoliofront.utility.ModClasses
import org.jetbrains.compose.web.dom.Button
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.H2
import org.jetbrains.compose.web.dom.H3
import org.jetbrains.compose.web.dom.H4
import org.jetbrains.compose.web.dom.Img
import org.jetbrains.compose.web.dom.Li
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text
import org.jetbrains.compose.web.dom.Ul

@Composable
fun ProjectModal(
    project: Project,
    onClose: () -> Unit,
) {
    Div(attrs = { classes("project-modal") }) {
        // Header with title and close button
        Div(attrs = { classes("project-modal-header") }) {
            Div(attrs = { classes("project-modal-title-block") }) {
                H2(attrs = { classes("project-modal-title") }) {
                    Text(project.title)
                }
                Link(
                    path = project.linkInfo.url,
                    modifier = Modifier.ModClasses("project-modal-link")
                ) {
                    Text(project.linkInfo.presentation)
                    FaSquareUpRight(modifier = Modifier)
                }
            }
            Button(attrs = {
                classes("project-modal-close")
                onClick { onClose() }
            }) {
                FaX()
            }
        }

        // Main content grid
        Div(attrs = { classes("project-modal-content") }) {

            // Left column - Text content
            Div(attrs = { classes("project-modal-left") }) {
                // Description
                Div(attrs = { classes("project-modal-section") }) {
                    H3 { Text("Overview") }
                    P { Text(project.overview) }
                }

//                // Date and Links
//                Div(attrs = { classes("project-modal-meta") }) {
//                    SpanText(
//                        text = project.date,
//                        modifier = Modifier.ModClasses("project-modal-date subtle")
//                    )
//                }

                // Features
                Div(attrs = { classes("project-modal-section") }) {
                    H3 { Text("Key Features") }
                    Ul {
                        project.features.forEach { feature ->
                            Li(attrs = { classes("project-modal-list-item") }) {
                                Text(feature)
                            }
                        }
                    }
                }

                // Technologies
                Div(attrs = { classes("project-modal-section") }) {
                    H3 { Text("Technologies") }
                    Div(attrs = { classes("project-modal-tech-grid") }) {
                        project.technologies.forEach { tech ->
                            Div(attrs = { classes("project-modal-tech-item") }) {
                                Img(
                                    src = tech.iconUrl,
                                    alt = tech.name,
                                    attrs = { classes("project-modal-tech-icon") }
                                )
                                SpanText(text = tech.name)
                            }
                        }
                    }
                }

                // Challenges
                Div(attrs = { classes("project-modal-section") }) {
                    H3 { Text("Challenges") }
                    Ul {
                        project.challenges.forEach { challenge ->
                            Li(attrs = { classes("project-modal-list-item") }) {
                                Text(challenge)
                            }
                        }
                    }
                }

                // My Experience
                Div(attrs = { classes("project-modal-section") }) {
                    H3 { Text("My Experience") }
                    P { Text(project.experience) }
                }

            }

            // Right column - Images
            Div(attrs = { classes("project-modal-right") }) {
                Div(attrs = { classes("project-modal-images") }) {
                    project.imageURLs.forEach { image ->
                        Img(
                            src = image.src,
                            alt = image.alt,
                            attrs = { classes("project-modal-image") }
                        )
                    }
                }
            }
        }
    }
}
