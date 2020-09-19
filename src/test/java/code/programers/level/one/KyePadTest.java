package code.programers.level.one;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class KyePadTest {
    
    /**
     * 1 2 3
     * 4 5 6
     * 7 8 9
     * * 0 #
     * 
     * list[][]
     * [0] = [1, 2, 3]
     * [1] = [4, 5, 6]
     * [2] = [7, 8, 9]
     * [3] = [*, 0, #]
     * 
     * 1에서 5는
     * 절대값(0-1) + 절대값(0-1) = 2
     * [0][0] ~ [1][1] = 2
     * 3에서 5는
     * 절대값(0-1) + 절대값(2-1) = 2
     * [0][2] ~ [1][1] = 2
     * 
     * 1에서 8은
     * 절대값(0-2) + 절대값(0-1) = 3
     * [0][0] ~ [2][1] = 3
     */


    KeyPad kp = new KeyPad();

    @Test
    void testDistance()
    {
        assertEquals(2, kp.distance(1,5));
    }

    @Test
    void testMod()
    {
        assertEquals(0, kp.mod(3,3));
    }

    @Test
    void testIsZero()
    {
        assertTrue(kp.isZero(0));
        assertFalse(kp.isZero(1));
    }

    @Test
    void position()
    {
        assertArrayEquals(new int[]{0,1}, kp.position(1));
    }
}