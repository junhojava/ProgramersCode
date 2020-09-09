package code.programers.level.two;

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
}