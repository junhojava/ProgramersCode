package code.programers.level.two;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
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
        String[] list2 = {"FR", "RE", "EN", "NC", "CH"};

        String[] result = nc.interSection(list1, list2);

        assertArrayEquals(new String[]{"FR, NC"}, result);
    }
}