package code.programers.level.one;

public class NumberSecure {
    
    String appendSecureCode(String str, int length)
    {
        String result = "";

        for(int index=0; index<length; index++)
        {
            result += str;
        }

        return result;
    }

    String concatNumber(String left, String right)
    {
        return left.concat(right);
    }
}