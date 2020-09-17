package code.programers.level.one;

public class Collatz {
    
    boolean isOne(int number)
    {
        return number == 1;
    }

    boolean isEven(int number)
    {
        return number % 2 == 0;
    }

    int evenCalc(int number)
    {
        return number /2;
    }
}