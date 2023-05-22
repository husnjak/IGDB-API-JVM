package com.api.igdb;

import com.api.igdb.request.TwitchAuthenticator;
import com.api.igdb.utils.TwitchToken;
import org.junit.jupiter.api.Test;

import java.time.Duration;

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
        assertTrue(token.getExpires_in() > Duration.ofDays(57).toSeconds());
        long tokenFutureDate = System.currentTimeMillis() + Duration.ofDays(57).toSeconds();
        assertTrue(tokenFutureDate > token.getExpiresUnix());
    }
}
