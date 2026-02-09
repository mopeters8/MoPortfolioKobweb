package mo.web.portfoliofront.infrastructure

import mo.web.portfoliofront.infrastructure.models.Project
import mo.web.portfoliofront.infrastructure.models.ProjectImage
import mo.web.portfoliofront.infrastructure.models.ProjectLink
import mo.web.portfoliofront.infrastructure.models.Technologies

val FEATURED_PROJECT: Project = Project(
    title = "Goal Blogs",
    description = "Social platform to track your goals and share your experiences and accomplishments with others.",
    linkInfo = ProjectLink(
        presentation = "GoalBlogs.com",
        url = "https://goalblogs.com"
    ),
    date = "November 2025",
    imageURLs = listOf(
        ProjectImage(
            src = "https://i.postimg.cc/bwYyhpXH/goalblogs-home.png",
            alt = "Home page for Goal Blogs"
        )
    ),
    technologies = listOf(Technologies.KOTLIN, Technologies.KOBWEB, Technologies.KTOR, Technologies.JOOQ),
    features = listOf(
        "Personalized profiles to house and track your list of goals.",
        "Various goal types and visibilities, to make sure you are able to track your progress effectively.",
        "Likes and favorites to keep track of others goals you appreciate."
    ),
    challenges = listOf(
        "Security and Auth, as it's still relatively new to me.",
        "Scaling up an app with more features, making sure to keep both frontend and backend organized and in sync with updates."
    )
)

/*
    Rules: Number 1 on the list is the featured Project.
    - Makes it easier later for if I want to add my new featured, current priority project.
    - Easier to slide down the rest of the projects.
 */
val PROJECTS_LIST: List<Project> = listOf(

    // Goal Blogs
    Project(
        title = "Goal Blogs",
        description = "Social platform to track your goals and share your experiences and accomplishments with others.",
        linkInfo = ProjectLink(
            presentation = "GoalBlogs.com",
            url = "https://goalblogs.com"
        ),
        date = "November 2025",
        imageURLs = listOf(
            ProjectImage(
                src = "https://i.postimg.cc/bwYyhpXH/goalblogs-home.png",
                alt = "Home page for Goal Blogs"
            )
        ),
        technologies = listOf(Technologies.KOTLIN, Technologies.KOBWEB, Technologies.KTOR, Technologies.JOOQ),
        features = listOf(
            "Personalized profiles to house and track your list of goals.",
            "Various goal types and visibilities, to make sure you are able to track your progress effectively.",
            "Likes and favorites to keep track of others goals you appreciate."
        ),
        challenges = listOf(
            "Security and Auth, as it's still relatively new to me.",
            "Scaling up an app with more features, making sure to keep both frontend and backend organized and in sync with updates."
        )
    ),

    // Goal Blogs
    Project(
        title = "Disc Golf Club",
        description = "Social platform to track your goals and share your experiences and accomplishments with others.",
        linkInfo = ProjectLink(
            presentation = "GoalBlogs.com",
            url = "https://goalblogs.com"
        ),
        date = "November 2025",
        imageURLs = listOf(
            ProjectImage(
                src = "https://i.postimg.cc/bwYyhpXH/goalblogs-home.png",
                alt = "Home page for Goal Blogs"
            )
        ),
        technologies = listOf(Technologies.KOTLIN, Technologies.KOBWEB, Technologies.KTOR, Technologies.JOOQ),
        features = listOf(
            "Personalized profiles to house and track your list of goals.",
            "Various goal types and visibilities, to make sure you are able to track your progress effectively.",
            "Likes and favorites to keep track of others goals you appreciate."
        ),
        challenges = listOf(
            "Security and Auth, as it's still relatively new to me.",
            "Scaling up an app with more features, making sure to keep both frontend and backend organized and in sync with updates."
        )
    ),

    // Goal Blogs
    Project(
        title = "Mo Blog",
        description = "Social platform to track your goals and share your experiences and accomplishments with others.",
        linkInfo = ProjectLink(
            presentation = "GoalBlogs.com",
            url = "https://goalblogs.com"
        ),
        date = "November 2025",
        imageURLs = listOf(
            ProjectImage(
                src = "https://i.postimg.cc/bwYyhpXH/goalblogs-home.png",
                alt = "Home page for Goal Blogs"
            )
        ),
        technologies = listOf(Technologies.KOTLIN, Technologies.KOBWEB, Technologies.KTOR, Technologies.JOOQ),
        features = listOf(
            "Personalized profiles to house and track your list of goals.",
            "Various goal types and visibilities, to make sure you are able to track your progress effectively.",
            "Likes and favorites to keep track of others goals you appreciate."
        ),
        challenges = listOf(
            "Security and Auth, as it's still relatively new to me.",
            "Scaling up an app with more features, making sure to keep both frontend and backend organized and in sync with updates."
        )
    ),

)