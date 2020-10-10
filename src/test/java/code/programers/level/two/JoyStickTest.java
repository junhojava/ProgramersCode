package code.programers.level.two;

import org.junit.jupiter.api.Test;

/**
 * JAZ(11)
 * 
 * upKey(9)
 *                   ↓
 * A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V,W,X,Y,Z
 * 
 * leftKey(1)
 *                                                   ↓
 * A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V,W,X,Y,Z
 * 
 * downKey(1)
 * ↓
 * A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V,W,X,Y,Z
 * 
 * 9+1+1 = 11
 * 
 * 
 * JEROEN(56)
 * upKey(9)
 *                   ↓
 * A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V,W,X,Y,Z
 * downKey(5)
 *         ↓
 * A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V,W,X,Y,Z
 * upKey(13)
 *                                   ↓
 * A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V,W,X,Y,Z
 * downKey(3)
 *                             ↓
 * A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V,W,X,Y,Z
 * downKey(10)
 *         ↓
 * A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V,W,X,Y,Z
 * upKey(9)
 *                           ↓
 * A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V,W,X,Y,Z
 * 
 */
public class JoyStickTest
{
    JoyStick js = new JoyStick();

    @Test
    void test()
    {
        
    }
}