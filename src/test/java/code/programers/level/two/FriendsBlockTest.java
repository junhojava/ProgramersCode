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
}