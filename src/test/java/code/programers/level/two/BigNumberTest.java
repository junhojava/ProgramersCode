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

    @Test
    void testCaseOne()
    {
        String str= "1924";
        int start = 0;
        int number = 2;
        StringBuilder sb = new StringBuilder();

        while(number > 0)
        {
            int index= bn.bigIndex(str.substring(start, start+ (number+1)));
            
            start += index+1;

            sb.append(str.substring(start-1, start));

            number -= index;
        }

        assertEquals("94", sb.toString());
    }
}