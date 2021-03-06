package code.programers.level.one;

public class Average {
    
    int sum(int... numbers)
    {
        int result = 0;

        for(int number : numbers)
            result += number;

        return result;
    }

    double average(int left, int right)
    {
        return (double)left / (double)right;
    }
}