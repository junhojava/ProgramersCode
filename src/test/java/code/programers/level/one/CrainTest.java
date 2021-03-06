package code.programers.level.one;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
/**
 *  link: https://kknr-study.atlassian.net/browse/ZIGT-129
 */
public class CrainTest
{

    int[][] board = {
          {0,0,0,0,0}
        , {0,0,1,0,3}
        , {0,2,5,0,1}
        , {4,2,4,4,2}
        , {3,5,1,3,1}};
    int[] moves = {1,5,3,5,1,2,1,4};
    CrainSolution crain = new CrainSolution();

    @Test
    public void testCrain()
    {
        assertEquals(4, crain.solution(board, moves));
    }
    
    @Test
    public void testDollPosition()
    {
        int position = crain.findDollPosition(board[1]);
        assertEquals(4, position);
    }

    @Test
    public void testBucketOnTop()
    {
        crain.bucket = new ArrayList<Integer>();
        crain.bucket.add(3);
        int doll = crain.bucketOnTop();

        assertEquals(3, doll);
    }

    @Test
    public void testBucketOnSecond()
    {
        crain.bucket = new ArrayList<Integer>();
        crain.bucket.add(3);
        int empty = crain.bucketOnSecond();

        assertEquals(0, empty);

        crain.bucket.add(4);
        int doll = crain.bucketOnSecond();

        assertEquals(3, doll);
    }

    @Test
    public void testBucketSameDolls()
    {
        crain.bucket = new ArrayList<Integer>();
        crain.bucket.add(3);

        assertEquals(true, crain.bucketSameDolls(3));

    }
}
