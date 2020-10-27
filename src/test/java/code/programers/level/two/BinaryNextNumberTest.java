package code.programers.level.two;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BinaryNextNumberTest
{
    BinaryNextNumber bnn = new BinaryNextNumber();

    @Test
    void testConvert()
    {
        assertEquals(5, bnn.convert("101"));
    }
}