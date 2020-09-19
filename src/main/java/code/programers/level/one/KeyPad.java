package code.programers.level.one;

public class KeyPad {
    int divide(int left, int right)
    {
        return left / right;
    }


    int distance(int[] position, int[] target)
    {
        int zero = position[0] - target[0];
        int one = position[1] - target[1];

        if(zero < 0)
            zero *= -1;

        if(one < 0)
            one *= -1;

        return zero + one;
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
        if(number == 0)
            return new int[]{3,2};

        int[] result = new int[2];

        result[0] = divide(number, 3);

        if(mod(number, 3) == 0)
        {
            result[1] = 3;
            result[0] -= 1;
        }
        else
            result[1] = mod(number, 3);

        return result;
    }

    boolean isSameDistance(int left, int right)
    {
        return left == right;
    }
}