package code.programers.level.two;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class AlterKeyTest {
    /**
     * 유일성 검사
     * 1개의 컬럼을 유일성을 검사한다
     * 학번(유일성), 이름(중복), 전공(중복), 학년(중복)
     * 학번을 제외한다.
     * 카운터에 1을 더한다.
     * 컬럼을 2개씩 짝지어 유일성을 검사한다.
     * [이름,전공](유일), 학년(중복)
     * 이름과 전공을 제외한다.
     * 카운터에 1을 더한다.
     * 
     */
    String[][] relation;
    AlterKey ak = new AlterKey();

    @Test
    void testUnique()
    {
        assertTrue(ak.isUnique("100"));
    }

    @Test
    void testUniqueColumn()
    {
        int result = 0;
        relation = new String[][]{{"100","ryan","music","2"},{"200","apeach","math","2"},{"300","tube","computer","3"},{"400","con","computer","4"},{"500","muzi","music","3"},{"600","apeach","music","2"}};
        ak.list = new int[relation[0].length][relation[0].length];

        for(int column=0; column<relation[0].length; column++)
        {
            int row = 0;
            while(ak.flag && row < relation.length)
            {
                String key = relation[row][column];
                if(ak.isUnique(key))
                {
                    ak.putKey(key);
                    row++;
                }
                else
                {
                    ak.flag = false;
                    ak.list[0][column] = 1;
                }
            }
            ak.clear();
        }
        result = ak.isZero(ak.list[0], 0);
        assertEquals(1, result);
    }

    @Test
    void testIsPair()
    {
        int result = 0;
        relation = new String[][]{{"100","ryan","music","2"},{"200","apeach","math","2"},{"300","tube","computer","3"},{"400","con","computer","4"},{"500","muzi","music","3"},{"600","apeach","music","2"}};
        ak.list = new int[][]{{0,1,1,1},{1,0,0,0},{1,0,0,0},{1,0,0,0}};


        int index= 0;
        if(ak.list[1][index])
        {

        }


    }
}