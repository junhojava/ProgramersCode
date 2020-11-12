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

    void fill(int number, int depth)
    {
        for(int i=0; i< results.length; i++)
            if(i%2 == 0)
                results[i] = number;
            else
                results[i] = -number;
    }
}