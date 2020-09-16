package code.programers.level.one;

public class RemoveMinNumber {
    
    int max(int[] list)
    {
        int max = 0;

        for(int number: list)
            if(max < number)
                max = number;
        
        return max;
    }
}