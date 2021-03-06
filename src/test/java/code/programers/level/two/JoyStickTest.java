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

    @Test
    void testCaseOne()
    {
        String str = "JAZ";
        StringBuilder sb = new StringBuilder(str);

        js.create(str.length());

        int command = js.vertical(str);

        int position = 0;
        sb.replace(position, position+1, "A");
        while(!sb.toString().equals(js.word))
        {
            int[] distance = js.distance(sb.toString(), position);

            command += distance[0];
            position = distance[1];
            sb.replace(position, position+1, "A");
        }

        assertEquals(11, command);
    }

    @Test
    void testCaseTwo()
    {
        String str = "JEROEN";
        StringBuilder sb = new StringBuilder(str);

        js.create(str.length());

        int command = js.vertical(str);

        int position = 0;
        sb.replace(position, position+1, "A");
        while(!sb.toString().equals(js.word))
        {
            int[] distance = js.distance(sb.toString(), position);

            command += distance[0];
            position = distance[1];
            sb.replace(position, position+1, "A");
        }

        assertEquals(56, command);
    }

    @Test
    void testCaseThree()
    {
        String str = "JAN";
        StringBuilder sb = new StringBuilder(str);

        js.create(str.length());

        int command = js.vertical(str);

        int position = 0;
        sb.replace(position, position+1, "A");
        while(!sb.toString().equals(js.word))
        {
            int[] distance = js.distance(sb.toString(), position);

            command += distance[0];
            position = distance[1];
            sb.replace(position, position+1, "A");
        }

        assertEquals(23, command);
    }

    @Test
    void testCaseFour()
    {
        String str = "JAAAZAAZAA";
        StringBuilder sb = new StringBuilder(str);

        js.create(str.length());

        int command = js.vertical(str);

        int position = 0;
        sb.replace(position, position+1, "A");
        while(!sb.toString().equals(js.word))
        {
            int[] distance = js.distance(sb.toString(), position);

            command += distance[0];
            position = distance[1];
            sb.replace(position, position+1, "A");
        }

        assertEquals(17, command);
    
    }
    @Test
    void testCaseFive()
    {
        String str = "BBBAAAB";
        StringBuilder sb = new StringBuilder(str);

        js.create(str.length());

        int command = js.vertical(str);

        int position = 0;
        sb.replace(position, position+1, "A");
        while(!sb.toString().equals(js.word))
        {
            int[] distance = js.distance(sb.toString(), position);

            command += distance[0];
            position = distance[1];
            sb.replace(position, position+1, "A");
        }

        assertEquals(9, command);
    }
    @Test
    void testCaseSix()
    {
        String str = "ABABAAAAABA";
        StringBuilder sb = new StringBuilder(str);

        js.create(str.length());

        int command = js.vertical(str);

        int position = 0;
        sb.replace(position, position+1, "A");
        while(!sb.toString().equals(js.word))
        {
            int[] distance = js.distance(sb.toString(), position);

            command += distance[0];
            position = distance[1];
            sb.replace(position, position+1, "A");
        }

        assertEquals(11, command);
    }
}