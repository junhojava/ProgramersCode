package code.programers.level.one;

/**
 * Hello world!
 *
 */
public class CrainSolution 
{
    public int solution(int[][] board, int[] moves)
    {
        int answer = 4;

        return answer;
    }

    boolean emptyPosition(int[] board)
    {
        int count = 0;

        for(int index=0; index< board.length; index++)
        {
            count(board[index], count);
        }

        return (count == board.length);
    }

    int count(int value, int count)
    {
        if(value == 0)
        {
            count += 1;
        }

        return count;
    }
}