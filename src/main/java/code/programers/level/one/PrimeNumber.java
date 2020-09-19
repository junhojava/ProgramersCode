package code.programers.level.one;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumber {
    boolean[] table;
    List<Integer> list;

    void init(int length)
    {
        table = new boolean[length];
        list = new ArrayList<>();
    }

    void check(int number, int end)
    {
        list.add(number);
        for(int index=1; index*number<=end; index++)
        {
            table[index*number] = true;
        }
    }

    int primeNumber(int number)
    {
        for(int index=2; index<=number; index++)
        {
            if(!table[index])
                check(index, number);
        }

        return list.size();
    }
}