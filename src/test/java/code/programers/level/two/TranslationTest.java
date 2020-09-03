package code.programers.level.two;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
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
     * 
     * 
     * if(isEmpty(input));
     * 
     * u == 균형잡힌 괄호 문자열?
     * v == 빈 문자열?
     * 
     * u == 올바른 괄호 문자열
     * 
     * while(!(v.length() == 0))
     *     if(isEmpty(v))
     *     
     * 
     * ※ 균형잡힌 괄호 문자열의 예시
     *    () 혹은 )(
     * 
     * 
     * ※ 입출력 예 2
     *  s= ")("
     * 
     *  s는 균형잡힌 괄호 문자열
     * 
     * 1. s는 빈 문자열이 아닙니다.
     * 2. u = ")(", v = ""
     * 3. u는 올바른 문자열이 아닙니다.
     * 4. 빈문자열 "("
     * 5. 문자열 v는 비었습니다.
     * 6. 빈문자열이었던 "("에 ")"를 붙입니다.
     * 7. u의 첫번째와 마지막을 제거합니다. u = ""
     * 8. 나머지 괄호 방향을 바꿉니다. u = ""
     * 9. "("+ "" + ")"+ ""
     * 10. "()"
     * 
     * ※ 입출력 예 3
     * s = "()))((()"
     * 
     * s는 균형잡힌 괄호 문자열
     * 
     * 1. s는 빈 문자열이 아닙니다.
     * 2. u= "()" v="))((()"
     * 3. u는 올바른 괄호 문자열입니다.
     * 4. v에 대해 1단계부터 다시 수행합니다.
     * 5. v는 빈 문자열이 아닙니다.
     * 6. u="))((", v="()"
     * 7. u는 올바른 괄호 문자열이 아닙니다.
     * 8. 빈 문자열에 첫번째 문자로 "("를 붙입니다.
     * 9. v에 대해 1단계를 수행합니다.
     * 10. v는 빈 문자열이 아닙니다.
     * 11. u="()" v는 =""
     * 12. u는 올바른 괄호 문자열입니다.
     * 13. v는 빈 문자열입니다.
     * 14. 빈 문자열은 "("+ "()"이 됩니다.
     * 15. 빈 문자열에 ")"를 붙입니다. "("+ "()"+ ")"가 됩니다.
     * 16. u의 첫 번째와 마지막 문자를 제거합니다. u=")("
     * 17. u의 괄호방향을 바꿉니다. u="()"
     * 18. 빈 문자열에 더합니다. "("+ "()" + ")" + "()"
     * 19. 생성된 문자열을 반환합니다. "(())()"
     * 20. "()"+ "(())()"이 됩니다.
     * 
     * ※ 입출력 예 4
     * s = "))((()))((()"
     * 
     * 1. s는 빈 문자열이 아닙니다.
     * 2. u="))((" v = "()))((()"
     * 3. u는 올바른 괄호 문자열이 아닙니다.
     * 4. 빈 문자열에 첫번째 문자로 "("를 붙입니다.
     * 5. v에 대해 1단계를 수행합니다.
     * 6. v는 빈 문자열이 아닙니다.
     * 7. u= "()" v = "))((()"
     * 8. .. "()"+ "(())()"이 됩니다.
     * 9. 빈 문자열은 "("+ "()(())()"이 됩니다.
     * 10. u의 첫번째와 마지막 문자를 제거합니다. u ="()"
     * 11. 빈 문자열에 ")"를 더합니다. 
     * 12. "("+ "()(())()" + ")" + "()"
     * 13. "(()(())())()"
     * 
     */
    Translation ts = new Translation();

    @Test
    void testBalnacedString()
    {
        assertTrue(ts.isBalance("()(())"));
    }

    @Test
    void testIsEmptyString()
    {
        assertTrue(ts.isEmpty(""));
    }

    @Test
    void testIsRight()
    {
        assertFalse(ts.isRight(")("));
    }

    @Test
    void testReverseString()
    {
        assertEquals("(())", ts.reverseString("))(("));
    }

    @Test
    void testCaseTwo()
    {
        String s = ")(";

        s= ts.solution(s);

        assertEquals("()", s);
    }

    @Test
    void testCaseThree()
    {
        String s = "()))((()";

        s= ts.solution(s);

        assertEquals("()(())()", s);
    }
}