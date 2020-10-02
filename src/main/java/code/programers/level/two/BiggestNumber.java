package code.programers.level.two;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BiggestNumber {
    List<int[]> list;

    Integer[] array;

    public void permutation(int[] arr, int startIdx)
    {
        int length = arr.length;
        if(startIdx == length-1)
        {
            list.add(Arrays.copyOf(arr, arr.length));

            return;
        }

        for(int i=startIdx; i<length; i++)
        {
            swap(arr, startIdx, i);
            permutation(arr, startIdx+1);
            swap(arr, startIdx, i);
        }
    }

    public void swap(int[] arr, int n1, int n2)
    {
        int temp = arr[n1];
        arr[n1] = arr[n2];
        arr[n2] = temp;
    }

    public int stringCompare(String left, String right)
    {
        return (right+left).compareTo(left+right);
    }

    public void sort()
    {
        Arrays.sort(array, new Comparator<Integer>() {

            @Override
            public int compare(Integer left, Integer right)
            {
                return stringCompare(Integer.toString(left), Integer.toString(right));
            }
        });
    }

    public void init(int[] number)
    {
        array = Arrays.stream(number).boxed().toArray(Integer[]::new);
    }
}