package code.programers.level.one;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class KyePadTest {
    
    KeyPad kp = new KeyPad();

    @Test
    void testDistance()
    {
        assertEquals(2, kp.distance(1,5));
    }
}