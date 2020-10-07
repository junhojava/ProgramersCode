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
    void testInsertMaxHeap()
    {
        int[] array = new int[]{1,2,3,9,10,12};

        hot.initHeap(array.length+1);

        for(int index= 0; index < array.length; index++)
            hot.insertMaxHeap(array[index]);

        assertArrayEquals(new int[]{0,12,9,10,1,3,2}, hot.heapArray);
    }

    // [0, 12]
    // [0, 10, 12]
    // [0, 9, 12, 10]
    // [0, 3, 9, 10, 12]
    // [0, 2, 3, 10, 12, 9]
    // [0, 1, 3, 2, 12 ,9, 10]
    @Test
    void testInsertMinHeap()
    {
        int[] array = new int[]{12,10,9,3,2,1};
        hot.initHeap(array.length+1);
        for(int index= 0; index < array.length; index++)
            hot.insertMinHeap(array[index]);

        assertArrayEquals(new int[]{0,1,3,2,12,9,10}, hot.heapArray);
    }

    // [0, 2, 3, 10, 12, 9]
    @Test
    void testDeleteMinHeap()
    {
        int[] array = new int[]{12,10,9,3,2,1};
        hot.initHeap(array.length+1);
        for(int index= 0; index < array.length; index++)
            hot.insertMinHeap(array[index]);

        hot.deleteMinHeap();

        assertArrayEquals(new int[]{0, 2, 3, 10, 12 ,9, 0}, hot.heapArray);
    }

}