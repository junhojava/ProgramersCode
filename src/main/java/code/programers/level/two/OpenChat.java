package code.programers.level.two;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OpenChat {

    Map<String, String> users;
    List<String> message;

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

    void whoAreYou(String[] records)
    {
        for(String record: records)
        {
            String[] info = record.split(" ");
            if(isEnter(record))
            {
                message.add(info[1]+ "~님이 들어왔습니다.");
                users.put(info[1], info[2]);
            }
            else if(isLeave(record))
            {
                message.add(info[1]+ "~님이 나갔습니다.");
            }
            else
            {
                users.put(info[1], info[2]);
            }
        }
    }
    
    public String[] solution(String[] record) {
        users = new HashMap<String, String>();
        message = new ArrayList();
        String result = "";
        
        whoAreYou(record);
        
        for(int index = 0; index< message.size(); index++)
        {
            String[] info = message.get(index).split("~");
            message.set(index, users.get(info[0]) + info[1]);
        }

        String[] answer = message.toArray(new String[0]);
        return answer;
    }
}