package code.programers.level.one;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

/**
 * 스테이지의 거쳐간 수 채우기
 */
public class FailureTest {
    FailureRate fr = new FailureRate();

    @Test
    void testPutStageCount()
    {
        int[] stages = {2,1,2,6,2,4,3,3};

        fr.stageLength(5);
        fr.putList(stages);

        fr.calc();
        for(int index= fr.rates.length-1; index>-1; index--)
        {
            int key = fr.index(fr.rates[index]);
            fr.putStage(key);
        }

        int[] result = new int[fr.list.size()];
        for(int index=0; index<fr.list.size(); index++)
        {
            result[index] = fr.list.get(index);
        }
        assertArrayEquals(new int[]{8,7,4,2,1}, fr.stagecount);
        assertArrayEquals(new int[]{3,4,2,1,5}, result);
    }

    @Test
    void testCaseTwo()
    {
        int[] stages = {4,4,4,4,4};

        fr.stageLength(4);
        fr.putList(stages);

        fr.calc();
        for(int index= fr.rates.length-1; index>-1; index--)
        {
            int key = fr.index(fr.rates[index]);
            fr.putStage(key);
        }

        int[] result = new int[fr.list.size()];
        for(int index=0; index<fr.list.size(); index++)
        {
            result[index] = fr.list.get(index);
        }
        assertArrayEquals(new int[]{4,1,2,3}, result);
    }
}