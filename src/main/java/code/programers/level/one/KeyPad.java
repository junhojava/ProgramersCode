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
        int[] result = new int[2];

        result[0] = divide(number, 3);
        result[1] = mod(number, 3);

        return result;
    }
}