package datatype;

public class DoubleNumber extends Number{
    
    public DoubleNumber()
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