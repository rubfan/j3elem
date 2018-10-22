import org.junit.Assert;
import org.junit.Test;

public class DoorTest {

    Door door = new Door();

    @Test
    public void doorOpenNoLockTest() {
        door.dorOpen = false;
        door.isLocked = false;
        Assert.assertTrue(door.openDoor());
    }

    @Test
    public void doorOpenLockTest() {

        door.isLocked = true;

        Assert.assertFalse(door.openDoor());
    }

    @Test
    public void doorStayClosedTest() {
        door.isLocked = false;
        door.dorOpen = true;

        Assert.assertFalse(door.openDoor());
    }
}
