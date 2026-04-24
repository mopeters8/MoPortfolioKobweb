package mo.web.portfoliofront.infrastructure.models

enum class GameType {
    VideoGame,
    BoardGame,
    CardGame
}

data class Game(
    val title: String,
    val coverImageUrl: String,
    val rating: Int,                       // 1–10
    val type: GameType,
    val featured: Boolean = false,         // shown in About page favorites row
    val mosPick: Boolean = false,          // rare gold badge on /games page
    val currentlyPlaying: Boolean = false, // pinned to top of All view
    val review: String = "",
    val platform: String? = null           // e.g. "PC", "Xbox / PC", "Tabletop"
)

fun Game.toSlug(): String =
    title.lowercase().replace(" ", "-").replace(Regex("[^a-z0-9-]"), "")
