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
            int top = findDollPosition(board[move-1]);
            int doll= 0;
            int bucketOnTopDoll = bucketOnTop();
            int bucketOnSecondDOll = bucketOnSecond();

            if(top > -1)
            {
                doll = board[move-1][top];
                board[move-1][top]= 0;
            }

            if(!isEmptySpace(doll))
            {
                bucket.add(doll);
            }

            if(bucketHaveManyTwoDolls())
            {
                if(bucketSameDools())
                {
                    bucket.remove(bucket.size()-1);
                    bucket.remove(bucket.size()-1);
                    answer += 2;
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

    boolean bucketHaveManyTwoDolls()
    {
        return (bucket.size()>1);
    }

    boolean bucketSameDools()
    {
        return (bucketOnTop() == bucketOnSecond());
    }
}