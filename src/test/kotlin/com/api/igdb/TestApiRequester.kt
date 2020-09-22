package com.api.igdb

import com.api.igdb.apicalypse.ApiCalypse
import com.api.igdb.apicalypse.Sort
import com.api.igdb.exceptions.RequestException
import com.api.igdb.request.ApiRequester
import com.api.igdb.request.games
import com.api.igdb.request.search
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class TestApiRequester {

    private val wrapper = ApiRequester

    @BeforeEach
    fun setup() {
        wrapper.setCredentials(System.getenv("client-id"), System.getenv("bearer"))
    }

    //Get all Coming Soon PS4 games
    @Test
    fun testComingSoonPS4Games() {
        val date = (System.currentTimeMillis() / 1000).toString()
        val query = ApiCalypse()
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
        val query = ApiCalypse()
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
        val query = ApiCalypse()
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
        val query = ApiCalypse()
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