package code.programers.level.two;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

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
        
        int result = printer.calcShiftedIndex(0, max_index, priorities.length);
    
        assertEquals(result, 2);
    }

    @Test
    void testCaseTwo()
    {
        int[] priorities = {1,1,9,1,1,1};

        int max_index = printer.maxIndex(priorities);
        
        int result = printer.calcShiftedIndex(0, max_index, priorities.length);
    
        assertEquals(result, 4);
    }
}