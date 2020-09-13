package code.programers.level.one;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class MockExamTest {

    MockExam me = new MockExam();

    @Test
    void testIndex()
    {
        int one = me.index(17, 8);

        assertEquals(1, one);
    }

    @Test
    void testIsHit()
    {
        boolean one = me.isHit(1, 1);

        assertTrue(one);
    }

    @Test
    void testRank()
    {
        int[] rank = {2, 0, 0};

        int[] top = me.top(rank);

        assertArrayEquals(new int[]{1}, top);
    }

    @Test
    void testTopThree()
    {
        int[] rank = {2, 2, 2};

        int[] top = me.top(rank);

        assertArrayEquals(new int[]{1,2,3}, top);
    }

    @Test
    void testCaseOne()
    {
        int[][] testers = {{1,2,3,4,5},{2,1,2,3,2,4,2,5},{3,3,1,1,2,2,4,4,5,5}};
        int[] answers = {1,2,3,4,5};
        int[] scores = {0,0,0};

        for(int number=0; number< answers.length; number++)
        {
            for(int tester=0; tester<3; tester++)
            {
                int index = me.index(number, testers[tester].length );

                if(me.isHit(answers[number], testers[tester][index]))
                {
                    scores[tester]++;
                }
            }
        }

        int[] top = me.top(scores);

        assertArrayEquals(new int[]{1,}, top);
    }
}