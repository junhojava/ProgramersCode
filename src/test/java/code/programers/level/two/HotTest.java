package code.programers.level.two;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class HotTest {
    
    Hot hot = new Hot();

    @Test
    void testSort()
    {
        int[] array= new int[]{2,1,3,9,10,12};
        Arrays.sort(array);

        assertArrayEquals(new int[]{1,2,3,9,10,12}, array);
    }

    @Test
    void testCalc()
    {
        int[] array= new int[]{1,2,3,9,10,12};
        int index = 0;
        
        int value = 0;
        Arrays.sort(array);

        while(array[index] <= 7 && index+1 < array.length)
        {
            value = hot.calc(array[index], array[index+1]);
            array[index] = -1;
            array[index+1] = value;

            Arrays.sort(array);
            index++;
        }

        assertEquals(-1, value);
    }

    @Test
    void testHeap()
    {
        int[] array = new int[]{1,2,3,9,10,12};

        hot.initHeap();

        hot.insert(array[0]);
        hot.insert(array[1]);
        hot.insert(array[2]);
        hot.insert(array[3]);
        hot.insert(array[4]);
        hot.insert(array[5]);

        assertArrayEquals(new int[]{0,12,9,10,1,3,2}, hot.heapArray);
    }
}