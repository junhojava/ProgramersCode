package code.programers.level.two;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import java.util.Map;

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
}