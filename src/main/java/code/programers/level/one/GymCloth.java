package code.programers.level.one;

public class GymCloth {
    
    int who(int[] list, int me)
    {
        int index = 0;
        for(;index<list.length; index++)
            if(list[index] == me)
                return index;

        return -1;
    }

    int[] canRent(int me)
    {
        int[] result = new int[2];

        result[0] = me-1;
        result[1] = me+1;

        return result;
    }
}