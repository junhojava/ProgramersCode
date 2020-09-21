package code.programers.level.two;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class StockTest {
    Stock stock = new Stock();

    @Test
    void testIsBigger()
    {
        assertTrue(stock.isSmaller(1,2));
    }

    @Test
    void testCaseOne()
    {
        int[] list = {1,2,3,2,3};
        int[] result = new int[list.length];

        for(int index=0; index<list.length; index++)
            for(int next=index+1; next<list.length; next++)
            {
                result[index]++;

                if(stock.isSmaller(list[next], list[index]))
                    break;
            }

        assertArrayEquals(new int[]{4,3,1,1,0}, result);
    }
}