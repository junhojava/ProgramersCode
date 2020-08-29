package code.programers.level.one;

public class Rectangle {
    public int[] solution(int[][] v) {
        int[] answer = {0,0};

        int[] x_list = {v[0][0], v[1][0], v[2][0]};
        int[] y_list = {v[0][1], v[1][1], v[2][1]};
        
        answer[0] = alone(x_list);
        answer[1] = alone(y_list);

        return answer;
    }
    
    int alone(int[] position)
    {
        int result = 0;
        
        if(position[0] == position[1])
        {
            return position[2];
        }else if(position[0] == position[2])
        {
            return position[1];
        }else
        {
            return position[0];
        }
    }
} 