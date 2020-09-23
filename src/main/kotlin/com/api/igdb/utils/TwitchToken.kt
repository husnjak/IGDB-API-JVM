package com.api.igdb.utils

import java.io.Serializable
import kotlin.properties.Delegates

/**
 * The Twitch OAuth object used to serialize the oauth response
 *
 * @property access_token Your Twitch Access Token
 * @property expires_in The token expiry time
 * @property token_type The token type
 */
data class TwitchToken(
    val access_token: String,
    val expires_in: Long,
    val token_type: String
): Serializable {
    private var expiresAt: Long

    init {
        val currentTime = System.currentTimeMillis()
        val expiresAtMillis = expires_in * 1000
        expiresAt = currentTime + expiresAtMillis
    }

    fun getExpiresUnix() = expiresAt
}