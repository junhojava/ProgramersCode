package code.programers.level.one;

public class CaesarCipher {
    String alphabet = "abcdefghijklmnopqrstuvwxyz";

    boolean isAlphabet(String s)
    {
        return (s.matches("[a-z]") || s.matches("[A-Z]"));
    }

    boolean isLowCase(String s)
    {
        return s.matches("[a-z]");
    }

    String shift(String s, int count)
    {
        int left = alphabet.indexOf(s);
        int right = alphabet.length();

        return alphabet.substring((left+count)%right, (left+count+1)%right);
    }
}