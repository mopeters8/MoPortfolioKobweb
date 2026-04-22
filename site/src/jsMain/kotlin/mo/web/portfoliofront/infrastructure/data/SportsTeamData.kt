package mo.web.portfoliofront.infrastructure.data

import mo.web.portfoliofront.infrastructure.models.SportsTeam

val SPORTS_TEAMS_LIST = listOf(

    SportsTeam(
        name = "Las Vegas Raiders",
        sport = "NFL",
        logoPath = "/teams/raiders.svg",
        secondImage = null, // TODO
        description = "My dad's team, and now mine. Growing up watching the Raiders with him is one of my favorite memories — it's where my love for the sport started. Silver and Black runs deep, no matter the season.",
        primaryColor = "#000000",
        secondaryColor = "#A5ACAF"
    ),

    SportsTeam(
        name = "Golden State Warriors",
        sport = "NBA",
        logoPath = "/teams/warriors.svg",
        secondImage = null,                         // TODO: add personal photo
        description = "Bay Area born and raised — the Warriors have always been my team. The dynasty years were something special to watch, and Chase Center is a fantastic place to catch a game.",
        primaryColor = "#1D42BA",
        secondaryColor = "#FFC72C"
    ),

    SportsTeam(
        name = "San Jose Earthquakes",
        sport = "MLS",
        logoPath = "/teams/eathquakes.svg",
        secondImage = null,                         // TODO: add personal photo
        description = "Local MLS club and an underrated game-day experience. The Quakes have a passionate supporter section and PayPal Park is a great stadium to watch live soccer.",
        primaryColor = "#0D4C92",                         // TODO: verify exact Earthquakes navy
        secondaryColor = "#0D95D0"                        // TODO: verify exact Earthquakes sky blue
    ),

    SportsTeam(
        name = "Liverpool FC",
        sport = "Premier League",
        logoPath = "/teams/liverpool.svg",
        secondImage = null,
        description = "You'll Never Walk Alone. Got pulled into the Premier League through Liverpool and never looked back. Watching them fight through big European nights is some of the best football you'll ever see.",
        primaryColor = "#C8102E",
        secondaryColor = "#F6EB61"
    ),

    SportsTeam(
        name = "OpTic Gaming",
        sport = "Esports",
        logoPath = "/teams/optic.svg",            // TODO: add logo
        secondImage = null,                         // TODO: add personal photo
        description = "The Green Wall. OpTic has been my esports org since the early Call of Duty days on YouTube. They represent the culture of competitive gaming in a way no other org does.",
        primaryColor = "#000000",
        secondaryColor = "#39FF14"                        // TODO: verify exact OpTic neon green
    ),

    SportsTeam(
        name = "Gannon Buhr",
        sport = "Disc Golf",
        logoPath = "/teams/discmania.png",           // TODO: add logo
        secondImage = null,                         // TODO: add personal photo
        description = "My favorite pro disc golfer. Gannon is young, talented, and plays with a style that's fun to watch. Getting into disc golf seriously made following the DGPT a whole new layer of enjoyment.",
        primaryColor = "#2E7D32",                         // TODO: use Gannon's actual brand colors
        secondaryColor = "#FFFFFF"                        // TODO: verify
    ),

)
