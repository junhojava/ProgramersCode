package code.programers.level.one;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
/**
 *  인형은 가장 아래 칸부터 쌓임(1x1 공간 사용)
 *  크레인은 맨 위의 인형을 집어 올림
 *  바구니에는 인형이 맨 밑부터 쌓이고, 2개가 중복되면 사라짐.
 *  board == 맵, moves == 크레인 작동 위치
 * 
 *  board 안의 값은 0~100
 *  0은 빈값, 1~100은 인형
 * 
 *  테스트 정보
 *  터진 인형 개수= 1번 인형 2개, 3번 인형 2개
 *  남는 인형 정보= 2번 인형
 * 
 *  다음과 같이 명명한다.
 *  board = 맵
 *  moves = 작동위치
 *  stack = 바구니
 *  
 */
public class CrainTest
{

    @Test
    public void testCrain()
    {
        int[][] board = {{0,0,0,0,0}
        , {0,0,1,0,3}
        , {0,2,5,0,1}
        , {4,2,4,4,2}
        , {3,5,1,3,1}};
        int[] moves = {1,5,3,5,1,2,1,4};

        CrainSolution crainSolution = new CrainSolution();

        assertEquals(4, crainSolution.solution(board, moves));
    }

    @Test
    public void testEmptyPosition()
    {
        int[][] board = {{0,0,0,0,0}
        , {0,0,1,0,3}
        , {0,2,5,0,1}
        , {4,2,4,4,2}
        , {3,5,1,3,1}};

        CrainSolution crain = new CrainSolution();
        boolean result= crain.emptyPosition(board[0]);
        boolean second_position = crain.emptyPosition(board[1]);

        assertEquals(true, result);
        assertEquals(false, second_position);
    }

    @Test
    public void testReplaceMoves()
    {
        int[] moves = {1,5,3,5,1,2,1,4};

        CrainSolution crain = new CrainSolution();
        crain.replaceMoves(moves);
    }
}