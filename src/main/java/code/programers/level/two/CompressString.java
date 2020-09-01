package code.programers.level.two;

public class CompressString {
    
    boolean firstCharacterDuplication(String s)
    {
        boolean result = true;
        String c = s.substring(0,1);

        if(s.replaceAll(c, "").length() == s.length()-1)
        {
            result = false;
        }

        return result;
    }

    boolean isEven(int number)
    {
        boolean result = false;
        if(number%2 == 0)
        {
            result = true;
        }
        return result;
    }
}