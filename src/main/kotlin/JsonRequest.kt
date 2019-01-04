
/*
* JsonRequest
* This file holds function extensions for IGDBWrapper for each public endpoint in the API
*
* Created at: 2018-01-04
*
* Created by Filip
*
* */

@Throws(RequestException::class)
fun IGDBWrapper.jsonAchievements(apiCalypse: APICalypse): String {
    return apiJsonRequest(Endpoint.ACHIEVEMENTS, apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonAchievementIcons(apiCalypse: APICalypse): String {
    return apiJsonRequest(Endpoint.ACHIEVEMENT_ICONS, apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonAgeRatings(apiCalypse: APICalypse): String {
    return apiJsonRequest(Endpoint.AGE_RATINGS, apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonAgeRatingContentDescriptions(apiCalypse: APICalypse): String {
    return apiJsonRequest(Endpoint.AGE_RATING_CONTENT_DESCRIPTIONS, apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonAlternativeNames(apiCalypse: APICalypse): String {
    return apiJsonRequest(Endpoint.ALTERNATIVE_NAMES, apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonArtworks(apiCalypse: APICalypse): String {
    return apiJsonRequest(Endpoint.ARTWORKS, apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonCharacters(apiCalypse: APICalypse): String {
    return apiJsonRequest(Endpoint.CHARACTERS, apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonCollections(apiCalypse: APICalypse): String {
    return apiJsonRequest(Endpoint.COLLECTIONS, apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonCharacterMugShots(apiCalypse: APICalypse): String {
    return apiJsonRequest(Endpoint.CHARACTER_MUG_SHOTS, apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonCompanies(apiCalypse: APICalypse): String {
    return apiJsonRequest(Endpoint.COMPANIES, apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonCompanyWebsites(apiCalypse: APICalypse): String {
    return apiJsonRequest(Endpoint.COMPANY_WEBSITES, apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonCompanyLogos(apiCalypse: APICalypse): String {
    return apiJsonRequest(Endpoint.COMPANY_LOGOS, apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonCovers(apiCalypse: APICalypse): String {
    return apiJsonRequest(Endpoint.COVERS, apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonExternalGames(apiCalypse: APICalypse): String {
    return apiJsonRequest(Endpoint.EXTERNAL_GAMES, apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonFeeds(apiCalypse: APICalypse): String {
    return apiJsonRequest(Endpoint.FEEDS, apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonFranchises(apiCalypse: APICalypse): String {
    return apiJsonRequest(Endpoint.FRANCHISES, apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonGames(apiCalypse: APICalypse): String {
    return apiJsonRequest(Endpoint.GAMES, apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonGameEngines(apiCalypse: APICalypse): String {
    return apiJsonRequest(Endpoint.GAME_ENGINES, apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonGameEngineLogos(apiCalypse: APICalypse): String {
    return apiJsonRequest(Endpoint.GAME_ENGINE_LOGOS, apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonGameModes(apiCalypse: APICalypse): String {
    return apiJsonRequest(Endpoint.GAME_MODES, apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonGameVersion(apiCalypse: APICalypse): String {
    return apiJsonRequest(Endpoint.GAME_VERSIONS, apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonGameVersionFeatures(apiCalypse: APICalypse): String {
    return apiJsonRequest(Endpoint.GAME_VERSION_FEATURES, apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonGameVersionFeatureValues(apiCalypse: APICalypse): String {
    return apiJsonRequest(Endpoint.GAME_VERSION_FEATURE_VALUES, apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonGameVideos(apiCalypse: APICalypse): String {
    return apiJsonRequest(Endpoint.GAME_VIDEOS, apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonGenres(apiCalypse: APICalypse): String {
    return apiJsonRequest(Endpoint.GENRES, apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonInvolvedCompanies(apiCalypse: APICalypse): String {
    return apiJsonRequest(Endpoint.INVOLVED_COMPANIES, apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonKeywords(apiCalypse: APICalypse): String {
    return apiJsonRequest(Endpoint.KEYWORDS, apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonMultiplayerModes(apiCalypse: APICalypse): String {
    return apiJsonRequest(Endpoint.MULTIPLAYER_MODES, apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonPages(apiCalypse: APICalypse): String {
    return apiJsonRequest(Endpoint.PAGES, apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonPageBackgrounds(apiCalypse: APICalypse): String {
    return apiJsonRequest(Endpoint.PAGE_BACKGROUNDS, apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonPageLogos(apiCalypse: APICalypse): String {
    return apiJsonRequest(Endpoint.PAGE_LOGOS, apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonPageWebsite(apiCalypse: APICalypse): String {
    return apiJsonRequest(Endpoint.PAGE_WEBSITES, apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonPlatforms(apiCalypse: APICalypse): String {
    return apiJsonRequest(Endpoint.PLATFORMS, apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonPlatformLogos(apiCalypse: APICalypse): String {
    return apiJsonRequest(Endpoint.PLATFORM_LOGOS, apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonPlatformVersions(apiCalypse: APICalypse): String {
    return apiJsonRequest(Endpoint.PLATFORM_VERSIONS, apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonPlatformVersionCompanies(apiCalypse: APICalypse): String {
    return apiJsonRequest(Endpoint.PLATFORM_VERSION_COMPANIES, apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonPlatformVersionReleaseDates(apiCalypse: APICalypse): String {
    return apiJsonRequest(Endpoint.PLATFORM_VERSION_RELEASE_DATES, apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonPlatformWebsites(apiCalypse: APICalypse): String {
    return apiJsonRequest(Endpoint.PLATFORM_WEBSITES, apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonPlayerPerspectives(apiCalypse: APICalypse): String {
    return apiJsonRequest(Endpoint.PLAYER_PERSPECTIVES, apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonProductFamilies(apiCalypse: APICalypse): String {
    return apiJsonRequest(Endpoint.PRODUCT_FAMILIES, apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonPulses(apiCalypse: APICalypse): String {
    return apiJsonRequest(Endpoint.PULSES, apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonPulseGroups(apiCalypse: APICalypse): String {
    return apiJsonRequest(Endpoint.PULSE_GROUPS, apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonPulseSources(apiCalypse: APICalypse): String {
    return apiJsonRequest(Endpoint.PULSE_SOURCES, apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonPulseUrls(apiCalypse: APICalypse): String {
    return apiJsonRequest(Endpoint.PULSE_URLS, apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonReleaseDates(apiCalypse: APICalypse): String {
    return apiJsonRequest(Endpoint.RELEASE_DATES, apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonScreenshots(apiCalypse: APICalypse): String {
    return apiJsonRequest(Endpoint.SCREENSHOTS, apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonSearch(apiCalypse: APICalypse): String {
    return apiJsonRequest(Endpoint.SEARCH, apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonThemes(apiCalypse: APICalypse): String {
    return apiJsonRequest(Endpoint.THEMES, apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonTimeToBeats(apiCalypse: APICalypse): String {
    return apiJsonRequest(Endpoint.TIME_TO_BEATS, apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonTitles(apiCalypse: APICalypse): String {
    return apiJsonRequest(Endpoint.TITLES, apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonWebsites(apiCalypse: APICalypse): String {
    return apiJsonRequest(Endpoint.WEBSITES, apiCalypse.buildQuery())
}