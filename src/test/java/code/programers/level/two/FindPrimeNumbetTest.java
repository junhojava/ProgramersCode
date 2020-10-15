package code.programers.level.two;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

import code.programers.level.one.PrimeNumber;

public class FindPrimeNumbetTest {
    
    PrimeNumber pn = new PrimeNumber();
    BiggestNumber bn = new BiggestNumber();

    @Test
    void testSplitOne()
    {
        int[] array = new int[]{1,3,7};

        int[] result = FindPrimeNumber.split(array, 1);

        assertArrayEquals(new int[]{1,3,7}, result);
    }
}