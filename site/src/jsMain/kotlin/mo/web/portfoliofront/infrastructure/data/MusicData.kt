package mo.web.portfoliofront.infrastructure.data

import mo.web.portfoliofront.infrastructure.models.SpotifyEmbed

val MUSIC_LIST = listOf(

    SpotifyEmbed(
        title = "B2B",
        artist = "INFEKT",
        iframeCode = """
            <iframe data-testid="embed-iframe" style="border-radius:12px" src="https://open.spotify.com/embed/track/4rZ3SkUV5eL7jT9C1Cfs5d?utm_source=generator" width="100%" height="152" frameBorder="0" allowfullscreen="" allow="autoplay; clipboard-write; encrypted-media; fullscreen; picture-in-picture" loading="lazy"></iframe>
            """.trimIndent()
    ),

    SpotifyEmbed(
        title = "Pyro",
        artist = "Kings of Leon",
        iframeCode = """
            <iframe data-testid="embed-iframe" style="border-radius:12px" src="https://open.spotify.com/embed/track/0umDVf77ygI5RiVp9OvNDj?utm_source=generator" width="100%" height="152" frameBorder="0" allowfullscreen="" allow="autoplay; clipboard-write; encrypted-media; fullscreen; picture-in-picture" loading="lazy"></iframe>
            """.trimIndent()
    ),

    SpotifyEmbed(
        title = "You've Made Me So Very Happy",
        artist = "Alton Ellis",
        iframeCode = """
            <iframe data-testid="embed-iframe" style="border-radius:12px" src="https://open.spotify.com/embed/track/57BKgehOyI7PSnwVlEFuif?utm_source=generator" width="100%" height="152" frameBorder="0" allowfullscreen="" allow="autoplay; clipboard-write; encrypted-media; fullscreen; picture-in-picture" loading="lazy"></iframe>
            """.trimIndent()
    ),

)
