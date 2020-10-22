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
}