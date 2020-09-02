package code.programers.level.two;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class OpenChatTest {
    /**
     * 가상의 닉네임을 사용한다.
     * 신입사원이 오픈 채팅방 관리자창을 만든다
     * 
     * 메시지 목록
     * 1. 채팅방 접속시 : [닉네임]님이 들어왔습니다.
     * 2. 채팅방 퇴장시 : [닉네임]님이 나갔습니다.
     * 
     * 닉네임 변경 방법
     * 1. 채팅방을 나간 후, 새로운 닉네임으로 접속한다.
     * 2. 채팅방에서 닉네임을 변경한다.
     * 
     * 
     * 닉네임을 변경할 때는 기존에 채팅바에 출력되어 있던 메시지의 닉네임도 전부 변경된다.
     * 
     * 중복 닉네임을 허용한다.
     * Muzi , Prodo -> Prodo(전 Muzi), Prodo
     * 
     * 
     */
    @Test
    void testIsEnter()
    {
        OpenChat oc = new OpenChat();

        assertTrue(oc.isEnter("Enter uid1234 Muzi"));
    }
}