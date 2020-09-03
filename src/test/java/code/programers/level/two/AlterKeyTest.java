package code.programers.level.two;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class AlterKeyTest {
    
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