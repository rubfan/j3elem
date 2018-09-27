package hillel;

public class Flashlight {

    private int battery;
    private int countPress;
    private String status = "off";

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        if (isValidCase(battery)) {
            this.battery = battery;
        } else {
            System.out.println("You can't set a lot of battery");
        }
    }

    private boolean isValidCase(int battery) {
        if (battery < 4) {
            return true;
        }
        return false;
    }

    private void whiteLight() {
        if (isValidWhite()) {
            status = "White";
        } else {
            System.out.println("Is low battery");
        }
    }

    private void redLight() {
        if (isValidRed()) {
            status = "Red";
        } else {
            System.out.println("Is low battery");
        }
    }

    private void strobeLight() {
        if (isValidStrop()) {
            status = "Strobe";
        } else {
            System.out.println("Is low battery");
        }
    }

    public String getStatus() {
        return status;
    }

    private boolean isValidWhite() {
        if (battery > 0) {
            return true;
        }
        return false;
    }

    private boolean isValidRed() {
        if (battery > 1) {
            return true;
        }
        return false;
    }

    private boolean isValidStrop() {
        if (battery > 2) {
            return true;
        }
        return false;
    }

    private void general(int count) {
        switch (count) {
            case 1:
                whiteLight();
                break;

            case 2:
                redLight();
                break;

            case 3:
                strobeLight();
                break;

            default:
                System.out.println("unable command");
                break;
        }
    }

    public void printStatus(String status){
        System.out.println("Flashlighter is " + status);
    }

    public void pressButt() {
        countPress++;
        if (countPress > 3) {
            countPress = 0;
            status = "off";
        }
        general(countPress);
        printStatus(status);
    }
}


