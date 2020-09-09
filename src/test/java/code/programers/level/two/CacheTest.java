package code.programers.level.two;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

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

        cache.buffer[0] = "Jeju";
        cache.buffer[1] = "Pangyo";
        cache.buffer[2] = "Seoul";

        cache.put("Jeju");

        assertArrayEquals(new String[]{"Pangyo", "Seoul", "Jeju"}, cache.buffer);
    }
}