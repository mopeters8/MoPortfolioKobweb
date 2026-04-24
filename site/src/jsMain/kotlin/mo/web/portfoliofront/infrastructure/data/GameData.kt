package mo.web.portfoliofront.infrastructure.data

import mo.web.portfoliofront.infrastructure.models.Game
import mo.web.portfoliofront.infrastructure.models.GameType

// Steam CDN URL pattern: https://cdn.cloudflare.steamstatic.com/steam/apps/{APP_ID}/library_600x900.jpg
// Use this for any game available on Steam — free, Cloudflare-backed, consistent 600x900 portrait art.

val GAMES_LIST = listOf(

    // ── Featured favorites (shown on About page) ──────────────────────────────

    Game(
        title = "Halo",
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
        coverImageUrl = "https://cdn2.steamgriddb.com/thumb/b3049ee4f30b41fa9f41d88a0068f65c.jpg",
        rating = 9,
        type = GameType.VideoGame,
        featured = true,
        mosPick = true,
        platform = "Xbox / PC",
        review = "Grew up on it. MW1/MW2 what I was raised on, Black Ops 2 was the peak, but I've had great memories across nearly every title. One of the few games where I genuinely enjoyed the grind."
    ),

    Game(
        title = "Minecraft",
        coverImageUrl = "https://cdn2.steamgriddb.com/thumb/286afc63607600765569a515dabc500d.jpg",
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
        title = "The Elder Scrolls V: Skyrim",
        coverImageUrl = "https://cdn2.steamgriddb.com/thumb/d17f1582a4c9ae2078ae91ca7b5645ea.jpg",
        rating = 9,
        type = GameType.VideoGame,
        featured = true,
        mosPick = true,
        platform = "Tabletop",
        review = "The card game that took over game night. Easy to learn, brutal to master, and every expansion adds real variety. Perfect for a group of 3–6."
    ),

    Game(
        title = "Here to Slay",
        coverImageUrl = "https://cf.geekdo-images.com/ozUv3be9fcf28tJk30bNow__itemrep@2x/img/9MTs9WeXP_Rna61_nWNJyeDswSQ=/fit-in/492x600/filters:strip_icc()/pic5181432.jpg",
        rating = 8,
        type = GameType.CardGame,
        featured = true,
        mosPick = true,
        platform = "Tabletop",
        review = "The card game that took over game night. Easy to learn, brutal to master, and every expansion adds real variety. Perfect for a group of 3–6."
    ),

    // ── Full games list (shown on /games page) ────────────────────────────────

    Game(
        title = "Valorant",
        coverImageUrl = "https://cdn2.steamgriddb.com/thumb/3a06f95569b14f0db46a80796966456b.jpg",
        rating = 6,
        type = GameType.VideoGame,
        platform = "PC",
        review = "Great gunplay, solid agent design. The ranked grind got exhausting but I respect what Riot built."
    ),

    Game(
        title = "Stardew Valley",
        coverImageUrl = "https://cdn.cloudflare.steamstatic.com/steam/apps/413150/library_600x900.jpg",
        rating = 7,
        type = GameType.VideoGame,
        platform = "PC",
        review = "The most relaxing game I've ever played. Perfect for winding down after a long day."
    ),

)

val FEATURED_GAMES: List<Game> = GAMES_LIST.filter { it.featured }
