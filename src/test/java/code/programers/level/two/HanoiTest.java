package code.programers.level.two;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * https://kknr-study.atlassian.net/browse/ZIGT-123
 */
public class HanoiTest
{
    Hanoi hanoi = new Hanoi();

    @Test
    void testRing()
    {
        hanoi.setRing(2);
        assertEquals(2, hanoi.ring);
    }
}