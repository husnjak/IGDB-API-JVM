package com.api.igdb

import com.api.igdb.apicalypse.APICalypse
import com.api.igdb.apicalypse.Sort
import com.api.igdb.exceptions.RequestException
import com.api.igdb.request.IGDBWrapper
import com.api.igdb.request.games
import com.api.igdb.request.search
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class TestProxy {

    private val wrapper = IGDBWrapper

    @BeforeEach
    fun setup() {
        wrapper.setupProxy(proxyURL = System.getenv("proxy_url"), proxyHeaders = mapOf("x-api-key" to System.getenv("proxy_api_key")))
    }

    //Get all Coming Soon PS4 games
    @Test
    fun testComingSoonPS4Games() {
        val date = (System.currentTimeMillis() / 1000).toString()
        val query = APICalypse()
            .fields("*")
            .where("platforms = 48 & release_dates.date > $date")
            .sort("release_dates.date", Sort.ASCENDING)

        try {
            val ps4Games = wrapper.games(query)
            assert(ps4Games.isNotEmpty())
        } catch (e: RequestException) {
            assert(false)
        }
    }

    //Get all Recently released PS4 games
    @Test
    fun testRecentlyReleasedPS4Games() {
        val date = (System.currentTimeMillis() / 1000).toString()
        val query = APICalypse()
            .fields("*")
            .where("platforms = 48 & release_dates.date < $date")
            .sort("release_dates.date", Sort.DESCENDING)

        try {
            val ps4Games = wrapper.games(query)
            assert(ps4Games.isNotEmpty())
        } catch (e: RequestException) {
            assert(false)
        }
    }

    //Get all Recently released PS4 games
    @Test
    fun testSearch() {
        val query = APICalypse()
            .search("Assassins Creed")
            .fields("game.name,game.involved_companies")
            .where("game != null & game.version_parent = null")

        try {
            val result = wrapper.search(query)
            assert(result.isNotEmpty())
        } catch (e: RequestException) {
            assert(false)
        }

    }

    //Get all Recently released PS4 games
    @Test
    fun testPS4Exclusives() {
        val query = APICalypse()
            .fields("name,category,platforms")
            .where("category = 0 & platforms = 48")

        try {
            val result = wrapper.games(query)
            assert(result.isNotEmpty())
        } catch (e: RequestException) {
            assert(false)
        }

    }
    
}