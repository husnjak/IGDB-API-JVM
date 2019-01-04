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

    @Throws(RequestException::class)
    fun apiRequest(url: String, body: String): ByteArray {
        val requestURL = "$APIURL$url.pb"
        val (request, response, result) = requestURL.httpPost()
            .header("user-key" to userkey).body(body).responseString()

        if (response.statusCode != 200) {
            throw RequestException(response.statusCode, request, result)
        }
        return response.data
    }

    @Throws(RequestException::class)
    fun apiJsonRequest(url: String, body: String): String {
        val requestURL = "$APIURL$url"
        val (request, response, result) = requestURL.httpPost()
            .header("user-key" to userkey).body(body).responseString()

        if (response.statusCode != 200) {
            throw RequestException(response.statusCode, request, result)
        }
        return result.get()
    }

    fun Endpoint.url() = "/${this.name.toLowerCase()}"

}