package code.programers.level.one;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CreateStringTest {
    CreateString cs = new CreateString();

    @Test
    void testSplit()
    {
        String[] result = cs.split("");
        assertArrayEquals(new String[]{" ", " ", "aa ", " "}, cs.split("  aa  "));
    }

    @Test
    void testChangeCase()
    {
        assertEquals("TrY", cs.changeCase("try"));
    }

    @Test
    void testCaseOne()
    {
        String[] list = cs.split("__tRY HeLlO woRlD StRyS___");
        String answer = "";

        for(int index=0; index<list.length; index++)
        {
            answer += cs.changeCase(list[index]);
        }

        assertEquals("__TrY HeLlO WoRlD StRyS___", answer);
    }

    @Test
    void testCaseTwo()
    {
        String s = "  aa  ";
        String[] list = cs.split(s);
        String answer = "";

        for(int index=0; index<list.length; index++)
        {
            answer += cs.changeCase(list[index]);
        }


        if(answer.length() > s.length())
            answer = answer.substring(0, s.length());
        else
            answer = answer;

        assertEquals("  Aa  ", answer);
    }
}