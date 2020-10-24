package code.programers.level.two;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class LifeBoatTest
{
    Boat boat = new Boat();

    @Test
    void test()
    {
        List<Integer> list = new ArrayList<>();

        list.add(40);
        list.add(50);
        list.add(50);
        list.add(60);
        list.add(70);

        assertEquals(list, boat.list(new int[]{40,50,50,60,70}));
    }
}