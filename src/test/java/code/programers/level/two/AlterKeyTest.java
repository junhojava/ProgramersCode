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
     * list = [[0,0,0,0],[0,0,0,0],[0,0,0,0],[0,0,0,0]];
     * 
     * 짝지을 컬럼 = 1
     * for(list[0])
     *     컬럼의 값이 0이고, 짝의 수인 1과 같으면
     *     0번째 컬럼은 유일성을 만족한다.
     *     0번째 컬럼 관련 자료는 모두 1로 바꾼다.
     * list = [[1,0,0,0],[1,0,0,0],[1,0,0,0],[1,0,0,0]];
     * 
     * 짝지을 컬럼 = 2
     * for(list[1])
     *     컬럼의 값이 
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
        ak.count = 0;
        relation = new String[][]{{"100","ryan","music","2"},{"200","apeach","math","2"},{"300","tube","computer","3"},{"400","con","computer","4"},{"500","muzi","music","3"},{"600","apeach","music","2"}};
        ak.init(relation[0].length); 

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
                }
            }

            if(ak.flag)
            {
                ak.listRemove(new int[]{column});
            }
            ak.clear();
        }

        assertEquals(1, ak.count);
    }
}