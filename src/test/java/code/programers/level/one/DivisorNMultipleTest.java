package code.programers.level.one;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class DivisorNMultipleTest {
    
    DivisorNMultiple dnm = new DivisorNMultiple();

    @Test
    void testDivisorList()
    {
        List<Integer> result = new ArrayList<Integer>();

        result.add(1);
        result.add(3);

        assertEquals(result, dnm.divisorList(3));
    }

    @Test
    void testCommonDivisor()
    {
        List<Integer> three = dnm.divisorList(3);
        List<Integer> twelve = dnm.divisorList(12);

        List<Integer> result = new ArrayList<Integer>();

        result.add(1);
        result.add(3);

        assertEquals(result, dnm.commonDivisor(three, twelve));
    }

    @Test
    void testBiggestCommonDivisor()
    {
        List<Integer> three = dnm.divisorList(3);
        List<Integer> twelve = dnm.divisorList(12);
        List<Integer> commonList = dnm.commonDivisor(three, twelve);

        assertEquals(3, dnm.biggestCommonDivisor(commonList));
    }

    @Test
    void testMultipleList()
    {
        List<Integer> result = new ArrayList<Integer>();

        result.add(4);
        result.add(8);
        result.add(12);
        result.add(16);
        result.add(20);
        
        assertEquals(result, dnm.multipleList(4));
    }
}