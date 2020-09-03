package code.programers.level.two;

import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

public class AlterKeyTest {
    
    String[][] relation;
    AlterKey ak = new AlterKey();

    @Test
    void testDuplication()
    {
        assertFalse(ak.isUnique("100", "200"));
    }
}