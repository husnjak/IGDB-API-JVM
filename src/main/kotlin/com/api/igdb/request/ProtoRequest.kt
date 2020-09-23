package com.api.igdb.request

import com.api.igdb.apicalypse.APICalypse
import com.api.igdb.exceptions.RequestException
import com.api.igdb.utils.PublicEndpoint
import proto.*
import proto.Collection


@Throws(RequestException::class)
fun IGDBWrapper.ageRatings(APICalypse: APICalypse): List<AgeRating> {
    val bytes = apiProtoRequest(PublicEndpoint.AGE_RATINGS, APICalypse.buildQuery())
    return AgeRatingResult.parseFrom(bytes).ageratingsList
}

@Throws(RequestException::class)
fun IGDBWrapper.ageRatingContentDescriptions(APICalypse: APICalypse): List<AgeRatingContentDescription> {
    val bytes = apiProtoRequest(PublicEndpoint.AGE_RATING_CONTENT_DESCRIPTIONS, APICalypse.buildQuery())
    return AgeRatingContentDescriptionResult.parseFrom(bytes).ageratingcontentdescriptionsList
}

@Throws(RequestException::class)
fun IGDBWrapper.alternativeNames(APICalypse: APICalypse): List<AlternativeName> {
    val bytes = apiProtoRequest(PublicEndpoint.ALTERNATIVE_NAMES, APICalypse.buildQuery())
    return AlternativeNameResult.parseFrom(bytes).alternativenamesList
}

@Throws(RequestException::class)
fun IGDBWrapper.artworks(APICalypse: APICalypse): List<Artwork> {
    val bytes = apiProtoRequest(PublicEndpoint.ARTWORKS, APICalypse.buildQuery())
    return ArtworkResult.parseFrom(bytes).artworksList
}

@Throws(RequestException::class)
fun IGDBWrapper.characters(APICalypse: APICalypse): List<Character> {
    val bytes = apiProtoRequest(PublicEndpoint.CHARACTERS, APICalypse.buildQuery())
    return CharacterResult.parseFrom(bytes).charactersList
}

@Throws(RequestException::class)
fun IGDBWrapper.collections(APICalypse: APICalypse): List<Collection> {
    val bytes = apiProtoRequest(PublicEndpoint.COLLECTIONS, APICalypse.buildQuery())
    return CollectionResult.parseFrom(bytes).collectionsList
}

@Throws(RequestException::class)
fun IGDBWrapper.characterMugShots(APICalypse: APICalypse): List<CharacterMugShot> {
    val bytes = apiProtoRequest(PublicEndpoint.CHARACTER_MUG_SHOTS, APICalypse.buildQuery())
    return CharacterMugShotResult.parseFrom(bytes).charactermugshotsList
}

@Throws(RequestException::class)
fun IGDBWrapper.companies(APICalypse: APICalypse): List<Company> {
    val bytes = apiProtoRequest(PublicEndpoint.COMPANIES, APICalypse.buildQuery())
    return CompanyResult.parseFrom(bytes).companiesList
}

@Throws(RequestException::class)
fun IGDBWrapper.companyWebsites(APICalypse: APICalypse): List<CompanyWebsite> {
    val bytes = apiProtoRequest(PublicEndpoint.COMPANY_WEBSITES, APICalypse.buildQuery())
    return CompanyWebsiteResult.parseFrom(bytes).companywebsitesList
}

@Throws(RequestException::class)
fun IGDBWrapper.companyLogos(APICalypse: APICalypse): List<CompanyLogo> {
    val bytes = apiProtoRequest(PublicEndpoint.COMPANY_LOGOS, APICalypse.buildQuery())
    return CompanyLogoResult.parseFrom(bytes).companylogosList
}

@Throws(RequestException::class)
fun IGDBWrapper.covers(APICalypse: APICalypse): List<Cover> {
    val bytes = apiProtoRequest(PublicEndpoint.COVERS, APICalypse.buildQuery())
    return CoverResult.parseFrom(bytes).coversList
}

@Throws(RequestException::class)
fun IGDBWrapper.externalGames(APICalypse: APICalypse): List<ExternalGame> {
    val bytes = apiProtoRequest(PublicEndpoint.EXTERNAL_GAMES, APICalypse.buildQuery())
    return ExternalGameResult.parseFrom(bytes).externalgamesList
}

@Throws(RequestException::class)
fun IGDBWrapper.franchises(APICalypse: APICalypse): List<Franchise> {
    val bytes = apiProtoRequest(PublicEndpoint.FRANCHISES, APICalypse.buildQuery())
    return FranchiseResult.parseFrom(bytes).franchisesList
}

@Throws(RequestException::class)
fun IGDBWrapper.games(APICalypse: APICalypse): List<Game> {
    val bytes = apiProtoRequest(PublicEndpoint.GAMES, APICalypse.buildQuery())
    return GameResult.parseFrom(bytes).gamesList
}

@Throws(RequestException::class)
fun IGDBWrapper.gameEngines(APICalypse: APICalypse): List<GameEngine> {
    val bytes = apiProtoRequest(PublicEndpoint.GAME_ENGINES, APICalypse.buildQuery())
    return GameEngineResult.parseFrom(bytes).gameenginesList
}

@Throws(RequestException::class)
fun IGDBWrapper.gameEngineLogos(APICalypse: APICalypse): List<GameEngineLogo> {
    val bytes = apiProtoRequest(PublicEndpoint.GAME_ENGINE_LOGOS, APICalypse.buildQuery())
    return GameEngineLogoResult.parseFrom(bytes).gameenginelogosList
}

@Throws(RequestException::class)
fun IGDBWrapper.gameModes(APICalypse: APICalypse): List<GameMode> {
    val bytes = apiProtoRequest(PublicEndpoint.GAME_MODES, APICalypse.buildQuery())
    return GameModeResult.parseFrom(bytes).gamemodesList
}

@Throws(RequestException::class)
fun IGDBWrapper.gameVersion(APICalypse: APICalypse): List<GameVersion> {
    val bytes = apiProtoRequest(PublicEndpoint.GAME_VERSIONS, APICalypse.buildQuery())
    return GameVersionResult.parseFrom(bytes).gameversionsList
}

@Throws(RequestException::class)
fun IGDBWrapper.gameVersionFeatures(APICalypse: APICalypse): List<GameVersionFeature> {
    val bytes = apiProtoRequest(PublicEndpoint.GAME_VERSION_FEATURES, APICalypse.buildQuery())
    return GameVersionFeatureResult.parseFrom(bytes).gameversionfeaturesList
}

@Throws(RequestException::class)
fun IGDBWrapper.gameVersionFeatureValues(APICalypse: APICalypse): List<GameVersionFeatureValue> {
    val bytes = apiProtoRequest(PublicEndpoint.GAME_VERSION_FEATURE_VALUES, APICalypse.buildQuery())
    return GameVersionFeatureValueResult.parseFrom(bytes).gameversionfeaturevaluesList
}

@Throws(RequestException::class)
fun IGDBWrapper.gameVideos(APICalypse: APICalypse): List<GameVideo> {
    val bytes = apiProtoRequest(PublicEndpoint.GAME_VIDEOS, APICalypse.buildQuery())
    return GameVideoResult.parseFrom(bytes).gamevideosList
}

@Throws(RequestException::class)
fun IGDBWrapper.genres(APICalypse: APICalypse): List<Genre> {
    val bytes = apiProtoRequest(PublicEndpoint.GENRES, APICalypse.buildQuery())
    return GenreResult.parseFrom(bytes).genresList
}

@Throws(RequestException::class)
fun IGDBWrapper.involvedCompanies(APICalypse: APICalypse): List<InvolvedCompany> {
    val bytes = apiProtoRequest(PublicEndpoint.INVOLVED_COMPANIES, APICalypse.buildQuery())
    return InvolvedCompanyResult.parseFrom(bytes).involvedcompaniesList
}

@Throws(RequestException::class)
fun IGDBWrapper.keywords(APICalypse: APICalypse): List<Keyword> {
    val bytes = apiProtoRequest(PublicEndpoint.KEYWORDS, APICalypse.buildQuery())
    return KeywordResult.parseFrom(bytes).keywordsList
}

@Throws(RequestException::class)
fun IGDBWrapper.multiplayerModes(APICalypse: APICalypse): List<MultiplayerMode> {
    val bytes = apiProtoRequest(PublicEndpoint.MULTIPLAYER_MODES, APICalypse.buildQuery())
    return MultiplayerModeResult.parseFrom(bytes).multiplayermodesList
}

@Throws(RequestException::class)
fun IGDBWrapper.platforms(APICalypse: APICalypse): List<Platform> {
    val bytes = apiProtoRequest(PublicEndpoint.PLATFORMS, APICalypse.buildQuery())
    return PlatformResult.parseFrom(bytes).platformsList
}

@Throws(RequestException::class)
fun IGDBWrapper.platformLogos(APICalypse: APICalypse): List<PlatformLogo> {
    val bytes = apiProtoRequest(PublicEndpoint.PLATFORM_LOGOS, APICalypse.buildQuery())
    return PlatformLogoResult.parseFrom(bytes).platformlogosList
}

@Throws(RequestException::class)
fun IGDBWrapper.platformVersions(APICalypse: APICalypse): List<PlatformVersion> {
    val bytes = apiProtoRequest(PublicEndpoint.PLATFORM_VERSIONS, APICalypse.buildQuery())
    return PlatformVersionResult.parseFrom(bytes).platformversionsList
}

@Throws(RequestException::class)
fun IGDBWrapper.platformVersionCompanies(APICalypse: APICalypse): List<PlatformVersionCompany> {
    val bytes = apiProtoRequest(PublicEndpoint.PLATFORM_VERSION_COMPANIES, APICalypse.buildQuery())
    return PlatformVersionCompanyResult.parseFrom(bytes).platformversioncompaniesList
}

@Throws(RequestException::class)
fun IGDBWrapper.platformVersionReleaseDates(APICalypse: APICalypse): List<PlatformVersionReleaseDate> {
    val bytes = apiProtoRequest(PublicEndpoint.PLATFORM_VERSION_RELEASE_DATES, APICalypse.buildQuery())
    return PlatformVersionReleaseDateResult.parseFrom(bytes).platformversionreleasedatesList
}

@Throws(RequestException::class)
fun IGDBWrapper.platformWebsites(APICalypse: APICalypse): List<PlatformWebsite> {
    val bytes = apiProtoRequest(PublicEndpoint.PLATFORM_WEBSITES, APICalypse.buildQuery())
    return PlatformWebsiteResult.parseFrom(bytes).platformwebsitesList
}

@Throws(RequestException::class)
fun IGDBWrapper.playerPerspectives(APICalypse: APICalypse): List<PlayerPerspective> {
    val bytes = apiProtoRequest(PublicEndpoint.PLAYER_PERSPECTIVES, APICalypse.buildQuery())
    return PlayerPerspectiveResult.parseFrom(bytes).playerperspectivesList
}

@Throws(RequestException::class)
fun IGDBWrapper.platformFamilies(APICalypse: APICalypse): List<PlatformFamily> {
    val bytes = apiProtoRequest(PublicEndpoint.PLATFORM_FAMILIES, APICalypse.buildQuery())
    return PlatformFamilyResult.parseFrom(bytes).platformfamiliesList
}

@Throws(RequestException::class)
fun IGDBWrapper.releaseDates(APICalypse: APICalypse): List<ReleaseDate> {
    val bytes = apiProtoRequest(PublicEndpoint.RELEASE_DATES, APICalypse.buildQuery())
    return ReleaseDateResult.parseFrom(bytes).releasedatesList
}

@Throws(RequestException::class)
fun IGDBWrapper.screenshots(APICalypse: APICalypse): List<Screenshot> {
    val bytes = apiProtoRequest(PublicEndpoint.SCREENSHOTS, APICalypse.buildQuery())
    return ScreenshotResult.parseFrom(bytes).screenshotsList
}

@Throws(RequestException::class)
fun IGDBWrapper.search(APICalypse: APICalypse): List<Search> {
    val bytes = apiProtoRequest(PublicEndpoint.SEARCH, APICalypse.buildQuery())
    return SearchResult.parseFrom(bytes).searchesList
}

@Throws(RequestException::class)
fun IGDBWrapper.themes(APICalypse: APICalypse): List<Theme> {
    val bytes = apiProtoRequest(PublicEndpoint.THEMES, APICalypse.buildQuery())
    return ThemeResult.parseFrom(bytes).themesList
}

@Throws(RequestException::class)
fun IGDBWrapper.websites(APICalypse: APICalypse): List<Website> {
    val bytes = apiProtoRequest(PublicEndpoint.WEBSITES, APICalypse.buildQuery())
    return WebsiteResult.parseFrom(bytes).websitesList
}
