package code.programers.level.one;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class FindKimTest {
    
    FindKim fk = new FindKim();

    @Test
    void test()
    {
        String[] seoul = {"Jane", "Kim"};

        assertTrue(fk.equals(seoul[0], "Kim"));
    }
}