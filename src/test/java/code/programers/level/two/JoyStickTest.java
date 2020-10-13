package code.programers.level.two;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class JoyStickTest
{
    JoyStick js = new JoyStick();

    @Test
    void testCreateWord()
    {
        js.create(3);

        assertEquals("AAA", js.word);
    }

    @Test
    void testUpDownCommand()
    {
        js.create(3);

        int vertical = js.vertical("JAZ");

        assertEquals(10, vertical);
    }

    @Test
    void testLeftRightDistance()
    {
        int[] distance = js.distance("AAAAZAAAAA", 7);

        assertArrayEquals(new int[]{3, 4}, distance);
    }
}