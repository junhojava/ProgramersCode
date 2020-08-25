package code.programers.level.one;

import java.util.ArrayList;
import java.util.List;

public class CrainSolution 
{
    List<Integer> bucket;


    public int solution(int[][] board, int[] moves)
    {
        int answer = 0;
        bucket = new ArrayList<Integer>();

        for(int move: moves)
        {
            int doll= findDollInBoard(board, move-1);

            if(!isEmptySpace(doll))
            {
                if(!bucketIsEmpty())
                {
                    if(bucketSameDolls(doll))
                    {
                        bucket.remove(bucket.size()-1);
                        answer += 2;
                    }else
                    {
                        bucket.add(doll);
                    }
                }else
                {
                    bucket.add(doll);
                }
            }

        }

        return answer;
    }

    int findDollPosition(int[] board)
    {
        int result= -1;

        for(int index=board.length-1; index>-1 ; index--)
        {
            if(!isEmptySpace(board[index]))
            {
                result = index;

                return result;
            }
        }
        return result;
    }

    boolean isEmptySpace(int value)
    {
        boolean result = false;

        if(value == 0)
        {
            result = true;
        }
        else
        {
            result = false;
        }

        return result;
    }

    int bucketOnTop()
    {
        if(bucket.size() == 0)
        {
            return 0;
        }
        else
        {
            return bucket.get(bucket.size()-1);
        }
    }

    int bucketOnSecond()
    {
        if(bucket.size() == 0 || bucket.size() == 1)
        {
            return 0;
        }
        else
        {
            return bucket.get(bucket.size()-2);
        }
    }

    boolean bucketIsEmpty()
    {
        return bucket.size()==0;
    }

    boolean bucketSameDolls(int doll)
    {
        return bucketOnTop() == doll;
    }

    int findDollInBoard(int[][] board, int move)
    {
        int result= 0;
        for(int[] space: board)
        {
            if(space[move] > 0)
            {
                result = space[move];
                space[move] = 0;
                return result;
            }
        }
        return result;
    }
}