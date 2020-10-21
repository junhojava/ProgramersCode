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

        hindex.sort(citation);

        assertArrayEquals(new int[]{0,1,3,5,6}, citation);
    }

    @Test
    void testLoop()
    {
        int[] citation = new int[]{3,0,6,1,5,0,2,4,7,1,8,9,10};

        hindex.sort(citation);
        int index= hindex.index(citation);

        if(index > 0)
            index--;

        assertEquals(4, citation[index]);
    }

    @Test
    void testCount()
    {
        int[] citation = new int[]{3,0,6,1,5};

        int h = 0;
        int count = hindex.count(citation, h);

        assertEquals(5, count);
    }

    @Test
    void testHalf()
    {
        int five = hindex.half(5);
        int six = hindex.half(6);

        assertEquals(2, five);
        assertEquals(2, six);
    }
}