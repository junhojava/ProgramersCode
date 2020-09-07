package code.programers.level.two;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashMap;
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
    void testCountKey()
    {
        String[] list = nc.multiCombination("handshake");

        Map<String, Integer> result = nc.countKey(list);

        Map<String, Integer> map = new HashMap<String, Integer>();

        map.put("HA", 2);
        map.put("AN", 1);
        map.put("ND", 1);
        map.put("DS", 1);
        map.put("SH", 1);
        map.put("AK", 1);
        map.put("KE", 1);

        assertEquals(map, result);
    }

    @Test
    void testSimilirity()
    {
        String[] list1 = nc.multiCombination("handshake");
        String[] list2 = nc.multiCombination("shake ands");

        Map<String, Integer> map1 = nc.countKey(list1);
        Map<String, Integer> map2 = nc.countKey(list2);

        int intersection = nc.intersection(map1, map2);
        int union = nc.union(map1, map2);

        assertEquals(7, intersection);
        assertEquals(8, union);
    }

    @Test
    void testZeroCombination()
    {
        assertTrue(nc.isZero(nc.multiCombination("123")));
    }

    @Test
    void testNonZeroCombination()
    {
        assertFalse(nc.isZero(nc.multiCombination("asb")));
    }
}