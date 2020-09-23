package com.api.igdb;

import com.api.igdb.request.TwitchAuthenticator;
import com.api.igdb.utils.TwitchToken;
import org.junit.jupiter.api.Test;

public class TestTwitchToken {

    @Test
    void testGetTwitchToken() {
        // Create the Twitch authenticator instance
        TwitchAuthenticator tAuth = TwitchAuthenticator.INSTANCE;
        // request a new Twitch Authentication token
        TwitchToken token = tAuth.requestTwitchToken(System.getenv("client_id"), System.getenv("client_secret"));

        assert(token.getExpires_in() > 5000000);
        Long tokenFutureDate = System.currentTimeMillis() + 5000000; // 57 days
        assert(tokenFutureDate > token.getExpiresUnix());
        assert(token != null);
    }
}
