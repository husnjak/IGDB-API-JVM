import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class TestKotlinWrapper {
    private val wrapper = IGDBWrapper

    @BeforeEach
    fun setup() {
        wrapper.userkey = System.getenv("key")
    }

    // TODO uncomment when api bug is fixed *API3-176*
    //Get all Coming Soon PS4 games
//    @Test
//    fun testComingSoonPS4Games() {
//        val date = (System.currentTimeMillis() / 1000).toString()
//        val query = APICalypse()
//            .fields("*")
//            .where("platforms = 48 & release_dates.date > " + date)
//            .sort("release_dates.date", SortOrder.ASCENDING)
//
//        try {
//            val ps4Games = wrapper.games(query)
//            assert(!ps4Games.isEmpty());
//        } catch (e: RequestException) {
//            assert(false)
//        }
//    }
//
//    //Get all Recently released PS4 games
//    @Test
//    fun testRecentlyReleasedPS4Games() {
//        val date = (System.currentTimeMillis() / 1000).toString()
//        val query = APICalypse()
//                .fields("*")
//                .where("platforms = 48 & release_dates.date < " + date)
//                .sort("release_dates.date", SortOrder.DESCENDING)
//
//        try {
//            val ps4Games = wrapper.games(query)
//            assert(!ps4Games.isEmpty());
//        } catch (e: RequestException) {
//            assert(false)
//        }
//    }

    //Get all Recently released PS4 games
    @Test
    fun testSearch() {
        val query = APICalypse()
            .search("Assassins Creed")
            .fields("game.name,game.involved_companies")
            .where("game != null & game.version_parent = null")

        try {
            val result = wrapper.search(query)
            assert(!result.isEmpty())
        } catch (e: RequestException) {
            assert(false)
        }

    }

    //Get all Recently released PS4 games
    @Test
    fun testPS4Exclusives() {
        val query = APICalypse()
            .fields("name,category,platforms")
            .where("category = 0 & platforms = 48")

        try {
            val result = wrapper.games(query)
            assert(!result.isEmpty())
        } catch (e: RequestException) {
            assert(false)
        }

    }

}