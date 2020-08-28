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
}