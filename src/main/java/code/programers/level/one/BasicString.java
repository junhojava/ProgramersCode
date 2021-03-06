package code.programers.level.one;

public class BasicString {
    
    String removeNumber(String str)
    {
        return str.replaceAll("\\d", "");
    }
}