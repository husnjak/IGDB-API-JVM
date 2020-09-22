package com.api.igdb.request

import com.github.kittinunf.fuel.gson.responseObject
import com.github.kittinunf.fuel.httpPost
import com.github.kittinunf.result.Result
import java.io.Serializable
import kotlin.properties.Delegates

object TwitchAuthenticator {
    private const val twitchOauthTokenURL = "https://id.twitch.tv/oauth2/token"
    private const val twitchGrantType = "client_credentials"

    private var twitchClientID: String = ""
    private var twitchClientSecret: String = ""
    var twitchToken: TwitchTokenResponse? = null

    /**
     * The Setter function for the Twitch Developer Credentials
     *
     * @property clientID Your application client_id found in the Twitch Developer Portal
     * @property clientSecret Your application client_secret found in the Twitch Developer Portal
     */
    fun setCredentials(clientID: String, clientSecret: String) {
        twitchClientID = clientID
        twitchClientSecret = clientSecret
    }

    /**
     * The Twitch OAuth request function
     *
     * @property clientID Your application client_id found in the Twitch Developer Portal
     * @property clientSecret Your application client_secret found in the Twitch Developer Portal
     * @return The Twitch token response object, if successful otherwise null
     */
    fun requestTwitchToken(clientID: String = twitchClientID, clientSecret: String = twitchClientSecret): TwitchTokenResponse? {
        val parameters = listOf("client_id" to clientID, "client_secret" to clientSecret,
            "grant_type" to twitchGrantType)
        val (_, _, result) = twitchOauthTokenURL.httpPost(parameters)
            .responseObject<TwitchTokenResponse>()

        twitchToken =  when (result) {
            is Result.Failure -> {
               null
            }
            is Result.Success -> {
                result.get()
            }
        }
        return twitchToken
    }

    /**
     * The Twitch OAuth object used to serialize the oauth response
     *
     * @property access_token Your Twitch Access Token
     * @property expires_in The token expiry time
     * @property token_type The token type
     */
    data class TwitchTokenResponse(
        val access_token: String,
        val expires_in: Long,
        val token_type: String
    ): Serializable {
        var expiresAt by Delegates.notNull<Long>()

        init {
            val currentTime = System.currentTimeMillis()
            val expiresAtMillis = expires_in * 1000
            expiresAt = currentTime + expiresAtMillis
        }
    }

}