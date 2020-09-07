package code.programers.level.one;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class FailureRate {
    
    int[] stagecount;
    int[] nonclearcount;
    double[] rates;
    Map<Integer, Double> map;
    List<Integer> list;

    void stageLength(int length)
    {
        stagecount = new int[length];
        nonclearcount = new int[length];
        rates = new double[length];
        map = new HashMap<Integer, Double>();
        list = new ArrayList<Integer>();
    }

    void putList(int[] stages)
    {
        for(int stage: stages)
        {
            if(stage-1 < nonclearcount.length)
            {
                nonclearcount[stage-1]++;
            }
            for(int index=0; index< stage; index++)
            {
                if(stagecount.length > index)
                {
                    stagecount[index]++;
                }
            }
        }
    }

    void calc()
    {
        for(int index=0; index<stagecount.length; index++)
        {
            if(stagecount[index] > 0)
            {
                rates[index] = (double)nonclearcount[index] / stagecount[index];
            }
            else
            {
                rates[index] = 0;
            }
            map.put(index, rates[index]);

        }
        Arrays.sort(rates);
    }

    int index(double value)
    {
        for(Entry<Integer, Double> entry:map.entrySet())
        {
            Integer key = entry.getKey();

            if(map.get(key).equals(value))
            {
                return key;
            }
        }
        return 0;
    }

    void putStage(int index)
    {
        map.remove(index);
        list.add(index+1);
    }
}