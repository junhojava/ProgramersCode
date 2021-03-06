package code.programers.level.one;

import java.util.Arrays;

public class Budget {
    
    void sort(int[] list)
    {
        Arrays.sort(list);
    }

    boolean isBudget(int[][] combination, int[] list, int budget)
    {
        boolean can = false;

        for(int[] dimension:combination)
        {
            int value = 0;
            
            for(int number: dimension)
                value += list[number];

            if(value <= budget)
                can = true;
        }

        return can;
    }

    boolean isMax(boolean[] list, int length)
    {
        return list[length];
    }
}