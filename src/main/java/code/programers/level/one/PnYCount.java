package code.programers.level.one;

public class PnYCount {
    
    int[] count(String s)
    {
        int[] result = new int[2];

        for(int index=0; index<s.length(); index++)
            if(s.substring(index, index+1).toLowerCase().equals("p"))
                result[0]++;
            else if(s.substring(index, index+1).toLowerCase().equals("y"))
                result[1]++;

        return result;
    }
}