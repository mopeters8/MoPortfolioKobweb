package mo.web.portfoliofront.infrastructure.models

enum class BlogType() {
    Technology,
    Gaming,
    Programming,
    Life
}

/**
 * Data class representing a blog post with basic properties.
 */
data class Blog(
    val title: String,
    val subtitle: String,
    val url: String,
    val created: String,
    val readtime: Int,
    val blogType: BlogType
)

fun List<Blog>.sortedByNewest(): List<Blog> = sortedByDescending { it.created }

fun List<Blog>.personalBlogs(): List<Blog> =
    filter { it.blogType == BlogType.Gaming || it.blogType == BlogType.Life }
        .sortedByNewest()