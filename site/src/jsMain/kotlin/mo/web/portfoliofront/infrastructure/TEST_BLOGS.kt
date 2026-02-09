package mo.web.portfoliofront.infrastructure

import mo.web.portfoliofront.infrastructure.models.Blog
import mo.web.portfoliofront.infrastructure.models.BlogLink

/**
 * A list of sample blog posts for testing the UI.
 */
val TEST_BLOGS: List<Blog> = listOf(
    Blog(
        title = "Getting Started with Kotlin Multiplatform",
        date = "March 15, 2023",
        description = "Learn how to set up your first Kotlin Multiplatform project and share code between different platforms.",
        imageUrl = "https://i.postimg.cc/bwYyhpXH/goalblogs-home.png",
        link = BlogLink(
            presentation = "Read More",
            url = "https://example.com/kotlin-multiplatform"
        )
    ),
    Blog(
        title = "Building Web Applications with Kobweb",
        date = "April 22, 2023",
        description = "Explore how to create modern web applications using Kobweb, a Kotlin framework for building web UIs.",
        imageUrl = "https://i.postimg.cc/bwYyhpXH/goalblogs-home.png",
        link = BlogLink(
            presentation = "Read More",
            url = "https://example.com/kobweb"
        )
    ),
    Blog(
        title = "Responsive Design Patterns in CSS",
        date = "May 10, 2023",
        description = "Discover effective patterns for creating responsive layouts that work across all device sizes.",
        imageUrl = "https://i.postimg.cc/bwYyhpXH/goalblogs-home.png",
        link = BlogLink(
            presentation = "Read More",
            url = "https://example.com/responsive-design"
        )
    )
)