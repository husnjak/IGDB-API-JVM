import proto.*

/*
* ProtoRequest
* This file holds function extensions for IGDBWrapper for each public endpoint in the API
*
* Created at: 2018-01-04
*
* Created by Filip
*
* */

@Throws(RequestException::class)
fun IGDBWrapper.achievements(apiCalypse: APICalypse): List<proto.Achievement> {
    val bytes = apiRequest(Endpoint.ACHIEVEMENTS.url(), apiCalypse.buildQuery())
    return AchievementResult.parseFrom(bytes).achievementsList
}

@Throws(RequestException::class)
fun IGDBWrapper.achievementIcons(apiCalypse: APICalypse): List<proto.AchievementIcon> {
    val bytes = apiRequest(Endpoint.ACHIEVEMENT_ICONS.url(), apiCalypse.buildQuery())
    return AchievementIconResult.parseFrom(bytes).achievementiconsList
}

@Throws(RequestException::class)
fun IGDBWrapper.ageRatings(apiCalypse: APICalypse): List<proto.AgeRating> {
    val bytes = apiRequest(Endpoint.AGE_RATINGS.url(), apiCalypse.buildQuery())
    return AgeRatingResult.parseFrom(bytes).ageratingsList
}

@Throws(RequestException::class)
fun IGDBWrapper.ageRatingContentDescriptions(apiCalypse: APICalypse): List<proto.AgeRatingContentDescription> {
    val bytes = apiRequest(Endpoint.AGE_RATING_CONTENT_DESCRIPTIONS.url(), apiCalypse.buildQuery())
    return AgeRatingContentDescriptionResult.parseFrom(bytes).ageratingcontentdescriptionsList
}

@Throws(RequestException::class)
fun IGDBWrapper.alternativeNames(apiCalypse: APICalypse): List<proto.AlternativeName> {
    val bytes = apiRequest(Endpoint.ALTERNATIVE_NAMES.url(), apiCalypse.buildQuery())
    return AlternativeNameResult.parseFrom(bytes).alternativenamesList
}

@Throws(RequestException::class)
fun IGDBWrapper.artworks(apiCalypse: APICalypse): List<proto.Artwork> {
    val bytes = apiRequest(Endpoint.ARTWORKS.url(), apiCalypse.buildQuery())
    return ArtworkResult.parseFrom(bytes).artworksList
}

@Throws(RequestException::class)
fun IGDBWrapper.characters(apiCalypse: APICalypse): List<proto.Character> {
    val bytes = apiRequest(Endpoint.CHARACTERS.url(), apiCalypse.buildQuery())
    return CharacterResult.parseFrom(bytes).charactersList
}

@Throws(RequestException::class)
fun IGDBWrapper.collections(apiCalypse: APICalypse): List<proto.Collection> {
    val bytes = apiRequest(Endpoint.COLLECTIONS.url(), apiCalypse.buildQuery())
    return CollectionResult.parseFrom(bytes).collectionsList
}

@Throws(RequestException::class)
fun IGDBWrapper.characterMugShots(apiCalypse: APICalypse): List<proto.CharacterMugShot> {
    val bytes = apiRequest(Endpoint.CHARACTER_MUG_SHOTS.url(), apiCalypse.buildQuery())
    return CharacterMugShotResult.parseFrom(bytes).charactermugshotsList
}

@Throws(RequestException::class)
fun IGDBWrapper.companies(apiCalypse: APICalypse): List<proto.Company> {
    val bytes = apiRequest(Endpoint.COMPANIES.url(), apiCalypse.buildQuery())
    return CompanyResult.parseFrom(bytes).companiesList
}

@Throws(RequestException::class)
fun IGDBWrapper.companyWebsites(apiCalypse: APICalypse): List<proto.CompanyWebsite> {
    val bytes = apiRequest(Endpoint.COMPANY_WEBSITES.url(), apiCalypse.buildQuery())
    return CompanyWebsiteResult.parseFrom(bytes).companywebsitesList
}

@Throws(RequestException::class)
fun IGDBWrapper.companyLogos(apiCalypse: APICalypse): List<proto.CompanyLogo> {
    val bytes = apiRequest(Endpoint.COMPANY_LOGOS.url(), apiCalypse.buildQuery())
    return CompanyLogoResult.parseFrom(bytes).companylogosList
}

@Throws(RequestException::class)
fun IGDBWrapper.covers(apiCalypse: APICalypse): List<proto.Cover> {
    val bytes = apiRequest(Endpoint.COVERS.url(), apiCalypse.buildQuery())
    return CoverResult.parseFrom(bytes).coversList
}

@Throws(RequestException::class)
fun IGDBWrapper.externalGames(apiCalypse: APICalypse): List<proto.ExternalGame> {
    val bytes = apiRequest(Endpoint.EXTERNAL_GAMES.url(), apiCalypse.buildQuery())
    return ExternalGameResult.parseFrom(bytes).externalgamesList
}

@Throws(RequestException::class)
fun IGDBWrapper.feeds(apiCalypse: APICalypse): List<proto.Feed> {
    val bytes = apiRequest(Endpoint.FEEDS.url(), apiCalypse.buildQuery())
    return FeedResult.parseFrom(bytes).feedsList
}

@Throws(RequestException::class)
fun IGDBWrapper.franchises(apiCalypse: APICalypse): List<proto.Franchise> {
    val bytes = apiRequest(Endpoint.FRANCHISES.url(), apiCalypse.buildQuery())
    return FranchiseResult.parseFrom(bytes).franchisesList
}

@Throws(RequestException::class)
fun IGDBWrapper.games(apiCalypse: APICalypse): List<proto.Game> {
    val bytes = apiRequest(Endpoint.GAMES.url(), apiCalypse.buildQuery())
    return GameResult.parseFrom(bytes).gamesList
}

@Throws(RequestException::class)
fun IGDBWrapper.gameEngines(apiCalypse: APICalypse): List<proto.GameEngine> {
    val bytes = apiRequest(Endpoint.GAME_ENGINES.url(), apiCalypse.buildQuery())
    return GameEngineResult.parseFrom(bytes).gameenginesList
}

@Throws(RequestException::class)
fun IGDBWrapper.gameEngineLogos(apiCalypse: APICalypse): List<proto.GameEngineLogo> {
    val bytes = apiRequest(Endpoint.GAME_ENGINE_LOGOS.url(), apiCalypse.buildQuery())
    return GameEngineLogoResult.parseFrom(bytes).gameenginelogosList
}

@Throws(RequestException::class)
fun IGDBWrapper.gameModes(apiCalypse: APICalypse): List<proto.GameMode> {
    val bytes = apiRequest(Endpoint.GAME_MODES.url(), apiCalypse.buildQuery())
    return GameModeResult.parseFrom(bytes).gamemodesList
}

@Throws(RequestException::class)
fun IGDBWrapper.gameVersion(apiCalypse: APICalypse): List<proto.GameVersion> {
    val bytes = apiRequest(Endpoint.GAME_VERSIONS.url(), apiCalypse.buildQuery())
    return GameVersionResult.parseFrom(bytes).gameversionsList
}

@Throws(RequestException::class)
fun IGDBWrapper.gameVersionFeatures(apiCalypse: APICalypse): List<proto.GameVersionFeature> {
    val bytes = apiRequest(Endpoint.GAME_VERSION_FEATURES.url(), apiCalypse.buildQuery())
    return GameVersionFeatureResult.parseFrom(bytes).gameversionfeaturesList
}

@Throws(RequestException::class)
fun IGDBWrapper.gameVersionFeatureValues(apiCalypse: APICalypse): List<proto.GameVersionFeatureValue> {
    val bytes = apiRequest(Endpoint.GAME_VERSION_FEATURE_VALUES.url(), apiCalypse.buildQuery())
    return GameVersionFeatureValueResult.parseFrom(bytes).gameversionfeaturevaluesList
}

@Throws(RequestException::class)
fun IGDBWrapper.gameVideos(apiCalypse: APICalypse): List<proto.GameVideo> {
    val bytes = apiRequest(Endpoint.GAME_VIDEOS.url(), apiCalypse.buildQuery())
    return GameVideoResult.parseFrom(bytes).gamevideosList
}

@Throws(RequestException::class)
fun IGDBWrapper.genres(apiCalypse: APICalypse): List<proto.Genre> {
    val bytes = apiRequest(Endpoint.GENRES.url(), apiCalypse.buildQuery())
    return GenreResult.parseFrom(bytes).genresList
}

@Throws(RequestException::class)
fun IGDBWrapper.involvedCompanies(apiCalypse: APICalypse): List<proto.InvolvedCompany> {
    val bytes = apiRequest(Endpoint.INVOLVED_COMPANIES.url(), apiCalypse.buildQuery())
    return InvolvedCompanyResult.parseFrom(bytes).involvedcompaniesList
}

@Throws(RequestException::class)
fun IGDBWrapper.keywords(apiCalypse: APICalypse): List<proto.Keyword> {
    val bytes = apiRequest(Endpoint.KEYWORDS.url(), apiCalypse.buildQuery())
    return KeywordResult.parseFrom(bytes).keywordsList
}

@Throws(RequestException::class)
fun IGDBWrapper.multiplayerModes(apiCalypse: APICalypse): List<proto.MultiplayerMode> {
    val bytes = apiRequest(Endpoint.MULTIPLAYER_MODES.url(), apiCalypse.buildQuery())
    return MultiplayerModeResult.parseFrom(bytes).multiplayermodesList
}

@Throws(RequestException::class)
fun IGDBWrapper.pages(apiCalypse: APICalypse): List<proto.Page> {
    val bytes = apiRequest(Endpoint.PAGES.url(), apiCalypse.buildQuery())
    return PageResult.parseFrom(bytes).pagesList
}

@Throws(RequestException::class)
fun IGDBWrapper.pageBackgrounds(apiCalypse: APICalypse): List<proto.PageBackground> {
    val bytes = apiRequest(Endpoint.PAGE_BACKGROUNDS.url(), apiCalypse.buildQuery())
    return PageBackgroundResult.parseFrom(bytes).pagebackgroundsList
}

@Throws(RequestException::class)
fun IGDBWrapper.pageLogos(apiCalypse: APICalypse): List<proto.PageLogo> {
    val bytes = apiRequest(Endpoint.PAGE_LOGOS.url(), apiCalypse.buildQuery())
    return PageLogoResult.parseFrom(bytes).pagelogosList
}

@Throws(RequestException::class)
fun IGDBWrapper.pageWebsite(apiCalypse: APICalypse): List<proto.PageWebsite> {
    val bytes = apiRequest(Endpoint.PAGE_WEBSITES.url(), apiCalypse.buildQuery())
    return PageWebsiteResult.parseFrom(bytes).pagewebsitesList
}

@Throws(RequestException::class)
fun IGDBWrapper.platforms(apiCalypse: APICalypse): List<proto.Platform> {
    val bytes = apiRequest(Endpoint.PLATFORMS.url(), apiCalypse.buildQuery())
    return PlatformResult.parseFrom(bytes).platformsList
}

@Throws(RequestException::class)
fun IGDBWrapper.platformLogos(apiCalypse: APICalypse): List<proto.PlatformLogo> {
    val bytes = apiRequest(Endpoint.PLATFORM_LOGOS.url(), apiCalypse.buildQuery())
    return PlatformLogoResult.parseFrom(bytes).platformlogosList
}

@Throws(RequestException::class)
fun IGDBWrapper.platformVersions(apiCalypse: APICalypse): List<proto.PlatformVersion> {
    val bytes = apiRequest(Endpoint.PLATFORM_VERSIONS.url(), apiCalypse.buildQuery())
    return PlatformVersionResult.parseFrom(bytes).platformversionsList
}

@Throws(RequestException::class)
fun IGDBWrapper.platformVersionCompanies(apiCalypse: APICalypse): List<proto.PlatformVersionCompany> {
    val bytes = apiRequest(Endpoint.PLATFORM_VERSION_COMPANIES.url(), apiCalypse.buildQuery())
    return PlatformVersionCompanyResult.parseFrom(bytes).platformversioncompaniesList
}

@Throws(RequestException::class)
fun IGDBWrapper.platformVersionReleaseDates(apiCalypse: APICalypse): List<proto.PlatformVersionReleaseDate> {
    val bytes = apiRequest(Endpoint.PLATFORM_VERSION_RELEASE_DATES.url(), apiCalypse.buildQuery())
    return PlatformVersionReleaseDateResult.parseFrom(bytes).platformversionreleasedatesList
}

@Throws(RequestException::class)
fun IGDBWrapper.platformWebsites(apiCalypse: APICalypse): List<proto.PlatformWebsite> {
    val bytes = apiRequest(Endpoint.PLATFORM_WEBSITES.url(), apiCalypse.buildQuery())
    return PlatformWebsiteResult.parseFrom(bytes).platformwebsitesList
}

@Throws(RequestException::class)
fun IGDBWrapper.playerPerspectives(apiCalypse: APICalypse): List<proto.PlayerPerspective> {
    val bytes = apiRequest(Endpoint.PLAYER_PERSPECTIVES.url(), apiCalypse.buildQuery())
    return PlayerPerspectiveResult.parseFrom(bytes).playerperspectivesList
}

@Throws(RequestException::class)
fun IGDBWrapper.productFamilies(apiCalypse: APICalypse): List<proto.ProductFamily> {
    val bytes = apiRequest(Endpoint.PRODUCT_FAMILIES.url(), apiCalypse.buildQuery())
    return ProductFamilyResult.parseFrom(bytes).productfamiliesList
}

@Throws(RequestException::class)
fun IGDBWrapper.pulses(apiCalypse: APICalypse): List<proto.Pulse> {
    val bytes = apiRequest(Endpoint.PULSES.url(), apiCalypse.buildQuery())
    return PulseResult.parseFrom(bytes).pulsesList
}

@Throws(RequestException::class)
fun IGDBWrapper.pulseGroups(apiCalypse: APICalypse): List<proto.PulseGroup> {
    val bytes = apiRequest(Endpoint.PULSE_GROUPS.url(), apiCalypse.buildQuery())
    return PulseGroupResult.parseFrom(bytes).pulsegroupsList
}

@Throws(RequestException::class)
fun IGDBWrapper.pulseSources(apiCalypse: APICalypse): List<proto.PulseSource> {
    val bytes = apiRequest(Endpoint.PULSE_SOURCES.url(), apiCalypse.buildQuery())
    return PulseSourceResult.parseFrom(bytes).pulsesourcesList
}

@Throws(RequestException::class)
fun IGDBWrapper.pulseUrls(apiCalypse: APICalypse): List<proto.PulseUrl> {
    val bytes = apiRequest(Endpoint.PULSE_URLS.url(), apiCalypse.buildQuery())
    return PulseUrlResult.parseFrom(bytes).pulseurlsList
}

@Throws(RequestException::class)
fun IGDBWrapper.releaseDates(apiCalypse: APICalypse): List<proto.ReleaseDate> {
    val bytes = apiRequest(Endpoint.RELEASE_DATES.url(), apiCalypse.buildQuery())
    return ReleaseDateResult.parseFrom(bytes).releasedatesList
}

@Throws(RequestException::class)
fun IGDBWrapper.screenshots(apiCalypse: APICalypse): List<proto.Screenshot> {
    val bytes = apiRequest(Endpoint.SCREENSHOTS.url(), apiCalypse.buildQuery())
    return ScreenshotResult.parseFrom(bytes).screenshotsList
}

@Throws(RequestException::class)
fun IGDBWrapper.search(apiCalypse: APICalypse): List<proto.Search> {
    val bytes = apiRequest(Endpoint.SEARCH.url(), apiCalypse.buildQuery())
    return SearchResult.parseFrom(bytes).searchesList
}

@Throws(RequestException::class)
fun IGDBWrapper.themes(apiCalypse: APICalypse): List<proto.Theme> {
    val bytes = apiRequest(Endpoint.THEMES.url(), apiCalypse.buildQuery())
    return ThemeResult.parseFrom(bytes).themesList
}

@Throws(RequestException::class)
fun IGDBWrapper.timeToBeats(apiCalypse: APICalypse): List<proto.TimeToBeat> {
    val bytes = apiRequest(Endpoint.TIME_TO_BEATS.url(), apiCalypse.buildQuery())
    return TimeToBeatResult.parseFrom(bytes).timetobeatsList
}

@Throws(RequestException::class)
fun IGDBWrapper.titles(apiCalypse: APICalypse): List<proto.Title> {
    val bytes = apiRequest(Endpoint.TITLES.url(), apiCalypse.buildQuery())
    return TitleResult.parseFrom(bytes).titlesList
}

@Throws(RequestException::class)
fun IGDBWrapper.websites(apiCalypse: APICalypse): List<proto.Website> {
    val bytes = apiRequest(Endpoint.WEBSITES.url(), apiCalypse.buildQuery())
    return WebsiteResult.parseFrom(bytes).websitesList
}