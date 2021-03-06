package code.programers.level.two;

public class Fibonaci
{
    long[] array;

    Fibonaci()
    {
        array = new long[]{0,1,1};
    }

    long calc(int n)
    {
        if(n == 0)
            return 0;
        else if(n == 1)
            return 1;
        else if(n == 2)
            return 1;
        else
            for(int count = 0; count < n-2; count++)
            {
                array[0] = array[1];
                array[1] = array[2];
                array[2] = ((array[0]%1234567)+(array[1]%1234567))%1234567;
            }

        return array[2];
    }
}