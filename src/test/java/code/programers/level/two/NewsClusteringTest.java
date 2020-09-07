package code.programers.level.two;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Map;

import org.junit.jupiter.api.Test;

public class NewsClusteringTest {
    
    NewsClustrering nc = new NewsClustrering();

    @Test
    void testMultiCombination()
    {
        String france = "france";

        String[] result = nc.multiCombination(france);

        assertArrayEquals(new String[]{"FR", "RA", "AN", "NC", "CE"}, result);
    }

    @Test
    void testContainNonEnglish()
    {
        String str = "aa1+aa2";

        String[] result = nc.multiCombination(str);

        assertArrayEquals(new String[]{"AA", "AA"}, result);
    }

    @Test
    void testSimilarity()
    {
        String[] list = nc.multiCombination("handshake");

        Map<String, Integer> result = nc.countKey(list);

        Map<String, Integer> map = new HashMap<String, Integer>();

        map.put("ha", 2);
        map.put("")
    }
}