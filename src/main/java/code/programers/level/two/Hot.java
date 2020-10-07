package code.programers.level.two;

import java.util.Arrays;

public class Hot {

    int[] heapArray;

    void initHeap()
    {
        heapArray = new int[1];
    }

    void insert(int number)
    {
        heapArray = Arrays.copyOf(heapArray, heapArray.length+1);

        heapArray[heapArray.length-1] = number;

        for(int index= heapArray.length -1; index > 1; index/=2)
        {
            if(heapArray[index] > heapArray[index/2])
            {
                int buffer = heapArray[index];
                heapArray[index] = heapArray[index/2];
                heapArray[index/2] = buffer;
            }
        }
    }

    public int calc(int left, int right) {
        return left + (right * 2);
    }

}