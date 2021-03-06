package code.programers.level.two;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class NumberExpressionTest
{
    NumberExpression ne = new NumberExpression();

    @Test
    void testCase()
    {
        int count= ne.count(15);

        assertEquals(3, count);
    }
}