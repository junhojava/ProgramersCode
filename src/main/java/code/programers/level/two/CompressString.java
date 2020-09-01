package code.programers.level.two;

public class CompressString {
    
    boolean only(String s, String c)
    {
        return s.replace(c, "").length() == s.length() - 1;
    }

    boolean remained(int left, int right)
    {
        return (left%right) != 0;
    }

    boolean equalsString(String left, String right)
    {
        return left.equals(right);
    }
}