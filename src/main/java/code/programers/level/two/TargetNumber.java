package code.programers.level.two;

public class TargetNumber
{
    int[] results;

    TargetNumber(int n)
    {
        int length = 1;

        for(int count = 0; count < n; count++)
            length *= 2;

        results = new int[length];
    }

    void fill(int number, int count)
    {
        int c = 0;

        for(int i=0; i< results.length; i++)
        {
            results[i] = number;
            c++;
            if(c == count)
            {
                number *= -1;
                c = 0;
            }
        }
    }
}