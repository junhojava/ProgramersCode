package code.programers.level.one;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CollatzTest {
    
    Collatz collatz = new Collatz();

    @Test
    void testIsOne()
    {
        assertTrue(collatz.isOne(1));
    }

    @Test
    void testIsEven()
    {
        assertTrue(collatz.isEven(2));
    }

    @Test
    void testEvenCalc()
    {
        assertEquals(2, collatz.evenCalc(4));
    }

    @Test
    void testOddCalc()
    {
        assertEquals(10, collatz.oddCalc(3));
    }

    @Test
    void testCaseOne()
    {
        int count = 0;
        long number = 6;
        while(!collatz.isOne(number))
        {
            if(collatz.isEven(number))
                number = collatz.evenCalc(number);
            else
                number = collatz.oddCalc(number);

            if(count <= 500)
                count++;
            else
            {
                count = -1;
                number = 1;
            }
        }

        assertEquals(8, count);
    }

    @Test
    void testCaseTwo()
    {
        int count = 0;
        long number = 626331;
        while(!collatz.isOne(number))
        {
            if(collatz.isEven(number))
                number = collatz.evenCalc(number);
            else
                number = collatz.oddCalc(number);

            if(count <= 500)
                count++;
            else
            {
                count = -1;
                number = 1;
            }
        }

        assertEquals(488, count);
    }
}