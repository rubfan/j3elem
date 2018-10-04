

public class Light {

    int battery = 0;


    public boolean glowWithRed(int installBattery) {

        battery = battery + installBattery;
        boolean isRed;

        if (battery >= 2) {

            glowing("red");
            isRed = true;

        } else {

            notEnoughBatteryes();
            isRed = false;
        }

        return isRed;
    }

    public boolean glowWithWhite(int installBattery) {

        battery = battery + installBattery;
        boolean isWhite;

        if (battery >= 1) {

            glowing("white");
            isWhite = true;

        } else {

            notEnoughBatteryes();
            isWhite = false;

        }

        return isWhite;
    }

    public boolean glowingWithFlash(int installBattery) {

        battery = battery + installBattery;
        boolean isflashing;

        if (battery >= 3) {

            glowing("flash");
            isflashing = true;

        } else {

            notEnoughBatteryes();
            isflashing = false;
        }

        return isflashing;
    }

    public boolean glowWithGreen(int installBattery) {

        battery = battery + installBattery;
        boolean isGreen;

        if (battery >= 4) {

            glowing("green");
            isGreen = true;

        } else {

            notEnoughBatteryes();
            isGreen = false;
        }

        return isGreen;
    }

    public boolean glowWithYellow(int installBattery) {

        battery = battery + installBattery;
        boolean isYellow;

        if ((battery >= 1) && (battery < 4)) {

            glowing("yellow");
            isYellow = true;

        } else if (battery < 1) {

            notEnoughBatteryes();
            isYellow = false;

        } else {

            tooMuchBatteryes();
            isYellow = false;
        }

        return isYellow;

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
