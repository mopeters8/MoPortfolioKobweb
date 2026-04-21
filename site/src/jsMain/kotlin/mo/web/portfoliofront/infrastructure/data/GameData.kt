package mo.web.portfoliofront.infrastructure.data

import mo.web.portfoliofront.infrastructure.models.Game
import mo.web.portfoliofront.infrastructure.models.GameType

// Steam CDN URL pattern: https://cdn.cloudflare.steamstatic.com/steam/apps/{APP_ID}/library_600x900.jpg
// Use this for any game available on Steam — free, Cloudflare-backed, consistent 600x900 portrait art.

val GAMES_LIST = listOf(

    // ── Featured favorites (shown on About page) ──────────────────────────────

    Game(
        title = "Halo 2",
        // Halo: The Master Chief Collection on Steam (App 976730) — covers Halo 2
        coverImageUrl = "https://cdn.cloudflare.steamstatic.com/steam/apps/976730/library_600x900.jpg",
        rating = 10,
        type = GameType.VideoGame,
        featured = true,
        mosPick = true,
        platform = "Xbox / PC",
        review = "The game that started it all. My dad's original Xbox, Halo 2, and a CRT TV is responsible for basically every career decision I've made. Best multiplayer ever shipped."
    ),

    Game(
        title = "Call of Duty",
        coverImageUrl = "https://cdn.cloudflare.steamstatic.com/steam/apps/1938090/library_600x900.jpg", // TODO: pick your preferred CoD title's App ID
        rating = 9,
        type = GameType.VideoGame,
        featured = true,
        mosPick = true,
        platform = "Xbox / PC",
        review = "Grew up on it. Black Ops 2 is the peak but I've had great memories across nearly every title. One of the few games where I genuinely enjoyed the grind."
    ),

    Game(
        title = "Minecraft",
        coverImageUrl = "/images/games/minecraft.jpg",   // TODO: add local cover image (not on Steam)
        rating = 10,
        type = GameType.VideoGame,
        featured = true,
        mosPick = true,
        platform = "PC / Xbox",
        review = "Infinite creativity and still the most hours I've sunk into any single game. Running servers for friends is half the fun."
    ),

    Game(
        title = "Team Fortress 2",
        coverImageUrl = "https://cdn.cloudflare.steamstatic.com/steam/apps/440/library_600x900.jpg",
        rating = 9,
        type = GameType.VideoGame,
        featured = true,
        mosPick = true,
        platform = "PC",
        review = "Timeless. The class design is still unmatched in team shooters. I will defend TF2 as one of the greatest games ever made until I'm old and gray."
    ),

    Game(
        title = "Here to Slay",
        coverImageUrl = "/images/games/here-to-slay.jpg", // TODO: add local cover image (card game, not on Steam)
        rating = 9,
        type = GameType.CardGame,
        featured = true,
        mosPick = true,
        platform = "Tabletop",
        review = "The card game that took over game night. Easy to learn, brutal to master, and every expansion adds real variety. Perfect for a group of 3–6."
    ),

    // ── Full games list (shown on /games page) ────────────────────────────────

    Game(
        title = "Valorant",
        coverImageUrl = "https://cdn.cloudflare.steamstatic.com/steam/apps/2355570/library_600x900.jpg", // TODO: Valorant is not on Steam, replace with local image
        rating = 7,
        type = GameType.VideoGame,
        platform = "PC",
        review = "Great gunplay, solid agent design. The ranked grind got exhausting but I respect what Riot built."
    ),

    Game(
        title = "Stardew Valley",
        coverImageUrl = "https://cdn.cloudflare.steamstatic.com/steam/apps/413150/library_600x900.jpg",
        rating = 8,
        type = GameType.VideoGame,
        platform = "PC",
        review = "The most relaxing game I've ever played. Perfect for winding down after a long day."
    ),

)

val FEATURED_GAMES: List<Game> = GAMES_LIST.filter { it.featured }
