package mo.web.portfoliofront.pages

import androidx.compose.runtime.*
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.core.data.add
import com.varabyte.kobweb.core.init.InitRoute
import com.varabyte.kobweb.core.init.InitRouteContext
import com.varabyte.kobweb.core.layout.Layout
import com.varabyte.kobweb.core.rememberPageContext
import com.varabyte.kobweb.silk.components.text.SpanText
import org.jetbrains.compose.web.dom.Text
import com.varabyte.kobweb.worker.rememberWorker
import mo.web.portfoliofront.components.ModalOverlay
import mo.web.portfoliofront.components.ProjectModal
import mo.web.portfoliofront.components.ProjectCardFeatured
import mo.web.portfoliofront.components.SectionHeader
import mo.web.portfoliofront.components.layout.PageLayoutData
import mo.web.portfoliofront.components.sections.BlogDisplay
import mo.web.portfoliofront.components.sections.ProjectDisplay
import mo.web.portfoliofront.components.sections.ContactResume
import mo.web.portfoliofront.infrastructure.FEATURED_PROJECT
import mo.web.portfoliofront.infrastructure.PROJECTS_LIST
import mo.web.portfoliofront.infrastructure.models.Project
import mo.web.portfoliofront.infrastructure.models.TEST_BLOG_LIST
import mo.web.portfoliofront.worker.EchoWorker
import org.jetbrains.compose.web.dom.Br
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Footer
import org.jetbrains.compose.web.dom.H1
import org.jetbrains.compose.web.dom.Hr
import org.jetbrains.compose.web.dom.Img
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Section

@InitRoute
fun initHomePage(ctx: InitRouteContext) {
    ctx.data.add(PageLayoutData(title = "Owen Peters"))
}

@Page
@Layout(".components.layout.PageLayout")
@Composable
fun HomePage() {
    val context = rememberPageContext()
    val worker = rememberWorker { EchoWorker { output -> console.log("Echoed: $output") } }

    LaunchedEffect(Unit) {
        worker.postInput("Hello, worker!")
    }

    val projects = PROJECTS_LIST
    val featuredProject = FEATURED_PROJECT
    var openedProject by remember { mutableStateOf<Project?>(null) }

    val blogs = TEST_BLOG_LIST

    ModalOverlay(
        isOpen = openedProject != null,
        onClose = {
            console.log("Closing Modal")
            openedProject = null
        },
    ) {
        openedProject?.let { project ->
            ProjectModal(
                project = project,
                onClose = { openedProject = null }
            )
        }
    }

    Section(attrs = { classes("hero") }) {
        Img(
            src = "/owenhs.png",
            attrs = { classes("hero-image") }
        )

        Div(attrs = { classes("hero-content") }) {

            H1 {
                Text("Web Dev - end to end.")
                Br()
                SpanText("Turning coffee into code.",)
            }

            P {
                Text("I’m a full-stack web developer focused on building web software that’s dependable and easy to work with. My background spans frontend interfaces, backend services, and deployment. I visualize the full lifecycle of an application, not just one piece of it.")
                Br()
                Br()
                Text("With experience in teaching, IT support, and freelance work I am comfortable explaining ideas, debugging issues, and working with those who are not developers. I value teams that prioritize clarity, collaboration, and steady improvement over hype.")
            }
        }
    }

    Section(attrs = { classes("projects-section", "content-section") }) {
        SectionHeader(title = "Projects")
        Hr()

        ProjectCardFeatured(
            project = featuredProject,
            onProjectClick = { openedProject = it }
        )

        ProjectDisplay(
            projectList = projects,
            onProjectClick = { openedProject = it }
        )
    }

    Section(attrs = { classes("blog-section", "content-section") }) {
        SectionHeader(title = "Blogs", link = "https://blog.owen-peters.com", linkText = "blog.owen-peters.com")
        Hr()
        BlogDisplay(blogList = blogs)
    }

    Section(attrs = { classes("contact-section", "content-section") }) {
        SectionHeader(title = "Contact & Resume")
        Hr()

        ContactResume()
    }

    Footer {
        Text("© 2024 Owen Peters. All rights reserved.")
    }
}
