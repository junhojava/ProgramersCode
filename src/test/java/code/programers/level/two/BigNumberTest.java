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

        if(start < str.length())
            sb.append(str.substring(start , str.length()));

        assertEquals("94", sb.toString());
    }

    @Test
    void testCaseTwo()
    {
        String str= "1231234";
        int start = 0;
        int number = 3;
        StringBuilder sb = new StringBuilder();

        while(number > 0)
        {
            int index= bn.bigIndex(str.substring(start, start+ (number+1)));
            
            start += index+1;

            sb.append(str.substring(start-1, start));

            number -= index;
        }

        if(start < str.length())
            sb.append(str.substring(start , str.length()));

        assertEquals("3234", sb.toString());
    }

    @Test
    void testCaseThree()
    {
        String str= "4177252841";
        int start = 0;
        int number = 4;
        StringBuilder sb = new StringBuilder();

        while(number > 0)
        {
            int index= 0;
            try
            {
                index = bn.bigIndex(str.substring(start, start+ (number+1)));
            }
            catch (Exception e)
            {
                //TODO: handle exception
                start = str.length();
                break;
            }
            
            start += index+1;

            sb.append(str.substring(start-1, start));

            number -= index;
        }

        if(start < str.length())
            sb.append(str.substring(start , str.length()));

        assertEquals("775841", sb.toString());
    }

    @Test
    void testCaseTwoelve()
    {
        String str= "111119";
        int start = 0;
        int number = 3;
        StringBuilder sb = new StringBuilder();

        while(number > 0)
        {
            int index= 0;
            try
            {
                index = bn.bigIndex(str.substring(start, start+ (number+1)));
            }
            catch (Exception e)
            {
                //TODO: handle exception
                start = str.length();
                break;
            }
            
            start += index+1;

            sb.append(str.substring(start-1, start));

            number -= index;
        }

        if(start < str.length())
            sb.append(str.substring(start , str.length()));

        assertEquals("119", sb.toString());
    }
}