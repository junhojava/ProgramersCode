package code.programers.level.two;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
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

    @Test
    void testEnglishCharacter()
    {
        String ch1 = "FR";
        String ch2 = "A+";

        assertTrue(nc.isEnglish(ch1));
        assertFalse(nc.isEnglish(ch2));
    }

    @Test
    void testInterSection()
    {
        String[] list1 = {"FR", "RA", "AN", "NC", "CE"};
        String[] list2 = {"fr", "re", "en", "nc", "ch"};

        double value;
        value = nc.sets(list1, list2);

        assertEquals(0.25, value);
    }

    @Test
    void testCaseOne()
    {
        String[] france = nc.combination("FRANCE");
        String[] french = nc.combination("french");

        
        double value;
        value = nc.sets(france, french);

        assertEquals(0.25, value);
    }

    @Test
    void testCaseTwo()
    {
        String[] one = nc.combination("aa1+aa2");
        String[] two = nc.combination("AAAA12");

        double value;
        value = nc.sets(one, two);

        int result = 65536;

        result *= value;

        assertEquals(43690, result);
    }

    @Test
    void testCaseThree()
    {
        String[] one = nc.combination("E=M*C^2");
        String[] two = nc.combination("e=m*c^2");
        
        double value;
        value = nc.sets(one, two);

        System.out.println(65536 * value);
    }
}