package code.programers.level.two;

import java.util.ArrayList;
import java.util.List;

public class Camoflague
{
    String[] parts(String[][] clothes)
    {
        List<String> list = new ArrayList<>();

        for(String[] cloth: clothes)
        {
            if(!list.contains(cloth[1]))
                list.add(cloth[1]);
        }

        return list.toArray(new String[0]);
    }
}