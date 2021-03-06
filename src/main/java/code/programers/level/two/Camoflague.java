package code.programers.level.two;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Camoflague {

    int count;

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

    int count(int[] arr, String[] array, Map<String, Integer> map)
    {
        int result = 1;
        for(int index: arr)
            result *= map.get(array[index]);

        return result;
    }

    int[] partsCount(String[][] clothes) {
        Map<String, Integer> map = new HashMap<>();
        
        for (String[] cloth : clothes)
            map.put(cloth[1], map.getOrDefault(cloth[1], 0) + 1);
        
        int[] array = new int[map.size()];
        int index = 0;

        for (Entry<String, Integer> entry: map.entrySet())
            array[index++] = entry.getValue();

        return array;
    }

    int factorial(int number)
    {
        return (number * (number+1)) / 2;
    }

    int space(int length)
    {
        int result = length;
        int count = 0;

        while(length > 0)
        {
            if(count > 0 && (length-1) > 1)
                result += 1;

            count++;
            result += factorial(--length);
        }

        return result;
    }

    void combination(int[] arr, boolean[] visited, int start, int n, int r)
    {
        if(r == 0)
        {
            count += print(arr, visited, n);
            return;
        } 
    
        for(int i=start; i<n; i++)
        {
            visited[i] = true;
            combination(arr, visited, i + 1, n, r - 1);
            visited[i] = false;
        }
    }

    int print(int[] arr, boolean[] visited, int n)
    {
        int result = 1;
        for (int i = 0; i < n; i++)
        {
            if (visited[i])
            {
                result *= arr[i];
            }
        }

        return result;
    }
}