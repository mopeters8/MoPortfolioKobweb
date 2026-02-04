package mo.web.portfoliofront.utility

import com.varabyte.kobweb.compose.ui.Modifier
import org.jetbrains.compose.web.attributes.AttrsScope

fun Modifier.custClasses(classString: String): AttrsScope<*>.() -> Unit = {
    classes(*classString.split(Regex("\\s+")).toTypedArray())
}
