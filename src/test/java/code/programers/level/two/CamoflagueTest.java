package code.programers.level.two;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

public class CamoflagueTest {

    Camoflague camoflague = new Camoflague();

    @Test
    void testParts()
    {
        String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};

        assertArrayEquals(new String[]{"headgear", "eyewear"}, camoflague.parts(clothes));
    }

    @Test
    void testSplited()
    {
        String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};

        Map<String, Integer> map= new HashMap<>();

        map.put("headgear", 2);
        map.put("eyewear", 1);

        assertEquals(map, camoflague.partsEquied(clothes));
    }
}