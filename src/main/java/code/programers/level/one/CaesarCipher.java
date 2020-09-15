package code.programers.level.one;

public class CaesarCipher {
    String alphbet = "abcdefghijklmnopqrstuvwxyz";

    boolean isAlphabet(String s)
    {
        return (s.matches("[a-z]") || s.matches("[A-Z]"));
    }

    boolean isLowCase(String s)
    {
        return s.matches("[a-z]");
    }
}