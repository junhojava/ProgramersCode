package code.programers.level.one;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class DescendNumberTest {
    
    ReverseNumber rn = new ReverseNumber();
    SumNumbers sn = new SumNumbers();
    DescendNumber dn = new DescendNumber();

    @Test
    void testToString()
    {
        long n = 118372;

        assertEquals("118372", rn.toString(n));
    }

    @Test
    void testSplit()
    {
        assertArrayEquals(new String[]{"1", "1", "8", "3", "7", "2"}, sn.split(rn.toString(118372)));
    }

    @Test
    void testDescendSort()
    {
        assertArrayEquals(new String[]{"8","7","3","2","1","1"}, dn.sort(sn.split(rn.toString(118372)),"desc"));
    }

    @Test
    void testParseLong()
    {
        assertEquals(Long.parseLong("873211"), dn.parseLong(dn.sort(sn.split(rn.toString(118372)),"desc")));
    }
}