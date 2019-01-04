import com.github.kittinunf.fuel.httpPost
import proto.*

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

    fun apiRequest(url: String, body: String): ByteArray {
        val reqeustURL = "$APIURL$url.pb"
        val (request, response, result) = reqeustURL.httpPost()
            .header("user-key" to userkey).body(body).responseString()

        if (response.statusCode != 200) {
            throw RequestException(response.statusCode, request, result)
        }
        return response.data
    }

    fun apiJsonRequest(url: String, body: String): String {
        val reqeustURL = "$APIURL$url"
        val (request, response, result) = reqeustURL.httpPost()
            .header("user-key" to userkey).body(body).responseString()

        if (response.statusCode != 200) {
            throw RequestException(response.statusCode, request, result)
        }
        return result.get()
    }

    fun Endpoint.url() = "/${this.name.toLowerCase()}"

    /*
    * Helper methods for each endpoint
    * 1. ProtoHelper methods
    * 2. JsonHelper methods
    * */



}