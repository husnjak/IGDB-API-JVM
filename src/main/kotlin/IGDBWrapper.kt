import com.github.kittinunf.fuel.httpPost

/**
 * IGDBWrapper
 * Lets users access IGDB API with kotlin, works with java.
 *
 * Created at: 2018-01-03
 *
 * Created by Filip
 *
 **/
private const val APIURL = "https://api-v3.igdb.com"
object IGDBWrapper {
    var userkey = ""
    var isDebugLog = false

    @Throws(RequestException::class)
    fun apiRequest(endpoint: Endpoint, apicalypseQuery: String): ByteArray {
        val requestURL = "$APIURL${endpoint.url()}.pb"
        val (request, response, result) = requestURL.httpPost()
            .header("user-key" to userkey).body(apicalypseQuery).responseString()

        if(isDebugLog) {
            println("IGDBWrapper Request: $request")
            println("IGDBWrapper Response: $response")
            println("IGDBWrapper Result: $result")
        }

        if (response.statusCode != 200) {
            throw RequestException(response.statusCode, request, result)
        }
        return response.data
    }

    @Throws(RequestException::class)
    fun apiJsonRequest(endpoint: Endpoint, apicalypseQuery: String): String {
        val requestURL = "$APIURL${endpoint.url()}"
        val (request, response, result) = requestURL.httpPost()
            .header("user-key" to userkey).body(apicalypseQuery).responseString()

        if(isDebugLog) {
            println("IGDBWrapper Request: $request")
            println("IGDBWrapper Response: $response")
            println("IGDBWrapper Result: $result")
        }

        if (response.statusCode != 200) {
            throw RequestException(response.statusCode, request, result)
        }
        return result.get()
    }

    fun Endpoint.url() = "/${this.name.toLowerCase()}"

}