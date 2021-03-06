package code.programers.level.one;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveMinNumber {
    
    int min(int[] list)
    {
        int[] copy = Arrays.copyOf(list, list.length);

        Arrays.sort(copy);

        return copy[0];
    }

    boolean findMin(int left, int right)
    {
        return left == right;
    }

    int[] removeMin(int list[], int min)
    {
        List<Integer> buffer = new ArrayList<Integer>();
        int index= 0;

        for(int number: list)
            if(!(findMin(number, min)))
                buffer.add(number);

        int[] result = new int[buffer.size()];
        
        for(Integer number:buffer)
            result[index++] = number;

        return result;
    }
}