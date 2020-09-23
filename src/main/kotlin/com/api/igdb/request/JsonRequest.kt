package com.api.igdb.request

import com.api.igdb.apicalypse.APICalypse
import com.api.igdb.exceptions.RequestException
import com.api.igdb.utils.PublicEndpoint

@Throws(RequestException::class)
fun IGDBWrapper.jsonAgeRatings(APICalypse: APICalypse): String {
    return apiJsonRequest(PublicEndpoint.AGE_RATINGS, APICalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonAgeRatingContentDescriptions(APICalypse: APICalypse): String {
    return apiJsonRequest(PublicEndpoint.AGE_RATING_CONTENT_DESCRIPTIONS, APICalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonAlternativeNames(APICalypse: APICalypse): String {
    return apiJsonRequest(PublicEndpoint.ALTERNATIVE_NAMES, APICalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonArtworks(APICalypse: APICalypse): String {
    return apiJsonRequest(PublicEndpoint.ARTWORKS, APICalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonCharacters(APICalypse: APICalypse): String {
    return apiJsonRequest(PublicEndpoint.CHARACTERS, APICalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonCollections(APICalypse: APICalypse): String {
    return apiJsonRequest(PublicEndpoint.COLLECTIONS, APICalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonCharacterMugShots(APICalypse: APICalypse): String {
    return apiJsonRequest(PublicEndpoint.CHARACTER_MUG_SHOTS, APICalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonCompanies(APICalypse: APICalypse): String {
    return apiJsonRequest(PublicEndpoint.COMPANIES, APICalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonCompanyWebsites(APICalypse: APICalypse): String {
    return apiJsonRequest(PublicEndpoint.COMPANY_WEBSITES, APICalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonCompanyLogos(APICalypse: APICalypse): String {
    return apiJsonRequest(PublicEndpoint.COMPANY_LOGOS, APICalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonCovers(APICalypse: APICalypse): String {
    return apiJsonRequest(PublicEndpoint.COVERS, APICalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonExternalGames(APICalypse: APICalypse): String {
    return apiJsonRequest(PublicEndpoint.EXTERNAL_GAMES, APICalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonFranchises(APICalypse: APICalypse): String {
    return apiJsonRequest(PublicEndpoint.FRANCHISES, APICalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonGames(APICalypse: APICalypse): String {
    return apiJsonRequest(PublicEndpoint.GAMES, APICalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonGameEngines(APICalypse: APICalypse): String {
    return apiJsonRequest(PublicEndpoint.GAME_ENGINES, APICalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonGameEngineLogos(APICalypse: APICalypse): String {
    return apiJsonRequest(PublicEndpoint.GAME_ENGINE_LOGOS, APICalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonGameModes(APICalypse: APICalypse): String {
    return apiJsonRequest(PublicEndpoint.GAME_MODES, APICalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonGameVersion(APICalypse: APICalypse): String {
    return apiJsonRequest(PublicEndpoint.GAME_VERSIONS, APICalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonGameVersionFeatures(APICalypse: APICalypse): String {
    return apiJsonRequest(PublicEndpoint.GAME_VERSION_FEATURES, APICalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonGameVersionFeatureValues(APICalypse: APICalypse): String {
    return apiJsonRequest(PublicEndpoint.GAME_VERSION_FEATURE_VALUES, APICalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonGameVideos(APICalypse: APICalypse): String {
    return apiJsonRequest(PublicEndpoint.GAME_VIDEOS, APICalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonGenres(APICalypse: APICalypse): String {
    return apiJsonRequest(PublicEndpoint.GENRES, APICalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonInvolvedCompanies(APICalypse: APICalypse): String {
    return apiJsonRequest(PublicEndpoint.INVOLVED_COMPANIES, APICalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonKeywords(APICalypse: APICalypse): String {
    return apiJsonRequest(PublicEndpoint.KEYWORDS, APICalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonMultiplayerModes(APICalypse: APICalypse): String {
    return apiJsonRequest(PublicEndpoint.MULTIPLAYER_MODES, APICalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonPlatforms(APICalypse: APICalypse): String {
    return apiJsonRequest(PublicEndpoint.PLATFORMS, APICalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonPlatformLogos(APICalypse: APICalypse): String {
    return apiJsonRequest(PublicEndpoint.PLATFORM_LOGOS, APICalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonPlatformVersions(APICalypse: APICalypse): String {
    return apiJsonRequest(PublicEndpoint.PLATFORM_VERSIONS, APICalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonPlatformVersionCompanies(APICalypse: APICalypse): String {
    return apiJsonRequest(PublicEndpoint.PLATFORM_VERSION_COMPANIES, APICalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonPlatformVersionReleaseDates(APICalypse: APICalypse): String {
    return apiJsonRequest(PublicEndpoint.PLATFORM_VERSION_RELEASE_DATES, APICalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonPlatformWebsites(APICalypse: APICalypse): String {
    return apiJsonRequest(PublicEndpoint.PLATFORM_WEBSITES, APICalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonPlayerPerspectives(APICalypse: APICalypse): String {
    return apiJsonRequest(PublicEndpoint.PLAYER_PERSPECTIVES, APICalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonPlatformFamilies(APICalypse: APICalypse): String {
    return apiJsonRequest(PublicEndpoint.PLATFORM_FAMILIES, APICalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonReleaseDates(APICalypse: APICalypse): String {
    return apiJsonRequest(PublicEndpoint.RELEASE_DATES, APICalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonScreenshots(APICalypse: APICalypse): String {
    return apiJsonRequest(PublicEndpoint.SCREENSHOTS, APICalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonSearch(APICalypse: APICalypse): String {
    return apiJsonRequest(PublicEndpoint.SEARCH, APICalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonThemes(APICalypse: APICalypse): String {
    return apiJsonRequest(PublicEndpoint.THEMES, APICalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonWebsites(APICalypse: APICalypse): String {
    return apiJsonRequest(PublicEndpoint.WEBSITES, APICalypse.buildQuery())
}