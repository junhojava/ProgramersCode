package code.programers.level.two;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
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
    void testConcatColumn()
    {
        assertArrayEquals(new int[][]{{1,2},{1,3},{1,4},{2,3},{2,4},{3,4}}, ak.combination(new int[]{1,2,3,4}, 2));
    }
}