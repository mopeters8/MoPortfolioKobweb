import com.varabyte.kobweb.gradle.application.util.configAsKobwebApplication
import kotlinx.html.link
import kotlinx.html.script

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
                link(rel = "stylesheet", href = "/reset.css")
                link(rel = "stylesheet", href = "/styles.css")
                link(rel = "stylesheet", href = "/projects.css")
                link(rel = "stylesheet", href = "/about.css")
                link(rel = "stylesheet", href = "/blog.css")
                link(rel = "stylesheet", href = "/games.css")
                link(rel = "stylesheet", href = "/photos.css")

                link(rel = "preconnect", href = "https://fonts.googleapis.com")
                link(rel = "preconnect", href = "https://fonts.gstatic.com")
                link(rel = "stylesheet", href = "https://fonts.googleapis.com/css2?family=Lexend:wght@100..900&display=swap")

                script {
                    src = "https://cdn.jsdelivr.net/npm/@emailjs/browser@4/dist/email.min.js"
                    type = "text/javascript"
                }
            }
        }
    }
    markdown {
        defaultLayout.set(".components.layout.MarkdownLayout")
        process.set { markdownEntries ->

            // Local model used only during Gradle processing — mirrors Blog.kt fields
            data class BlogEntry(
                val title: String,
                val subtitle: String,
                val url: String,
                val created: String,
                val readtime: Int,
                val blogType: String
            ) {
                private fun String.esc() = replace("\"", "\\\"")
                fun toKotlin() =
                    """    
                    Blog(
                        title = "${title.esc()}",
                        subtitle = "${subtitle.esc()}",
                        url = "$url",
                        created = "$created",
                        readtime = $readtime,
                        blogType = BlogType.$blogType
                    )
                    """
                }

            val blogEntries = markdownEntries
                .filter { it.route.startsWith("/blog/") }
                .mapNotNull { entry ->
                    val fm = entry.frontMatter
                    val title = fm["title"]?.singleOrNull() ?: run {
                        println("Skipping ${entry.filePath}: missing 'title'")
                        return@mapNotNull null
                    }
                    val subtitle = fm["subtitle"]?.singleOrNull() ?: run {
                        println("Skipping ${entry.filePath}: missing 'subtitle'")
                        return@mapNotNull null
                    }
                    val created = fm["created"]?.singleOrNull() ?: run {
                        println("Skipping ${entry.filePath}: missing 'created'")
                        return@mapNotNull null
                    }
                    val readtime = fm["readtime"]?.singleOrNull()?.toIntOrNull() ?: run {
                        println("Skipping ${entry.filePath}: missing or invalid 'readtime'")
                        return@mapNotNull null
                    }
                    val blogType = fm["blogType"]?.singleOrNull() ?: "Life"

                    BlogEntry(
                        title = title,
                        subtitle = subtitle,
                        url = entry.route,
                        created = created,
                        readtime = readtime,
                        blogType = blogType
                    )
                }
                .sortedByDescending { it.created }

            generateKotlin(
                filePath = "mo/web/portfoliofront/infrastructure/data/BlogList.kt",
                content = buildString {
                    appendLine("package mo.web.portfoliofront.infrastructure.data")
                    appendLine()
                    appendLine("import mo.web.portfoliofront.infrastructure.models.Blog")
                    appendLine("import mo.web.portfoliofront.infrastructure.models.BlogType")
                    appendLine()
                    appendLine("val BLOG_GENERATED_LIST = listOf(")
                    blogEntries.forEach { appendLine(it.toKotlin() + ",") }
                    appendLine(")")
                }
            )
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
