package code.programers.level.one;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;

public class DartTest {
    /**
     * 다트를 세번 던져 그 점수의 합계로 실력을 겨루는 게임
     *  0<= 점수 <= 10
     * S, D, T 영역 존재 ( n^1, n^2, n^3)
     * * = n * 2
     * # = -n
     * ** = (n*2), (n-1*2)
     * *# = n*-2
     * S, D, T는 점수마다 하나씩 나온다.
     * *, #는 점수마다 둘 중 하나만 존재하거나, 하나도 존재하지 않을 수 있다.
     * 
     * 입력 영역
     * 숫자: 0~10
     * 영문자: S,D,T 
     * 특수문자: *, #
     */

    Dart dart = new Dart();
     @Test
     void testNumbers()
     {
        String input = "1S2D*3T";

        int[] numbers = dart.numbers(input);

        assertArrayEquals(new int[]{1,2,3}, numbers);
     }

     @Test
     void testcharacter()
     {
         String input = "1S2D*3T";

         String[] area = dart.character(input);

         assertArrayEquals(new String[]{"S", "D*","T"}, area);
     }

     @Test
     void testNumberCalcArea()
     {
        String input = "1S2D*3T";

        int[] numbers = dart.numbers(input);

        String[] area = dart.character(input);

        assertEquals(1, dart.calc(numbers[0], area[0]));
        assertEquals(27, dart.calc(numbers[2], area[2]));
     }

     @Test
     void testCharacterLengthTwo()
     {
        String input = "1S2D*3T";

        String[] area = dart.character(input);

        assertFalse(dart.isTwoCharacter(area[0]));
        assertTrue(dart.isTwoCharacter(area[1]));
     }

     @Test
     void testSplitTwoCharacter()
     {
        String[] character = {"S", "D*", "T"};

        String[][] area_special = new String[2][character.length];

        for(int index=0; index< character.length; index++)
        {
            if(dart.isTwoCharacter(character[index]))
            {
                area_special [0][index] = dart.splitTwoCharacter(character[index], 0, 1);
                area_special [1][index] = dart.splitTwoCharacter(character[index], 1, 2);
            }
        }

        assertEquals("D", area_special[0][1]);
        assertEquals("*", area_special[1][1]);
     }

     @Test
     void testSpecialCalc()
     {
        int number = 2;

        assertEquals(4, dart.asteriskCalc(number));
     }
     
     @Test
     void testPoundCalc()
     {
         int number = 2;

         assertEquals(-2, dart.poundClac(number));
     }
}