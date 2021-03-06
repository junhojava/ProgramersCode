package code.programers.level.one;

import java.util.ArrayList;
import java.util.List;

public class MockExam {
    
    int index(int left, int right)
    {
        return left%right;
    }

    boolean isHit(int left, int right)
    {
        return left == right;
    }

    int[] top(int[] scores)
    {
        int max = 0;
        List<Integer> list = new ArrayList<Integer>();

        for(int point: scores)
            if(max<point)
                max = point;

        for(int index=0; index<scores.length; index++)
        {
            if(scores[index] == max)
            {
                list.add(index+1);
            }
        }

        scores = new int[list.size()];

        for(int index=0; index<scores.length; index++)
        {
            scores[index] = list.get(index);
        }

        return scores;
    }
}