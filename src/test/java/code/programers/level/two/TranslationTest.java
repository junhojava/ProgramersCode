package code.programers.level.two;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class TranslationTest {
    /**
     * (와 )로만 이루어진 문자열이 있을 경우
     * ( ) 의 개수가 같다면 균형잡힌 괄호 문자열
     * ( ) 의 괄호의 짝도 모두 맞을 경우 올바른 괄호 문자열
     * (()))( == 균형잡힌 괄호 문자열 , != 올바른 괄호 문자열
     * 
     * (())() == 균형잡힌 괄호 문자열 , == 올바른 괄호 문자열
     */
    Translation ts = new Translation();

    @Test
    void testBalnacedString()
    {
        assertTrue(ts.isBalance("()"));
    }
}