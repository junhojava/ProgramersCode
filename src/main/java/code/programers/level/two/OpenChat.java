package code.programers.level.two;

public class OpenChat {
    
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
}