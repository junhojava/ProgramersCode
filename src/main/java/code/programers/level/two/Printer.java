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
            return (location - max_index) +1;
        }
        else if(location < max_index)
        {
            return (length - max_index + location) +1;
        }
        else
        {
            return 1;
        }
    }

    int[] shiftList(int[] numbers, int count)
    {
        int number= 0;
        while(number<count)
        {
            number++;
            int buffer = 0;
            buffer = numbers[0];
            for(int index=0; index<numbers.length-1; index++)
            {
                numbers[index] = numbers[index+1];
            }
            numbers[numbers.length-1] = buffer;
        }

        return numbers;
    }

    int[] firstOutList(int[] priorities)
    {
        int[] result = new int[priorities.length-1];
        for(int index=1; index<result.length; index++)
        {
            result[index] = priorities[index+1];
        }
        return result;
    }
}