package com.api.igdb.request

import com.api.igdb.apicalypse.APICalypse
import com.api.igdb.exceptions.RequestException
import com.api.igdb.utils.Endpoints
import proto.*
import proto.Collection


@Throws(RequestException::class)
fun IGDBWrapper.ageRatings(APICalypse: APICalypse): List<AgeRating> {
    val bytes = apiProtoRequest(Endpoints.AGE_RATINGS, APICalypse.buildQuery())
    return AgeRatingResult.parseFrom(bytes).ageratingsList
}

@Throws(RequestException::class)
fun IGDBWrapper.ageRatingContentDescriptions(APICalypse: APICalypse): List<AgeRatingContentDescription> {
    val bytes = apiProtoRequest(Endpoints.AGE_RATING_CONTENT_DESCRIPTIONS, APICalypse.buildQuery())
    return AgeRatingContentDescriptionResult.parseFrom(bytes).ageratingcontentdescriptionsList
}

@Throws(RequestException::class)
fun IGDBWrapper.alternativeNames(APICalypse: APICalypse): List<AlternativeName> {
    val bytes = apiProtoRequest(Endpoints.ALTERNATIVE_NAMES, APICalypse.buildQuery())
    return AlternativeNameResult.parseFrom(bytes).alternativenamesList
}

@Throws(RequestException::class)
fun IGDBWrapper.artworks(APICalypse: APICalypse): List<Artwork> {
    val bytes = apiProtoRequest(Endpoints.ARTWORKS, APICalypse.buildQuery())
    return ArtworkResult.parseFrom(bytes).artworksList
}

@Throws(RequestException::class)
fun IGDBWrapper.characters(APICalypse: APICalypse): List<Character> {
    val bytes = apiProtoRequest(Endpoints.CHARACTERS, APICalypse.buildQuery())
    return CharacterResult.parseFrom(bytes).charactersList
}

@Throws(RequestException::class)
fun IGDBWrapper.collections(APICalypse: APICalypse): List<Collection> {
    val bytes = apiProtoRequest(Endpoints.COLLECTIONS, APICalypse.buildQuery())
    return CollectionResult.parseFrom(bytes).collectionsList
}

@Throws(RequestException::class)
fun IGDBWrapper.characterMugShots(APICalypse: APICalypse): List<CharacterMugShot> {
    val bytes = apiProtoRequest(Endpoints.CHARACTER_MUG_SHOTS, APICalypse.buildQuery())
    return CharacterMugShotResult.parseFrom(bytes).charactermugshotsList
}

@Throws(RequestException::class)
fun IGDBWrapper.companies(APICalypse: APICalypse): List<Company> {
    val bytes = apiProtoRequest(Endpoints.COMPANIES, APICalypse.buildQuery())
    return CompanyResult.parseFrom(bytes).companiesList
}

@Throws(RequestException::class)
fun IGDBWrapper.companyWebsites(APICalypse: APICalypse): List<CompanyWebsite> {
    val bytes = apiProtoRequest(Endpoints.COMPANY_WEBSITES, APICalypse.buildQuery())
    return CompanyWebsiteResult.parseFrom(bytes).companywebsitesList
}

@Throws(RequestException::class)
fun IGDBWrapper.companyLogos(APICalypse: APICalypse): List<CompanyLogo> {
    val bytes = apiProtoRequest(Endpoints.COMPANY_LOGOS, APICalypse.buildQuery())
    return CompanyLogoResult.parseFrom(bytes).companylogosList
}

@Throws(RequestException::class)
fun IGDBWrapper.covers(APICalypse: APICalypse): List<Cover> {
    val bytes = apiProtoRequest(Endpoints.COVERS, APICalypse.buildQuery())
    return CoverResult.parseFrom(bytes).coversList
}

@Throws(RequestException::class)
fun IGDBWrapper.externalGames(APICalypse: APICalypse): List<ExternalGame> {
    val bytes = apiProtoRequest(Endpoints.EXTERNAL_GAMES, APICalypse.buildQuery())
    return ExternalGameResult.parseFrom(bytes).externalgamesList
}

@Throws(RequestException::class)
fun IGDBWrapper.franchises(APICalypse: APICalypse): List<Franchise> {
    val bytes = apiProtoRequest(Endpoints.FRANCHISES, APICalypse.buildQuery())
    return FranchiseResult.parseFrom(bytes).franchisesList
}

@Throws(RequestException::class)
fun IGDBWrapper.games(APICalypse: APICalypse): List<Game> {
    val bytes = apiProtoRequest(Endpoints.GAMES, APICalypse.buildQuery())
    return GameResult.parseFrom(bytes).gamesList
}

@Throws(RequestException::class)
fun IGDBWrapper.gameEngines(APICalypse: APICalypse): List<GameEngine> {
    val bytes = apiProtoRequest(Endpoints.GAME_ENGINES, APICalypse.buildQuery())
    return GameEngineResult.parseFrom(bytes).gameenginesList
}

@Throws(RequestException::class)
fun IGDBWrapper.gameEngineLogos(APICalypse: APICalypse): List<GameEngineLogo> {
    val bytes = apiProtoRequest(Endpoints.GAME_ENGINE_LOGOS, APICalypse.buildQuery())
    return GameEngineLogoResult.parseFrom(bytes).gameenginelogosList
}

@Throws(RequestException::class)
fun IGDBWrapper.gameLocalizations(APICalypse: APICalypse): List<GameLocalization> {
    val bytes = apiProtoRequest(Endpoints.GAME_LOCALIZATIONS, APICalypse.buildQuery())
    return GameLocalizationResult.parseFrom(bytes).gamelocalizationsList
}

@Throws(RequestException::class)
fun IGDBWrapper.gameModes(APICalypse: APICalypse): List<GameMode> {
    val bytes = apiProtoRequest(Endpoints.GAME_MODES, APICalypse.buildQuery())
    return GameModeResult.parseFrom(bytes).gamemodesList
}

@Throws(RequestException::class)
fun IGDBWrapper.gameVersion(APICalypse: APICalypse): List<GameVersion> {
    val bytes = apiProtoRequest(Endpoints.GAME_VERSIONS, APICalypse.buildQuery())
    return GameVersionResult.parseFrom(bytes).gameversionsList
}

@Throws(RequestException::class)
fun IGDBWrapper.gameVersionFeatures(APICalypse: APICalypse): List<GameVersionFeature> {
    val bytes = apiProtoRequest(Endpoints.GAME_VERSION_FEATURES, APICalypse.buildQuery())
    return GameVersionFeatureResult.parseFrom(bytes).gameversionfeaturesList
}

@Throws(RequestException::class)
fun IGDBWrapper.gameVersionFeatureValues(APICalypse: APICalypse): List<GameVersionFeatureValue> {
    val bytes = apiProtoRequest(Endpoints.GAME_VERSION_FEATURE_VALUES, APICalypse.buildQuery())
    return GameVersionFeatureValueResult.parseFrom(bytes).gameversionfeaturevaluesList
}

@Throws(RequestException::class)
fun IGDBWrapper.gameVideos(APICalypse: APICalypse): List<GameVideo> {
    val bytes = apiProtoRequest(Endpoints.GAME_VIDEOS, APICalypse.buildQuery())
    return GameVideoResult.parseFrom(bytes).gamevideosList
}

@Throws(RequestException::class)
fun IGDBWrapper.genres(APICalypse: APICalypse): List<Genre> {
    val bytes = apiProtoRequest(Endpoints.GENRES, APICalypse.buildQuery())
    return GenreResult.parseFrom(bytes).genresList
}

@Throws(RequestException::class)
fun IGDBWrapper.involvedCompanies(APICalypse: APICalypse): List<InvolvedCompany> {
    val bytes = apiProtoRequest(Endpoints.INVOLVED_COMPANIES, APICalypse.buildQuery())
    return InvolvedCompanyResult.parseFrom(bytes).involvedcompaniesList
}

@Throws(RequestException::class)
fun IGDBWrapper.keywords(APICalypse: APICalypse): List<Keyword> {
    val bytes = apiProtoRequest(Endpoints.KEYWORDS, APICalypse.buildQuery())
    return KeywordResult.parseFrom(bytes).keywordsList
}

@Throws(RequestException::class)
fun IGDBWrapper.languages(APICalypse: APICalypse): List<Language> {
    val bytes = apiProtoRequest(Endpoints.LANGUAGES, APICalypse.buildQuery())
    return LanguageResult.parseFrom(bytes).languagesList
}

@Throws(RequestException::class)
fun IGDBWrapper.languageSupports(APICalypse: APICalypse): List<LanguageSupport> {
    val bytes = apiProtoRequest(Endpoints.LANGUAGE_SUPPORTS, APICalypse.buildQuery())
    return LanguageSupportResult.parseFrom(bytes).languagesupportsList
}

@Throws(RequestException::class)
fun IGDBWrapper.languageSupportTypes(APICalypse: APICalypse): List<LanguageSupportType> {
    val bytes = apiProtoRequest(Endpoints.LANGUAGE_SUPPORT_TYPES, APICalypse.buildQuery())
    return LanguageSupportTypeResult.parseFrom(bytes).languagesupporttypesList
}

@Throws(RequestException::class)
fun IGDBWrapper.multiplayerModes(APICalypse: APICalypse): List<MultiplayerMode> {
    val bytes = apiProtoRequest(Endpoints.MULTIPLAYER_MODES, APICalypse.buildQuery())
    return MultiplayerModeResult.parseFrom(bytes).multiplayermodesList
}

@Throws(RequestException::class)
fun IGDBWrapper.platforms(APICalypse: APICalypse): List<Platform> {
    val bytes = apiProtoRequest(Endpoints.PLATFORMS, APICalypse.buildQuery())
    return PlatformResult.parseFrom(bytes).platformsList
}

@Throws(RequestException::class)
fun IGDBWrapper.platformLogos(APICalypse: APICalypse): List<PlatformLogo> {
    val bytes = apiProtoRequest(Endpoints.PLATFORM_LOGOS, APICalypse.buildQuery())
    return PlatformLogoResult.parseFrom(bytes).platformlogosList
}

@Throws(RequestException::class)
fun IGDBWrapper.platformVersions(APICalypse: APICalypse): List<PlatformVersion> {
    val bytes = apiProtoRequest(Endpoints.PLATFORM_VERSIONS, APICalypse.buildQuery())
    return PlatformVersionResult.parseFrom(bytes).platformversionsList
}

@Throws(RequestException::class)
fun IGDBWrapper.platformVersionCompanies(APICalypse: APICalypse): List<PlatformVersionCompany> {
    val bytes = apiProtoRequest(Endpoints.PLATFORM_VERSION_COMPANIES, APICalypse.buildQuery())
    return PlatformVersionCompanyResult.parseFrom(bytes).platformversioncompaniesList
}

@Throws(RequestException::class)
fun IGDBWrapper.platformVersionReleaseDates(APICalypse: APICalypse): List<PlatformVersionReleaseDate> {
    val bytes = apiProtoRequest(Endpoints.PLATFORM_VERSION_RELEASE_DATES, APICalypse.buildQuery())
    return PlatformVersionReleaseDateResult.parseFrom(bytes).platformversionreleasedatesList
}

@Throws(RequestException::class)
fun IGDBWrapper.platformWebsites(APICalypse: APICalypse): List<PlatformWebsite> {
    val bytes = apiProtoRequest(Endpoints.PLATFORM_WEBSITES, APICalypse.buildQuery())
    return PlatformWebsiteResult.parseFrom(bytes).platformwebsitesList
}

@Throws(RequestException::class)
fun IGDBWrapper.playerPerspectives(APICalypse: APICalypse): List<PlayerPerspective> {
    val bytes = apiProtoRequest(Endpoints.PLAYER_PERSPECTIVES, APICalypse.buildQuery())
    return PlayerPerspectiveResult.parseFrom(bytes).playerperspectivesList
}

@Throws(RequestException::class)
fun IGDBWrapper.platformFamilies(APICalypse: APICalypse): List<PlatformFamily> {
    val bytes = apiProtoRequest(Endpoints.PLATFORM_FAMILIES, APICalypse.buildQuery())
    return PlatformFamilyResult.parseFrom(bytes).platformfamiliesList
}

@Throws(RequestException::class)
fun IGDBWrapper.regions(APICalypse: APICalypse): List<Region> {
    val bytes = apiProtoRequest(Endpoints.REGIONS, APICalypse.buildQuery())
    return RegionResult.parseFrom(bytes).regionsList
}

@Throws(RequestException::class)
fun IGDBWrapper.releaseDates(APICalypse: APICalypse): List<ReleaseDate> {
    val bytes = apiProtoRequest(Endpoints.RELEASE_DATES, APICalypse.buildQuery())
    return ReleaseDateResult.parseFrom(bytes).releasedatesList
}

@Throws(RequestException::class)
fun IGDBWrapper.screenshots(APICalypse: APICalypse): List<Screenshot> {
    val bytes = apiProtoRequest(Endpoints.SCREENSHOTS, APICalypse.buildQuery())
    return ScreenshotResult.parseFrom(bytes).screenshotsList
}

@Throws(RequestException::class)
fun IGDBWrapper.search(APICalypse: APICalypse): List<Search> {
    val bytes = apiProtoRequest(Endpoints.SEARCH, APICalypse.buildQuery())
    return SearchResult.parseFrom(bytes).searchesList
}

@Throws(RequestException::class)
fun IGDBWrapper.themes(APICalypse: APICalypse): List<Theme> {
    val bytes = apiProtoRequest(Endpoints.THEMES, APICalypse.buildQuery())
    return ThemeResult.parseFrom(bytes).themesList
}

@Throws(RequestException::class)
fun IGDBWrapper.websites(APICalypse: APICalypse): List<Website> {
    val bytes = apiProtoRequest(Endpoints.WEBSITES, APICalypse.buildQuery())
    return WebsiteResult.parseFrom(bytes).websitesList
}

@Throws(RequestException::class)
fun IGDBWrapper.events(APICalypse: APICalypse): List<Event> {
    val bytes = apiProtoRequest(Endpoints.EVENTS, APICalypse.buildQuery())
    return EventResult.parseFrom(bytes).eventsList
}

@Throws(RequestException::class)
fun IGDBWrapper.eventLogos(APICalypse: APICalypse): List<EventLogo> {
    val bytes = apiProtoRequest(Endpoints.EVENT_LOGOS, APICalypse.buildQuery())
    return EventLogoResult.parseFrom(bytes).eventlogosList
}


@Throws(RequestException::class)
fun IGDBWrapper.eventNetworks(APICalypse: APICalypse): List<EventNetwork> {
    val bytes = apiProtoRequest(Endpoints.EVENT_NETWORKS, APICalypse.buildQuery())
    return EventNetworkResult.parseFrom(bytes).eventnetworksList
}

@Throws(RequestException::class)
fun IGDBWrapper.networkTypes(APICalypse: APICalypse): List<NetworkType> {
    val bytes = apiProtoRequest(Endpoints.NETWORK_TYPES, APICalypse.buildQuery())
    return NetworkTypeResult.parseFrom(bytes).networktypesList
}

@Throws(RequestException::class)
fun IGDBWrapper.collectionRelations(APICalypse: APICalypse): List<CollectionRelation> {
    val bytes = apiProtoRequest(Endpoints.COLLECTION_RELATIONS, APICalypse.buildQuery())
    return CollectionRelationResult.parseFrom(bytes).collectionrelationsList
}

@Throws(RequestException::class)
fun IGDBWrapper.collectionRelationTypes(APICalypse: APICalypse): List<CollectionRelationType> {
    val bytes = apiProtoRequest(Endpoints.COLLECTION_RELATION_TYPES, APICalypse.buildQuery())
    return CollectionRelationTypeResult.parseFrom(bytes).collectionrelationtypesList
}

@Throws(RequestException::class)
fun IGDBWrapper.collectionTypes(APICalypse: APICalypse): List<CollectionType> {
    val bytes = apiProtoRequest(Endpoints.COLLECTION_TYPES, APICalypse.buildQuery())
    return CollectionTypeResult.parseFrom(bytes).collectiontypesList
}

@Throws(RequestException::class)
fun IGDBWrapper.collectionMemberships(APICalypse: APICalypse): List<CollectionMembership> {
    val bytes = apiProtoRequest(Endpoints.COLLECTION_MEMBERSHIPS, APICalypse.buildQuery())
    return CollectionMembershipResult.parseFrom(bytes).collectionmembershipsList
}

@Throws(RequestException::class)
fun IGDBWrapper.collectionMembershipTypes(APICalypse: APICalypse): List<CollectionMembershipType> {
    val bytes = apiProtoRequest(Endpoints.COLLECTION_MEMBERSHIP_TYPES, APICalypse.buildQuery())
    return CollectionMembershipTypeResult.parseFrom(bytes).collectionmembershiptypesList
}

@Throws(RequestException::class)
fun IGDBWrapper.popularityTypes(APICalypse: APICalypse): List<PopularityType> {
    val bytes = apiProtoRequest(Endpoints.POPULARITY_TYPES, APICalypse.buildQuery())
    return PopularityTypeResult.parseFrom(bytes).popularitytypesList
}

@Throws(RequestException::class)
fun IGDBWrapper.popularityPrimitives(APICalypse: APICalypse): List<PopularityPrimitive> {
    val bytes = apiProtoRequest(Endpoints.COLLECTION_MEMBERSHIP_TYPES, APICalypse.buildQuery())
    return PopularityPrimitiveResult.parseFrom(bytes).popularityprimitivesList
}