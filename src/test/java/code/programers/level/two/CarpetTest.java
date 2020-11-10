package code.programers.level.two;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CarpetTest
{
    Carpet carpet = new Carpet();

    @Test
    void testDivide()
    {
        assertEquals(4, carpet.divide(12,3));
    }
}