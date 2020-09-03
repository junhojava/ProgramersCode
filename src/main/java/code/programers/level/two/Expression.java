package code.programers.level.two;

public class Expression {

    int count;

    int countOperate(String s)
    {
        if(s.contains("+"))
            count++;

        if(s.contains("-"))
            count++;

        if(s.contains("*"))
            count++;

        return count;
    }
}