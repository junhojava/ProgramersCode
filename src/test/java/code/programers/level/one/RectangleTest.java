package code.programers.level.one;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class RectangleTest {

    @Test
    void testLastPoint()
    {
        int[][] three_point = {{1,4}, {3,4}, {3,10}};

        Rectangle rect = new Rectangle();

        assertArrayEquals(new int[]{1,10}, rect.solution(three_point));
    }

    @Test
    void testCaseTwo()
    {
        int[][] three_point = {{1,1}, {2,2}, {1,2}};

        Rectangle rect = new Rectangle();

        assertArrayEquals(new int[]{2,1}, rect.solution(three_point));
    }
}