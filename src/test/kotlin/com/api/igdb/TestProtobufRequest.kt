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

    private val apiCalypseQuery = APICalypse().fields("*")
    
    @BeforeEach
    fun setup() {
        wrapper.setCredentials(System.getenv("client_id"), System.getenv("bearer"))
    }

    @Test
    fun testAgeRating() {
        val result = wrapper.ageRatings(apiCalypseQuery)
        assert(result.isNotEmpty())
    }

    @Test
    fun testAgeRatingCategories() {
        val result = wrapper.ageRatingCategories(apiCalypseQuery)
        assert(result.isNotEmpty())
    }

    @Test
    fun testAgeRatingContentDescriptions() {
        val result = wrapper.ageRatingContentDescriptions(apiCalypseQuery)
        assert(result.isNotEmpty())
    }

    @Test
    fun testAgeRatingContentDescriptionsV2() {
        val result = wrapper.ageRatingContentDescriptionsV2(apiCalypseQuery)
        assert(result.isNotEmpty())
    }

    @Test
    fun testAgeRatingOrganizations() {
        val result = wrapper.ageRatingOrganizations(apiCalypseQuery)
        assert(result.isNotEmpty())
    }

    @Test
    fun testAlternativeNames() {
        val result = wrapper.alternativeNames(apiCalypseQuery)
        assert(result.isNotEmpty())
    }

    @Test
    fun testArtwork() {
        val result = wrapper.artworks(apiCalypseQuery)
        assert(result.isNotEmpty())
    }

    @Test
    fun testCharactersGenders() {
        val result = wrapper.characterGenders(apiCalypseQuery)
        assert(result.isNotEmpty())
    }

    @Test
    fun testCharacterSpecies() {
        val result = wrapper.characterSpecies(apiCalypseQuery)
        assert(result.isNotEmpty())
    }

    @Test
    fun testCharacters() {
        val result = wrapper.characters(apiCalypseQuery)
        assert(result.isNotEmpty())
    }

    @Test
    fun testCollections() {
        val result = wrapper.collections(apiCalypseQuery)
        assert(result.isNotEmpty())
    }

    @Test
    fun testCharacterMugShots() {
        val result = wrapper.characterMugShots(apiCalypseQuery)
        assert(result.isNotEmpty())
    }

    @Test
    fun testCompanies() {
        val result = wrapper.companies(apiCalypseQuery)
        assert(result.isNotEmpty())
    }

    @Test
    fun testCompanyStatuses() {
        val result = wrapper.companyStatuses(apiCalypseQuery)
        assert(result.isNotEmpty())
    }

    @Test
    fun testComapnyWebsites() {
        val result = wrapper.companyWebsites(apiCalypseQuery)
        assert(result.isNotEmpty())
    }

    @Test
    fun testCompantLogos() {
        val result = wrapper.companyLogos(apiCalypseQuery)
        assert(result.isNotEmpty())
    }

    @Test
    fun testCover() {
        val result = wrapper.covers(apiCalypseQuery)
        assert(result.isNotEmpty())
    }

    @Test
    fun testDateFormats() {
        val result = wrapper.dateFormats(apiCalypseQuery)
        assert(result.isNotEmpty())
    }

    @Test
    fun testExternalGames() {
        val result = wrapper.externalGames(apiCalypseQuery)
        assert(result.isNotEmpty())
    }

    @Test
    fun testExternalGameSources() {
        val result = wrapper.externalGameSources(apiCalypseQuery)
        assert(result.isNotEmpty())
    }

    @Test
    fun testFranschises() {
        val result = wrapper.franchises(apiCalypseQuery)
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
        val result = wrapper.gameEngines(apiCalypseQuery)
        assert(result.isNotEmpty())
    }

    @Test
    fun testGameEngineLogos() {
        val result = wrapper.gameEngineLogos(apiCalypseQuery)
        assert(result.isNotEmpty())
    }

    @Test
    fun testGameLocalizations() {
        val result = wrapper.gameLocalizations(apiCalypseQuery)
        assert(result.isNotEmpty())
    }

    @Test
    fun testGameModes() {
        val result = wrapper.gameModes(apiCalypseQuery)
        assert(result.isNotEmpty())
    }

    @Test
    fun testGameReleaseFormats() {
        val result = wrapper.gameReleaseFormats(apiCalypseQuery)
        assert(result.isNotEmpty())
    }

    @Test
    fun testGameStatuses() {
        val result = wrapper.gameStatuses(apiCalypseQuery)
        assert(result.isNotEmpty())
    }

    @Test
    fun testGameTypes() {
        val result = wrapper.gameTypes(apiCalypseQuery)
        assert(result.isNotEmpty())
    }

    @Test
    fun testGameVersions() {
        val result = wrapper.gameVersion(apiCalypseQuery)
        assert(result.isNotEmpty())
    }

    @Test
    fun testGameVersionFeatures() {
        val result = wrapper.gameVersionFeatures(apiCalypseQuery)
        assert(result.isNotEmpty())
    }

    @Test
    fun testGameVersionFeatureValues() {
        val result = wrapper.gameVersionFeatureValues(apiCalypseQuery)
        assert(result.isNotEmpty())
    }

    @Test
    fun testGameVideos() {
        val result = wrapper.gameVideos(apiCalypseQuery)
        assert(result.isNotEmpty())
    }

    @Test
    fun testGenres() {
        val result = wrapper.genres(apiCalypseQuery)
        assert(result.isNotEmpty())
    }

    @Test
    fun testInvolvedCompanies() {
        val result = wrapper.involvedCompanies(apiCalypseQuery)
        assert(result.isNotEmpty())
    }

    @Test
    fun testKeywords() {
        val result = wrapper.keywords(apiCalypseQuery)
        assert(result.isNotEmpty())
    }

    @Test
    fun testMultiplayerModes() {
        val result = wrapper.multiplayerModes(apiCalypseQuery)
        assert(result.isNotEmpty())
    }

    @Test
    fun testPlatforms() {
        val result = wrapper.platforms(apiCalypseQuery)
        assert(result.isNotEmpty())
    }

    @Test
    fun testPlatformLogos() {
        val result = wrapper.platformLogos(apiCalypseQuery)
        assert(result.isNotEmpty())
    }

    @Test
    fun testPlatformTypes() {
        val result = wrapper.platformTypes(apiCalypseQuery)
        assert(result.isNotEmpty())
    }

    @Test
    fun testPlatformVersions() {
        val result = wrapper.platformVersions(apiCalypseQuery)
        assert(result.isNotEmpty())
    }

    @Test
    fun testPlatformVerisonCompanies() {
        val result = wrapper.platformVersionCompanies(apiCalypseQuery)
        assert(result.isNotEmpty())
    }

    @Test
    fun testPlatformVersionReleaseDates() {
        val result = wrapper.platformVersionReleaseDates(apiCalypseQuery)
        assert(result.isNotEmpty())
    }

    @Test
    fun testPlatformWebsites() {
        val result = wrapper.platformWebsites(apiCalypseQuery)
        assert(result.isNotEmpty())
    }

    @Test
    fun testPlayerPerspectives() {
        val result = wrapper.playerPerspectives(apiCalypseQuery)
        assert(result.isNotEmpty())
    }

    @Test
    fun testProductFamilies() {
        val result = wrapper.platformFamilies(apiCalypseQuery)
        assert(result.isNotEmpty())
    }

    @Test
    fun testRegions() {
        val result = wrapper.regions(apiCalypseQuery)
        assert(result.isNotEmpty())
    }

    @Test
    fun testReleaseDates() {
        val result = wrapper.releaseDates(apiCalypseQuery)
        assert(result.isNotEmpty())
    }

    @Test
    fun testReleaseDateRegions() {
        val result = wrapper.releaseDateRegions(apiCalypseQuery)
        assert(result.isNotEmpty())
    }

    @Test
    fun testScreenshots() {
        val result = wrapper.screenshots(apiCalypseQuery)
        assert(result.isNotEmpty())
    }

    @Test
    fun testSearch() {
        val result = wrapper.search(apiCalypseQuery)
        assert(result.isNotEmpty())
    }

    @Test
    fun testThemes() {
        val result = wrapper.themes(apiCalypseQuery)
        assert(result.isNotEmpty())
    }

    @Test
    fun testWebsites() {
        val result = wrapper.websites(apiCalypseQuery)
        assert(result.isNotEmpty())
    }

    @Test
    fun testWebsiteTypes() {
        val result = wrapper.websiteTypes(apiCalypseQuery)
        assert(result.isNotEmpty())
    }

    @Test
    fun testEvents() {
        val result = wrapper.events(apiCalypseQuery)
        assert(result.isNotEmpty())
    }

    @Test
    fun testEventLogos() {
        val result = wrapper.eventLogos(apiCalypseQuery)
        assert(result.isNotEmpty())
    }

    @Test
    fun testEventNetworks() {
        val result = wrapper.eventNetworks(apiCalypseQuery)
        assert(result.isNotEmpty())
    }

    @Test
    fun testNetworkTypes() {
        val result = wrapper.networkTypes(apiCalypseQuery)
        assert(result.isNotEmpty())
    }

    @Test
    fun testCollectionRelations() {
        val result = wrapper.collectionRelations(apiCalypseQuery)
        assert(result.isNotEmpty())
    }

    @Test
    fun testCollectionRelationTypes() {
        val result = wrapper.collectionRelationTypes(apiCalypseQuery)
        assert(result.isNotEmpty())
    }

    @Test
    fun testCollectionTypes() {
        val result = wrapper.collectionTypes(apiCalypseQuery)
        assert(result.isNotEmpty())
    }

    @Test
    fun testCollectionMemberships() {
        val result = wrapper.collectionMemberships(apiCalypseQuery)
        assert(result.isNotEmpty())
    }

    @Test
    fun testCollectionMembershipTypes() {
        val result = wrapper.collectionMembershipTypes(apiCalypseQuery)
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
