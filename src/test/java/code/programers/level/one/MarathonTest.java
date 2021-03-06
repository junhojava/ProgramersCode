package code.programers.level.one;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Map;

import org.junit.jupiter.api.Test;

public class MarathonTest {
    /**
    *   마라톤 선수 = participant
    *   완주한 선수 = completion
    *   완주하지 못한 선수 = answer, (participant- completion)
    *   
    *   1 <= participant <= 100,000
    *   completion == (participant -1)
    *   1<= participant[index].length <=20
    *
    *   testCaseOne ~ testCaseTwo = 순차탐색(효율성↓), 시간복잡도 =O(n)
    *   testCaseThree = 정렬된 배열에서의 순차탐색(효율성 하), 시간복잡도 =O(n)
    *   testCaseFour = 정렬된 배열에서의 이진 탐색(효율성 중간), 시간복잡도 =O(log2n)
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
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion= {"eden", "kiki"};
        String result = marathon.linearSearch(participant, completion);

        assertEquals("leo", result);
    }

    @Test
    void testCaseTwo()
    {
        String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completion= {"josipa", "filipa", "marina", "nikola"};
        String result = marathon.linearSearch(participant, completion);

        assertEquals("vinko", result);
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
        int five = marathon.half(9);
        String[][] areas = marathon.twoDimensionString(five);
        boolean result = marathon.isTwoDimensionString(areas);

        assertTrue(result);
    }

    @Test
    public void testLinearFindIndex()
    {
        String[] participant = {"leo", "kiki", "eden"};
        int two = marathon.linearFindIndex(participant, "eden");

        assertEquals(2, two);
    }

    @Test
    public void testReplaceString()
    {
        String[] participant = {"leo", "kiki", "eden"};
        int two = marathon.linearFindIndex(participant, "eden");

        participant = marathon.replaceString(participant, two, "wow");

        assertEquals("wow", participant[2]);
    }

    @Test
    public void testLinearSearchMarathoner()
    {
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion= {"eden", "kiki"};

        for(String name: completion)
        {
            int number = marathon.linearFindIndex(participant, name);
            participant = marathon.replaceString(participant, number, "");
        }

        int last_number = marathon.isNotEmptyString(participant);
        assertEquals(0, last_number);
    }

    @Test
    public void testSimpleSort()
    {
        String[] participant = {"leo", "kiki", "eden"};

        participant = marathon.bubleSort(participant);

        assertEquals("eden", participant[0]);
    }

    @Test
    public void testCaseThree()
    {
        /**
         * 마라톤 선수 = ["eden", "kiki", "leo"]
         * 완주한 선수 = ["eden", "kiki"]
         * 완주하지 못한 선수 = ["leo"]
         */
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion= {"eden", "kiki"};
        String result = marathon.linearSearch(participant, completion);

        assertEquals("leo", result);
    }

    @Test
    void testCompareName()
    {
        /**
         * sign = 부등호 표시를 위한 변수 {{작다=-1},{같다=0},{크다=1}}
         */
        String[] participant = {"leo", "kiki", "eden"};
        participant = marathon.bubleSort(participant);
        int sign = marathon.compareName(participant[1], "leo");

        assertEquals(1, sign);
    }

    @Test
    void testBinarySearch()
    {
        String[] participant = {"leo", "kiki", "eden"};
        participant = marathon.bubleSort(participant);
        int first = marathon.binarySearch(participant, "eden", 0, participant.length);
        int last = marathon.binarySearch(participant, "leo", 0, participant.length);

        assertEquals(0, first);
        assertEquals(2, last);
    }

    @Test
    void testCaseFour()
    {
        /**
         * 마라톤 선수 = ["leo", "kiki", "eden"]
         * 완주한 선수 = ["eden", "kiki"]
         * 완주하지 못한 선수 = ["leo"]
         */
        String[] participant = {"mislav", "stanko", "mislav", "ana", "ana"};
        String[] completion= {"stanko", "ana", "mislav", "mislav"};

        Map<String, Integer> participant_map = marathon.addCountName(participant);

        for(String name: completion)
        {
            marathon.subCountName(participant_map, name);
        }

        assertEquals("ana", participant_map.keySet().toArray()[0]);
    }

    @Test
    void testMislavCount()
    {
        String[] participant = {"mislav", "stanko", "mislav", "ana", "ana"};

        Map<String, Integer> participant_map = marathon.addCountName(participant);

        assertEquals(2, participant_map.get("mislav"));
    }

    @Test
    void testMislavOnePassed()
    {
        String[] participant = {"mislav", "stanko", "mislav", "ana", "ana"};
        Map<String, Integer> participant_map = marathon.addCountName(participant);

        marathon.subCountName(participant_map, "mislav");

        assertEquals(1, participant_map.get("mislav"));
    }
}