import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test


class TestProtobufRequests {
    val wrapper = IGDBWrapper

    @BeforeEach
    fun setup() {
        wrapper.userkey = System.getProperty("key")
    }

    @Test
    fun testAchievements() {
        val result = wrapper.achievements(APICalypse())
        assert(result.isNotEmpty())
    }

    @Test
    fun testAchievementIcons() {
        val result = wrapper.achievementIcons(APICalypse())
        assert(result.isNotEmpty())
    }

    @Test
    fun testAgeRating() {
        val result = wrapper.ageRatings(APICalypse())
        assert(result.isNotEmpty())
    }

    @Test
    fun testAgeRatingContentDescriptions() {
        val result = wrapper.ageRatingContentDescriptions(APICalypse())
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
    fun testExternalGames() {
        val result = wrapper.externalGames(APICalypse())
        assert(result.isNotEmpty())
    }

    @Test
    fun testFeeds() {
        val result = wrapper.feeds(APICalypse())
        assert(result.isNotEmpty())
    }

    @Test
    fun testFranschises() {
        val result = wrapper.franchises(APICalypse())
        assert(result.isNotEmpty())
    }

    @Test
    fun testGames() {
        val result = wrapper.games(APICalypse())
        assert(result.isNotEmpty())
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
    fun testGameModes() {
        val result = wrapper.gameModes(APICalypse())
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
    fun testPages() {
        val result = wrapper.pages(APICalypse())
        assert(result.isNotEmpty())
    }

    @Test
    fun testPageBackgrounds() {
        val result = wrapper.pageBackgrounds(APICalypse())
        assert(result.isNotEmpty())
    }

    @Test
    fun testPageLogos() {
        val result = wrapper.pageLogos(APICalypse())
        assert(result.isNotEmpty())
    }

    @Test
    fun testPageWebsites() {
        val result = wrapper.pageWebsite(APICalypse())
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
        val result = wrapper.productFamilies(APICalypse())
        assert(result.isNotEmpty())
    }

    @Test
    fun testPulses() {
        val result = wrapper.pulses(APICalypse())
        assert(result.isNotEmpty())
    }

    @Test
    fun testPulseGroups() {
        val result = wrapper.pulseGroups(APICalypse())
        assert(result.isNotEmpty())
    }

    @Test
    fun testPulseSources() {
        val result = wrapper.pulseSources(APICalypse())
        assert(result.isNotEmpty())
    }

    @Test
    fun testPulseUrls() {
        val result = wrapper.pulseUrls(APICalypse())
        assert(result.isNotEmpty())
    }

    @Test
    fun testReleaseDates() {
        val result = wrapper.releaseDates(APICalypse())
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
    fun testTimeToBeats() {
        val result = wrapper.timeToBeats(APICalypse())
        assert(result.isNotEmpty())
    }

    @Test
    fun testTitles() {
        val result = wrapper.titles(APICalypse())
        assert(result.isNotEmpty())
    }

    @Test
    fun testWebsites() {
        val result = wrapper.websites(APICalypse())
        assert(result.isNotEmpty())
    }

}