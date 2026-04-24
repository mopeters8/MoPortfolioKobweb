package mo.web.portfoliofront.infrastructure.data

import mo.web.portfoliofront.infrastructure.models.Game
import mo.web.portfoliofront.infrastructure.models.GameType

// Steam CDN URL pattern: https://cdn.cloudflare.steamstatic.com/steam/apps/{APP_ID}/library_600x900.jpg
// Use this for any game available on Steam — free, Cloudflare-backed, consistent 600x900 portrait art.

/*
    TODO LIST
    - Outlast Trials
    - Marvel Rivals
    - Brotato
    - Black Mesa
    - Super Battle Golf
    - Balatro
    - Lego Party
    - Cult of the Lamb
    - Buckshot Roulette
    - Individual Halo Games
    - Individual COD Games
    - Payday 2
    - Peak
    - Skate
    - Destiny 1/2
    - Helldivers


    TO FINISH PLAYING AND DO:
    - Half Life 2
    - Portal 1
    - Portal 2
    - Mass Effect
    - Left 4 Dead


 */

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
        platform = "PC / Console",
        review = "Have been playing for years, a new playthrough once a year. The mods have made this games longevity INSANE for me, and the base game continues to shine where others still fail. One of the best games of all time IMO."
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
    
    Game(
        title = "Arc Raiders",
        coverImageUrl = "https://cdn2.steamgriddb.com/thumb/5373be3fc629b0f98ca1b669e54c0c17.jpg",
        rating = 8,
        type = GameType.VideoGame,
        featured = false,
        mosPick = true,
        currentlyPlaying = true,
        review = "Solid game any PvP or PvE enjoyer should try. Next level immersion, while keeping it casual and easy to understand. I am fortunate enough to have convinced my non gamer Uncle and Dad to get into this game - and now they are addicted. Maybe not everyones jam, but I think anyone could enjoy the beginning of this game. Very unique experience, coming from a Tarkov player.",
        platform = "PC"
    ),

    Game(
        title = "Escape From Tarkov",
        coverImageUrl = "https://cdn2.steamgriddb.com/thumb/ea9dc69aa87d34bba96112dcd72b211e.jpg",
        rating = 6,
        type = GameType.VideoGame,
        featured = false,
        mosPick = false,
        review = "My first experience in the extraction shooter genre. Over the years I had many play throughs. The bugs, lack of QoL, shitty developers make me relunctant to give it any higher of a score. While I love the experience, gun play, loot and atmosphere - it's just too hard to get into, not welcoming to new players and deserves to be trumped by other studios.",
        platform = "PC"
    ),

    // TODO: Finish and adjust score
    Game(
        title = "Metro 2033",
        coverImageUrl = "https://cdn2.steamgriddb.com/thumb/c79b09261c899f5507ac7bdf8e993f2b.jpg",
        rating = 7,
        type = GameType.VideoGame,
        featured = false,
        mosPick = false,
        currentlyPlaying = true,
        review = "What a treat of a game. Slightly older, but I love the grungy, post apocalyptic atmosphere. The immersion with the sounds, lack of hud, and solid graphics get me deeply immersed. It feels fairly easy to pick up, especially with it on my Steam Deck. The linear progression of the story makes it easy to consume, while still being able to be entrenched in immersion. Enjoying it so far, and plan to finish soon with a higher score if it keeps it up. ",
        platform = "PC"
    ),

    // TODO: Finish and adjust score
    Game(
        title = "Baldur's Gate 3",
        coverImageUrl = "https://cdn2.steamgriddb.com/thumb/5cdf5c84489e801e6bac5693b1c8e290.jpg",
        rating = 7,
        type = GameType.VideoGame,
        featured = false,
        mosPick = false,
        currentlyPlaying = true,
        review = "First time play through, second time doing anything DnD related. Graphics, atmosphere and character creation have been solid. This play through is with my cousins, family and friends - so going through this game in a crew will make me hopefully enjoy it even more. More thoughts to come..",
        platform = "PC"
    ),

    Game(
        title = "Warframe",
        coverImageUrl = "https://cdn2.steamgriddb.com/thumb/4e2a3c5332c92654090b105e3723479f.jpg",
        rating = 9,
        type = GameType.VideoGame,
        featured = false,
        mosPick = false,
        currentlyPlaying = false,
        review = "One of the best multiplayer games ever made. Makes you feel like a badass, insane amounts of content, hardly any MTX (its there, but 100% optional AND earnable in game) all while being free! I started playing back in middle school, but never took it serious until I was older. Actually grasping the systems and seeing how much free content there is, this is an easy recommend to literally any gamer. An easier on boarding for new players would make this a 10/10, and I have heard they are on the way.",
        platform = "PC / Console"
    ),

    Game(
        title = "CS2 / CSGO",
        coverImageUrl = "https://cdn2.steamgriddb.com/thumb/0662aa1719017e0efa5fa8daf0880c6e.jpg",
        rating = 7,
        type = GameType.VideoGame,
        featured = false,
        mosPick = false,
        currentlyPlaying = false,
        review = "I was able to release from this game. Many memories, maybe even more $$$ spent. Fun while it was here, but I can't hang with the young guns anymore, and just not looking for something so competitive. Another recommend to try for any PC gamer.",
        platform = "PC"
    ),

    Game(
        title = "Battlefield 6",
        coverImageUrl = "https://cdn2.steamgriddb.com/thumb/45713287ba01bb2c9dfa4a9c486e4cc9.jpg",
        rating = 6,
        type = GameType.VideoGame,
        featured = false,
        mosPick = false,
        currentlyPlaying = false,
        review = "Awesome addition to the franchise - it just wasn't the battlefield game I wanted. Totally subjective, and while I love all the systems of the game, the amount of content with maps, vehicles and other means of progression leave me wanting more. It feels like they mastered all of this in Battlefield 4, yet feel the need to reinvent the wheel with every new game.",
        platform = "PC"
    ),

    Game(
        title = "Battlefield 4",
        coverImageUrl = "https://cdn2.steamgriddb.com/thumb/771dd529ffdd3fda1a93ad0659a99bba.jpg",
        rating = 10,
        type = GameType.VideoGame,
        featured = false,
        mosPick = true,
        currentlyPlaying = false,
        review = "Favorite Battlefield game. The modern warfare, large scale battles, and large variety of weapons and methods to attack made this game a dream. While Premium was/is controversial, I enjoyed just how many new maps would come out for this game. Each DLC felt like a whole new game to explore, while the current drip feed content feels like scraps.",
        platform = "PC"
    ),

    Game(
        title = "Warhammer 40,000: Space Marine 2",
        coverImageUrl = "https://cdn2.steamgriddb.com/thumb/e8cd36a85b2cdfe7c02dfa9f001d68e0.jpg",
        rating = 8,
        type = GameType.VideoGame,
        featured = false,
        mosPick = true,
        currentlyPlaying = false,
        review = "First media foray into Warhammer 40k. While I do understand 40K universe a little bit, it's only been through YouTube videos. I love space marines, I love the imperium, so this game was everything I needed and wanted for my level of enjoyment in 40K. This game only made it worse, now I have read 2 books, have multiple figurines and enjoy countless art. (Dark Angels Enjoyer, sorry the colors are just too cool!)",
        platform = "PC"
    ),

    Game(
        title = "The Finals",
        coverImageUrl = "https://cdn2.steamgriddb.com/thumb/e7cb8104a3ea8d45834194f693384c2b.jpg",
        rating = 7,
        type = GameType.VideoGame,
        featured = false,
        mosPick = false,
        currentlyPlaying = false,
        review = "Too many are sleeping on Embark and the finals! This studio rocks with this game and Arc Raiders. The graphics, audio and atmoshpere taking place in a virtual video game make this game truly special. The gunplay, teamwork and gamemmodes are creative and give a whole new unique spin on arena shooter. It's free, its worth a shot! You'll get a few fun hours at minimum!",
        platform = "PC"
    ),

    Game(
        title = "Garry's Mod",
        coverImageUrl = "https://cdn2.steamgriddb.com/thumb/a2a9894ca446f0fe0aac693516c52c4d.jpg",
        rating = 6,
        type = GameType.VideoGame,
        featured = false,
        mosPick = false,
        currentlyPlaying = false,
        review = "The game that brought me to Steam! First game I ever purchased, way back in 2012 maybe? Low rating isn't because I don't like this, just never did anything in it that warranted some insane score or memories. Messing around with friends was fun, custom maps and addons were a joy. Definitely a recommend to any new Steam user.",
        platform = "PC"
    ),

    Game(
        title = "Borderlands 4",
        coverImageUrl = "https://cdn2.steamgriddb.com/thumb/d1e1fa0779ea7cf1f4fbe2403b99d226.jpg",
        rating = 5,
        type = GameType.VideoGame,
        featured = false,
        mosPick = false,
        currentlyPlaying = false,
        review = "Fun but forgettable. I have already forgotten most about the game, only few months after playing. The games steep price, poor performance and backwards feeling menus just made me question why so many studios get things right in previous games, then fail to execute on simply upgrading that. (Borderlands 2).",
        platform = "PC"
    ),

    Game(
        title = "Marathon",
        coverImageUrl = "https://cdn2.steamgriddb.com/thumb/fb8435fec3ba5c275b3c3a755324c61c.jpg",
        rating = 7,
        type = GameType.VideoGame,
        featured = false,
        mosPick = false,
        currentlyPlaying = false,
        review = "Awesome design from art to music, amazing gunplay given its Bungie, and solid take on extraction mechanics. Only thing that stops me from recommending more, is how competitive it got so fast. The niche extraction shooter genre, and low player count contribute heavily to that. The unique universe makes me wish Bungie would do more PvE with this game, as Marathon was a single player game AND the atmosphere is too good to ignore! However, the disapointing feeling of losing a raid, the commitment to time, and idea that I don't need another extraction shooter right now leave this pretty low on my todem pole for playing. ",
        platform = "PC"
    ),

    Game(
        title = "LOCKDOWN Protocol",
        coverImageUrl = "https://cdn2.steamgriddb.com/thumb/c8864f588e5f7c63712b612d6aafef0a.jpg",
        rating = 7,
        type = GameType.VideoGame,
        featured = false,
        mosPick = false,
        currentlyPlaying = false,
        review = "Calling this friendslop would be a disservice. Awesome, new fresh take on a first person among us. Sooo many laughs with friends on this game. If you have a decent sized crew, or are willing to meet others in random lobbies, this game is a blast! Don't be too sussy!",
        platform = "PC"
    ),

    Game(
        title = "Golf With Your Friends",
        coverImageUrl = "https://cdn2.steamgriddb.com/thumb/7b760eb81cb66af0bed3206d287c1cf3.jpg",
        rating = 7,
        type = GameType.VideoGame,
        featured = false,
        mosPick = false,
        currentlyPlaying = false,
        review = "Come on, you can't go wrong. Some simple golf with your friends to pass time is always great. Plenty of laughs, fun modes and maps. Easy recommend!",
        platform = "PC"
    ),

    Game(
        title = "Halo Infinite",
        coverImageUrl = "https://cdn2.steamgriddb.com/thumb/5e6f4ecb84c2cef4254267d8479a3fb4.jpg",
        rating = 5,
        type = GameType.VideoGame,
        featured = false,
        mosPick = false,
        currentlyPlaying = false,
        review = "This review here won't be able to capture all my feelings about Halo Infinite, and HaLo StUdIoS. To summarize my feelings, when I look at this game I feel like a disappointed family member. Full of hope for what could've been, but so sad to see it and the franchise in the state its in. Could've been so much more, even a return to greatness just continuously troubled by weird dumb decisions.",
        platform = "PC"
    ),

    Game(
        title = "Dead By Daylight",
        coverImageUrl = "https://cdn2.steamgriddb.com/thumb/420309902608f05802e6d9d942b6e0b1.jpg",
        rating = 7,
        type = GameType.VideoGame,
        featured = false,
        mosPick = false,
        currentlyPlaying = false,
        review = "Not my cup of tea, but I do recognize how fun rounds can be and how awesome this game is for the Horror enjoyers/community. The cast of villains is pretty wild, and yes I do get plenty scared playing this.",
        platform = "PC"
    ),

    Game(
        title = "REMATCH",
        coverImageUrl = "https://cdn2.steamgriddb.com/thumb/b88357d046ba1f1a3419f97551a419cd.jpg",
        rating = 5,
        type = GameType.VideoGame,
        featured = false,
        mosPick = false,
        currentlyPlaying = false,
        review = "Soccer player for life, so of course I had to snag a game that simulates that. Fun at first, but after seeing how try hard, sweaty and overall lame the mechanics got - its something I won't touch again. Again, lots of potential and they should've made it free to combat Rocket League.",
        platform = "PC"
    ),

    Game(
        title = "Hades",
        coverImageUrl = "https://cdn2.steamgriddb.com/thumb/bfe339860b048949369fc6945cea504d.jpg",
        rating = 8,
        type = GameType.VideoGame,
        featured = false,
        mosPick = false,
        currentlyPlaying = false,
        review = "Beautiful art, hard game. Cool story and characters, and rogue-like makes it's replayability awesome. The way the story is connected to you dying and restarting is super interesting. Stuck on the final boss, probably won't beat.",
        platform = "PC"
    ),

    Game(
        title = "Hades II",
        coverImageUrl = "https://cdn2.steamgriddb.com/thumb/b2c6c5b4f6992b115368bcb678c4662a.jpg",
        rating = 9,
        type = GameType.VideoGame,
        featured = false,
        mosPick = false,
        currentlyPlaying = false,
        review = "Beautiful art AGAIN! Absolutely stunning on an OLED. Although, hard game AGAIN. Cool story and characters AGAIN. Interesting story, but once again the game started to get a little too hard and asking for too much for me personally with really long sessions. Just couldn't find it in me to continue to the absolute end, but I am happy with where I am at.",
        platform = "PC"
    ),

).sortedByDescending { it.rating }

val FEATURED_GAMES: List<Game> = GAMES_LIST.filter { it.featured }
