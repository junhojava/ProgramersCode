package code.programers.level.one;

public class GymCloth {
    
    boolean isSelf(int[] list, int me)
    {
        for(int loster: list)
            if(loster == me)
                return true;

        return false;
    }
}