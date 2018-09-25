import org.junit.Assert;
import org.junit.Test;

public class MicrowaveTest {

    Microwave mWave = new Microwave();


    @Test
    public void cookTest() {
        Assert.assertFalse(mWave.cook(1));
        Assert.assertFalse(mWave.cook(5));
        Assert.assertFalse(mWave.cook(9));
        Assert.assertFalse(mWave.cook(10));
        Assert.assertTrue(mWave.cook(11));
        Assert.assertTrue(mWave.cook(12));
        Assert.assertTrue(mWave.cook(13));
        Assert.assertTrue(mWave.cook(14));
    }

    @Test
    public void heatTest() {
        Assert.assertFalse(mWave.heat(1));
        Assert.assertFalse(mWave.heat(2));
        Assert.assertTrue(mWave.heat(3));
        Assert.assertTrue(mWave.heat(4));
        Assert.assertTrue(mWave.heat(5));
        Assert.assertTrue(mWave.heat(6));

    }
}
