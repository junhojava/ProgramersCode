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

        for(int index=board.length-1; index> -1; index--)
        {
            if(board[index] != 0)
            {
                return false;
            }
            else
            {
                count++;
            }
        }

        return (count == board.length);
    }

    int replaceMoves(int value, int addend)
    {
        return value + addend;
    }
}