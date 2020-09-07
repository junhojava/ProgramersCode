package code.programers.level.two;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class NewsClusteringTest {
    
    NewsClustrering nc = new NewsClustrering();

    @Test
    void testIsZero()
    {
        assertTrue(nc.isZero(""));
    }

    @Test
    void testMultiCombination()
    {
        String[] france = nc.combination("FRANCE");

        assertArrayEquals(new String[]{"FR", "RA", "AN", "NC", "CE"}, france);
    }
}