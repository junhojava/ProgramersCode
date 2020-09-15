package code.programers.level.one;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CaesarCipherTest {
    
    CaesarCipher cc = new CaesarCipher();

    @Test
    void isAlphabet()
    {
        assertTrue(cc.isAlphabet(" "));
    }
}