package code.programers.level.one;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import datatype.DoubleNumber;
import datatype.Number;

public class AverageTest {
    Number doubleNumber = new DoubleNumber();

    @Test
    void testCalc()
    {
        double sumOfValue = doubleNumber.sum(4,6);
        double twoHalf = doubleNumber.divide(10, 4);

        assertEquals(10, sumOfValue);
        assertEquals(2.5, twoHalf);
    }
}