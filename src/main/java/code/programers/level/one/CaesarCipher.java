package code.programers.level.one;

public class CaesarCipher {
    String lowAlphabet = "abcdefghijklmnopqrstuvwxyz";
    String upperAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    boolean isAlphabet(String s)
    {
        return (s.matches("[a-z]") || s.matches("[A-Z]"));
    }

    boolean isLowCase(String s)
    {
        return s.matches("[a-z]");
    }

    String lowShift(String s, int count)
    {
        int left = lowAlphabet.indexOf(s);
        int right = lowAlphabet.length();
        int index = (left+count) % right;


        return lowAlphabet.substring(index, index+1);
    }

    String upperShift(String s, int count)
    {
        int left = upperAlphabet.indexOf(s);
        int right = upperAlphabet.length();
        int index = (left+count) % right;

        return upperAlphabet.substring(index, index+1);
    }
}