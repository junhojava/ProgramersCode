package code.programers.level.one;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.jupiter.api.Test;

import code.programers.level.two.AlterKey;

public class SumTwoNumberTest {

    AlterKey ak = new AlterKey();

    @Test
    void testCombination()
    {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int[] result;
        int[] numbers = {2,1,3,4,1};
        int[] columns = ak.columns(numbers.length);
        int[][] indexs = {{0},{1},{2},{3},{4}};

        int[][] dimension = ak.combination(columns, indexs);

        for(int[] lists:dimension)
            map.put(numbers[lists[0]]+numbers[lists[1]], 1);

        int index= 0;
        result = new int[map.size()];

        for(Entry <Integer, Integer> entry : map.entrySet())
            result[index++] = entry.getKey();

        Arrays.sort(result);

        assertArrayEquals(new int[]{2,3,4,5,6,7}, result);
    }
}