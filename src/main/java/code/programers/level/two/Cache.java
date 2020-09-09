package code.programers.level.two;

public class Cache {
    
    String[] buffer;
    int size;

    boolean isZero()
    {
        return size == 0;
    }

    void put(String str)
    {
        for(int index=1; index < size; index++)
            buffer[index-1] = buffer[index];

        buffer[size-1] = str;
    }
}