package code.programers.level.one;

public class SquareRoot {
    
    double divideTwo(long number)
    {
        return number / 2.0;
    }

    long minusLoop(double number)
    {
        double result = number;
        long index = 1;

        for(;index< number; index++)
        {
            result -= index;
            if(result < 0)
                break;
        }

        result += (index);

        if(index == result*2)
        {
            return index;
        }
        else
        {
            return -1;
        }
    }
}