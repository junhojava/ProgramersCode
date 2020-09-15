package code.programers.level.one;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PrimeNumberTest {

    PrimeNumber pn = new PrimeNumber();

    @Test
    void tsetDivideOne()
    {
        assertEquals(1, pn.divide(2,2));
    }

    @Test
    void testModZero()
    {
        assertEquals(0, pn.mod(2,2));
    }

    @Test
    void testCaseOne()
    {
        int n = 10;
        int count = 0;

        for(int left= 2; left<= n; left++)
        {
            count++;
            for(int right = 2; right <= left; right++)
            {
                if(pn.mod(left, right) == 0)
                {
                    if(pn.divide(left, right) != 1)
                        count--;
                        break;
                }
            }
        }

        assertEquals(4, count);
    }
}