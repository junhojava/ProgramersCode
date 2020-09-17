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
}