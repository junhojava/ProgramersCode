package code.programers.level.one;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RemoveMinNumberTest {
    
    RemoveMinNumber rmn = new RemoveMinNumber();

    @Test
    void testMinIndex()
    {
        int[] list = new int[]{4,3,2,1};
        int[] result = new int[list.length-1];
        boolean flag = true;

        int min = rmn.min(list);

        for(int index= 0; index<result.length; index++)
        {
            if(flag)
            {
                boolean find = rmn.findMin(list[index], min);
                
                if(find)
                {
                   flag = false;
                }
                else
                {
                    result[index] = list[index];
                }
            }
            else
            {
                result[index] = list[index+1];
            }
        }

        assertArrayEquals(new int[]{4,3,2}, result);
    }
}