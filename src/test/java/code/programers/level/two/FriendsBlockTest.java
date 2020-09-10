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
    void testDown()
    {
        String[] board= {"CCBDE", "AAADE", "AAABF", "CCBBF"};
        fb.blocks = new String[4][5];

        fb.toArray(board, 4, 5);

        fb.blocks[1][0] = "";
        fb.blocks[1][1] = "";
        fb.blocks[1][2] = "";
        fb.blocks[2][0] = "";
        fb.blocks[2][1] = "";
        fb.blocks[2][2] = "";
        
        fb.down(4, 5);

        assertArrayEquals(new String[][]{{"", "", "", "D", "E"}, {"", "", "", "D", "E"}, {"C", "C", "B", "B", "F"}, {"C", "C", "B", "B", "F"}}, fb.blocks);
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
}