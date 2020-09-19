package code.programers.level.one;

public class KeyPad {
    int divide(int left, int right)
    {
        return left / right;
    }


    int distance(int start, int goal)
    {
        return 2;
    }

    int mod(int left, int right)
    {
        return left % right;
    }

    boolean isZero(int number)
    {
        return number == 0;
    }

    int[] position(int number)
    {
        int[] result = new int[2];

        result[0] = divide(number, 3);
        result[1] = mod(number, 3);

        return result;
    }
}