package code.programers.level.one;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
/**
 * Unit test for simple App.
 */
public class CrainTest
{
    @Test
    public void testCrain()
    {
        int[][] board = {{0,0,0,0,0}
        , {0,0,1,0,3}
        , {0,2,5,0,1}
        , {4,2,4,4,2}
        , {3,5,1,3,1}};
        int[] moves = {1,5,3,5,1,2,1,4};

        CrainSolution crainSolution = new CrainSolution();

        assertEquals(4, crainSolution.solution(board, moves));
    }
}