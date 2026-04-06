package mo.web.portfoliofront.infrastructure.models

data class TechnicalSkill(
    val name: String,
    val category: SkillCategory,
    val iconUrl: String? = null,
)