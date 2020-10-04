package code.programers.level.two;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BigNumberTest {

    BigNumber bn = new BigNumber();

    @Test
    void testBigIndex()
    {
        int index = bn.bigIndex("192");

        assertEquals(1, index);
    }
}