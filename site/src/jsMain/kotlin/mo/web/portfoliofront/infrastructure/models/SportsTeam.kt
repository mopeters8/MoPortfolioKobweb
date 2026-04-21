package mo.web.portfoliofront.infrastructure.models

data class SportsTeam(
    val name: String,
    val sport: String,
    val logoPath: String,               // e.g. "/images/teams/raiders.png"
    val secondImage: String? = null, // optional personal photo shown when card expands
    val description: String,
    val primaryColor: String,           // hex e.g. "#000000"
    val secondaryColor: String          // hex e.g. "#A5ACAF"
)
