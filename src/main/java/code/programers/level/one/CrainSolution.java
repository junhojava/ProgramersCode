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
        boolean result= true;
        int flag = 0;

        for(int index=0; index< board.length; index++)
        {
            if(board[index] == 0)
            {
                flag += 1;
            }
        }

        if(flag == board.length)
        {
            result = true;
        }
        else
        {
            result = false;
        }

        return result;
    }
}