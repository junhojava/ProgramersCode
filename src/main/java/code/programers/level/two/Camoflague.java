package code.programers.level.two;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Camoflague {
    String[] parts(String[][] clothes) {
        List<String> list = new ArrayList<>();

        for (String[] cloth : clothes) {
            if (!list.contains(cloth[1]))
                list.add(cloth[1]);
        }

        return list.toArray(new String[0]);
    }

    Map<String, Integer> partsEquied(String[][] clothes) {
        Map<String, Integer> map = new HashMap<>();

        for (String[] cloth : clothes)
            map.put(cloth[1], map.getOrDefault(cloth[1], 0) + 1);

        return map;
    }
}