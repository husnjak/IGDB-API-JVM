package com.api.igdb

import com.api.igdb.request.TwitchAuthenticator
import org.junit.jupiter.api.Test
import java.time.Duration

class TestTwitchTokenKotlin {
    @Test
    fun testGetTwitchToken() {
        // request a new Twitch Authentication token
        val token = TwitchAuthenticator.requestTwitchToken(System.getenv("client_id"), System.getenv("client_secret"))

        assert(token != null)
        assert(token!!.expires_in > Duration.ofDays(60).toSeconds())
        val tokenFutureDate = System.currentTimeMillis() + Duration.ofDays(60).toSeconds()
        assert(tokenFutureDate > token.getExpiresUnix())
    }
}