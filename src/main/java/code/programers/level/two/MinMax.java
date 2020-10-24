package code.programers.level.two;

import java.util.Arrays;

public class MinMax
{
    String[] split(String str)
    {
        return str.split(" ");
    }

    int[] parseInt(String[] array)
    {
        return Arrays.stream(array).mapToInt(Integer::parseInt).sorted().toArray();
    }
}