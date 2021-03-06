package code.programers.level.one;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import code.programers.level.two.AlterKey;

public class BudgetTest {
    
    Budget budget = new Budget();

    @Test
    void budgetSupportProducts()
    {
        assertEquals(3, budget.budgetSupport(9, new int[]{1,2,3,4,5}));
        assertEquals(4, budget.budgetSupport(10, new int[]{2,2,3,3}));
    }
}