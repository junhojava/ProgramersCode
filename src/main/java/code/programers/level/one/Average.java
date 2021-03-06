package code.programers.level.one;

public class Average {
    
    double sum(double... numbers)
    {
        double result = 0;

        for(double number : numbers)
            result += number;

        return result;
    }

    double divide(double left, double right)
    {
        return left / right;
    }
}