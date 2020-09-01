package code.programers.level.two;

public class Printer {
    
    int maxIndex(int[] numbers)
    {
        int max = 0;
        int position = 0;

        for(int index=0; index < numbers.length; index++)
        {
            if(max < numbers[index])
            {
                max = numbers[index];
                position = index;
            }
        }
        return position;
    }

    int calcShiftedIndex(int location, int max_index, int length)
    {
        if(location> max_index)
        {
            return location - max_index;
        }
        else if(location < max_index)
        {
            return length - max_index + location;
        }
        else
        {
            return 0;
        }
    }
}