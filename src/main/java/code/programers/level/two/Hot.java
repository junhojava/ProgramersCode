package code.programers.level.two;

public class Hot {

    int[] heapArray;

    void initHeap(int length)
    {
        heapArray = new int[length];
    }

    void insertMaxHeap(int number, int index)
    {
        heapArray[index] = number;

        for(; index > 1; index/=2)
        {
            if(heapArray[index] > heapArray[index/2])
            {
                int buffer = heapArray[index];
                heapArray[index] = heapArray[index/2];
                heapArray[index/2] = buffer;
            }
        }
    }

    void insertMinHeap(int number, int index)
    {
        heapArray[index] = number;

        for(; index > 1; index/=2)
        {
            if(heapArray[index] < heapArray[index/2])
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