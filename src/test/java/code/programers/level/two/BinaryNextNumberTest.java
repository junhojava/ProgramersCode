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
}