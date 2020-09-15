package code.programers.level.one;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CaesarCipherTest {
    
    CaesarCipher cc = new CaesarCipher();

    @Test
    void testIsAlphabet()
    {
        assertTrue(cc.isAlphabet(" "));
    }

    @Test
    void testAIsLowCase()
    {
        assertTrue(cc.isLowCase("A"));
    }

    @Test
    void testShiftString()
    {
        assertEquals("b", cc.shift("a", 1));
    }
}