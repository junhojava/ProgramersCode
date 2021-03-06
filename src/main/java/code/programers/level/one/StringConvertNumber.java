package code.programers.level.one;

public class StringConvertNumber {

    boolean existMinus(String s)
    {
        String result = s.replaceAll("\\d", "");

        return result.equals("-");
    }

    int extractNumber(String s)
    {
        String result = s.replaceAll("\\D", "");

        return Integer.parseInt(result);
    }
}