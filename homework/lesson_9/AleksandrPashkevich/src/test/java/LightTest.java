import org.junit.Test;
import org.junit.Assert;

public class LightTest {


    Light light = new Light();

    @Test
    public void glowWithWhiteTest() {

        Assert.assertFalse(light.glowWithWhite(0));
        light.battery = 0;
        Assert.assertTrue(light.glowWithWhite(1));
        light.battery = 0;
        Assert.assertTrue(light.glowWithWhite(2));
        light.battery = 0;
    }

    @Test
    public void glowWithRedTest() {
        Assert.assertFalse(light.glowWithRed(0));
        light.battery = 0;
        Assert.assertFalse(light.glowWithRed(1));
        light.battery = 0;
        Assert.assertTrue(light.glowWithRed(2));
        light.battery = 0;

    }

    @Test
    public void glowingWithFlashTest() {

        Assert.assertFalse(light.glowingWithFlash(0));
        light.battery = 0;
        Assert.assertFalse(light.glowingWithFlash(1));
        light.battery = 0;
        Assert.assertFalse(light.glowingWithFlash(2));
        light.battery = 0;
        Assert.assertTrue(light.glowingWithFlash(3));
        light.battery = 0;
        Assert.assertTrue(light.glowingWithFlash(4));
    }

    @Test
    public void glowWithGreenTest() {

        Assert.assertFalse(light.glowWithGreen(0));
        light.battery = 0;
        Assert.assertFalse(light.glowWithGreen(1));
        light.battery = 0;
        Assert.assertFalse(light.glowWithGreen(2));
        light.battery = 0;
        Assert.assertFalse(light.glowWithGreen(3));
        light.battery = 0;
        Assert.assertTrue(light.glowWithGreen(4));
        light.battery = 0;
        Assert.assertTrue(light.glowWithGreen(5));
        light.battery = 0;
    }

    @Test
    public void glowWithYellowTest() {

        boolean isYellow;

        Assert.assertFalse(light.glowWithYellow(0));
        light.battery = 0;
        Assert.assertTrue(light.glowWithYellow(1));
        light.battery = 0;
        Assert.assertTrue(light.glowWithYellow(2));
        light.battery = 0;
        Assert.assertTrue(light.glowWithYellow(3));
        light.battery = 0;
        Assert.assertFalse(light.glowWithYellow(4));
        light.battery = 0;
        Assert.assertFalse(light.glowWithYellow(5));
        light.battery = 0;

    }

}
