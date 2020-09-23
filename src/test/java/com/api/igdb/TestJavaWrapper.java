package com.api.igdb;

import com.api.igdb.apicalypse.APICalypse;
import com.api.igdb.apicalypse.Sort;
import com.api.igdb.exceptions.RequestException;
import com.api.igdb.request.IGDBWrapper;
import com.api.igdb.request.JsonRequestKt;
import com.api.igdb.request.ProtoRequestKt;
import com.api.igdb.utils.ImageBuilderKt;
import com.api.igdb.utils.ImageSize;
import com.api.igdb.utils.ImageType;
import org.junit.jupiter.api.Test;
import proto.Cover;
import proto.Game;
import proto.Search;

import java.util.List;

class TestJavaWrapper {
    private final IGDBWrapper wrapper = IGDBWrapper.INSTANCE;

    TestJavaWrapper() {
        wrapper.setCredentials(System.getenv("client_id"), System.getenv("bearer"));
    }

    /*
     * The proto tests should cover the rest of the endpoints
     * */

    @Test
    void testGetProtoGames() throws RequestException {
        List<Game> result = ProtoRequestKt.games(wrapper, new APICalypse());
        assert(!result.isEmpty());
    }

    @Test
    void testGetJsonGames() throws RequestException {
        String result = JsonRequestKt.jsonGames(wrapper, new APICalypse());
        assert(!result.isEmpty());
    }

    /*
     * Real-world test cases
     * */

    //Get all Coming Soon PS4 games
    @Test
    void testComingSoonPS4Games() {
        String date = String.valueOf((System.currentTimeMillis() / 1000));
        APICalypse query = new APICalypse()
                .fields("*")
                .where("platforms = 48 & release_dates.date > " + date)
                .sort("release_dates.date", Sort.ASCENDING);

        try {
            List<Game> ps4Games = ProtoRequestKt.games(wrapper, query);
            assert(!ps4Games.isEmpty());
        } catch (RequestException e) {
            assert(false);
        }
    }

    //Get all Recently released PS4 games
    @Test
    void testRecentlyReleasedPS4Games() {
        String date = String.valueOf((System.currentTimeMillis() / 1000));
        APICalypse query = new APICalypse()
                .fields("*")
                .where("platforms = 48 & release_dates.date < " + date)
                .sort("release_dates.date", Sort.DESCENDING);

        try {
            List<Game> ps4Games = ProtoRequestKt.games(wrapper, query);
            assert(!ps4Games.isEmpty());
        } catch (RequestException e) {
            assert(false);
        }
    }

    //Get all Recently released PS4 games
    @Test
    void testSearch() {
        APICalypse query = new APICalypse()
                .search("Assassins Creed")
                .fields("game.name,game.involved_companies")
                .where("game != null & game.version_parent = null");

        try {
            List<Search> result = ProtoRequestKt.search(wrapper, query);
            assert(!result.isEmpty());
        } catch (RequestException e) {
            assert(false);
        }
    }

    //Get all Recently released PS4 games
    @Test
    void testPS4Exclusives() {
        APICalypse query = new APICalypse()
                .fields("name,category,platforms")
                .where("category = 0 & platforms = 48");

        try {
            List<Game> result = ProtoRequestKt.games(wrapper, query);
            assert(!result.isEmpty());
        } catch (RequestException e) {
            assert(false);
        }
    }

    @Test
    void testJPEGImg() {
        APICalypse query = new APICalypse()
                .fields("image_id")
                .where("image_id != n");
        try {
            List<Cover> covers = ProtoRequestKt.covers(wrapper, query);
            assert(!covers.isEmpty());
            Cover firstCover = covers.get(0);
            String coverUrl = ImageBuilderKt.imageBuilder(firstCover.getImageId(), ImageSize.HD, ImageType.JPEG);
            assert(!coverUrl.isEmpty());
            assert(coverUrl.endsWith("jpg"));

        } catch (RequestException e) {
            assert(false);
        }
    }

}