package code.programers.level.two;

import java.util.ArrayList;
import java.util.List;

public class CompressString {

    boolean only(String s, String c)
    {
        return s.replace(c, "").length() == s.length() - 1;
    }

    boolean remained(int left, int right)
    {
        return (left%right) != 0;
    }

    boolean equalsString(String left, String right)
    {
        return left.equals(right);
    }

    String[] splitedList(String s, int number)
    {
        List<String> list = new ArrayList<String>();

        for(int index=0; index< s.length(); index+=number)
        {
            String crnt = "";
            if(index+number > s.length())
            {
                crnt = s.substring(index, s.length());
            }
            else
            {
                crnt = s.substring(index, index+number);
            }

            list.add(crnt);
        }

        return list.toArray(new String[0]);
    }

    String[] concatList(String[] list, String str)
    {
        String[] result = new String[list.length+1];

        for(int index=0; index<list.length; index++)
        {
            result[index] = list[index];
        }

        result[result.length-1] = str;

        return result;
    }

    int stringToInt(String left)
    {
        return Integer.parseInt(left);
    }

    String concatString(String right, int number)
    {
        if(number > 1)
        {
            return number+right;
        }
        else
        {
            return right;
        }
    }

    String compresString(String s, int number)
    {
        String[] list = splitedList(s, number);

        if(!listToString(list).equals(s))
        {
            int value = s.length()- listToString(list).length();
            list = concatList(list, s.substring(s.length()-value ,s.length()));
        }

        int count = 1;
            for(int index=1; index<=list.length; index++)
            {
                String crnt = list[index-1];
                if(index==list.length)
                {
                    list[index-1] = concatString(crnt, count);
                }
                else
                {
                    String next = list[index];
                    if(equalsString(crnt, next))
                    {
                        count++;
                        list[index-1] = "";
                    }
                    else
                    {
                        list[index-1] = concatString(crnt, count);
                        
                        count = 1;
                    }
                }

            }

            return listToString(list);
    }

    String listToString(String[] list)
    {
        String result = "";
        for(String s: list)
        {
            result += s;
        }

        return result;
    }

    public int solution(String s) {
        if(s.length() == 1) return 1;
         
        int answer = 1001;
        for (int i = 1; i <= s.length() / 2; i++) {
            String now, next = "", result = "";
            int hit = 1;
            for (int j = 0; j <= s.length() / i; j++) {
                int start = j * i;
                int end = i * (j + 1) > s.length() ? s.length() : i * (j + 1);
                now = next;
                next = s.substring(start, end);
 
                if(now.equals(next)) {
                    hit++;
                } else {
                    result += (processHit(hit) + now);
                    hit = 1;
                }
            }
            result += (processHit(hit) + next);
            answer = Math.min(answer, result.length());
        }
 
        return answer;
    }


    private static String processHit(int hit) {
        return hit > 1 ? String.valueOf(hit) : "";
    }

}