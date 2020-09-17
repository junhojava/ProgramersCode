package code.programers.level.one;

import java.util.ArrayList;
import java.util.List;

public class DivisorNMultiple {

    List<Integer> divisorList(int number)
    {
        List<Integer> list = new ArrayList<Integer>();

        for(int index=1; index<=number; index++)
            if((number % index) == 0)
                list.add(index);

        return list;
    }
}