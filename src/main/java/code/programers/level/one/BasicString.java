package code.programers.level.one;

public class BasicString {
    
    int length(String str)
    {
        return str.length();
    }

    String replaceNumber(String str)
    {
        return str.replaceAll("\\d", "");
    }
}