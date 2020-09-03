package code.programers.level.two;

public class Translation {
    
    boolean isBalance(String value)
    {
        int open = value.replace("(", "").length();
        int close = value.replace(")", "").length();

        return open == close;
    }

    boolean isEmpty(String value)
    {
        return value.equals("");
    }

    boolean isRight(String value)
    {
        int count = 0;
        for(int index=0; index<value.length(); index++)
        {
            if(value.substring(index, index+1).equals("("))
            {
                count++;
            }
            else
            {
                count--;
            }

            if(count < 0)
            {
                return false;
            }
        }
        return true;
    }

    String reverseString(String value)
    {
        return value.replace("(", ",").replace(")", "(").replace(",", ")");
    }

    String solution(String s)
    {
        int index = 2;
        String result = "";
        String empty = "(";
        String u, v;

        if(isEmpty(s))
        {
            return s;
        }
        else
        {
            u = s.substring(0, index);
            v = s.substring(index, s.length());
        }

        while(!isBalance(u))
        {
            index+=2;
            u = s.substring(0, index);
            v = s.substring(index, s.length());
        }

        if(isRight(u))
        {
            result = solution(v);
            u += result;
        }
        else
        {
            result = solution(v);
            String apend = reverseString(u.substring(1, u.length()-1));
            empty += result + ")" + apend;
            u = empty;
        }
        return u;
    }
}