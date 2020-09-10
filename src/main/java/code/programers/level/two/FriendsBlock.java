package code.programers.level.two;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FriendsBlock {

    Map<String, Integer> map;
    String[][] blocks;

    void toArray(String[] board, int m, int n)
    {
        for(int height = 0; height< m; height++)
            for(int width = 0; width< n; width++)
                blocks[height][width] = board[height].substring(width, width+1);
    }

    void down(int m, int n)
    {
        for(int height= 1; height< m; height++)
            for(int width=0; width< n; width++)
                if(blocks[height][width].equals(""))
                {
                    blocks[height][width] = blocks[height-1][width];
                    blocks[height-1][width] = "";
                }
    }

    int isHit(int m, int n)
    {
        int result = 0;
        map = new HashMap<String, Integer>();

        for(int height= 0; height< m; height++)
            for(int width = 0; width < n; width++)
            {
                String block = blocks[height][width];

                if(block.equals(blocks[height+1][width]) && block.equals(blocks[height+1][width+1]) && block.equals(blocks[height][width+1]))
                {
                    if(!block.equals(""))
                        map.put(Integer.toString(height).concat("n"+Integer.toString(width)), 1);
                        map.put(Integer.toString(height).concat("n"+Integer.toString(width+1)), 1);
                        map.put(Integer.toString(height+1).concat("n"+Integer.toString(width)), 1);
                        map.put(Integer.toString(height+1).concat("n"+Integer.toString(width+1)), 1);
                }
            }

        for(Entry<String, Integer> entry: map.entrySet())
        {
            String[] key = entry.getKey().split("n");

            int height = Integer.parseInt(key[0]);
            int width = Integer.parseInt(key[1]);

            blocks[height][width] = "";
        }

        result = map.size();
        map.clear();

        return result;
    }
}