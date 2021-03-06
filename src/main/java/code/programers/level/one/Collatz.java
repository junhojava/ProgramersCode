package code.programers.level.one;

public class Collatz {
    
    boolean isOne(long number)
    {
        return number == 1;
    }

    boolean isEven(long number)
    {
        return number % 2 == 0;
    }

    long evenCalc(long number)
    {
        return number /2;
    }

    long oddCalc(long number)
    {
        return (number * 3) + 1;
    }
}