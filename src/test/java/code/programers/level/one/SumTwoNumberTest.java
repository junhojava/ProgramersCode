package code.programers.level.one;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

import code.programers.level.two.AlterKey;

public class SumTwoNumberTest {

    AlterKey ak = new AlterKey();

    @Test
    void testCombination()
    {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int[] numbers = {2,1,3,4,1};
        int[] columns = ak.columns(numbers.length);
        int[][] indexs = {{0},{1},{2},{3},{4}};

        int[][] dimension = ak.combination(columns, indexs);

        System.out.println(dimension);
    }
}