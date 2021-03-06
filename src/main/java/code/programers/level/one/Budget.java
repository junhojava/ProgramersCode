package code.programers.level.one;

public class Budget {
    
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