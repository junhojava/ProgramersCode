package code.programers.level.one;

public class CreateString {
    
    String[] split(String str)
    {
        return str.split(" ");
    }

    String changeCase(String str)
    {
        String result = "";
        for(int index=0; index<str.length(); index++)
            if(index % 2 == 0)
                result += str.substring(index, index+1).toUpperCase();
            else
                result += str.substring(index, index+1);

        return result;
    }
}