package code.programers.level.two;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class BiggestNumberTest {

    BiggestNumber bn = new BiggestNumber();


    @Test
    void testPermutation()
    {
        int[] array = {0123, 0132, 0213, 0231, 0312, 0321};

        int[] result = bn.permutation();

        assertArrayEquals(array, result);
    }
}