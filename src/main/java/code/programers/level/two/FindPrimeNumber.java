package code.programers.level.two;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import code.programers.level.one.PrimeNumber;

public class FindPrimeNumber {

    PrimeNumber pn;
    BiggestNumber bn;
    AlterKey ak;

    int max;
    Map<Integer, Boolean> map;
    int count;

    FindPrimeNumber()
    {
        pn = new PrimeNumber();
        bn = new BiggestNumber();
        ak = new AlterKey();
        bn.list = new ArrayList<>();

        max = 0;
        map = new HashMap<>();
        count = 1;
    }


    void parseInt(int[] indexes, int[] array)
    {
        int number = 0;
        StringBuilder sb = new StringBuilder();

        for(int index:indexes)
        {
            if(number != 0 || array[index] != 0)
            {
                sb.append(array[index]);
                number = Integer.parseInt(sb.toString());
            }
        }

        map.put(number, map.getOrDefault(number, false));

        if(max < number)
            max = number;
    }

    int solution(int[] array)
    {
        int[] akArray = ak.columns(array.length);

        int[][] combination= ak.dimension(akArray);

        for(int[] arr: combination)
        {
            bn.list.add(arr);
        }

        while(count< array.length)
        {
            count++;

            combination = ak.combination(akArray, combination);

            for(int[] arr: combination)
                bn.permutation(arr, 0);
        }

        for(int[] arr:bn.list)
        {
            parseInt(arr, array);
        }

        pn.init(max+1);
        pn.primeNumber(max);

        int result = 0;

        for(Entry<Integer, Boolean> entry: map.entrySet())
        {
            if(pn.primeNumbers().contains(entry.getKey()))
                result++;
        }

        return result;
    }
}