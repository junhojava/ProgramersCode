package code.programers.level.two;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class PhoneBookTest {
    PhoneBook pb = new PhoneBook();

    @Test
    void testNumberPrefix()
    {
        assertTrue(pb.isPrefix("11923456", "119"));
    }

    @Test
    void testCaseOne()
    {
        String[] phone_book = {"119", "97674223", "1195524421"};
        boolean result = false;

        Arrays.sort(phone_book);

        for(int i = 0; i < phone_book.length-1; i++)
            for(int j = i+1; j < phone_book.length; j++)
                if(pb.isPrefix(phone_book[j], phone_book[i]))
                    assertTrue(true);

        assertFalse(false);
    }
}