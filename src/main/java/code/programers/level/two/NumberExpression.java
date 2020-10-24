package code.programers.level.two;

public class NumberExpression
{
    int count(int number)
    {
        int result = 0;
        for(int i=1; i<= number/2; i++)
        {
            int value = i;
            for(int n=i+1; n <= number; n++)
            {
                if(value >= number)
                {
                    if(value == number)
                        result++;
                    break;
                }
                else
                    value+=n;
            }
        }
        return result;
    }
}