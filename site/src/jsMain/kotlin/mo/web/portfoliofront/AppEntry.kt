package mo.web.portfoliofront

import androidx.compose.runtime.*
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.core.App
import com.varabyte.kobweb.silk.SilkApp
import com.varabyte.kobweb.silk.init.InitSilk
import com.varabyte.kobweb.silk.init.InitSilkContext
import com.varabyte.kobweb.silk.init.registerStyleBase
import mo.web.portfoliofront.infrastructure.email.initEmailJS
import mo.web.portfoliofront.utility.Constants

@InitSilk
fun initStyles(ctx: InitSilkContext) {
    ctx.stylesheet.registerStyleBase("html, body") { Modifier.fillMaxHeight() }
}

@App
@Composable
fun AppEntry(content: @Composable () -> Unit) {
    LaunchedEffect(Unit) {
        initEmailJS(Constants.EMAIL_JS_PUBLIC_KEY)
    }

    SilkApp {
        content()

        /*
          This used to be here, not sure of the benefits just yet
          - especially if I am aiming for pure css files.

            Surface(Modifier.fillMaxHeight()) { }
         */
    }
}
