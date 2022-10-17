package com.api.igdb

import com.api.igdb.apicalypse.APICalypse
import com.api.igdb.exceptions.RequestException
import com.api.igdb.request.IGDBWrapper
import com.api.igdb.request.games
import com.api.igdb.request.jsonGameModes
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.api.assertThrows

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class TestRequestExceptions {
    private val wrapper = IGDBWrapper

    @BeforeAll
    internal fun beforeAll() {
        wrapper.setCredentials("", "")
    }

    @Test
    fun testNoKeyException() {
        try {
            wrapper.games(APICalypse())
        } catch (e: RequestException){
            Assertions.assertEquals(401, e.statusCode)
        }
    }

    @Test
    fun testException() {
        assertThrows<RequestException> {
            wrapper.jsonGameModes(APICalypse())
        }
    }

}