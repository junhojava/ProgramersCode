package code.programers.level.one;

public class SecretMap {
    

    boolean isEven(int number)
    {
        return number % 2 == 0;
    }

    int sqrt(int number, int count)
    {
        int result = 1;
        while(count-- > 0)
        {
            result *= number;
        }

        return result;
    }
}