package com.api.igdb;

import com.api.igdb.request.TwitchAuthenticator;
import com.api.igdb.utils.TwitchToken;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestTwitchToken {

    @Test
    void testGetTwitchToken() {
        // Create the Twitch authenticator instance
        TwitchAuthenticator tAuth = TwitchAuthenticator.INSTANCE;
        // request a new Twitch Authentication token
        TwitchToken token = tAuth.requestTwitchToken(System.getenv("client_id"), System.getenv("client_secret"));

        assertNotNull(token);
        assertTrue(token.getExpires_in() > 5000000);
        long tokenFutureDate = System.currentTimeMillis() + 5000000; // 57 days
        assertTrue(tokenFutureDate > token.getExpiresUnix());
    }
}
