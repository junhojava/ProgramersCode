package code.programers.level.two;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class MatrixTest
{
    @Test
    void testCaseOne()
    {
        int[][] arr = new int[][]{{2,3},{4,5}};

        Matrix matrix = new Matrix();

        assertArrayEquals(new int[][]{{2,4},{3,5}}, matrix.pivot(arr));
    }
}