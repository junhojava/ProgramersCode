package code.programers.level.one;

import datatype.NumberType;

public class Average extends NumberType{

    public Average()
    {
        super();
    }
    
    @Override
    public double sum(double... numbers)
    {
        double result = 0;

        for(double number : numbers)
            result += number;

        return result;
    }

    @Override
    public double divide(double left, double right)
    {
        return left / right;
    }
}