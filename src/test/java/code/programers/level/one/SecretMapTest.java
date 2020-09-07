package code.programers.level.one;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

public class SecretMapTest {
    SecretMap sm = new SecretMap();

    @Test
    void testTwoSqrt()
    {
        int number = sm.sqrt(2, 5);

        assertEquals(32, number);
    }

    @Test
    void testFillMap()
    {
        String one = " #   ";
        String two = "# # #";

        String result = sm.fill(one, two, 5);

        assertEquals("### #", result);
    }

    @Test
    void testConvertMap()
    {
        String result = "";
        int max = sm.sqrt(2,4);
        int number = 9;
        
        result = sm.convert(max, number);

        assertEquals(" #  #", result);
    }

    @Test
    void testCaseOne()
    {
        int n = 5;
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};
        String[] result = new String[n];

        int max = sm.sqrt(2, n-1);
        for(int index=0; index<n; index++)
        {
            String str1 = sm.convert(max, arr1[index]);
            String str2 = sm.convert(max, arr2[index]);

            String fill = sm.fill(str1, str2, n);
            result[index] = fill;
        }

        assertArrayEquals(new String[]{"#####","# # #", "### #", "#  ##", "#####"}, result);
    }
}