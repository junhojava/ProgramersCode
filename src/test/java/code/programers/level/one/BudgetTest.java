package code.programers.level.one;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import code.programers.level.two.AlterKey;

public class BudgetTest {
    
    Budget budget = new Budget();
    AlterKey ak = new AlterKey();

    @Test
    void testCombination()
    {
        int[] list = {1,3,2,5,4};
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