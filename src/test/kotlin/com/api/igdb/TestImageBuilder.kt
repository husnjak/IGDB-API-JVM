package com.api.igdb

import com.api.igdb.apicalypse.ApiCalypse
import com.api.igdb.exceptions.RequestException
import com.api.igdb.request.IGDBWrapper
import com.api.igdb.request.covers
import com.api.igdb.utils.ImageSize
import com.api.igdb.utils.ImageType
import com.api.igdb.utils.imageBuilder
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class TestImageBuilder {

    private val wrapper = IGDBWrapper

    @BeforeEach
    fun setup() {
        wrapper.setCredentials(System.getenv("client-id"), System.getenv("bearer"))
    }

    @Test
    fun testJPEGImg() {
        val query = ApiCalypse()
            .fields("image_id")
            .where("image_id != n")
        try {
            val covers = wrapper.covers(query)
            assert(covers.isNotEmpty())
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
        val query = ApiCalypse()
            .fields("image_id")
            .where("image_id != n")
        try {
            val covers = wrapper.covers(query)
            assert(covers.isNotEmpty())
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
        val query = ApiCalypse()
            .fields("image_id")
            .where("image_id != n")
        try {
            val covers = wrapper.covers(query)
            assert(covers.isNotEmpty())
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
        val query = ApiCalypse()
            .fields("image_id")
            .where("image_id != n")
        try {
            val covers = wrapper.covers(query)
            assert(covers.isNotEmpty())
            val firstCover = covers.first()
            val coverUrl = imageBuilder(firstCover.imageId, ImageSize.SCREENSHOT_HUGE, ImageType.WEBP)
            assert(coverUrl.isNotBlank())
            assert(coverUrl.substringAfterLast(".") == "webp")

        } catch (e: RequestException) {
            assert(false)
        }
    }
    
}