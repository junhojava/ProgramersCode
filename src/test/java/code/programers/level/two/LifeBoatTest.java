package code.programers.level.two;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class LifeBoatTest
{
    Boat boat = new Boat();

    @Test
    void testList()
    {
        List<Integer> list = new ArrayList<>();

        list.add(40);
        list.add(50);
        list.add(50);
        list.add(60);
        list.add(70);

        assertEquals(list, boat.list(new int[]{40,50,50,60,70}));
    }

    @Test
    void testIsOver()
    {
        assertFalse(boat.isOver(20, 30, 60));
    }

    @Test
    void testCaseOne()
    {
        int[] array = {50,50,60,70};

        List<Integer> list = boat.list(array);

        int count = 0;

        while(list.size() > 0)
        {
            if(!boat.isOver(list.get(0), list.get(list.size()-1), 100))
                list.remove(0);

            list.remove(list.size()-1);
            count++;
        }

        assertEquals(3, count);
    }

    @Test
    void testCaseTwo()
    {
        int[] array = {50, 70, 80};

        List<Integer> list = boat.list(array);

        int count = 0;
        int size = array.length;

        int left = 0;
        int right = size-1;

        while(size > 0)
        {
            if(size > 1)
            {
                if(!boat.isOver(array[left], array[right], 100))
                {
                    left++;
                    size--;
                }
            }
            right--;
            size--;
            count++;
        }

        assertEquals(3, count);
    }
}