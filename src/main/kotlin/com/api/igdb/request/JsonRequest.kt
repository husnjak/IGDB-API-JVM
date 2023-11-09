package com.api.igdb.request

import com.api.igdb.apicalypse.APICalypse
import com.api.igdb.exceptions.RequestException
import com.api.igdb.utils.Endpoints

@Throws(RequestException::class)
fun IGDBWrapper.jsonAgeRatings(APICalypse: APICalypse): String {
    return apiJsonRequest(Endpoints.AGE_RATINGS, APICalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonAgeRatingContentDescriptions(APICalypse: APICalypse): String {
    return apiJsonRequest(Endpoints.AGE_RATING_CONTENT_DESCRIPTIONS, APICalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonAlternativeNames(APICalypse: APICalypse): String {
    return apiJsonRequest(Endpoints.ALTERNATIVE_NAMES, APICalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonArtworks(APICalypse: APICalypse): String {
    return apiJsonRequest(Endpoints.ARTWORKS, APICalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonCharacters(APICalypse: APICalypse): String {
    return apiJsonRequest(Endpoints.CHARACTERS, APICalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonCollections(APICalypse: APICalypse): String {
    return apiJsonRequest(Endpoints.COLLECTIONS, APICalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonCharacterMugShots(APICalypse: APICalypse): String {
    return apiJsonRequest(Endpoints.CHARACTER_MUG_SHOTS, APICalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonCompanies(APICalypse: APICalypse): String {
    return apiJsonRequest(Endpoints.COMPANIES, APICalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonCompanyWebsites(APICalypse: APICalypse): String {
    return apiJsonRequest(Endpoints.COMPANY_WEBSITES, APICalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonCompanyLogos(APICalypse: APICalypse): String {
    return apiJsonRequest(Endpoints.COMPANY_LOGOS, APICalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonCovers(APICalypse: APICalypse): String {
    return apiJsonRequest(Endpoints.COVERS, APICalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonExternalGames(APICalypse: APICalypse): String {
    return apiJsonRequest(Endpoints.EXTERNAL_GAMES, APICalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonFranchises(APICalypse: APICalypse): String {
    return apiJsonRequest(Endpoints.FRANCHISES, APICalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonGames(APICalypse: APICalypse): String {
    return apiJsonRequest(Endpoints.GAMES, APICalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonGameEngines(APICalypse: APICalypse): String {
    return apiJsonRequest(Endpoints.GAME_ENGINES, APICalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonGameEngineLogos(APICalypse: APICalypse): String {
    return apiJsonRequest(Endpoints.GAME_ENGINE_LOGOS, APICalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonGameLocalizations(APICalypse: APICalypse): String {
    return apiJsonRequest(Endpoints.GAME_LOCALIZATIONS, APICalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonGameModes(APICalypse: APICalypse): String {
    return apiJsonRequest(Endpoints.GAME_MODES, APICalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonGameVersion(APICalypse: APICalypse): String {
    return apiJsonRequest(Endpoints.GAME_VERSIONS, APICalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonGameVersionFeatures(APICalypse: APICalypse): String {
    return apiJsonRequest(Endpoints.GAME_VERSION_FEATURES, APICalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonGameVersionFeatureValues(APICalypse: APICalypse): String {
    return apiJsonRequest(Endpoints.GAME_VERSION_FEATURE_VALUES, APICalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonGameVideos(APICalypse: APICalypse): String {
    return apiJsonRequest(Endpoints.GAME_VIDEOS, APICalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonGenres(APICalypse: APICalypse): String {
    return apiJsonRequest(Endpoints.GENRES, APICalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonInvolvedCompanies(APICalypse: APICalypse): String {
    return apiJsonRequest(Endpoints.INVOLVED_COMPANIES, APICalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonKeywords(APICalypse: APICalypse): String {
    return apiJsonRequest(Endpoints.KEYWORDS, APICalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonLanguages(APICalypse: APICalypse): String {
    return apiJsonRequest(Endpoints.LANGUAGES, APICalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonLanguageSupports(APICalypse: APICalypse): String {
    return apiJsonRequest(Endpoints.LANGUAGE_SUPPORTS, APICalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonLanguageSupportTypes(APICalypse: APICalypse): String {
    return apiJsonRequest(Endpoints.LANGUAGE_SUPPORT_TYPES, APICalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonMultiplayerModes(APICalypse: APICalypse): String {
    return apiJsonRequest(Endpoints.MULTIPLAYER_MODES, APICalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonPlatforms(APICalypse: APICalypse): String {
    return apiJsonRequest(Endpoints.PLATFORMS, APICalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonPlatformLogos(APICalypse: APICalypse): String {
    return apiJsonRequest(Endpoints.PLATFORM_LOGOS, APICalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonPlatformVersions(APICalypse: APICalypse): String {
    return apiJsonRequest(Endpoints.PLATFORM_VERSIONS, APICalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonPlatformVersionCompanies(APICalypse: APICalypse): String {
    return apiJsonRequest(Endpoints.PLATFORM_VERSION_COMPANIES, APICalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonRegions(APICalypse: APICalypse): String {
    return apiJsonRequest(Endpoints.REGIONS, APICalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonPlatformVersionReleaseDates(APICalypse: APICalypse): String {
    return apiJsonRequest(Endpoints.PLATFORM_VERSION_RELEASE_DATES, APICalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonPlatformWebsites(APICalypse: APICalypse): String {
    return apiJsonRequest(Endpoints.PLATFORM_WEBSITES, APICalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonPlayerPerspectives(APICalypse: APICalypse): String {
    return apiJsonRequest(Endpoints.PLAYER_PERSPECTIVES, APICalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonPlatformFamilies(APICalypse: APICalypse): String {
    return apiJsonRequest(Endpoints.PLATFORM_FAMILIES, APICalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonReleaseDates(APICalypse: APICalypse): String {
    return apiJsonRequest(Endpoints.RELEASE_DATES, APICalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonScreenshots(APICalypse: APICalypse): String {
    return apiJsonRequest(Endpoints.SCREENSHOTS, APICalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonSearch(APICalypse: APICalypse): String {
    return apiJsonRequest(Endpoints.SEARCH, APICalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonThemes(APICalypse: APICalypse): String {
    return apiJsonRequest(Endpoints.THEMES, APICalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonWebsites(APICalypse: APICalypse): String {
    return apiJsonRequest(Endpoints.WEBSITES, APICalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonEvents(APICalypse: APICalypse): String {
    return apiJsonRequest(Endpoints.EVENTS, APICalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonEventLogos(APICalypse: APICalypse): String {
    return apiJsonRequest(Endpoints.EVENT_LOGOS, APICalypse.buildQuery())
}
@Throws(RequestException::class)
fun IGDBWrapper.jsonEventNetworks(APICalypse: APICalypse): String {
    return apiJsonRequest(Endpoints.EVENT_NETWORKS, APICalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonNetworkTypes(APICalypse: APICalypse): String {
    return apiJsonRequest(Endpoints.NETWORK_TYPES, APICalypse.buildQuery())
}
@Throws(RequestException::class)
fun IGDBWrapper.jsonCollectionRelations(APICalypse: APICalypse): String {
    return apiJsonRequest(Endpoints.COLLECTION_RELATIONS, APICalypse.buildQuery())
}
@Throws(RequestException::class)
fun IGDBWrapper.jsonCollectionRelationTypes(APICalypse: APICalypse): String {
    return apiJsonRequest(Endpoints.COLLECTION_RELATION_TYPES, APICalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonCollectionTypes(APICalypse: APICalypse): String {
    return apiJsonRequest(Endpoints.COLLECTION_TYPES, APICalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonCollectionMemberships(APICalypse: APICalypse): String {
    return apiJsonRequest(Endpoints.COLLECTION_MEMBERSHIPS, APICalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonCollectionMembershipTypes(APICalypse: APICalypse): String {
    return apiJsonRequest(Endpoints.COLLECTION_MEMBERSHIP_TYPES, APICalypse.buildQuery())
}
