package code.programers.level.one;

public class ReverseNumber {
    
    String toString(long number)
    {
        return Long.toString(number);
    }

    int[] reverse(String[] list)
    {
        int[] result = new int[list.length];

        int end = list.length-1;

        for(int index=0; index<list.length; index++)
        {
            result[index] = Integer.parseInt(list[end-index]);
            result[end-index] = Integer.parseInt(list[index]);
        }

        return result;
    }
}