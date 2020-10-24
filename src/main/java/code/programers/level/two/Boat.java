package code.programers.level.two;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Boat
{
    List<Integer> list(int[] array)
    {
        return Arrays.stream(array)
                     .boxed()
                     .collect(Collectors.toList());
    }
}