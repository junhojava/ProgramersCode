package code.programers.level.two;

public class Carpet
{
    int divide(int left, int right)
    {
        return left/right;
    }

    boolean modIsZero(int left, int right)
    {
        return (left%right) == 0;
    }

    int fill(int vertical, int horizontal)
    {
        return vertical*2 + horizontal *2;
    }
}