package code.programers.level.one;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

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
     void testArea()
     {
         String input = "1S2D*3T";

         String[] area = dart.area(input);

         assertArrayEquals(new String[]{"S", "D","T"}, area);
     }

     @Test
     void testSpecial()
     {
         String input = "1S2D*3T";

         String[] area = dart.special(input);

         assertArrayEquals(new String[]{"S", "D*","T"}, area);
     }
}