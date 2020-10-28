package code.programers.level.two;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BinaryNextNumberTest
{
    BinaryNextNumber bnn = new BinaryNextNumber();

    @Test
    void testConvertNumber()
    {
        assertEquals(78, bnn.convertNumber("1001110"));
    }

    @Test
    void testConvertBinary()
    {
        assertEquals("1001110", bnn.convertBinary(78));
    }

    @Test
    void testCanShiftedIndex()
    {
        assertEquals(2,bnn.canShiftedIndex("1001110"));
    }

    @Test
    void testCountOne()
    {
        assertEquals(2,bnn.countOne("110"));
    }

    @Test
    void testCaseOne()
    {
        String str = "1001110";
        StringBuilder sb = new StringBuilder();

        int index = bnn.canShiftedIndex(str);
        int count = str.substring(index+2, str.length()).length()- str.substring(index+2, str.length()).replaceAll("1", "").length();

        sb.append(str.substring(0, index));
        sb.append("10");

        for(int idx = 0; idx<str.length()-(index+2); idx++)
        {
            if(str.length()-(index+2+idx) > count)
                sb.append("0");
            else
                sb.append("1");
        }

        assertEquals("1010011",sb.toString());
    }
}