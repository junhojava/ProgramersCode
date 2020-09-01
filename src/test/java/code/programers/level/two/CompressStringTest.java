package code.programers.level.two;

import org.junit.jupiter.api.Test;

public class CompressStringTest {

    CompressString compressString = new CompressString();

    @Test
    void testFirstCharacterDuiplication()
    {
        String s= "xasdfasdf";
        
        assertFalse(compressString.firstCharacterDuiplication(s));
        
    }
}