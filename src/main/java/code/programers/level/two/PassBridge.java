package code.programers.level.two;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class PassBridge {
    List<Map<Integer, Integer>> bridge;
    int max;
    int time;

    boolean checkWeight(int truck)
    {
        return (max - truck) >= 0;
    }

    void putTruckInfo(int number)
    {
        Map<Integer, Integer> map = new HashMap<>();

        max -= number;
        map.put(number, 0);
        bridge.add(map);
    }

    void addCount()
    {
        for(Map<Integer, Integer>map : bridge)
            for(Entry<Integer, Integer>entry: map.entrySet())
                map.replace(entry.getKey(), entry.getValue(), entry.getValue()+1);
    }

    int solution(int bridge_length, int weight, int[] truck_weight)
    {
        bridge = new ArrayList<>();
        time = bridge_length;
        max = weight;
        int count = 0;
        int index=0;
        boolean isEnd = false;

        while(!isEnd)
        {
            count++;

            if(index < truck_weight.length && checkWeight(truck_weight[index]))
                putTruckInfo(truck_weight[index++]);

            addCount();

            for(Entry<Integer, Integer>entry:bridge.get(0).entrySet())
                if(entry.getValue() == time)
                {
                    max += entry.getKey();
                    bridge.remove(0);
                }

            if(index == truck_weight.length && bridge.size() == 0)
                isEnd =true;
        }

        return count+1;
    }
}