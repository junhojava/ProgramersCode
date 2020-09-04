package code.programers.level.two;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class AlterKeyTest {
    /**
     * 
     * {0,1,2,3} = {1,2,3}
     * 
     * {1,2,3} = {{1,2},{1,3}},{{2,3}}
     * 
     * {1,2,3} = {{1,2,3}}
     */
    String[][] relation;
    AlterKey ak = new AlterKey();

    @Test
    void testUnique()
    {
        assertTrue(ak.isUnique("100"));
    }

    @Test
    void testCombination()
    {
        int[] list = new int[]{1,2,3,4};
        int[][] remained = new int[][]{{1},{2},{3},{4}};

        int[][] two_dimension = ak.combination(list, remained);
        int[][] three_dimension = ak.combination(list, two_dimension);
        assertArrayEquals(new int[][]{{1,2},{1,3},{1,4},{2,3},{2,4},{3,4}}, two_dimension);
        assertArrayEquals(new int[][]{{1,2,3},{1,2,4},{1,3,4},{2,3,4}}, three_dimension);
        assertArrayEquals(new int[][]{{1,2,3,4}}, ak.combination(list, three_dimension));
    }

    @Test
    void testColumns()
    {
        String[][] relation = {{"100","ryan","music","2"},{"200","apeach","math","2"},{"300","tube","computer","3"},{"400","con","computer","4"},{"500","muzi","music","3"},{"600","apeach","music","2"}};

        int[] columns = ak.columns(relation[0].length);

        assertArrayEquals(new int[]{0,1,2,3}, columns);
    }

    @Test
    void testDimension()
    {
        String[][] relation = {{"100","ryan","music","2"},{"200","apeach","math","2"},{"300","tube","computer","3"},{"400","con","computer","4"},{"500","muzi","music","3"},{"600","apeach","music","2"}};

        int[] columns = ak.columns(relation[0].length);

        int[][] combination = ak.dimension(columns);

        assertArrayEquals(new int[][]{{0},{1},{2},{3}}, combination);
    }

    @Test
    void testOne()
    {
        int count = 0;
        String[][] relation = {{"100","ryan","music","2"},{"200","apeach","math","2"},{"300","tube","computer","3"},{"400","con","computer","4"},{"500","muzi","music","3"},{"600","apeach","music","2"}};

        count = ak.solution(relation);
        assertEquals(2, count);
    }

    @Test
    void testRemove()
    {
        ak.remained = new int[]{0,1,2,3};

        int[] result = ak.remove(ak.remained, new int[]{0});

        assertArrayEquals(new int[]{1,2,3}, result);
    }

    @Test
    void testCaseTwo()
    {
        int count = 0;
        String[][] relation = {
            {"b","2","a","a","b"},
            {"b","2","7","1","b"},
            {"1","0","a","a","8"},
            {"7","5","a","a","9"},
            {"3","0","a","f","9"}};

        count = ak.solution(relation);

        System.out.println(ak.unique_key);
        assertEquals(5, count);
    }
}