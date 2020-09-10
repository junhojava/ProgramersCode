package code.programers.level.two;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FriendsBlockTest {
    FriendsBlock fb = new FriendsBlock();

    @Test
    void testToArray()
    {
        String[] board= {"CCBDE", "AAADE", "AAABF", "CCBBF"};
        fb.blocks = new String[4][5];

        fb.toArray(board, 4, 5);

        assertArrayEquals(new String[][]{{"C", "C", "B", "D", "E"}, {"A", "A", "A", "D", "E"}, {"A", "A", "A", "B", "F"}, {"C", "C", "B", "B", "F"}}, fb.blocks);
    }

    @Test
    void testIsHit()
    {
        String[] board= {"CCBDE", "AAADE", "AAABF", "CCBBF"};
        fb.blocks = new String[4][5];

        fb.toArray(board, 4, 5);

        int hit = fb.isHit(3, 4);

        assertEquals(6, hit);
    }

    @Test
    void testCaseOne()
    {
        String[] board= {"CCBDE", "AAADE", "AAABF", "CCBBF"};
        int result = 0;
        fb.blocks = new String[4][5];
        
        fb.toArray(board, 4, 5);
        
        int flag = fb.isHit(3, 4);
        while(flag != 0)
        {
            result += flag;
            fb.down(4, 5);

            flag = fb.isHit(3, 4);
        }

        assertEquals(14, result);
    }

    @Test
    void testCaseTwo()
    {
        String[] board= {"TTTANT", "RRFACC", "RRRFCC", "TRRRAA", "TTMMMF", "TMMTTJ"};
        int result = 0;
        fb.blocks = new String[6][6];
        
        fb.toArray(board, 6, 6);
        
        int flag = fb.isHit(5, 5);
        while(flag != 0)
        {
            result += flag;
            fb.down(6, 6);
            flag = fb.isHit(5, 5);
        }

        assertEquals(15, result);
    }

    @Test
    void testCaseThree()
    {
        String[] board = {"AAAAAA", "BBAATB", "BBAATB", "JJJTAA", "JJJTAA"};

        int result = 0;
        fb.blocks = new String[5][6];
        
        fb.toArray(board, 5, 6);
        
        int flag = fb.isHit(4, 5);
        while(flag != 0)
        {
            result += flag;
            fb.down(5, 6);
            flag = fb.isHit(4, 5);
        }

        assertEquals(24, result);
    }
}