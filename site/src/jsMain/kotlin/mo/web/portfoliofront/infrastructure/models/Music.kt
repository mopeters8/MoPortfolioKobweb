package mo.web.portfoliofront.infrastructure.models

data class SpotifyEmbed(
    val title: String,
    val artist: String,
    val iframeCode: String  // paste the full <iframe ...> snippet from Spotify's share → embed
)
