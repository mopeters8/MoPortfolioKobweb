package mo.web.portfoliofront.infrastructure.data

import mo.web.portfoliofront.infrastructure.models.Project
import mo.web.portfoliofront.infrastructure.models.ProjectImage
import mo.web.portfoliofront.infrastructure.models.ProjectLink
import mo.web.portfoliofront.infrastructure.models.Technologies

val FEATURED_PROJECT: Project = Project(
    title = "Goal Blogs",
    description = "Social platform to track your goals and share your experiences and accomplishments with others.",
    overview = "Goal Blogs is a social platform designed to help users track their goals and share their experiences and accomplishments with others. The platform allows users to create personalized profiles where they can list their goals, categorize them by type and visibility, and share updates on their progress. Users can also interact with each other's goals through likes and favorites, fostering a supportive community focused on personal growth and achievement.",
    linkInfo = ProjectLink(
        presentation = "GoalBlogs.com",
        url = "https://goalblogs.com"
    ),
    date = "November 2025",
    imageURLs = listOf(
        ProjectImage(src = "https://i.postimg.cc/bwYyhpXH/goalblogs-home.png", alt = "Home page for Goal Blogs"),
        ProjectImage(src = "https://i.postimg.cc/bwYyhpXH/goalblogs-home.png", alt = "Home page for Goal Blogs"),
        ProjectImage(src = "https://i.postimg.cc/bwYyhpXH/goalblogs-home.png", alt = "Home page for Goal Blogs")
    ),
    technologies = listOf(Technologies.KOTLIN, Technologies.KOBWEB, Technologies.KTOR, Technologies.JOOQ, Technologies.BOOTSTRAP),
    features = listOf(
        "Personalized profiles to house and track your list of goals.",
        "Various goal types and visibilities, to make sure you are able to track your progress effectively.",
        "Likes and favorites to keep track of others goals you appreciate."
    ),
    challenges = listOf(
        "Security and Auth, as it's still relatively new to me.",
        "Scaling up an app with more features, making sure to keep both frontend and backend organized and in sync with updates."
    ),
    experience = "Testing out the experience of building a full stack app with Kotlin, using Ktor for the backend and Kobweb for the frontend. It's been a great learning experience so far, and I'm excited to continue improving and adding features to the app as I learn more about both technologies."
)

/*
    Rules: Number 1 on the list is the featured project.
    - Makes it easier later to slide down the rest when a new featured project is added.
 */
val PROJECTS_LIST: List<Project> = listOf(

    Project(
        title = "Braun Equipment",
        description = "Social platform to track your goals and share your experiences and accomplishments with others.",
        overview = "Goal Blogs is a social platform designed to help users track their goals and share their experiences and accomplishments with others. The platform allows users to create personalized profiles where they can list their goals, categorize them by type and visibility, and share updates on their progress. Users can also interact with each other's goals through likes and favorites, fostering a supportive community focused on personal growth and achievement.",
        linkInfo = ProjectLink(presentation = "GoalBlogs.com", url = "https://goalblogs.com"),
        date = "November 2025",
        imageURLs = listOf(ProjectImage(src = "https://i.postimg.cc/bwYyhpXH/goalblogs-home.png", alt = "Home page for Goal Blogs")),
        technologies = listOf(Technologies.KOTLIN, Technologies.KOBWEB, Technologies.KTOR, Technologies.JOOQ),
        features = listOf("Personalized profiles to house and track your list of goals.", "Various goal types and visibilities, to make sure you are able to track your progress effectively.", "Likes and favorites to keep track of others goals you appreciate."),
        challenges = listOf("Security and Auth, as it's still relatively new to me.", "Scaling up an app with more features, making sure to keep both frontend and backend organized and in sync with updates."),
        experience = "Testing out the experience of building a full stack app with Kotlin, using Ktor for the backend and Kobweb for the frontend. It's been a great learning experience so far, and I'm excited to continue improving and adding features to the app as I learn more about both technologies."
    ),

    Project(
        title = "Disc Golf Club",
        description = "Social platform to track your goals and share your experiences and accomplishments with others.",
        overview = "Goal Blogs is a social platform designed to help users track their goals and share their experiences and accomplishments with others. The platform allows users to create personalized profiles where they can list their goals, categorize them by type and visibility, and share updates on their progress. Users can also interact with each other's goals through likes and favorites, fostering a supportive community focused on personal growth and achievement.",
        linkInfo = ProjectLink(presentation = "GoalBlogs.com", url = "https://goalblogs.com"),
        date = "November 2025",
        imageURLs = listOf(ProjectImage(src = "https://i.postimg.cc/bwYyhpXH/goalblogs-home.png", alt = "Home page for Goal Blogs")),
        technologies = listOf(Technologies.KOTLIN, Technologies.KOBWEB, Technologies.KTOR, Technologies.JOOQ),
        features = listOf("Personalized profiles to house and track your list of goals.", "Various goal types and visibilities, to make sure you are able to track your progress effectively.", "Likes and favorites to keep track of others goals you appreciate."),
        challenges = listOf("Security and Auth, as it's still relatively new to me.", "Scaling up an app with more features, making sure to keep both frontend and backend organized and in sync with updates."),
        experience = "Testing out the experience of building a full stack app with Kotlin, using Ktor for the backend and Kobweb for the frontend. It's been a great learning experience so far, and I'm excited to continue improving and adding features to the app as I learn more about both technologies."
    ),

    Project(
        title = "Mo Blog",
        description = "Social platform to track your goals and share your experiences and accomplishments with others.",
        overview = "Goal Blogs is a social platform designed to help users track their goals and share their experiences and accomplishments with others. The platform allows users to create personalized profiles where they can list their goals, categorize them by type and visibility, and share updates on their progress. Users can also interact with each other's goals through likes and favorites, fostering a supportive community focused on personal growth and achievement.",
        linkInfo = ProjectLink(presentation = "GoalBlogs.com", url = "https://goalblogs.com"),
        date = "November 2025",
        imageURLs = listOf(ProjectImage(src = "https://i.postimg.cc/bwYyhpXH/goalblogs-home.png", alt = "Home page for Goal Blogs")),
        technologies = listOf(Technologies.KOTLIN, Technologies.KOBWEB, Technologies.KTOR, Technologies.JOOQ),
        features = listOf("Personalized profiles to house and track your list of goals.", "Various goal types and visibilities, to make sure you are able to track your progress effectively.", "Likes and favorites to keep track of others goals you appreciate."),
        challenges = listOf("Security and Auth, as it's still relatively new to me.", "Scaling up an app with more features, making sure to keep both frontend and backend organized and in sync with updates."),
        experience = "Testing out the experience of building a full stack app with Kotlin, using Ktor for the backend and Kobweb for the frontend. It's been a great learning experience so far, and I'm excited to continue improving and adding features to the app as I learn more about both technologies."
    ),

    Project(
        title = "This Portfolio",
        description = "Social platform to track your goals and share your experiences and accomplishments with others.",
        overview = "Goal Blogs is a social platform designed to help users track their goals and share their experiences and accomplishments with others. The platform allows users to create personalized profiles where they can list their goals, categorize them by type and visibility, and share updates on their progress. Users can also interact with each other's goals through likes and favorites, fostering a supportive community focused on personal growth and achievement.",
        linkInfo = ProjectLink(presentation = "GoalBlogs.com", url = "https://goalblogs.com"),
        date = "November 2025",
        imageURLs = listOf(ProjectImage(src = "https://i.postimg.cc/bwYyhpXH/goalblogs-home.png", alt = "Home page for Goal Blogs")),
        technologies = listOf(Technologies.KOTLIN, Technologies.KOBWEB, Technologies.KTOR, Technologies.JOOQ),
        features = listOf("Personalized profiles to house and track your list of goals.", "Various goal types and visibilities, to make sure you are able to track your progress effectively.", "Likes and favorites to keep track of others goals you appreciate."),
        challenges = listOf("Security and Auth, as it's still relatively new to me.", "Scaling up an app with more features, making sure to keep both frontend and backend organized and in sync with updates."),
        experience = "Testing out the experience of building a full stack app with Kotlin, using Ktor for the backend and Kobweb for the frontend. It's been a great learning experience so far, and I'm excited to continue improving and adding features to the app as I learn more about both technologies."
    ),

    Project(
        title = "Old Mo Blog",
        description = "Social platform to track your goals and share your experiences and accomplishments with others.",
        overview = "Goal Blogs is a social platform designed to help users track their goals and share their experiences and accomplishments with others. The platform allows users to create personalized profiles where they can list their goals, categorize them by type and visibility, and share updates on their progress. Users can also interact with each other's goals through likes and favorites, fostering a supportive community focused on personal growth and achievement.",
        linkInfo = ProjectLink(presentation = "GoalBlogs.com", url = "https://goalblogs.com"),
        date = "November 2025",
        imageURLs = listOf(ProjectImage(src = "https://i.postimg.cc/bwYyhpXH/goalblogs-home.png", alt = "Home page for Goal Blogs")),
        technologies = listOf(Technologies.KOTLIN, Technologies.KOBWEB, Technologies.KTOR, Technologies.JOOQ),
        features = listOf("Personalized profiles to house and track your list of goals.", "Various goal types and visibilities, to make sure you are able to track your progress effectively.", "Likes and favorites to keep track of others goals you appreciate."),
        challenges = listOf("Security and Auth, as it's still relatively new to me.", "Scaling up an app with more features, making sure to keep both frontend and backend organized and in sync with updates."),
        experience = "Testing out the experience of building a full stack app with Kotlin, using Ktor for the backend and Kobweb for the frontend. It's been a great learning experience so far, and I'm excited to continue improving and adding features to the app as I learn more about both technologies."
    ),

    Project(
        title = "FDC Disc Golf Club",
        description = "Social platform to track your goals and share your experiences and accomplishments with others.",
        overview = "Goal Blogs is a social platform designed to help users track their goals and share their experiences and accomplishments with others. The platform allows users to create personalized profiles where they can list their goals, categorize them by type and visibility, and share updates on their progress. Users can also interact with each other's goals through likes and favorites, fostering a supportive community focused on personal growth and achievement.",
        linkInfo = ProjectLink(presentation = "GoalBlogs.com", url = "https://goalblogs.com"),
        date = "November 2025",
        imageURLs = listOf(ProjectImage(src = "https://i.postimg.cc/bwYyhpXH/goalblogs-home.png", alt = "Home page for Goal Blogs")),
        technologies = listOf(Technologies.KOTLIN, Technologies.KOBWEB, Technologies.KTOR, Technologies.JOOQ),
        features = listOf("Personalized profiles to house and track your list of goals.", "Various goal types and visibilities, to make sure you are able to track your progress effectively.", "Likes and favorites to keep track of others goals you appreciate."),
        challenges = listOf("Security and Auth, as it's still relatively new to me.", "Scaling up an app with more features, making sure to keep both frontend and backend organized and in sync with updates."),
        experience = "Testing out the experience of building a full stack app with Kotlin, using Ktor for the backend and Kobweb for the frontend. It's been a great learning experience so far, and I'm excited to continue improving and adding features to the app as I learn more about both technologies."
    ),

    Project(
        title = "FDC Card Game",
        description = "Social platform to track your goals and share your experiences and accomplishments with others.",
        overview = "Goal Blogs is a social platform designed to help users track their goals and share their experiences and accomplishments with others. The platform allows users to create personalized profiles where they can list their goals, categorize them by type and visibility, and share updates on their progress. Users can also interact with each other's goals through likes and favorites, fostering a supportive community focused on personal growth and achievement.",
        linkInfo = ProjectLink(presentation = "GoalBlogs.com", url = "https://goalblogs.com"),
        date = "November 2025",
        imageURLs = listOf(ProjectImage(src = "https://i.postimg.cc/bwYyhpXH/goalblogs-home.png", alt = "Home page for Goal Blogs")),
        technologies = listOf(Technologies.KOTLIN, Technologies.KOBWEB, Technologies.KTOR, Technologies.JOOQ),
        features = listOf("Personalized profiles to house and track your list of goals.", "Various goal types and visibilities, to make sure you are able to track your progress effectively.", "Likes and favorites to keep track of others goals you appreciate."),
        challenges = listOf("Security and Auth, as it's still relatively new to me.", "Scaling up an app with more features, making sure to keep both frontend and backend organized and in sync with updates."),
        experience = "Testing out the experience of building a full stack app with Kotlin, using Ktor for the backend and Kobweb for the frontend. It's been a great learning experience so far, and I'm excited to continue improving and adding features to the app as I learn more about both technologies."
    ),

    Project(
        title = "ICYLeds.com",
        description = "Social platform to track your goals and share your experiences and accomplishments with others.",
        overview = "Goal Blogs is a social platform designed to help users track their goals and share their experiences and accomplishments with others. The platform allows users to create personalized profiles where they can list their goals, categorize them by type and visibility, and share updates on their progress. Users can also interact with each other's goals through likes and favorites, fostering a supportive community focused on personal growth and achievement.",
        linkInfo = ProjectLink(presentation = "GoalBlogs.com", url = "https://goalblogs.com"),
        date = "November 2025",
        imageURLs = listOf(ProjectImage(src = "https://i.postimg.cc/bwYyhpXH/goalblogs-home.png", alt = "Home page for Goal Blogs")),
        technologies = listOf(Technologies.KOTLIN, Technologies.KOBWEB, Technologies.KTOR, Technologies.JOOQ),
        features = listOf("Personalized profiles to house and track your list of goals.", "Various goal types and visibilities, to make sure you are able to track your progress effectively.", "Likes and favorites to keep track of others goals you appreciate."),
        challenges = listOf("Security and Auth, as it's still relatively new to me.", "Scaling up an app with more features, making sure to keep both frontend and backend organized and in sync with updates."),
        experience = "Testing out the experience of building a full stack app with Kotlin, using Ktor for the backend and Kobweb for the frontend. It's been a great learning experience so far, and I'm excited to continue improving and adding features to the app as I learn more about both technologies."
    ),

    Project(
        title = "Greenrebates.com",
        description = "Social platform to track your goals and share your experiences and accomplishments with others.",
        overview = "Goal Blogs is a social platform designed to help users track their goals and share their experiences and accomplishments with others. The platform allows users to create personalized profiles where they can list their goals, categorize them by type and visibility, and share updates on their progress. Users can also interact with each other's goals through likes and favorites, fostering a supportive community focused on personal growth and achievement.",
        linkInfo = ProjectLink(presentation = "GoalBlogs.com", url = "https://goalblogs.com"),
        date = "November 2025",
        imageURLs = listOf(ProjectImage(src = "https://i.postimg.cc/bwYyhpXH/goalblogs-home.png", alt = "Home page for Goal Blogs")),
        technologies = listOf(Technologies.KOTLIN, Technologies.KOBWEB, Technologies.KTOR, Technologies.JOOQ),
        features = listOf("Personalized profiles to house and track your list of goals.", "Various goal types and visibilities, to make sure you are able to track your progress effectively.", "Likes and favorites to keep track of others goals you appreciate."),
        challenges = listOf("Security and Auth, as it's still relatively new to me.", "Scaling up an app with more features, making sure to keep both frontend and backend organized and in sync with updates."),
        experience = "Testing out the experience of building a full stack app with Kotlin, using Ktor for the backend and Kobweb for the frontend. It's been a great learning experience so far, and I'm excited to continue improving and adding features to the app as I learn more about both technologies."
    ),
)
