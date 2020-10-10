package code.programers.level.two;

import java.util.HashMap;
import java.util.Map;

public class JoyStick {
    Map<String, Integer> keys;
    String word;

    JoyStick()
    {
        keys = new HashMap<>();

        char alphabet = "A".charAt(0);

        keys.put(Character.toString(alphabet++), 0);

        for(int index=1; index< 14; index++)
        {
            keys.put(Character.toString(alphabet++), index%14);
        }

        for(int index=12; index> 0; index--)
        {
            keys.put(Character.toString(alphabet++), index%14);
        }
    }

    void create(int count)
    {
        StringBuilder sb = new StringBuilder();
        for(int index=0; index< count; index++)
        {
            sb.append("A");
        }

        word = sb.toString();
    }
}