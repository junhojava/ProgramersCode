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

    String convert(int number, int count)
    {
        StringBuilder sb = new StringBuilder();

        while(divide(number, 3) > 0 || count == 0)
        {
            count++;
            int mod = mod(number, 3);
            number = divide(number, 3);

            if(mod == 0)
            {
                number--;
                mod = 4;
            }

            sb.append(mod);

            if(number > 0 && number < 3)
            {
                sb.append(number);
            }
        }

        return sb.reverse().toString();
    }
}