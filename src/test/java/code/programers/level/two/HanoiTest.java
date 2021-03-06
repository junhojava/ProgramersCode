package code.programers.level.two;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

/**
 * https://kknr-study.atlassian.net/browse/ZIGT-128
 */
public class HanoiTest
{
    Hanoi hanoi = new Hanoi();

    @Test
    void testRecursiveMove()
    {
        hanoi.move(3,1,2,3);
        assertArrayEquals(new int[][]{{1,3},{1,2},{3,2},{1,3},{2,1},{2,3},{1,3}} , hanoi.list.toArray(int[][]::new));
    }
}