package code.programers.level.two;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class FunctionDevelopTest {
    FunctionDevelop fd = new FunctionDevelop();

    @Test
    void testCalcProgress()
    {
        assertEquals(94, fd.sum(93, 1));
    }

    @Test
    void testCaseOne()
    {
        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 5};
        List<Integer> progress_list = fd.asList(progresses);
        List<Integer> speed_list = fd.asList(speeds);
        List<Integer> result = new ArrayList<Integer>();

        while(progress_list.size() > 0)
        {
            for(int index=0; index<progress_list.size(); index++)
                progress_list.set(index, fd.sum(progress_list.get(index), speeds[index]));

            int count = fd.count(progress_list);
            
            if(count > 0)
            {
                result.add(count);

                for(int index=0; index<count; index++)
                {
                    progress_list.remove(index);
                    speed_list.remove(index);
                }
            }
        }
        
        assertArrayEquals(new int[]{2,1}, fd.toArray(result));
    }
}