package code.programers.level.two;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class PhoneBookTest {
    PhoneBook pb = new PhoneBook();

    @Test
    void testNumberPrefix()
    {
        assertTrue(pb.isPrefix("11923456", "119"));
    }
}