package code.programers.level.two;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CompressStringTest {

    /**
     * aabbaccc(8) = (aa)(bb)(a)(ccc) = 2a2ba3c(7)
     * ababcdcdababcdcd(16) = (ababcdcd)(ababcdcd) = 2ababcdcd(9)
     * abcabcdede(10) = (abcabc)dede = 2abcdede(8)
     * abcabcabcabcdededededede(24) = (abcabc)(abcabc)(dedede)(dedede) = 2abcabc2dedede (14)
     * xababcdcdababcdcd(17) = xababcdcdababcdcd(17)
     */
    CompressString compressString = new CompressString();

    @Test
    void testOnly()
    {
        String s= "xababcdcdababcdcd";

        assertTrue(compressString.only(s, s.substring(0, 1)));
    }

    @Test
    void testRemain()
    {
        String s = "asdf";

        assertTrue(compressString.remained(s.length(), 3));
    }

    @Test
    void testEqualsString()
    {
        String s = "aa";

        assertFalse(compressString.equalsString(s, "ab"));
        assertTrue(compressString.equalsString(s, "aa"));
    }

    @Test
    void testSplietdList()
    {
        String s = "aaabbccc";

        assertArrayEquals(new String[]{"aaa", "bbc", "cc"}, compressString.splitedList(s, 3));
    }

    @Test
    void testConcatList()
    {
        String[] list = {"aaa", "bbc"};

        assertArrayEquals(new String[]{"aaa", "bbc", "cc"}, compressString.concatList(list, "cc"));
    }

    @Test
    void testCaseOne()
    {
        String s= "aabbaccc";
        String result = "";

        if(compressString.only(s, "a"))
        {
            assertTrue(true);
        }
        else
        {
            String[] list = compressString.splitedList(s, 1);

            int count = 1;
            for(int index=0; index+1<list.length; index++)
            {
                String crnt = list[index];
                String next = list[index+1];
                if(compressString.equalsString(crnt, next))
                {
                    count++;
                }
                else
                {
                    result = compressString.concatString(result, crnt, count);

                    list[index] = "";
                    count = 1;
                }
            }

            if(!compressString.equalsString(list[list.length-1], ""))
            {
                result = compressString.concatString(result, list[list.length-1], count);
            }

            System.out.println(result);
            assertEquals(7, result.length());
        }
    }

    @Test
    void testCaseTwo()
    {
        String s= "ababcdcdababcdcd";
        String result = "";

        if(compressString.only(s, "a"))
        {
            assertTrue(true);
        }
        else
        {
            String[] list = compressString.splitedList(s, 8);
            list = compressString.concatList(list, "ababcdcd");

            int count = 1;
            for(int index=0; index+1<list.length; index++)
            {
                String crnt = list[index];
                String next = list[index+1];
                if(compressString.equalsString(crnt, next))
                {
                    count++;
                }
                else
                {
                    result = compressString.concatString(result, crnt, count);

                    count = 1;
                }
                list[index] = "";
            }

            if(!compressString.equalsString(list[list.length-1], ""))
            {
                result = compressString.concatString(result, list[list.length-1], count);
            }

            System.out.println(result);
            assertEquals(9, result.length());
        }
    }

    @Test
    void testTwoSplitedList()
    {
        String s = "ababcdcdababcdcd";

        String[] list = compressString.splitedList(s, 3);

        assertArrayEquals(new String[]{"aba", "bcd", "cda", "bab", "cdc", "d"}, list);
    }

    @Test
    void testConcatString()
    {
        String s = "2a2ba";
        assertEquals("2a2ba2c", compressString.concatString(s, "c", 2));
    }

    @Test
    void testCaseThree()
    {
        String s= "abcabcdede";
        String result = "";

        if(compressString.only(s, "a"))
        {
            assertTrue(true);
        }
        else
        {
            String[] list = compressString.splitedList(s, 3);

            int count = 1;
            for(int index=0; index+1<list.length; index++)
            {
                String crnt = list[index];
                String next = list[index+1];
                if(compressString.equalsString(crnt, next))
                {
                    count++;
                }
                else
                {
                    result = compressString.concatString(result, crnt, count);

                    count = 1;
                }
                list[index] = "";
            }

            if(!compressString.equalsString(list[list.length-1], ""))
            {
                result = compressString.concatString(result, list[list.length-1], count);
            }

            System.out.println(result);
            assertEquals(8, result.length());
        }
    }

    @Test
    void testCaseFour()
    {
        String s= "ababcdcdababcdcd";
        int answer = 1000;
        String result = "";

        if(compressString.only(s, s.substring(0,1)))
        {
            answer= s.length();
        }
        else
        {
            for(int index=1; index< s.length()/2 + 1; index++)
            {
                result = compressString.compresString(s, index);

                if(answer > result.length())
                {
                    answer = result.length();
                }
            }
        }

        assertEquals(9, answer);
    }

    @Test
    void testCaseFive()
    {
        String s= "ababcdcdababcdcd";

        assertEquals(9, compressString.solution(s));
    }

    @Test
    void testEqualsListToString()
    {
        String s= "abcabcabcabcdededededede";

        String[] list = compressString.splitedList(s, 4);

        assertEquals(s, compressString.listToString(list));
    }
}