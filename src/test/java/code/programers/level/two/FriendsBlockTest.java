package code.programers.level.two;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class FriendsBlockTest {
    FriendsBlock fb = new FriendsBlock();

    @Test
    void testToArray()
    {
        String[] board= {"CCBDE", "AAADE", "AAABF", "CCBBF"};

        String[][] result = fb.toArray(board);

        assertArrayEquals(new String[][]{{"C", "C", "B", "D", "E"}, {"A", "A", "A", "D", "E"}, {"A", "A", "A", "B", "F"}, {"C", "C", "B", "B", "F"}}, result);
    }

    @Test
    void testDown()
    {
        String[] board= {"CCBDE", "AAADE", "AAABF", "CCBBF"};

        String[][] result = fb.toArray(board);

        result[1][0] = null;
        result[1][1] = null;
        result[1][2] = null;
        result[2][0] = null;
        result[2][1] = null;
        result[2][2] = null;
        
        result = fb.down(result);

        assertArrayEquals(new String[][]{{null, null, null, "D", "E"}, {null, null, null, "D", "E"}, {"C", "C", "B", "B", "F"}, {"C", "C", "B", "B", "F"}}, result);
    }
}