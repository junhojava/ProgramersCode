package code.programers.level.one;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class CreateStringTest {
    CreateString cs = new CreateString();

    @Test
    void testSplit()
    {
        assertArrayEquals(new String[]{"try", "hello", "world"}, cs.split("try hello world"));
    }
}