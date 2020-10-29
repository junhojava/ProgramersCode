package code.programers.level.two;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

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
}