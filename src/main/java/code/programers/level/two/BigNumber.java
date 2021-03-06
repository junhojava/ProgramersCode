package code.programers.level.two;

public class BigNumber {
    
    int bigIndex(String str)
    {
        int max = 0;
        int result= 0;

        for(int index= 0;index< str.length(); index++)
        {
            if(max < Integer.parseInt(str.substring(index, index+1)))
            {
                max = Integer.parseInt(str.substring(index, index+1));
                result = index;
            }
        }

        return result;
    }
}