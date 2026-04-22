package mo.web.portfoliofront.infrastructure.models

data class Photo(
    val imageUrl: String,
    val alt: String,
    val caption: String? = null
)
