package code.programers.level.two;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class PrinterTest {
    /**
     * 중요도의 값이 높을수록 중요하다.
     * 나의 문서 location
     * 문서 중요도 정보 priorities
     * 내 문서의 인쇄 순번 return
     * 
     * • 테스트 목록
     * 제일 큰 숫자가 몇번째 인덱스에 존재하는지 확인하기
     * 
     * 2번을 선입선출 이동하면 어떻게 변하는지 확인하기
     * {0,1,2,3}
     * 
     * {2,3,0,1}
     * 
     * 4번째위치 출력
     * 1,1,9,1,8,1
     * 
     * ↓
     * 1,9,1,8(v),1,1
     * ↓
     * 1,1,9,1,8(v),1
     * ↓(출력)
     * 9,1,8(v),1,1,1
     *   ↓(출력)
     * 9,8(v),1,1,1,1
     * 
     * 0번째 위치 출력
     * ↓
     * 1,9,1,8,1,1(v)
     * ↓(출력)
     * 9,1,8,1,1(v),1
     *   ↓(출력)
     * 9,8,1,1(v),1,1
     *     ↓(출력)
     * 9,8,1,1(v),1,1
     *       ↓(출력)
     * 9,8,1,1(v),1,1
     */
    Printer printer = new Printer();

    @Test
    void testMaxIndex()
    {
        int[] priorities = {2,1,3,2};

        assertEquals(2, printer.maxIndex(priorities));
    }

    @Test
    void testCaseOne()
    {
        int[] priorities = {2,1,3,2};

        int max_index = printer.maxIndex(priorities);
        
        int result = printer.calcShiftedIndex(2, max_index, priorities.length);
    
        assertEquals(1, result);
    }

    @Test
    void testCaseTwo()
    {
        int[] priorities = {1,1,9,1,1,1};

        int max_index = printer.maxIndex(priorities);
        
        int result = printer.calcShiftedIndex(0, max_index, priorities.length);
    
        assertEquals(5, result);
    }

    @Test
    void testCaseThree()
    {
        int[] priorities = {1,2,3,4,5,6,7,8,9,1,2,3,4};

        int max_index = printer.maxIndex(priorities);
        
        int result = printer.calcShiftedIndex(7, max_index, priorities.length);
    
        assertEquals(result, 13);
    }

    @Test
    void testCaseFour()
    {
        int[] priorities = {1,5,4,1,8,2,8,2};

        int max_index = printer.maxIndex(priorities);

        int result = printer.calcShiftedIndex(0, max_index, priorities.length);

        assertEquals(5, result);
    }

    @Test
    void testShiftArray()
    {
        int[] priorities = {1,1,9,1,8,1};

        int[] result = printer.shiftList(priorities, 2);

        assertArrayEquals(new int[]{9,1,8,1,1,1}, result);
    }

    @Test
    void testFirstOutArray()
    {
        int[] priorities= {9,1,8,1,1,1};

        int[] result = printer.firstOutList(priorities);

        assertArrayEquals(new int[]{1,8,1,1,1}, result);
    }

    @Test
    void testIsMaxValue()
    {
        int[] priorities = {9,1,8,1,1,1};

        assertFalse(printer.isMaxValue(priorities, 1));
        assertTrue(printer.isMaxValue(priorities, 9));
    }

    @Test
    void testMyCaseOne()
    {
        int[] priorities = {1,1,9,8,8,1,1};
        int[] locations = new int[]{0,1,2,3,4,5,6};

        int location = 4;
        boolean flag = true;
        int value = priorities[location];
        int count = 0;

        while(flag)
        {
            int max_index = printer.maxIndex(priorities);

            if(printer.isMaxValue(priorities, value))
            {
                if(locations[max_index] == location)
                {
                    flag = false;
                }
                else
                {
                    printer.shiftList(priorities, max_index);
                    printer.shiftList(locations, max_index);

                    priorities= printer.firstOutList(priorities);
                    locations= printer.firstOutList(locations);
                    count++;
                }
            }
            else
            {
                printer.shiftList(priorities, max_index);
                printer.shiftList(locations, max_index);

                priorities= printer.firstOutList(priorities);
                locations= printer.firstOutList(locations);
                count++;
            }
        }
        assertEquals(2, count);
    }
}