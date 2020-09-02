package code.programers.level.two;

import java.util.Map;

public class OpenChat {

    Map<String, String> users;

    boolean isEnter(String record)
    {
        return record.substring(0, 5).equals("Enter");
    }

    boolean isLeave(String record)
    {
        return record.substring(0, 5).equals("Leave");
    }

    boolean isChange(String record)
    {
        return record.substring(0, 6).equals("Change");
    }

    String whoAreYou(String[] records)
    {
        for(String record: records)
        {
            String[] info = record.split(" ");
            if(isEnter(record))
            {
                users.put(info[1], info[2]);
            }
            else if(isChange(record))
            {
                users.put(info[1], info[2]);
            }
        }
        return "Ryan";
    }
}