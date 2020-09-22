package code.programers.level.two;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PassBridge {
    List<Map<Integer, Integer>> trucks;
    int weight;
    int time;

    PassBridge()
    {
        trucks = new ArrayList<>();
    }


    boolean checkWeight(int truck)
    {
        return (weight - truck) >= 0;
    }

    void putTruckInfo(int[] arr)
    {
        for(int number: arr)
        {
            Map<Integer, Integer> map = new HashMap<Integer, Integer>();

            map.put(number, 0);
            trucks.add(map);
        }
    }
}