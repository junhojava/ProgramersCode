package code.programers.level.one;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class KnightTest {
    /**
     * 8x8 좌표
     * L자 형태로만 이동할 수 있음.
     * 행은 1~8
     * 열은 a~h
     * 
     * 경우의 수를 출력하는 프로그램을 작성하시오
     * 
     * a1일 경우 움직일 수 있는 경우의 수
     * c2 b3
     * 
     * c2일 경우 움직일 수 있는 경우의 수
     * a1 e1 a3 e3 b4 d4
     * 
     * g2일 경우 움직일 수 있는 경우의 수
     * e1 e3 h4 f4
     */

     String column = "abcdefgh";
     String row = "12345678";

     @Test
     void test()
     {
         String point = "g2";
         int count = 0;

         String pc = point.substring(0,1);
         String pr = point.substring(1,2);
         
         int pc_index= column.indexOf(pc);
         int pr_index= row.indexOf(pr);

         if(pc_index-2 >=0)
         {
            if(pr_index-1>= 0)
            {
                count++;
            }
            if(pr_index+1 <row.length())
            {
                count++;
            }
         }
         if(pc_index+2 <column.length())
         {
            if(pr_index-1>= 0)
            {
                count++;
            }
            if(pr_index+1 <row.length())
            {
                count++;
            }
         }

         if(pr_index-2 >=0)
         {
            if(pc_index-1>= 0)
            {
                count++;
            }
            if(pc_index+1 <column.length())
            {
                count++;
            }
         }

         if(pr_index+2 <row.length())
         {
            if(pc_index-1>= 0)
            {
                count++;
            }
            if(pc_index+1 <column.length())
            {
                count++;
            }
         }

         assertEquals(6, count);
     }
}