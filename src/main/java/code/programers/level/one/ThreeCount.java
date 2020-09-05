package code.programers.level.one;

public class ThreeCount {
    String append(int second)
    {
        if(second<10)
        {
            return "0"+second;
        }
        else
        {
            return Integer.toString(second);
        }
    }
}