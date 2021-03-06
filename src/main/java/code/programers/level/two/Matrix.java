package code.programers.level.two;

class Matrix
{
    int[][] pivot(int[][] array)
    {
        int[][] result = new int[array[0].length][array.length];

        for(int x= 0; x< result.length; x++)
        {
            for(int y=0; y<result[0].length; y++)
            {
                result[x][y] = array[y][x];
            }
        }

        return result;
    }

    int[][] size(int row, int column)
    {
        return new int[row][column];
    }

    int calc(int[] row1, int[] row2)
    {
        int result = 0;

        for(int index=0; index<row1.length; index++)
            result += (row1[index]*row2[index]);

        return result;
    }
}