package mo.web.portfoliofront.components.sections

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.ui.Modifier
import mo.web.portfoliofront.components.ProjectCard
import mo.web.portfoliofront.infrastructure.models.Project
import mo.web.portfoliofront.utility.AttrClasses
import org.jetbrains.compose.web.dom.Div

@Composable
fun ProjectDisplay(
    projectList: List<Project>,
    onProjectClick: (Project) -> Unit,
) {
    Div(Modifier.AttrClasses("project-container")) {
        projectList.forEach { project ->
            ProjectCard(
                proj = project,
                onProjectClick = onProjectClick,
            )
        }
    }
}