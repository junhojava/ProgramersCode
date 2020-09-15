package code.programers.level.one;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CreateStringTest {
    CreateString cs = new CreateString();

    @Test
    void testSplit()
    {
        assertArrayEquals(new String[]{"try", "hello", "world"}, cs.split("try hello world"));
    }

    @Test
    void testChangeCase()
    {
        assertEquals("TrY", cs.changeCase("try"));
    }

    @Test
    void testCaseOne()
    {
        String[] list = new String[]{"try", "hello", "world"};
        String answer = "";

        for(int index=0; index<list.length; index++)
        {
            answer += cs.changeCase(list[index])+ " ";
        }

        answer = answer.substring(0, answer.length()-1);

        assertEquals("TrY HeLlO WoRlD", answer);
    }
}