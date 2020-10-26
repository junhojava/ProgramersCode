package code.programers.level.two;

class BiggestSquare
{
    int max;

    boolean isOne(int number)
    {
        return number == 1;
    }

    int min(int number1, int number2, int number3)
    {
        int min = number1;

        if(min > number2)
            min = number2;

        if(min > number3)
            min = number3;

        return min;
    }
}