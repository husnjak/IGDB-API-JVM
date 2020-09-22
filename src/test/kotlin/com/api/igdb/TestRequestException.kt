package com.api.igdb

import com.api.igdb.apicalypse.ApiCalypse
import com.api.igdb.exceptions.RequestException
import com.api.igdb.request.ApiRequester
import com.api.igdb.request.games
import com.api.igdb.request.jsonGameModes
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class TestRequestExceptions {
    val wrapper = ApiRequester

    @Test
    fun testNoKeyException() {
        try {
            wrapper.games(ApiCalypse())
        } catch (e: RequestException){
            Assertions.assertEquals(401, e.statusCode)
        }
    }

    @Test
    fun testException() {
        assertThrows<RequestException> {
            wrapper.jsonGameModes(ApiCalypse())
        }
    }

}