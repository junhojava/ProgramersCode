package code.programers.level.two;

public class CountryNumber {

    int divide(int left, int right)
    {
        return left / right;
    }

    public Integer mod(int left, int right) {
        return left % right;
    }

    boolean isZero(int number) {
        return number == 0;
    }

    String reverse(String str)
    {
        return new StringBuilder(str).reverse().toString();
    }
}