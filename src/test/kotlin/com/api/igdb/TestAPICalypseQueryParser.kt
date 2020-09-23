package com.api.igdb

import com.api.igdb.apicalypse.APICalypse
import com.api.igdb.apicalypse.Sort
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class TestAPICalypseQueryParser {

    @Test
    fun testAllFields() {
        val apiCalypse = APICalypse().fields("*")
        assertEquals("f *;", apiCalypse.buildQuery())
    }

    @Test
    fun testLimit() {
        val apiCalypse = APICalypse().fields("name").limit(10)
        assertEquals("f name;l 10;", apiCalypse.buildQuery())
    }

    @Test
    fun testOffset() {
        val apiCalypse = APICalypse().fields("name").offset(10)
        assertEquals("f name;o 10;", apiCalypse.buildQuery())
    }

    @Test
    fun testWhereNoCommaOrWhere() {
        val apiCalypse = APICalypse().fields("*").where("id = 1942")
        assertEquals("f *;w id = 1942;", apiCalypse.buildQuery())
    }

    @Test
    fun testWhereNoWhere() {
        val apiCalypse = APICalypse().fields("*").where("id = 1942;")
        assertEquals("f *;w id = 1942;", apiCalypse.buildQuery())
    }

    @Test
    fun testWhere() {
        val apiCalypse = APICalypse().fields("*").where("where id = 1942;")
        assertEquals("f *;where id = 1942;", apiCalypse.buildQuery())
    }

    @Test
    fun testWhereW() {
        val apiCalypse = APICalypse().fields("*").where("w id = 1942;")
        assertEquals("f *;w id = 1942;", apiCalypse.buildQuery())
    }

    @Test
    fun testExclude() {
        val apiCalypse = APICalypse().fields("*").exclude("name")
        assertEquals("f *;x name;", apiCalypse.buildQuery())
    }

    @Test
    fun testSort() {
        val apiCalypse = APICalypse().fields("name,popularity").sort("popularity", Sort.DESCENDING)
        assertEquals("f name,popularity;s popularity desc;", apiCalypse.buildQuery())
    }

    @Test
    fun testComingSoonGamesForPS4() {
        val apiCalypse = APICalypse().fields("*")
            .where("platform = 48 & date > 1538129354;")
            .sort("date", Sort.ASCENDING)
        assertEquals("f *;s date asc;w platform = 48 & date > 1538129354;", apiCalypse.buildQuery())
    }

    @Test
    fun testRecentlyReleaseGamesPS4() {
        val apiCalypse = APICalypse().fields("*")
            .where("platform = 48 & date > 1538129354;")
            .sort("date", Sort.DESCENDING)
        assertEquals("f *;s date desc;w platform = 48 & date > 1538129354;", apiCalypse.buildQuery())
    }

    @Test
    fun testSearch() {
        val apiCalypse = APICalypse().search("Halo")
            .where("game != n").fields("game.name,game.invloved_companies")
        assertEquals(
            "search \"Halo\";f game.name,game.invloved_companies;w game != n;",
            apiCalypse.buildQuery()
        )
    }

    @Test
    fun testSearchWithExclude() {
        val apiCalypse = APICalypse().search("Assassins Creed")
            .fields("game.name,game.invloved_companies")
            .where("game != n & game.version_parent = n")
        assertEquals(
            "search \"Assassins Creed\";f game.name,game.invloved_companies;w game != n & game.version_parent = n;",
            apiCalypse.buildQuery()
        )
    }

    @Test
    fun testGetVersions() {
        val apiCalypse = APICalypse()
            .fields("version_parent.*")
            .where("id = 39047")
        assertEquals("f version_parent.*;w id = 39047;", apiCalypse.buildQuery())
    }

    @Test
    fun testGetAllPS4Exclusives() {
        val apiCalypse = APICalypse()
            .fields("name,category,platforms")
            .where("category = 0 & platforms = 48")
        assertEquals("f name,category,platforms;w category = 0 & platforms = 48;", apiCalypse.buildQuery())
    }

    @Test
    fun testGetAllPS4ANDPCExclusives() {
        val apiCalypse = APICalypse()
            .fields("name,category,platforms")
            .where("category = 0 & platforms = {48,6}")
        assertEquals(
            "f name,category,platforms;w category = 0 & platforms = {48,6};",
            apiCalypse.buildQuery()
        )
    }
    
}