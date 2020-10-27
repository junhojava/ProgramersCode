package code.programers.level.two;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BinaryNextNumberTest
{
    BinaryNextNumber bnn = new BinaryNextNumber();

    @Test
    void testConvertNumber()
    {
        assertEquals(11, bnn.convertNumber("1011"));
    }

    @Test
    void testConvertBinary()
    {
        assertEquals("1000", bnn.convertBinary(8));
    }

    @Test
    void testCanShiftedIndex()
    {
        assertEquals(4,bnn.canShiftedIndex("10010110"));
    }

    @Test
    void testCountOne()
    {
        assertEquals(1,bnn.countOne(6, "10010110"));
    }
}