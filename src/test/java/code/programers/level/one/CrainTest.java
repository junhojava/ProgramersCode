package code.programers.level.one;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
/**
 *  1X1 칸
 *  인형은 가장 아래 칸부터 쌓임(1x1 공간 사용)
 *  크레인은 좌우로 움직일 수 있고, 맨 위의 인형을 집어 올림
 *  바구니에는 인형이 맨 밑부터 쌓임
 *  바구니에 같은 인형이 연속해서 중복으로 쌓이면 바구니에서 사라짐
 *  크레인이 인형이 없는곳에 집어올리는 행위를 했을 때 아무 일도 일어나지 않음.
 *  바구니 크기 == 모든 인형의 크기
 *  board == 격자의 상태(2차원 배열)
 *  moves== 크레인을 작동시킨 위치가 담긴 배열(배열)
 * 
 *  board 안의 값은 0~100
 *  0은 빈값, 1~100은 인형
 *  크레인 이동 == 1,5,3,5,1,2,1,4
 *  바구니 상태
 *  크레인은 맨 위의 것을 빼내므로 배열의 가장 뒤의 값을 빼낸다.
 *  0(빈공간), (1, 1), (3, 0(빈공간), 3), 0, 2
 *  터진 인형 정보: 1인형 2개가, 3인형 2개
 *  남는 인형 정보: 2인형
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
        int[] moves = {1,5,3,5,1,2,1,4};

        CrainSolution crain = new CrainSolution();
        boolean result= crain.emptyPosition(board[0]);

        assertEquals(true, result);
    }
}