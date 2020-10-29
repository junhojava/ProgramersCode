package code.programers.level.two;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class JadenCaseTest
{
    JadenCase jc = new JadenCase();

    @Test
    void testSplit()
    {
        String str = "asdf zxcv qwer";
        String[] result = str.split(" ");
        assertArrayEquals(new String[]{"asdf", "zxcv", "qwer"}, result);
    }

    @Test
    void testToUpperCase()
    {
        String str = "3asdf zxcv qwer";
        String[] result = str.split(" ");
        StringBuilder sb = new StringBuilder();

        for(String word: result)
        {
            sb.append(word.substring(0,1).toUpperCase());
            sb.append(word.substring(1,word.length()).toLowerCase()+" ");
        }
        sb.delete(sb.length()-1, sb.length());

        assertEquals("3asdf Zxcv Qwer", sb.toString());
    }
}