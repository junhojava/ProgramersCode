package code.programers.level.two;

public class NewsClustrering {
    
    boolean isZero(String str)
    {
        return str.length() == 0;
    }

    String[] combination(String str)
    {
        String[] result = new String[str.length()-1];
        for(int index=0; index<str.length()-1; index++)
        {
            result[index] = str.substring(index, index+2);
        }

        return result;
    }

    boolean isEnglish(String str)
    {
        return str.matches("^[a-zA-Z]*$");
    }
}