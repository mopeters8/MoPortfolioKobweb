package mo.web.portfoliofront.utility

import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.classNames
import org.jetbrains.compose.web.attributes.AttrsScope

fun Modifier.AttrClasses(classString: String): AttrsScope<*>.() -> Unit = {
    classes(*classString.split(Regex("\\s+")).toTypedArray())
}

fun Modifier.ModClasses(classString: String): Modifier {
    return this.classNames(classString.split(Regex("\\s+")))
}

