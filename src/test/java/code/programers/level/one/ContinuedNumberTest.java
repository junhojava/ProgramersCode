package code.programers.level.one;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class ContinuedNumberTest {
    
    ContinuedNumber cn = new ContinuedNumber();

    @Test
    void testIsContinued()
    {
        int[] list = {1};

        assertTrue(cn.isEquals(list[0], 1));
    }

    @Test
    void testCaseOne()
    {
        int[] list = {1,1,3,3,0,1,1};
        int[] result = new int[0];

        for(int number:list)
            if(result.length == 0)
            {
                result = new int[1];
                result[0] = number;
            }
            else
                if(!(cn.isEquals(result[result.length-1], number)))
                    result = cn.put(result, number);
    }
}