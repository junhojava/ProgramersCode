package code.programers.level.two;

public class BinaryNextNumber
{
    int convertNumber(String str)
    {
        int result = 0;
        StringBuilder sb = new StringBuilder(str);
        
        str = sb.reverse().toString();

        if(str.substring(0,1).equals("1"))
            result++;


        for(int index= 1; index<sb.length(); index++)
        {
            if(str.substring(index, index+1).equals("1"))
                result+= sqrt(index);
        }

        return result;
    }

    int sqrt(int count)
    {
        int result = 1;

        while(count > 0)
        {
            count--;
            result *= 2;
        }

        return result;
    }
}