package code.programers.level.two;

public class FriendsBlock {
    
    String[][] toArray(String[] board)
    {
        String[][] result = new String[board.length][board[0].length()];
        for(int height = 0; height< result.length; height++)
            for(int width = 0; width< result[0].length; width++)
                result[height][width] = board[height].substring(width, width+1);

        return result;
    }

    String[][] down(String[][] board)
    {
        for(int height= 1; height< board.length; height++)
            for(int width=0; width< board[0].length; width++)
                if(board[height][width] == null)
                {
                    board[height][width] = board[height-1][width];
                    board[height-1][width] = null;
                }

        return board;
    }

    int[] isHit(String[][] board)
    {
        int[] result = new int[1];

        for(int height= 0; height< board.length-1; height++)
            for(int width = 0; width < board[0].length-1; width++)
            {
                String block = board[height][width];

                if(block == board[height+1][width] && block == board[height+1][width+1] && block == board[height][width+1])
                {
                    if(block != null)
                    {
                        return new int[]{height, width};
                    }
                }
            }

        return result;
    }
}