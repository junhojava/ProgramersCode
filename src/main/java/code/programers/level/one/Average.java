package code.programers.level.one;

public class Average {
    
    int sum(int... numbers)
    {
        int result = 0;

        for(int number : numbers)
            result += number;

        return result;
    }

    int length(int[] list)
    {
        return list.length;
    }

    double average(int left, int right)
    {
        return (double)left / (double)right;
    }
}