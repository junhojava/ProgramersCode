package code.programers.level.one;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class StringConvertNumberTest {
    
    StringConvertNumber scn = new StringConvertNumber();

    @Test
    void testFirstCharacter()
    {
        assertTrue(scn.existMinus("-1234"));
    }

    @Test
    void testExtractNumber()
    {
        assertEquals(1234, scn.extractNumber("-1234"));
    }
}