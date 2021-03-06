package code.programers.level.one;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

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

        assertArrayEquals(new int[]{1,3,0,1}, result);
    }

    @Test
    void testCaseTwo()
    {
        int[] list = {4,4,4,3,3};

        List<Integer> result = new ArrayList<Integer>();

        for(int number:list)
            if(result.size() == 0)
                result.add(number);
            else
                if(!(cn.isEquals(result.get(result.size()-1), number)))
                    result.add(number);

        int[] answer = new int[result.size()];

        for(int index=0; index<answer.length; index++)
        {
            answer[index] = result.get(index);
        }

        assertArrayEquals(new int[]{4,3}, answer);
    }
}