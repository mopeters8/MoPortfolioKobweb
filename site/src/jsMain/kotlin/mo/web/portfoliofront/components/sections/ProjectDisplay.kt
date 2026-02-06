package mo.web.portfoliofront.components.sections

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.ui.Modifier
import mo.web.portfoliofront.components.ProjectCard
import mo.web.portfoliofront.infrastructure.models.Project
import mo.web.portfoliofront.utility.AttrClasses
import org.jetbrains.compose.web.dom.Div

@Composable
fun ProjectDisplay(
    projectList: List<Project>
) {
    Div(Modifier.AttrClasses("project-container")) {
        projectList.forEach { project ->
            repeat(3) {// TODO delete used for testing with only 1 project
                ProjectCard(proj = project)
            }
        }
    }
}