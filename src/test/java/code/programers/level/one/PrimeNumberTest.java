package code.programers.level.one;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

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

    @Test
    void testCaseTwo()
    {
        List<Integer> list = new ArrayList<Integer>();
        list.add(2);
        int n = 5;

        for(int left= 3; left<= n; left++)
        {
            boolean flag = true;
            for(Integer right:list)
            {
                if(pn.mod(left, right) == 0)
                {
                    flag = false;
                    break;
                }
            }

            if(flag)
            {
                list.add(left);
            }
        }

        assertEquals(3, list.size());
    }
}