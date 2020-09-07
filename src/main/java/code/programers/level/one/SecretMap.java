package code.programers.level.one;

public class SecretMap {
    int sqrt(int number, int count)
    {
        int result = 1;
        while(count-- > 0)
        {
            result *= number;
        }

        return result;
    }

    String fill(String one, String two, int length)
    {
        String result = "";
        for(int index=0; index<length; index++)
        {
            if(one.substring(index, index+1).equals("#") || two.substring(index, index+1).equals("#"))
            {
                result = result.concat("#");
            }
            else
            {
                result = result.concat(" ");
            }
        }
        return result;
    }

    String convert(int max, int number)
    {
        String result = "";
        while(max > 0)
        {
            if(number - max >= 0)
            {
                number -= max;
                result = result.concat("#");
            }
            else
            {
                result = result.concat(" ");
            }
            max /= 2;
        }

        return result;
    }
}