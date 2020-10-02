package code.programers.level.two;

import java.util.Arrays;
import java.util.List;

public class BiggestNumber {
    List<int[]> list;

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
}