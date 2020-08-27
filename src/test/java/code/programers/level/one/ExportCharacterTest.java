package code.programers.level.one;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class ExportCharacterTest {
    
    /**
     * 문자열의 가운데 글자를 반환하는 하시오.
     * 문자열의 길이
     * 홀수 = 1개의 문자를 나타냄
     * 짝수 = 2개의 문자열을 나타냄
     * 
     * 1 <= 문자열의 길이 <= 100
     */

    ExportCharacter exportCharacter = new ExportCharacter();

     @Test
     public void testIsEven()
     {
        boolean result = exportCharacter.isEven("solution".length());

        assertTrue(result);
     }
}