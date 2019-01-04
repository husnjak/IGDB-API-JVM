import org.junit.jupiter.api.Test;
import proto.Game;

import java.util.List;

public class TestJavaWrapper {
    private IGDBWrapper wrapper = IGDBWrapper.INSTANCE;

    TestJavaWrapper() {
        wrapper.setUserkey(System.getenv("key"));
    }

    @Test
    public void testGetProtoGames() {
        List<Game> result = ProtoRequestKt.games(wrapper, new APICalypse());
        assert(!result.isEmpty());
    }

    @Test
    public void testGetJsonGames() {
        String result = JsonRequestKt.jsonGames(wrapper, new APICalypse());
        assert(!result.isEmpty());
    }

}
