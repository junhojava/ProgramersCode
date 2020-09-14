package code.programers.level.one;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class GymClothTest {
    
    GymCloth gc = new GymCloth();

    @Test
    void testIsSelf()
    {
        assertTrue(gc.isSelf(new int[]{2,3,4}, 3));
    }
}