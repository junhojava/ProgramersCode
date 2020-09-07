package code.programers.level.one;

import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

public class SecretMapTest {
    SecretMap sm = new SecretMap();

    @Test
    void testIsEven()
    {
        assertFalse(sm.isEven(13));
    }
}