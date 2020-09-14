package code.programers.level.one;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class GymClothTest {
    
    GymCloth gc = new GymCloth();

    @Test
    void testIsSelf()
    {
        assertEquals(1, gc.who(new int[]{2,3,4}, 3));
    }

    @Test
    void testWho()
    {
        assertArrayEquals(new int[] {2,4}, gc.canRent(3));
    }
}