package code.programers.level.two;

public class Printer {
    
    int maxIndex(int[] numbers)
    {
        int max = 0;
        int position = 0;

        for(int index=0; index < 4; index++)
        {
            if(max < numbers[index])
            {
                max = numbers[index];
                position = index;
            }
        }
        return position;
    }
}