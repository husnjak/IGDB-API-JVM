import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class TestRequestExceptions {
    val wrapper = IGDBWrapper

    @BeforeEach
    fun setup() {
        wrapper.userkey = System.getenv("key")
    }

    @Test
    fun testNoKeyException() {
        wrapper.userkey = ""
        try {
            wrapper.games(APICalypse())
        } catch (e: RequestException){
            assertEquals(401, e.statusCode)
        }
    }

    @Test
    fun testException() {
        wrapper.userkey = ""
        assertThrows<RequestException> {
            wrapper.jsonAchievementIcons(APICalypse())
        }
    }

}