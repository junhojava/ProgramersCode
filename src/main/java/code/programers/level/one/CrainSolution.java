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
            if(board[index] == 0)
            {
                count += 1;
            }
        }

        return (count == board.length);
    }
}