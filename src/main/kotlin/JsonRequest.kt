
@Throws(RequestException::class)
fun IGDBWrapper.jsonAchievements(apiCalypse: APICalypse): String {
    return apiJsonRequest(Endpoint.ACHIEVEMENTS.url(), apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonAchievementIcons(apiCalypse: APICalypse): String {
    return apiJsonRequest(Endpoint.ACHIEVEMENT_ICONS.url(), apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonAgeRatings(apiCalypse: APICalypse): String {
    return apiJsonRequest(Endpoint.AGE_RATINGS.url(), apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonAgeRatingContentDescriptions(apiCalypse: APICalypse): String {
    return apiJsonRequest(Endpoint.AGE_RATING_CONTENT_DESCRIPTIONS.url(), apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonAlternativeNames(apiCalypse: APICalypse): String {
    return apiJsonRequest(Endpoint.ALTERNATIVE_NAMES.url(), apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonArtworks(apiCalypse: APICalypse): String {
    return apiJsonRequest(Endpoint.ARTWORKS.url(), apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonCharacters(apiCalypse: APICalypse): String {
    return apiJsonRequest(Endpoint.CHARACTERS.url(), apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonCollections(apiCalypse: APICalypse): String {
    return apiJsonRequest(Endpoint.COLLECTIONS.url(), apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonCharacterMugShots(apiCalypse: APICalypse): String {
    return apiJsonRequest(Endpoint.CHARACTER_MUG_SHOTS.url(), apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonCompanies(apiCalypse: APICalypse): String {
    return apiJsonRequest(Endpoint.COMPANIES.url(), apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonCompanyWebsites(apiCalypse: APICalypse): String {
    return apiJsonRequest(Endpoint.COMPANY_WEBSITES.url(), apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonCompanyLogos(apiCalypse: APICalypse): String {
    return apiJsonRequest(Endpoint.COMPANY_LOGOS.url(), apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonCovers(apiCalypse: APICalypse): String {
    return apiJsonRequest(Endpoint.COVERS.url(), apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonExternalGames(apiCalypse: APICalypse): String {
    return apiJsonRequest(Endpoint.EXTERNAL_GAMES.url(), apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonFeeds(apiCalypse: APICalypse): String {
    return apiJsonRequest(Endpoint.FEEDS.url(), apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonFranchises(apiCalypse: APICalypse): String {
    return apiJsonRequest(Endpoint.FRANCHISES.url(), apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonGames(apiCalypse: APICalypse): String {
    return apiJsonRequest(Endpoint.GAMES.url(), apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonGameEngines(apiCalypse: APICalypse): String {
    return apiJsonRequest(Endpoint.GAME_ENGINES.url(), apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonGameEngineLogos(apiCalypse: APICalypse): String {
    return apiJsonRequest(Endpoint.GAME_ENGINE_LOGOS.url(), apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonGameModes(apiCalypse: APICalypse): String {
    return apiJsonRequest(Endpoint.GAME_MODES.url(), apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonGameVersion(apiCalypse: APICalypse): String {
    return apiJsonRequest(Endpoint.GAME_VERSIONS.url(), apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonGameVersionFeatures(apiCalypse: APICalypse): String {
    return apiJsonRequest(Endpoint.GAME_VERSION_FEATURES.url(), apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonGameVersionFeatureValues(apiCalypse: APICalypse): String {
    return apiJsonRequest(Endpoint.GAME_VERSION_FEATURE_VALUES.url(), apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonGameVideos(apiCalypse: APICalypse): String {
    return apiJsonRequest(Endpoint.GAME_VIDEOS.url(), apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonGenres(apiCalypse: APICalypse): String {
    return apiJsonRequest(Endpoint.GENRES.url(), apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonInvolvedCompanies(apiCalypse: APICalypse): String {
    return apiJsonRequest(Endpoint.INVOLVED_COMPANIES.url(), apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonKeywords(apiCalypse: APICalypse): String {
    return apiJsonRequest(Endpoint.KEYWORDS.url(), apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonMultiplayerModes(apiCalypse: APICalypse): String {
    return apiJsonRequest(Endpoint.MULTIPLAYER_MODES.url(), apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonPages(apiCalypse: APICalypse): String {
    return apiJsonRequest(Endpoint.PAGES.url(), apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonPageBackgrounds(apiCalypse: APICalypse): String {
    return apiJsonRequest(Endpoint.PAGE_BACKGROUNDS.url(), apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonPageLogos(apiCalypse: APICalypse): String {
    return apiJsonRequest(Endpoint.PAGE_LOGOS.url(), apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonPageWebsite(apiCalypse: APICalypse): String {
    return apiJsonRequest(Endpoint.PAGE_WEBSITES.url(), apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonPlatforms(apiCalypse: APICalypse): String {
    return apiJsonRequest(Endpoint.PLATFORMS.url(), apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonPlatformLogos(apiCalypse: APICalypse): String {
    return apiJsonRequest(Endpoint.PLATFORM_LOGOS.url(), apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonPlatformVersions(apiCalypse: APICalypse): String {
    return apiJsonRequest(Endpoint.PLATFORM_VERSIONS.url(), apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonPlatformVersionCompanies(apiCalypse: APICalypse): String {
    return apiJsonRequest(Endpoint.PLATFORM_VERSION_COMPANIES.url(), apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonPlatformVersionReleaseDates(apiCalypse: APICalypse): String {
    return apiJsonRequest(Endpoint.PLATFORM_VERSION_RELEASE_DATES.url(), apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonPlatformWebsites(apiCalypse: APICalypse): String {
    return apiJsonRequest(Endpoint.PLATFORM_WEBSITES.url(), apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonPlayerPerspectives(apiCalypse: APICalypse): String {
    return apiJsonRequest(Endpoint.PLAYER_PERSPECTIVES.url(), apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonProductFamilies(apiCalypse: APICalypse): String {
    return apiJsonRequest(Endpoint.PRODUCT_FAMILIES.url(), apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonPulses(apiCalypse: APICalypse): String {
    return apiJsonRequest(Endpoint.PULSES.url(), apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonPulseGroups(apiCalypse: APICalypse): String {
    return apiJsonRequest(Endpoint.PULSE_GROUPS.url(), apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonPulseSources(apiCalypse: APICalypse): String {
    return apiJsonRequest(Endpoint.PULSE_SOURCES.url(), apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonPulseUrls(apiCalypse: APICalypse): String {
    return apiJsonRequest(Endpoint.PULSE_URLS.url(), apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonReleaseDates(apiCalypse: APICalypse): String {
    return apiJsonRequest(Endpoint.RELEASE_DATES.url(), apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonScreenshots(apiCalypse: APICalypse): String {
    return apiJsonRequest(Endpoint.SCREENSHOTS.url(), apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonSearch(apiCalypse: APICalypse): String {
    return apiJsonRequest(Endpoint.SEARCH.url(), apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonThemes(apiCalypse: APICalypse): String {
    return apiJsonRequest(Endpoint.THEMES.url(), apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonTimeToBeats(apiCalypse: APICalypse): String {
    return apiJsonRequest(Endpoint.TIME_TO_BEATS.url(), apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonTitles(apiCalypse: APICalypse): String {
    return apiJsonRequest(Endpoint.TITLES.url(), apiCalypse.buildQuery())
}

@Throws(RequestException::class)
fun IGDBWrapper.jsonWebsites(apiCalypse: APICalypse): String {
    return apiJsonRequest(Endpoint.WEBSITES.url(), apiCalypse.buildQuery())
}