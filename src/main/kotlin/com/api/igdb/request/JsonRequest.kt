package com.api.igdb.request

import com.api.igdb.apicalypse.ApiCalypse
import com.api.igdb.exceptions.RequestException
import com.api.igdb.utils.PublicEndpoint

@Throws(RequestException::class)
fun IGDBWrapper.jsonAgeRatings(apiCalypse: ApiCalypse): String {
    return apiJsonRequest(PublicEndpoint.AGE_RATINGS, apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonAgeRatingContentDescriptions(apiCalypse: ApiCalypse): String {
    return apiJsonRequest(PublicEndpoint.AGE_RATING_CONTENT_DESCRIPTIONS, apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonAlternativeNames(apiCalypse: ApiCalypse): String {
    return apiJsonRequest(PublicEndpoint.ALTERNATIVE_NAMES, apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonArtworks(apiCalypse: ApiCalypse): String {
    return apiJsonRequest(PublicEndpoint.ARTWORKS, apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonCharacters(apiCalypse: ApiCalypse): String {
    return apiJsonRequest(PublicEndpoint.CHARACTERS, apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonCollections(apiCalypse: ApiCalypse): String {
    return apiJsonRequest(PublicEndpoint.COLLECTIONS, apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonCharacterMugShots(apiCalypse: ApiCalypse): String {
    return apiJsonRequest(PublicEndpoint.CHARACTER_MUG_SHOTS, apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonCompanies(apiCalypse: ApiCalypse): String {
    return apiJsonRequest(PublicEndpoint.COMPANIES, apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonCompanyWebsites(apiCalypse: ApiCalypse): String {
    return apiJsonRequest(PublicEndpoint.COMPANY_WEBSITES, apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonCompanyLogos(apiCalypse: ApiCalypse): String {
    return apiJsonRequest(PublicEndpoint.COMPANY_LOGOS, apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonCovers(apiCalypse: ApiCalypse): String {
    return apiJsonRequest(PublicEndpoint.COVERS, apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonExternalGames(apiCalypse: ApiCalypse): String {
    return apiJsonRequest(PublicEndpoint.EXTERNAL_GAMES, apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonFranchises(apiCalypse: ApiCalypse): String {
    return apiJsonRequest(PublicEndpoint.FRANCHISES, apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonGames(apiCalypse: ApiCalypse): String {
    return apiJsonRequest(PublicEndpoint.GAMES, apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonGameEngines(apiCalypse: ApiCalypse): String {
    return apiJsonRequest(PublicEndpoint.GAME_ENGINES, apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonGameEngineLogos(apiCalypse: ApiCalypse): String {
    return apiJsonRequest(PublicEndpoint.GAME_ENGINE_LOGOS, apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonGameModes(apiCalypse: ApiCalypse): String {
    return apiJsonRequest(PublicEndpoint.GAME_MODES, apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonGameVersion(apiCalypse: ApiCalypse): String {
    return apiJsonRequest(PublicEndpoint.GAME_VERSIONS, apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonGameVersionFeatures(apiCalypse: ApiCalypse): String {
    return apiJsonRequest(PublicEndpoint.GAME_VERSION_FEATURES, apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonGameVersionFeatureValues(apiCalypse: ApiCalypse): String {
    return apiJsonRequest(PublicEndpoint.GAME_VERSION_FEATURE_VALUES, apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonGameVideos(apiCalypse: ApiCalypse): String {
    return apiJsonRequest(PublicEndpoint.GAME_VIDEOS, apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonGenres(apiCalypse: ApiCalypse): String {
    return apiJsonRequest(PublicEndpoint.GENRES, apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonInvolvedCompanies(apiCalypse: ApiCalypse): String {
    return apiJsonRequest(PublicEndpoint.INVOLVED_COMPANIES, apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonKeywords(apiCalypse: ApiCalypse): String {
    return apiJsonRequest(PublicEndpoint.KEYWORDS, apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonMultiplayerModes(apiCalypse: ApiCalypse): String {
    return apiJsonRequest(PublicEndpoint.MULTIPLAYER_MODES, apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonPlatforms(apiCalypse: ApiCalypse): String {
    return apiJsonRequest(PublicEndpoint.PLATFORMS, apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonPlatformLogos(apiCalypse: ApiCalypse): String {
    return apiJsonRequest(PublicEndpoint.PLATFORM_LOGOS, apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonPlatformVersions(apiCalypse: ApiCalypse): String {
    return apiJsonRequest(PublicEndpoint.PLATFORM_VERSIONS, apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonPlatformVersionCompanies(apiCalypse: ApiCalypse): String {
    return apiJsonRequest(PublicEndpoint.PLATFORM_VERSION_COMPANIES, apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonPlatformVersionReleaseDates(apiCalypse: ApiCalypse): String {
    return apiJsonRequest(PublicEndpoint.PLATFORM_VERSION_RELEASE_DATES, apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonPlatformWebsites(apiCalypse: ApiCalypse): String {
    return apiJsonRequest(PublicEndpoint.PLATFORM_WEBSITES, apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonPlayerPerspectives(apiCalypse: ApiCalypse): String {
    return apiJsonRequest(PublicEndpoint.PLAYER_PERSPECTIVES, apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonPlatformFamilies(apiCalypse: ApiCalypse): String {
    return apiJsonRequest(PublicEndpoint.PLATFORM_FAMILIES, apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonReleaseDates(apiCalypse: ApiCalypse): String {
    return apiJsonRequest(PublicEndpoint.RELEASE_DATES, apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonScreenshots(apiCalypse: ApiCalypse): String {
    return apiJsonRequest(PublicEndpoint.SCREENSHOTS, apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonSearch(apiCalypse: ApiCalypse): String {
    return apiJsonRequest(PublicEndpoint.SEARCH, apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonThemes(apiCalypse: ApiCalypse): String {
    return apiJsonRequest(PublicEndpoint.THEMES, apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonWebsites(apiCalypse: ApiCalypse): String {
    return apiJsonRequest(PublicEndpoint.WEBSITES, apiCalypse.buildQuery())
}