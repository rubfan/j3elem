package hillel;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ToyPlaneTest {

    private ToyPlane tp;

    @Before
    public void init(){
        tp = new ToyPlane();
    }

    @Test
    public void command(){
        assertEquals("stand", tp.getCurrentComm());
        tp.goFront();
        assertEquals("go front", tp.getCurrentComm());
        tp.goUp();
        assertEquals("go up", tp.getCurrentComm());
        tp.goDown();
        assertEquals("go down", tp.getCurrentComm());
        tp.turnLeft();
        assertEquals("turn left", tp.getCurrentComm());
        tp.turnRight();
        assertEquals("turn right", tp.getCurrentComm());

    }

    @Test
    public void motor(){
        assertEquals("motor off", tp.getStatusM());
        tp.startMotor();
        assertEquals("motor on", tp.getStatusM());
        tp.startMotor();
        assertEquals("motor off", tp.getStatusM());
    }

    @Test
    public void battery(){
        assertTrue(tp.getChBattery() == 0);
        assertTrue(tp.rechargeBat() == 100);
        tp.startMotor();
        tp.goFront();
        assertTrue(tp.getChBattery() == 98);
    }

    @Test
    public void warn(){
        tp.rechargeBat();
        tp.startMotor();
        //for the test warning message should emulate low battery
        for(int i = 1; i < 80; i++) {
            tp.goFront();
        }
        tp.goUp();
        assertEquals("go up Battery is low!", tp.getCurrentComm() );
        for(int i = 1; i < 15; i++){
            tp.goFront();
        }
        tp.goUp();
        assertEquals("Emergency lending!", tp.getCurrentComm());
    }


}
