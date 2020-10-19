package code.programers.level.two;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;

public class CamoflagueTest {

    Camoflague camoflague = new Camoflague();

    @Test
    void testParts()
    {
        String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};

        assertArrayEquals(new String[]{"headgear", "eyewear"}, camoflague.parts(clothes));
    }

    @Test
    void testSplited()
    {
        String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};

        Map<String, Integer> map= new HashMap<>();

        map.put("headgear", 2);
        map.put("eyewear", 1);

        assertEquals(map, camoflague.partsEquied(clothes));
    }

    @Test
    void testCombination()
    {
        String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};

        String[] array = camoflague.parts(clothes);
        AlterKey ak = new AlterKey();

        int[] columns = ak.columns(array.length);

        int[][] combination = ak.dimension(columns);

        int result = 0;

        for(int[] arr: combination)
            result += camoflague.count(arr, array, camoflague.partsEquied(clothes));

        for(int count = 1; count < columns.length; count++)
        {
            combination = ak.combination(columns, combination);

            for(int[] arr: combination)
                result += camoflague.count(arr, array, camoflague.partsEquied(clothes));
        }

        assertEquals(5, result);
    }

    @Test
    void twoFactorial()
    {
        assertEquals(10, camoflague.factorial(4));
    }

    @Test
    void testSpace()
    {
        assertEquals(30, camoflague.space(5));
    }

    @Test
    void testAnotherCombination()
    {
        String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
        int[] parts = camoflague.partsCount(clothes);
        int n = parts.length;
        int result = 0;
        boolean[] visited = new boolean[n];

        int count = 1;
        while(count <= n)
        {
            camoflague.count = 0;

            camoflague.combination(parts, visited, 0, n , count);

            count++;
            result += camoflague.count;
        }

        assertEquals(5, result);
    }
}