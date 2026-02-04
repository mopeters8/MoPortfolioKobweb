import com.varabyte.kobweb.gradle.application.util.configAsKobwebApplication
import com.varabyte.kobweb.gradle.core.util.importCss
import kotlinx.html.link
import kotlinx.html.style

plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.compose.compiler)
    alias(libs.plugins.kobweb.application)
    alias(libs.plugins.kobwebx.markdown)
}

group = "mo.web.portfoliofront"
version = "1.0-SNAPSHOT"

kobweb {
    app {
        index {
            description.set("Owen Peters Portfolio!")
            head.add {
                link(rel = "stylesheet", href = "/index.css")
            }
        }
    }
}

kotlin {
    configAsKobwebApplication("portfoliofront")

    sourceSets {
        jsMain.dependencies {
            implementation(libs.compose.runtime)
            implementation(libs.compose.html.core)
            implementation(libs.kobweb.core)
            implementation(libs.kobweb.silk)
            implementation(libs.silk.icons.fa)
            implementation(libs.kobwebx.markdown)
            implementation(project(":worker"))
        }
    }
}
