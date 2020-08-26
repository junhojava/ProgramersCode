package code.programers.level.one;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class MarathonTest {
    /**
    *   마라톤 선수 = participant
    *   완주한 선수 = completion
    *   완주하지 못한 선수 = answer, (participant- completion)
    *   
    *   1 <= particiant <= 100,000
    *   completion == (participant -1)
    *   1<= participant[index].length <=20
    */

    Marathon marathon = new Marathon();
    @Test
    public void testCaseOne()
    {
        /**
         * 마라톤 선수 = ["leo", "kiki", "eden"]
         * 완주한 선수 = ["eden", "kiki"]
         * 완주하지 못한 선수 = ["leo"]
         */
        String[] particiant = {"leo", "kiki", "eden"};
        String[] completion= {"eden", "kiki"};
        String result = marathon.solution(particiant, completion);

        assertEquals("leo", result);
    }

    @Test
    public void testEvenHalf()
    {
        int six = 6;
        int three = marathon.half(six);

        assertEquals(3, three);
    }

    @Test
    public void testEven()
    {
        int eight = 8;
        int nine = 9;

        assertTrue(marathon.isEven(eight));
        assertFalse(marathon.isEven(nine));
    }

    @Test
    public void testOddHalf()
    {
        int five = 5;

        int three= marathon.half(five);

        assertEquals(3, three);
    }

    @Test
    public void testTwoDimensionString()
    {
        int nine = 9;
        int five = marathon.half(9);
        String[][] areas = marathon.twoDimensionString(five);
        boolean result = marathon.isTwoDimensionString(areas);

        assertTrue(result);
    }

    @Test
    public void testLinearFindIndex()
    {
        String[] particiant = {"leo", "kiki", "eden"};
        int two = marathon.linearFindIndex(particiant, "eden");

        assertEquals(2, two);
    }
}