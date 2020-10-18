package code.programers.level.two;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class CamoflagueTest {

    Camoflague camoflague = new Camoflague();

    @Test
    void testParts()
    {
        String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};

        assertArrayEquals(new String[]{"headgear", "eyewear"}, camoflague.parts(clothes));
    }
}