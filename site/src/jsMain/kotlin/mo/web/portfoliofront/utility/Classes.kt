package mo.web.portfoliofront.utility

import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.classNames
import org.jetbrains.compose.web.attributes.AttrsScope

fun Modifier.AttrClasses(classString: String): AttrsScope<*>.() -> Unit = {
    classes(*classString.split(Regex("\\s+")).toTypedArray())
}

// New overload: allow calling with a trailing attrs block like:
// Modifier.AttrClasses("resume-button") { attr("type", "button"); onClick { ... } }
fun Modifier.AttrClasses(classString: String, block: AttrsScope<*>.() -> Unit): AttrsScope<*>.() -> Unit = {
    classes(*classString.split(Regex("\\s+")).toTypedArray())
    block()
}

fun Modifier.ModClasses(classString: String): Modifier {
    return this.classNames(classString.split(Regex("\\s+")))
}
