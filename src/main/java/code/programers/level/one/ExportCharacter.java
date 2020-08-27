package code.programers.level.one;

public class ExportCharacter {

    boolean isEven(int value)
    {
        return (value%2) == 0;
    }

    int half(int value)
    {
        int result = 0;

        if(isEven(value))
        {
            result= value/2;
        }else
        {
            result= value/2 +1;
        }

        return result;
    }
}