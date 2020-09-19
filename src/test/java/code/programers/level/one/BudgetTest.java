package code.programers.level.one;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import code.programers.level.two.AlterKey;

public class BudgetTest {

    Budget budget = new Budget();


    @Test
    void testAscend()
    {
        int[] list = {1,3,2,5,4};

        budget.sort(list);

        assertArrayEquals(new int[]{1,2,3,4,5}, list);
    }

    @Test
    void testCombination()
    {
        int[] list = {1,3,2,5,4};
        AlterKey ak = new AlterKey();
        int[] columns = ak.columns(list.length);
        int[][] combination = ak.dimension(columns);

        boolean[] lengths = new boolean[list.length];

        lengths[0] = budget.isBudget(combination, list, 9);

        int index=1;

        for(; index<5; index++)
        {
            combination = ak.combination(columns, combination);
            lengths[index] = budget.isBudget(combination, list, 9);

            if(lengths[index] == false)
                break;
        }

        assertEquals(3, index);
    }

    @Test
    void testCaseTwo()
    {
        int[] list = {2,2,3,3};
        AlterKey ak = new AlterKey();
        int[] columns = ak.columns(list.length);
        int[][] combination = ak.dimension(columns);

        boolean[] lengths = new boolean[list.length];

        lengths[0] = budget.isBudget(combination, list, 10);

        int index=1;

        for(; index<4; index++)
        {
            combination = ak.combination(columns, combination);
            lengths[index] = budget.isBudget(combination, list, 10);

            if(lengths[index] == false)
                break;
        }

        if(budget.isMax(lengths, list.length-1))
            index = list.length;

        assertEquals(4, index);
    }
}