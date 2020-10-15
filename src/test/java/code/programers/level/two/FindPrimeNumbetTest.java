package code.programers.level.two;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FindPrimeNumbetTest {

    @Test
    void testCaseOne()
    {
        FindPrimeNumber fpn = new FindPrimeNumber();

        int[] array = new int[]{0,1,1};

        int count = fpn.solution(array);

        assertEquals(2, count);
    }

    @Test
    void testCaseTwo()
    {
        FindPrimeNumber fpn = new FindPrimeNumber();

        int[] array = new int[]{1,7};

        int count = fpn.solution(array);

        assertEquals(3, count);
    }
}