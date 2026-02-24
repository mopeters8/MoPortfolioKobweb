package mo.web.portfoliofront.pages

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.core.data.add
import com.varabyte.kobweb.core.init.InitRoute
import com.varabyte.kobweb.core.init.InitRouteContext
import com.varabyte.kobweb.core.layout.Layout
import mo.web.portfoliofront.components.layout.PageLayoutData

@InitRoute
fun initAboutPage(ctx: InitRouteContext) {
    ctx.data.add(PageLayoutData(title = "Owen Peters - About"))
}

@Page
@Layout(".components.layout.PageLayout")
@Composable
fun AboutPage() {

}