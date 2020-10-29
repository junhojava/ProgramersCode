package code.programers.level.two;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class JadenCaseTest
{
    @Test
    void testSplit()
    {
        String str = "asdf zxcv qwer";
        String[] result = str.split(" ");
        assertArrayEquals(new String[]{"asdf", "zxcv", "qwer"}, result);
    }

    @Test
    void testToUpperCase()
    {
        String str = " 3asd  fzxcvqwer";
        StringBuilder sb = new StringBuilder();

        boolean flag = true;

        for(int index=0; index< str.length(); index++)
        {
            if(str.substring(index, index+1).equals(" "))
            {
                sb.append(str.substring(index, index+1));
                flag = true;
            }
            else
                if(flag == true)
                {
                    sb.append(str.substring(index, index+1).toUpperCase());
                    flag = false;
                }
                else
                    sb.append(str.substring(index, index+1).toLowerCase());
        }

        assertEquals(" 3asd  Fzxcvqwer", sb.toString());
    }
}