package code.programers.level.two;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class SquareTest {

    Square square = new Square();
    int w;
    int h;
    @Test
    void testEqualSize()
    {
        assertTrue(square.isEqualSize(10, 10));
    }

    @Test
    void testIsEven()
    {
        assertFalse(square.isEven(3));
    }
}