package mo.web.portfoliofront.infrastructure.models

/*
    I want to normalize each project into a data class.
    Sure, I will manually add the data classes instead of fetching but still helps with cleanliness.

 */
data class Project(
    // Main - Preview Card viewing Material
    val title: String,
    val description: String, // Small Preview Text
    val overview: String, // Detailed Text for Modal

    val linkInfo: ProjectLink,
    val date: String,
    val imageURLs: List<ProjectImage>,

    // Modal Information - More details
    val technologies: List<Technologies>,
    val features: List<String>,
    val challenges: List<String>,
    val experience: String,
)

data class ProjectLink(
    val presentation: String,
    val url: String,
)

data class ProjectImage(
    val src: String,
    val alt: String,
)

enum class Technologies(val iconUrl: String) {
    KOTLIN("/icons/Kotlin.svg"),
    KOBWEB("/icons/kobweb.svg"),
    KTOR("/icons/ktor.svg"),
    JOOQ("/icons/jooq.png"),
    PSQL("/icons/psql.svg"),
    POCKETBASE("/icons/pocketbase.svg"),
    MONGODB("/icons/mongodb.svg"),
    BOOTSTRAP("/icons/Bootstrap.svg"),
    NEXTJS("/icons/NextJs.svg"),
    SUPABASE("/icons/Supabase.svg"),

    DISCORD("https://www.svgrepo.com/show/353655/discord-icon.svg")

    ;

    companion object {
        fun getTechnologyFilters(): List<Technologies> {
            return listOf<Technologies>(KOTLIN, KOBWEB, KTOR, POCKETBASE, NEXTJS, SUPABASE)
        }
    }
}