package com.api.igdb.request

import com.api.igdb.exceptions.RequestException
import com.api.igdb.utils.Endpoint
import com.github.kittinunf.fuel.httpPost

/**
 * The ApiRequester object holds the API Key and uses it to request the IGDB API.
 */
private const val IGDB_API_URL = "https://api.igdb.com/v4"
object ApiRequester {
    private var requestHeaders: Map<String, Any> = mapOf("x-user-agent" to "igdb-api-jvm")

    /**
     * The Set method for API Credentials
     *
     * @property endpoint The endpoint the request
     * @property query The Api query to request with
     * @return The raw ByteArray to use with generated proto files
     */
    fun setCredentials(clientID: String, accessToken: String) {
        requestHeaders = mapOf(
            "client-id" to clientID,
            "authorization" to "Bearer $accessToken", "x-user-agent" to "igdb-api-jvm")
    }

    /**
     * The Api request function for Protocol Buffers
     *
     * @property endpoint The endpoint the request
     * @property query The Api query to request with
     * @return The raw ByteArray to use with generated proto files
     */
    @Throws(RequestException::class)
    fun apiProtoRequest(endpoint: Endpoint, query: String): ByteArray {
        val requestURL = "$IGDB_API_URL${endpoint.url()}.pb"
        val (request, response, result) = requestURL.httpPost()
            .header(requestHeaders).body(query).responseString()

        if (response.statusCode != 200) {
            throw RequestException(response.statusCode, request, result)
        }
        return response.data
    }

    /**
     * The Api request function for JSON
     *
     * @property endpoint The endpoint the request
     * @property query The Api query to request with
     * @return The raw String result from the request
     */
    @Throws(RequestException::class)
    fun apiJsonRequest(endpoint: Endpoint, query: String): String {
        val requestURL = "$IGDB_API_URL${endpoint.url()}"
        val (request, response, result) = requestURL.httpPost()
            .header(requestHeaders).body(query).responseString()

        if (response.statusCode != 200) {
            throw RequestException(response.statusCode, request, result)
        }
        return result.get()
    }
}
