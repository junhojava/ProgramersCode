package code.programers.level.two;

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
     * 0번째 인덱스의 배열을 2번 움직이도록 순환시킨다.
     * 
     * 
     * 
     * 
     */
    Printer printer = new Printer();

    @Test
    void testShiftLotate()
    {
        int[] priorities = {2,1,3,2};

        assertEquals(new int[]{3,2,2,1}, printer.shiftLotate(priorities, 0, 2));
    }
}