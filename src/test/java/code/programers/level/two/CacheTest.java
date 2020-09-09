package code.programers.level.two;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashMap;

import org.junit.jupiter.api.Test;

public class CacheTest {
    
    Cache cache = new Cache();

    @Test
    void testIsZeroSize()
    {
        cache.size = 0;

        assertTrue(cache.isZero());
    }

    @Test
    void testShiftString()
    {
        cache.size = 3;

        cache.buffer = new String[cache.size];
        cache.map = new HashMap<String, Integer>();

        cache.put("Jeju");
        cache.put("Pangyo");
        cache.put("Seoul");
        cache.put("Jeju");

        assertArrayEquals(new String[]{"Pangyo", "Seoul", "Jeju"}, cache.buffer);
    }

    @Test
    void testHit()
    {
        cache.size = 3;

        cache.buffer = new String[cache.size];
        cache.map = new HashMap<String, Integer>();

        cache.put("Jeju");
        cache.put("Pangyo");
        cache.put("Seoul");

        assertTrue(cache.isHit("Jeju"));
    }

    @Test
    void testCaseOne()
    {
        String[] cities = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"};
        cache.size = 3;

        cache.buffer = new String[cache.size];
        cache.map = new HashMap<String, Integer>();

        for(String city: cities)
        {
            if(cache.isHit(city))
                cache.time += 1;
            else
                cache.time += 5;

            cache.put(city);
        }

        assertEquals(50, cache.time);
    }

    @Test
    void testCaseTwo()
    {
        String[] cities = {"Jeju", "Jeju", "Seoul", "Seoul", "Pangyo", "Jeju", "Jeju", "Pangyo", "Seoul"};
        cache.size = 3;

        cache.buffer = new String[cache.size];
        cache.map = new HashMap<String, Integer>();

        for(String city: cities)
        {
            if(cache.isHit(city))
            {
                int index= cache.position(city);

                cache.time += 1;
                cache.shift(index, city);
            }
            else
            {
                cache.time += 5;

                cache.put(city);
            }

        }

        assertEquals(21, cache.time);
        
    }
}