package mo.web.portfoliofront.pages

import androidx.compose.runtime.*
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.core.data.add
import com.varabyte.kobweb.core.init.InitRoute
import com.varabyte.kobweb.core.init.InitRouteContext
import com.varabyte.kobweb.core.layout.Layout
import com.varabyte.kobweb.core.rememberPageContext
import org.jetbrains.compose.web.dom.Text
import com.varabyte.kobweb.worker.rememberWorker
import mo.web.portfoliofront.components.layout.PageLayoutData
import mo.web.portfoliofront.utility.custClasses
import mo.web.portfoliofront.worker.EchoWorker
import org.jetbrains.compose.web.dom.H1
import org.jetbrains.compose.web.dom.Main
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

    Main(Modifier.custClasses("main-section capped-width")) {

        Section(Modifier.custClasses("hero")) {
            H1 { Text("Owen Peters.") }
            P { Text("Developing, Learning, Living.") }
        }
    }

}
