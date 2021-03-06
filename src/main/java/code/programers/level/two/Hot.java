package code.programers.level.two;

public class Hot {

    int[] heapArray;
    int heap_size;

    void initHeap(int length)
    {
        heapArray = new int[length];
        heap_size = 0;
    }

    void insertMaxHeap(int number)
    {
        int index = ++heap_size;
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

    void insertMinHeap(int number)
    {
        int index = ++heap_size;
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

    void deleteMaxHeap()
    {
        int parent = 1;
        int child = 2;

        int temp = heapArray[heap_size--];
        heapArray[heap_size+1] = 0;

        while(child <= heap_size)
        {
            if(child < heap_size && heapArray[child] < heapArray[child+1])
                child++;
            if(temp >= heapArray[child])
                break;

            heapArray[parent] = heapArray[child];

            parent = child;
            child *= 2;
        }

        heapArray[parent] = temp;
    }

    void deleteMinHeap()
    {
        int parent = 1;
        int child = 2;

        int temp = heapArray[heap_size--];
        heapArray[heap_size+1] = 0;

        while(child <= heap_size)
        {
            if(child < heap_size && heapArray[child] > heapArray[child+1])
                child++;
            if(temp <= heapArray[child])
                break;

            heapArray[parent] = heapArray[child];

            parent = child;
            child *= 2;
        }

        heapArray[parent] = temp;
    }

    public int calc(int left, int right) {
        return left + (right * 2);
    }

}