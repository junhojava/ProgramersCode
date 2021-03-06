package code.programers.level.two;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class HIndexTest {
    HIndex hindex= new HIndex();

    @Test
    void testSort()
    {
        int[] citation = new int[]{3,0,6,1,5};

        assertArrayEquals(new int[]{6,5,3,1,0}, hindex.sort(citation));
    }

    @Test
    void testIndex()
    {
        int[] citation = new int[]{999, 998, 997};

        int index= hindex.index(hindex.sort(citation));

        assertEquals(3, index);
    }
}