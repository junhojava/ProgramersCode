package code.programers.level.one;

public class GymCloth {
    
    int isSelf(int[] list, int me)
    {
        int index = 0;
        for(;index<list.length; index++)
            if(list[index] == me)
                return index;

        return -1;
    }
}