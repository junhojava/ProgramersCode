package code.programers.level.two;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TargetNumberTest
{
    TargetNumber tn;

    @Test
    void testInit()
    {
        tn = new TargetNumber(5);
        assertEquals(32, tn.results.length);
    }
}