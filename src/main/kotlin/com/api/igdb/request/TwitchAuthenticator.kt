package com.api.igdb.request

import com.api.igdb.utils.TwitchToken
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
    var twitchToken: TwitchToken? = null

    /**
     * The Twitch OAuth request function
     *
     * @property clientID Your application client_id found in the Twitch Developer Portal
     * @property clientSecret Your application client_secret found in the Twitch Developer Portal
     * @return The Twitch token response object, if successful otherwise null
     */
    fun requestTwitchToken(clientID: String, clientSecret: String): TwitchToken? {
        val parameters = listOf("client_id" to clientID, "client_secret" to clientSecret,
            "grant_type" to twitchGrantType)
        val (_, _, result) = twitchOauthTokenURL.httpPost(parameters)
            .responseObject<TwitchToken>()

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

}