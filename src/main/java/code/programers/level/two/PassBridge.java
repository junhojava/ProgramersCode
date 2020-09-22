package code.programers.level.two;

import java.util.Arrays;

public class PassBridge {
    int[] trucks;
    int weight;

    void ascendSort()
    {
        Arrays.sort(trucks);
    }

    boolean checkWeight(int truck)
    {
        return (weight - truck) >= 0;
    }
}