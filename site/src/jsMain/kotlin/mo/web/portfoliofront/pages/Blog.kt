package mo.web.portfoliofront.pages

import androidx.compose.runtime.*
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.core.data.add
import com.varabyte.kobweb.core.init.InitRoute
import com.varabyte.kobweb.core.init.InitRouteContext
import com.varabyte.kobweb.core.layout.Layout
import com.varabyte.kobweb.silk.components.text.SpanText
import mo.web.portfoliofront.components.ModalOverlay
import mo.web.portfoliofront.components.ProjectCardFeatured
import mo.web.portfoliofront.components.ProjectModal
import mo.web.portfoliofront.components.SectionHeader
import mo.web.portfoliofront.components.layout.PageLayoutData
import mo.web.portfoliofront.components.sections.ProjectDisplay
import mo.web.portfoliofront.infrastructure.FEATURED_PROJECT
import mo.web.portfoliofront.infrastructure.PROJECTS_LIST
import mo.web.portfoliofront.infrastructure.models.Project
import mo.web.portfoliofront.infrastructure.models.Technologies
import mo.web.portfoliofront.utility.ModClasses
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.H1
import org.jetbrains.compose.web.dom.Hr
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Section
import org.jetbrains.compose.web.dom.Text

@InitRoute
fun initBlogPage(ctx: InitRouteContext) {
    ctx.data.add(PageLayoutData(title = "Owen Peters - Projects"))
}

@Page
@Layout(".components.layout.PageLayout")
@Composable
fun BlogPage() {
    val featuredProject = FEATURED_PROJECT
    val allProjects = PROJECTS_LIST

    var openedProject by remember { mutableStateOf<Project?>(null) }
    var activeFilter by remember { mutableStateOf<Technologies?>(null) }

    val allTechnologies = remember { Technologies.getTechnologyFilters() }

    val filteredProjects = if (activeFilter == null) allProjects
    else allProjects.filter { it.technologies.contains(activeFilter) }

    ModalOverlay(
        isOpen = openedProject != null,
        onClose = { openedProject = null },
    ) {
        openedProject?.let { project ->
            ProjectModal(
                project = project,
                onClose = { openedProject = null }
            )
        }
    }

    // Page Hero
    Section(attrs = { classes("projects-hero") }) {
        H1 { Text("Projects") }
        P(attrs = { classes("projects-hero-desc") }) {
            Text("A collection of things I've built — from full-stack web apps to smaller experiments.")
        }

        // TODO: Decide if I want to list total projects, total technologies.
//        Div(attrs = { classes("projects-stats") }) {
//            Div(attrs = { classes("projects-stat") }) {
//                SpanText(text = "${allProjects.size}", modifier = Modifier.ModClasses("projects-stat-number"))
//                SpanText(text = "Projects", modifier = Modifier.ModClasses("projects-stat-label"))
//            }
//            Div(attrs = { classes("projects-stat-divider") }) {}
//            Div(attrs = { classes("projects-stat") }) {
//                SpanText(text = "${allTechnologies.size}", modifier = Modifier.ModClasses("projects-stat-number"))
//                SpanText(text = "Technologies", modifier = Modifier.ModClasses("projects-stat-label"))
//            }
//        }
    }

    // Featured project
    Section(attrs = { classes("content-section", "fade-in-slow") }) {
        SectionHeader(title = "Featured")
        Hr()
        ProjectCardFeatured(
            project = featuredProject,
            onProjectClick = { openedProject = it }
        )
    }

    // All Projects with filter
    Section(attrs = { classes("content-section", "fade-in-slow", "projects-all-section") }) {
        SectionHeader(title = "All Projects")
        Hr()

        Div(attrs = { classes("project-filter-tabs") }) {
            Div(attrs = {
                classes("project-filter-chip")
                if (activeFilter == null) classes("active")
                onClick { activeFilter = null }
            }) { Text("All") }

            allTechnologies.forEach { tech ->
                Div(attrs = {
                    classes("project-filter-chip")
                    if (activeFilter == tech) classes("active")
                    onClick { activeFilter = if (activeFilter == tech) null else tech }
                }) {
                    Text(tech.name.lowercase().replaceFirstChar { it.uppercase() })
                }
            }
        }

        SpanText(
            text = "${filteredProjects.size} project${if (filteredProjects.size != 1) "s" else ""}",
            modifier = Modifier.ModClasses("projects-count")
        )

        Div(attrs = { classes("projects-all-grid") }) {
            ProjectDisplay(
                projectList = filteredProjects,
                onProjectClick = { openedProject = it }
            )
        }
    }
}