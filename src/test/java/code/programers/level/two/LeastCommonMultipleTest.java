package code.programers.level.two;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.jupiter.api.Test;

public class LeastCommonMultipleTest
{
    @Test
    void testFactorization()
    {
        LeastCommonMultiple lcm = new LeastCommonMultiple();

        lcm.factorization(10);

        Map<Integer, Integer> map = new HashMap<>();

        map.put(2,1);
        map.put(5,1);

        assertEquals(map, lcm.map);
    }

    @Test
    void testCaseOne()
    {
        int result = 1;
        LeastCommonMultiple lcm = new LeastCommonMultiple();

        lcm.factorization(10);
        lcm.factorization(14);
        
        for(Entry<Integer, Integer> entry: lcm.map.entrySet())
            result *= Math.pow(entry.getKey(), entry.getValue());

        assertEquals(result, 70);


    }
}