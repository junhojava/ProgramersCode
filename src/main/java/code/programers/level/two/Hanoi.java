package code.programers.level.two;

import java.util.ArrayList;
import java.util.List;

public class Hanoi
{
    List<int[]> list;

    Hanoi()
    {
        list = new ArrayList<>();
    }
    
    void move(int number, int start, int buffer, int goal)
    {
        if(number == 1)
            list.add(new int[]{start, goal});
        else
        {
            move(number-1, start, goal, buffer);
            list.add(new int[]{start, goal});
            move(number-1, buffer, start, goal);
        }
    }
}