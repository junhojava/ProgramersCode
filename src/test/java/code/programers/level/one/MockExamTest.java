package code.programers.level.one;

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
}