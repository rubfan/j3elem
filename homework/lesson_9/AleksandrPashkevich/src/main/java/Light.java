

public class Light {

    int battery = 0;


    public void glowWithRed(int installBattery) {

        battery = battery + installBattery;

        if (battery >= 2) {

            glowing("red");

        } else {

            notEnoughBatteryes();
        }


    }

    public void glowWithWhite(int installBattery) {

        battery = battery + installBattery;

        if (battery >= 1) {

            glowing("white");


        } else {

            notEnoughBatteryes();

        }

    }

    public void glowingWithFlash(int installBattery) {

        battery = battery + installBattery;

        if (battery >= 3) {

            glowing("flash");

        } else {

            notEnoughBatteryes();
        }
    }

    public void glowWithGreen(int installBattery) {

        battery = battery + installBattery;

        if (battery >= 4) {

            glowing("green");

        } else {

            notEnoughBatteryes();
        }


    }

    public void glowWithYellow(int installBattery) {

        battery = battery + installBattery;

        if ((battery >= 1) && (battery < 4)) {

            glowing("yellow");

        } else if (battery < 1) {

            notEnoughBatteryes();
        } else {

            tooMuchBatteryes();
        }


    }

    private void glowing(String type) {

        System.out.println("Glowing with " + type + ".");


    }

    private void notEnoughBatteryes() {

        System.out.println("Not enough bataryes");


    }

    private void tooMuchBatteryes() {

        System.out.println("Too much bataryes");
    }


}
