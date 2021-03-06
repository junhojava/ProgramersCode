package code.programers.level.one;

public class Accumulator {

    Accumulator()
    {

    }

    long sumBetweenTwoNumbers(long min, long max)
    {
        return (max - min +1) * (min + max) / 2;
    }

}