package com.api.igdb

import com.api.igdb.request.TwitchAuthenticator
import org.junit.jupiter.api.Test

class TestTwitchTokenKotlin {
    @Test
    fun testGetTwitchToken() {
        // request a new Twitch Authentication token
        val token = TwitchAuthenticator.requestTwitchToken(System.getenv("client_id"), System.getenv("client_secret"))

        assert(token != null)
        assert(token!!.expires_in > 5000000)
        val tokenFutureDate = System.currentTimeMillis() + 5000000 // 57 days
        assert(tokenFutureDate > token.getExpiresUnix())
    }
}