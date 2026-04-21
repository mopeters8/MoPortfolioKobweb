package mo.web.portfoliofront.infrastructure.data

import mo.web.portfoliofront.infrastructure.models.Blog
import mo.web.portfoliofront.infrastructure.models.BlogType

val BLOG_LIST = listOf(
    Blog(
        title = "My Favorite Games of 2025",
        subtitle = "I promised myself I'd touch grass, but the ground was frozen and the game was warm.",
        url = "https://blog.owen-peters.com/posts/favorite-games-of-2025",
        created = "2024-01-01",
        readtime = 5,
        blogType = BlogType.Gaming
    ),
    Blog(
        title = "New Blog! What are the changes?",
        subtitle = "A deep dive into Kotlin Multiplatform development",
        url = "https://blog.owen-peters.com/posts/exploring-kotlin-multiplatform",
        created = "2024-02-15",
        readtime = 5,
        blogType = BlogType.Programming
    ),
)
