package code.programers.level.two;

import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

public class CompressStringTest {

    CompressString compressString = new CompressString();

    @Test
    void testFirstCharacterDuiplication()
    {
        String s= "xasdfasdf";

        assertFalse(compressString.firstCharacterDuplication(s));
    }
}