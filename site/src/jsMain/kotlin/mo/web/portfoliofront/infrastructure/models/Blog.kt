package mo.web.portfoliofront.infrastructure.models

/**
 * Data class representing a blog post with basic properties.
 */
data class Blog(
    val title: String,
    val date: String,
    val description: String,
    val imageUrl: String? = null,
    val link: BlogLink? = null
)

/**
 * Data class representing a link to a blog post.
 */
data class BlogLink(
    val presentation: String,
    val url: String
)