import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class TestImageBuilder {
    private val wrapper = IGDBWrapper

    @BeforeEach
    fun setup() {
        wrapper.userkey = "260ebcadb73853584b3d7526f9ebfe7b" //System.getenv("key")
    }

    // TODO change url to image_id after covers bug is resolved! API3-214

    @Test
    fun testJPEGImg() {
        val query = APICalypse()
            .fields("image_id")
            .where("image_id != n")
        try {
            val covers = wrapper.covers(query)
            assert(!covers.isEmpty())
            val firstCover = covers.first()
            val coverUrl = imageBuilder(firstCover.imageId, ImageSize.HD, ImageType.JPEG)
            assert(coverUrl.isNotBlank())
            assert(coverUrl.substringAfterLast(".") == "jpg")

        } catch (e: RequestException) {
            assert(false)
        }
    }

    @Test
    fun testPNGImg() {
        val query = APICalypse()
            .fields("image_id")
            .where("image_id != n")
        try {
            val covers = wrapper.covers(query)
            assert(!covers.isEmpty())
            val firstCover = covers.first()
            val coverUrl = imageBuilder(firstCover.imageId, ImageSize.THUMB, ImageType.PNG)
            assert(coverUrl.isNotBlank())
            assert(coverUrl.substringAfterLast(".") == "png")

        } catch (e: RequestException) {
            assert(false)
        }
    }

    @Test
    fun testGIFImg() {
        val query = APICalypse()
            .fields("image_id")
            .where("image_id != n")
        try {
            val covers = wrapper.covers(query)
            assert(!covers.isEmpty())
            val firstCover = covers.first()
            val coverUrl = imageBuilder(firstCover.imageId, ImageSize.LOGO_MEDIUM, ImageType.GIF)
            assert(coverUrl.isNotBlank())
            assert(coverUrl.substringAfterLast(".") == "gif")

        } catch (e: RequestException) {
            assert(false)
        }
    }

    @Test
    fun testWEBPImg() {
        val query = APICalypse()
            .fields("image_id")
            .where("image_id != n")
        try {
            val covers = wrapper.covers(query)
            assert(!covers.isEmpty())
            val firstCover = covers.first()
            val coverUrl = imageBuilder(firstCover.imageId, ImageSize.SCREENSHOT_HUGE, ImageType.WEBP)
            assert(coverUrl.isNotBlank())
            assert(coverUrl.substringAfterLast(".") == "webp")

        } catch (e: RequestException) {
            assert(false)
        }
    }
}