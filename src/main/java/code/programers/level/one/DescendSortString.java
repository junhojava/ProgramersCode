package code.programers.level.one;

public class DescendSortString {
    
    String[] split(String s)
    {
        String[] result = new String[2];

        result[0] = s.replaceAll("[A-Z]", "");
        result[1] = s.replaceAll("[a-z]", "");

        return result;
    }
}