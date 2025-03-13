package com.api.igdb

import com.api.igdb.apicalypse.APICalypse
import com.api.igdb.request.IGDBWrapper
import com.api.igdb.request.*
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNotEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class TestProtobufRequest {

    private val wrapper = IGDBWrapper

    @BeforeEach
    fun setup() {
        wrapper.setCredentials(System.getenv("client_id"), System.getenv("bearer"))
    }

    @Test
    fun testAgeRating() {
        val result = wrapper.ageRatings(APICalypse())
        assert(result.isNotEmpty())
    }

    @Test
    fun testAgeRatingCategories() {
        val result = wrapper.ageRatingCategories(APICalypse())
        assert(result.isNotEmpty())
    }

    @Test
    fun testAgeRatingContentDescriptions() {
        val result = wrapper.ageRatingContentDescriptions(APICalypse())
        assert(result.isNotEmpty())
    }

    @Test
    fun testAgeRatingContentDescriptionsV2() {
        val result = wrapper.ageRatingContentDescriptionsV2(APICalypse())
        assert(result.isNotEmpty())
    }

    @Test
    fun testAgeRatingOrganizations() {
        val result = wrapper.ageRatingOrganizations(APICalypse())
        assert(result.isNotEmpty())
    }

    @Test
    fun testAlternativeNames() {
        val result = wrapper.alternativeNames(APICalypse())
        assert(result.isNotEmpty())
    }

    @Test
    fun testArtwork() {
        val result = wrapper.artworks(APICalypse())
        assert(result.isNotEmpty())
    }

    @Test
    fun testCharactersGenders() {
        val result = wrapper.characterGenders(APICalypse())
        assert(result.isNotEmpty())
    }

    @Test
    fun testCharacterSpecies() {
        val result = wrapper.characterSpecies(APICalypse())
        assert(result.isNotEmpty())
    }

    @Test
    fun testCharacters() {
        val result = wrapper.characters(APICalypse())
        assert(result.isNotEmpty())
    }

    @Test
    fun testCollections() {
        val result = wrapper.collections(APICalypse())
        assert(result.isNotEmpty())
    }

    @Test
    fun testCharacterMugShots() {
        val result = wrapper.characterMugShots(APICalypse())
        assert(result.isNotEmpty())
    }

    @Test
    fun testCompanies() {
        val result = wrapper.companies(APICalypse())
        assert(result.isNotEmpty())
    }

    @Test
    fun testCompanyStatuses() {
        val result = wrapper.companyStatuses(APICalypse())
        assert(result.isNotEmpty())
    }

    @Test
    fun testComapnyWebsites() {
        val result = wrapper.companyWebsites(APICalypse())
        assert(result.isNotEmpty())
    }

    @Test
    fun testCompantLogos() {
        val result = wrapper.companyLogos(APICalypse())
        assert(result.isNotEmpty())
    }

    @Test
    fun testCover() {
        val result = wrapper.covers(APICalypse())
        assert(result.isNotEmpty())
    }

    @Test
    fun testDateFormats() {
        val result = wrapper.dateFormats(APICalypse())
        assert(result.isNotEmpty())
    }

    @Test
    fun testExternalGames() {
        val result = wrapper.externalGames(APICalypse())
        assert(result.isNotEmpty())
    }

    @Test
    fun testExternalGameSources() {
        val result = wrapper.externalGameSources(APICalypse())
        assert(result.isNotEmpty())
    }

    @Test
    fun testFranschises() {
        val result = wrapper.franchises(APICalypse())
        assert(result.isNotEmpty())
    }

    @Test
    fun testGames() {
        val result = wrapper.games(APICalypse()
                .fields("*, age_ratings.*, alternative_names.*, cover.*, external_games.*, franchises.*, genres.*, screenshots.*, videos.*")
                .where("id = 1942"))
        assert(result.isNotEmpty())
        val game = result.first()
        assertEquals("The Witcher 3: Wild Hunt", game.name)
        assertEquals("the-witcher-3-wild-hunt", game.slug)
        assert(game.name.isNotEmpty())
        assert(game.hasCreatedAt())
        if (game.checksum.isNullOrBlank()) println("checksumField empty") else println(game.checksum)
        assertNotEquals(" ", game.checksum)

        val ageRatings = game.ageRatingsList
        val ageRating = ageRatings.first()
        assert(ageRating.contentDescriptionsList.isNotEmpty())
        assert(ageRating.ratingContentDescriptionsList.isNotEmpty())
        assert(ageRating.hasOrganization())
        assert(ageRating.hasRatingCategory())
        if (ageRating.checksum.isNullOrBlank()) println("checksumField empty") else println(ageRating.checksum)
        assertNotEquals(" ", ageRating.checksum)

        val alternativeNames = game.alternativeNamesList
        assert(alternativeNames.isNotEmpty())
        if (alternativeNames.first().checksum.isNullOrBlank()) println("checksumField empty") else println(alternativeNames.first().checksum)
        assertNotEquals(" ", alternativeNames.first().checksum)

        val cover = game.cover
        assertNotEquals(" ", cover.imageId)
        if (cover.checksum.isNullOrBlank()) println("checksumField empty") else println(cover.checksum)
        assertNotEquals(" ", cover.checksum)

        val externalGames = game.externalGamesList
        assert(externalGames.isNotEmpty())
        if (externalGames.first().checksum.isNullOrBlank()) println("checksumField empty") else println(externalGames.first().checksum)
        assertNotEquals(" ", externalGames.first().checksum)

        val franchises = game.franchisesList
        assert(franchises.first().id == 452L)
        assertEquals("the-witcher", franchises.first().slug)
        val franchiseGames = franchises.first().gamesList
        assert(franchiseGames.isNotEmpty())

        val involvedCompany = game.involvedCompaniesList
        assert(involvedCompany.isNotEmpty())

        val genres = game.genresList
        assert(genres.isNotEmpty())

        val releaseDates = game.releaseDatesList
        assert(releaseDates.isNotEmpty())

        val screenshots = game.screenshotsList
        assert(screenshots.isNotEmpty())
        val screenshot = screenshots.first()
        assertNotEquals(" ", screenshot.imageId)
        assertNotEquals(" ", screenshot.checksum)

        val videos = game.videosList
        assert(videos.isNotEmpty())
        val video = videos.first()
        assertNotEquals(" ", video.checksum)
        assertNotEquals(" ", video.videoId)
    }

    @Test
    fun testGameEngines() {
        val result = wrapper.gameEngines(APICalypse())
        assert(result.isNotEmpty())
    }

    @Test
    fun testGameEngineLogos() {
        val result = wrapper.gameEngineLogos(APICalypse())
        assert(result.isNotEmpty())
    }

    @Test
    fun testGameLocalizations() {
        val result = wrapper.gameLocalizations(APICalypse())
        assert(result.isNotEmpty())
    }

    @Test
    fun testGameModes() {
        val result = wrapper.gameModes(APICalypse())
        assert(result.isNotEmpty())
    }

    @Test
    fun testGameReleaseFormats() {
        val result = wrapper.gameReleaseFormats(APICalypse())
        assert(result.isNotEmpty())
    }

    @Test
    fun testGameStatuses() {
        val result = wrapper.gameStatuses(APICalypse())
        assert(result.isNotEmpty())
    }

    @Test
    fun testGameTypes() {
        val result = wrapper.gameTypes(APICalypse())
        assert(result.isNotEmpty())
    }

    @Test
    fun testGameVersions() {
        val result = wrapper.gameVersion(APICalypse())
        assert(result.isNotEmpty())
    }

    @Test
    fun testGameVersionFeatures() {
        val result = wrapper.gameVersionFeatures(APICalypse())
        assert(result.isNotEmpty())
    }

    @Test
    fun testGameVersionFeatureValues() {
        val result = wrapper.gameVersionFeatureValues(APICalypse())
        assert(result.isNotEmpty())
    }

    @Test
    fun testGameVideos() {
        val result = wrapper.gameVideos(APICalypse())
        assert(result.isNotEmpty())
    }

    @Test
    fun testGenres() {
        val result = wrapper.genres(APICalypse())
        assert(result.isNotEmpty())
    }

    @Test
    fun testInvolvedCompanies() {
        val result = wrapper.involvedCompanies(APICalypse())
        assert(result.isNotEmpty())
    }

    @Test
    fun testKeywords() {
        val result = wrapper.keywords(APICalypse())
        assert(result.isNotEmpty())
    }

    @Test
    fun testMultiplayerModes() {
        val result = wrapper.multiplayerModes(APICalypse())
        assert(result.isNotEmpty())
    }

    @Test
    fun testPlatforms() {
        val result = wrapper.platforms(APICalypse())
        assert(result.isNotEmpty())
    }

    @Test
    fun testPlatformLogos() {
        val result = wrapper.platformLogos(APICalypse())
        assert(result.isNotEmpty())
    }

    @Test
    fun testPlatformTypes() {
        val result = wrapper.platformTypes(APICalypse())
        assert(result.isNotEmpty())
    }

    @Test
    fun testPlatformVersions() {
        val result = wrapper.platformVersions(APICalypse())
        assert(result.isNotEmpty())
    }

    @Test
    fun testPlatformVerisonCompanies() {
        val result = wrapper.platformVersionCompanies(APICalypse())
        assert(result.isNotEmpty())
    }

    @Test
    fun testPlatformVersionReleaseDates() {
        val result = wrapper.platformVersionReleaseDates(APICalypse())
        assert(result.isNotEmpty())
    }

    @Test
    fun testPlatformWebsites() {
        val result = wrapper.platformWebsites(APICalypse())
        assert(result.isNotEmpty())
    }

    @Test
    fun testPlayerPerspectives() {
        val result = wrapper.playerPerspectives(APICalypse())
        assert(result.isNotEmpty())
    }

    @Test
    fun testProductFamilies() {
        val result = wrapper.platformFamilies(APICalypse())
        assert(result.isNotEmpty())
    }

    @Test
    fun testRegions() {
        val result = wrapper.regions(APICalypse())
        assert(result.isNotEmpty())
    }

    @Test
    fun testReleaseDates() {
        val result = wrapper.releaseDates(APICalypse())
        assert(result.isNotEmpty())
    }

    @Test
    fun testReleaseDateRegions() {
        val result = wrapper.releaseDateRegions(APICalypse())
        assert(result.isNotEmpty())
    }

    @Test
    fun testScreenshots() {
        val result = wrapper.screenshots(APICalypse())
        assert(result.isNotEmpty())
    }

    @Test
    fun testSearch() {
        val result = wrapper.search(APICalypse())
        assert(result.isNotEmpty())
    }

    @Test
    fun testThemes() {
        val result = wrapper.themes(APICalypse())
        assert(result.isNotEmpty())
    }

    @Test
    fun testWebsites() {
        val result = wrapper.websites(APICalypse())
        assert(result.isNotEmpty())
    }

    @Test
    fun testWebsiteTypes() {
        val result = wrapper.websiteTypes(APICalypse())
        assert(result.isNotEmpty())
    }

    @Test
    fun testEvents() {
        val result = wrapper.events(APICalypse())
        assert(result.isNotEmpty())
    }

    @Test
    fun testEventLogos() {
        val result = wrapper.eventLogos(APICalypse())
        assert(result.isNotEmpty())
    }

    @Test
    fun testEventNetworks() {
        val result = wrapper.eventNetworks(APICalypse())
        assert(result.isNotEmpty())
    }

    @Test
    fun testNetworkTypes() {
        val result = wrapper.networkTypes(APICalypse())
        assert(result.isNotEmpty())
    }

    @Test
    fun testCollectionRelations() {
        val result = wrapper.collectionRelations(APICalypse())
        assert(result.isEmpty()) // Currently no data..
    }

    @Test
    fun testCollectionRelationTypes() {
        val result = wrapper.collectionRelationTypes(APICalypse())
        assert(result.isNotEmpty())
    }

    @Test
    fun testCollectionTypes() {
        val result = wrapper.collectionTypes(APICalypse())
        assert(result.isNotEmpty())
    }

    @Test
    fun testCollectionMemberships() {
        val result = wrapper.collectionMemberships(APICalypse())
        assert(result.isNotEmpty())
    }

    @Test
    fun testCollectionMembershipTypes() {
        val result = wrapper.collectionMembershipTypes(APICalypse())
        assert(result.isNotEmpty())
    }

    @Test
    fun testPopularityTypes() {
        val result = wrapper.popularityTypes(APICalypse().fields("*"))
        assert(result.isNotEmpty())
        assert(result.first().hasExternalPopularitySource())
    }

    @Test
    fun testPopularityPrimitives() {
        val result = wrapper.popularityPrimitives(APICalypse().fields("*"))
        assert(result.isNotEmpty())
        assert(result.first().hasExternalPopularitySource())
        assert(result.first().hasCalculatedAt())
        assert(result.first().value > 0)
    }
    
}
