import org.junit.Test;

public class LightTest {


    Light light = new Light();

    @Test
    public void glowWithWhiteTest() {

        System.out.println("White: ");

        for (int i = 0; i < 5; i++) {
            System.out.print("Battaryes:" + i + " ");
            light.glowWithWhite(i);
            light.battery = 0;
        }
    }

    @Test

    public void glowWithRedTest() {
        System.out.println("Red: ");
        for (int i = 0; i < 5; i++) {
            System.out.print("Battaryes:" + i + " ");
            light.glowWithRed(i);
            light.battery = 0;
        }
    }

    @Test
    public void glowingWithFlashTest() {

        System.out.println("Flash");
        for (int i = 0; i < 5; i++) {
            System.out.print("Battaryes:" + i + " ");
            light.glowingWithFlash(i);
            light.battery = 0;
        }
    }

    @Test

    public void glowWithGreenTest() {

        System.out.println("Green: ");

        for (int i = 0; i < 5; i++) {
            System.out.print("Battaryes:" + i + " ");
            light.glowWithGreen(i);
            light.battery = 0;
        }
    }

    @Test
    public void glowWithYellowTest() {

        System.out.println("Yellow: ");

        for (int i = 0; i < 7; i++) {
            System.out.print("Battaryes:" + i + " ");
            light.glowWithYellow(i);
            light.battery = 0;
        }
    }

}
