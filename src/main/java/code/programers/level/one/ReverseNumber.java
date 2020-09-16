package code.programers.level.one;

public class ReverseNumber {
    
    String toString(long number)
    {
        return Long.toString(number);
    }

    String[] reverse(String[] list)
    {
        String[] result = new String[list.length];

        int end = list.length-1;

        for(int index=0; index<list.length; index++)
        {
            result[index] = list[end-index];
            result[end-index] = list[index];
        }

        return result;
    }
}