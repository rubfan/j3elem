package hillel;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FlashlightTest {

    private Flashlight fl;

    @Before
    public void init() {
        fl = new Flashlight();
    }

    @Test
    public void testSetBat() {
        fl.setBattery(2);
        assertTrue(fl.getBattery() == 2);
        fl.setBattery(0);
        assertTrue(fl.getBattery() == 0);
    }

    @Test
    public void presButt() {
        fl.setBattery(3);
        assertEquals("off", fl.getStatus());
        fl.pressButt();
        assertEquals("White", fl.getStatus());
        fl.pressButt();
        assertEquals("Red", fl.getStatus());
        fl.pressButt();
        assertEquals("Strobe", fl.getStatus());
        fl.pressButt();
        assertEquals("off", fl.getStatus());
    }
}
