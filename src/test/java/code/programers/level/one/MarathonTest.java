package code.programers.level.one;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
}