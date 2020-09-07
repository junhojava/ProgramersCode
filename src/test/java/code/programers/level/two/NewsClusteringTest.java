package code.programers.level.two;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

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

}