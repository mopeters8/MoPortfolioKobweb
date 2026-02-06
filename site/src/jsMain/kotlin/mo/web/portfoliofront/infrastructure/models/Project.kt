package mo.web.portfoliofront.infrastructure.models

/*
    I want to normalize each project into a data class.
    Sure, I will manually add the data classes instead of fetching but still helps with cleanliness.

 */
data class Project(
    // Main - Preview Card viewing Material
    val title: String,
    val description: String,
    val linkInfo: ProjectLink,
    val date: String,
    val imageURLs: List<ProjectImage>,

    // Modal Information - More details
    val technologies: List<Technologies>,
    val features: List<String>,
    val challenges: List<String>,
)

data class ProjectLink(
    val presentation: String,
    val url: String,
)

data class ProjectImage(
    val src: String,
    val alt: String,
)

enum class Technologies {
    KOTLIN,
    KOBWEB,
    KTOR,
    JOOQ,
    PSQL,
    POCKETBASE,
    MONGODB,
}