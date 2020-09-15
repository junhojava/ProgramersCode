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
        int index = alphabet.indexOf(s);

        return alphabet.substring(index+count, index+count+1);
    }
}