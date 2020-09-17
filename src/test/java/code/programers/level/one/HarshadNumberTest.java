package code.programers.level.one;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class HarshadNumberTest {
    Average av = new Average();
    HarshadNumber hn = new HarshadNumber();
    SumNumbers sn = new SumNumbers();

    @Test
    void testModIsZero()
    {
        assertTrue(hn.modIsZero(6, 1));
    }

    @Test
    void testToString()
    {
        String number = sn.convertIntToString(123);

        assertEquals("123", number);
    }

    @Test
    void testSum()
    {
        int result = 0;
        String number= sn.convertIntToString(18);

        for(int index=0; index<number.length(); index++)
        {
            result += Integer.parseInt(number.substring(index, index+1));
        }


    }
}