package com.api.igdb.request

import com.api.igdb.apicalypse.ApiCalypse
import com.api.igdb.exceptions.RequestException
import com.api.igdb.utils.PublicEndpoint

@Throws(RequestException::class)
fun ApiRequester.jsonAgeRatings(apiCalypse: ApiCalypse): String {
    return apiJsonRequest(PublicEndpoint.AGE_RATINGS, apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun ApiRequester.jsonAgeRatingContentDescriptions(apiCalypse: ApiCalypse): String {
    return apiJsonRequest(PublicEndpoint.AGE_RATING_CONTENT_DESCRIPTIONS, apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun ApiRequester.jsonAlternativeNames(apiCalypse: ApiCalypse): String {
    return apiJsonRequest(PublicEndpoint.ALTERNATIVE_NAMES, apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun ApiRequester.jsonArtworks(apiCalypse: ApiCalypse): String {
    return apiJsonRequest(PublicEndpoint.ARTWORKS, apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun ApiRequester.jsonCharacters(apiCalypse: ApiCalypse): String {
    return apiJsonRequest(PublicEndpoint.CHARACTERS, apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun ApiRequester.jsonCollections(apiCalypse: ApiCalypse): String {
    return apiJsonRequest(PublicEndpoint.COLLECTIONS, apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun ApiRequester.jsonCharacterMugShots(apiCalypse: ApiCalypse): String {
    return apiJsonRequest(PublicEndpoint.CHARACTER_MUG_SHOTS, apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun ApiRequester.jsonCompanies(apiCalypse: ApiCalypse): String {
    return apiJsonRequest(PublicEndpoint.COMPANIES, apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun ApiRequester.jsonCompanyWebsites(apiCalypse: ApiCalypse): String {
    return apiJsonRequest(PublicEndpoint.COMPANY_WEBSITES, apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun ApiRequester.jsonCompanyLogos(apiCalypse: ApiCalypse): String {
    return apiJsonRequest(PublicEndpoint.COMPANY_LOGOS, apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun ApiRequester.jsonCovers(apiCalypse: ApiCalypse): String {
    return apiJsonRequest(PublicEndpoint.COVERS, apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun ApiRequester.jsonExternalGames(apiCalypse: ApiCalypse): String {
    return apiJsonRequest(PublicEndpoint.EXTERNAL_GAMES, apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun ApiRequester.jsonFranchises(apiCalypse: ApiCalypse): String {
    return apiJsonRequest(PublicEndpoint.FRANCHISES, apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun ApiRequester.jsonGames(apiCalypse: ApiCalypse): String {
    return apiJsonRequest(PublicEndpoint.GAMES, apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun ApiRequester.jsonGameEngines(apiCalypse: ApiCalypse): String {
    return apiJsonRequest(PublicEndpoint.GAME_ENGINES, apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun ApiRequester.jsonGameEngineLogos(apiCalypse: ApiCalypse): String {
    return apiJsonRequest(PublicEndpoint.GAME_ENGINE_LOGOS, apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun ApiRequester.jsonGameModes(apiCalypse: ApiCalypse): String {
    return apiJsonRequest(PublicEndpoint.GAME_MODES, apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun ApiRequester.jsonGameVersion(apiCalypse: ApiCalypse): String {
    return apiJsonRequest(PublicEndpoint.GAME_VERSIONS, apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun ApiRequester.jsonGameVersionFeatures(apiCalypse: ApiCalypse): String {
    return apiJsonRequest(PublicEndpoint.GAME_VERSION_FEATURES, apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun ApiRequester.jsonGameVersionFeatureValues(apiCalypse: ApiCalypse): String {
    return apiJsonRequest(PublicEndpoint.GAME_VERSION_FEATURE_VALUES, apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun ApiRequester.jsonGameVideos(apiCalypse: ApiCalypse): String {
    return apiJsonRequest(PublicEndpoint.GAME_VIDEOS, apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun ApiRequester.jsonGenres(apiCalypse: ApiCalypse): String {
    return apiJsonRequest(PublicEndpoint.GENRES, apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun ApiRequester.jsonInvolvedCompanies(apiCalypse: ApiCalypse): String {
    return apiJsonRequest(PublicEndpoint.INVOLVED_COMPANIES, apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun ApiRequester.jsonKeywords(apiCalypse: ApiCalypse): String {
    return apiJsonRequest(PublicEndpoint.KEYWORDS, apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun ApiRequester.jsonMultiplayerModes(apiCalypse: ApiCalypse): String {
    return apiJsonRequest(PublicEndpoint.MULTIPLAYER_MODES, apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun ApiRequester.jsonPlatforms(apiCalypse: ApiCalypse): String {
    return apiJsonRequest(PublicEndpoint.PLATFORMS, apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun ApiRequester.jsonPlatformLogos(apiCalypse: ApiCalypse): String {
    return apiJsonRequest(PublicEndpoint.PLATFORM_LOGOS, apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun ApiRequester.jsonPlatformVersions(apiCalypse: ApiCalypse): String {
    return apiJsonRequest(PublicEndpoint.PLATFORM_VERSIONS, apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun ApiRequester.jsonPlatformVersionCompanies(apiCalypse: ApiCalypse): String {
    return apiJsonRequest(PublicEndpoint.PLATFORM_VERSION_COMPANIES, apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun ApiRequester.jsonPlatformVersionReleaseDates(apiCalypse: ApiCalypse): String {
    return apiJsonRequest(PublicEndpoint.PLATFORM_VERSION_RELEASE_DATES, apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun ApiRequester.jsonPlatformWebsites(apiCalypse: ApiCalypse): String {
    return apiJsonRequest(PublicEndpoint.PLATFORM_WEBSITES, apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun ApiRequester.jsonPlayerPerspectives(apiCalypse: ApiCalypse): String {
    return apiJsonRequest(PublicEndpoint.PLAYER_PERSPECTIVES, apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun ApiRequester.jsonPlatformFamilies(apiCalypse: ApiCalypse): String {
    return apiJsonRequest(PublicEndpoint.PLATFORM_FAMILIES, apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun ApiRequester.jsonReleaseDates(apiCalypse: ApiCalypse): String {
    return apiJsonRequest(PublicEndpoint.RELEASE_DATES, apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun ApiRequester.jsonScreenshots(apiCalypse: ApiCalypse): String {
    return apiJsonRequest(PublicEndpoint.SCREENSHOTS, apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun ApiRequester.jsonSearch(apiCalypse: ApiCalypse): String {
    return apiJsonRequest(PublicEndpoint.SEARCH, apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun ApiRequester.jsonThemes(apiCalypse: ApiCalypse): String {
    return apiJsonRequest(PublicEndpoint.THEMES, apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun ApiRequester.jsonWebsites(apiCalypse: ApiCalypse): String {
    return apiJsonRequest(PublicEndpoint.WEBSITES, apiCalypse.buildQuery())
}