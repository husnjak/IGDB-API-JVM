package com.api.igdb

import com.api.igdb.request.TwitchAuthenticator
import org.junit.jupiter.api.Test

class TestTwitchToken {
    @Test
    fun testGetTwitchToken() {
        // Create the Twitch authenticator instance
        val tAuth = TwitchAuthenticator
        // request a new Twitch Authentication token
        val token = tAuth.requestTwitchToken(System.getenv("client_id"), System.getenv("client_secret"))

        assert(token!!.expires_in > 5000000)
        val tokenFutureDate = System.currentTimeMillis() + 5000000 // 57 days
        assert(tokenFutureDate > token.getExpiresUnix())
        assert(token != null)
    }
}