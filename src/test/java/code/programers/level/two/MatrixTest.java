package code.programers.level.two;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class MatrixTest
{
    @Test
    void testPivot()
    {
        int[][] arr = new int[][]{{2,3},{4,5}};

        Matrix matrix = new Matrix();

        assertArrayEquals(new int[][]{{2,4},{3,5}}, matrix.pivot(arr));
    }

    @Test
    void testSize()
    {
        int[][] arr1 = new int[][]{{1,4},{3,2},{4,1}};
        int[][] arr2 = new int[][]{{3,3},{3,3}};

        Matrix matrix = new Matrix();

        assertArrayEquals(new int[3][2], matrix.size(arr1.length, arr2[0].length));
    }

    @Test
    void testCaseOne()
    {
        int[][] arr1 = new int[][]{{1,4},{3,2},{4,1}};
        int[][] arr2 = new int[][]{{3,3},{3,3}};
        
        Matrix matrix = new Matrix();

        int[][] arr3 = matrix.size(arr1.length, arr2[0].length);

        int row=0;
        int column = 0;
        for(int[] row1: arr1)
        {
            for(int[] row2:arr2)
            {
                arr3[row][column] = matrix.calc(row1, row2);
                column++;
            }
            column = 0;
            row++;
        }


        assertArrayEquals(new int[][]{{15,15},{15,15},{15,15}}, arr3);
    }
}