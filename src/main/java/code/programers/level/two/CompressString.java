package code.programers.level.two;

public class CompressString {
    
    boolean only(String s, String c)
    {
        return s.replace(c, "").length() == s.length() - 1;
    }
}