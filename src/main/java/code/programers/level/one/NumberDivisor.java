package code.programers.level.one;

public class NumberDivisor {
    int divisor;

    NumberDivisor(int divisor)
    {
        this.divisor = divisor;
    }

    int[] divisorList(int[] numbers)
    {
        for(int index=0; index<numbers.length; index++)
        {
            if((numbers[index] % divisor) != 0)
            {
                numbers[index] = 0;
            }
        }
        return numbers;
    }

    int countNumber(int[] numbers, int number)
    {
        int result = 0;
        for(int value: numbers)
        {
            if(value == number)
            {
                result++;
            }
        }

        return result;
    }

    int[] bubleSort(int[] numbers)
    {
        int buffer = 0;
        boolean isChanged = true;

        while(isChanged)
        {
            isChanged = false;
            for(int index=0; index < numbers.length-1; index++)
            {
                if(numbers[index]>numbers[index+1])
                {
                    buffer= numbers[index];
                    numbers[index] = numbers[index+1];
                    numbers[index+1] = buffer;
                    isChanged = true;
                }
            }
        }
        return numbers;
    }

    int[] subList(int[] numbers, int begin)
    {
        int[] result = new int[numbers.length - begin];

        for(int index= 0; index<result.length; index++)
        {
            result[index] = numbers[begin+ index];
        }
        return result;
    }
}