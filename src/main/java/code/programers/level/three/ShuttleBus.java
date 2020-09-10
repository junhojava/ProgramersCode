package code.programers.level.three;

public class ShuttleBus {

    int remained(int n, int m, int length)
    {
        int seat = n*m;

        if(length > seat)
            return -1;
        else if (length == seat)
            return 0;
        else
            return 1;
    }
}