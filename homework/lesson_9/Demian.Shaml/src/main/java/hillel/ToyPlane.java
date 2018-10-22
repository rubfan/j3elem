package hillel;


public class ToyPlane {

    private int chBattery;
    private String status = "stand";
    private String statusM = "motor off";

    public int rechargeBat() {
        return chBattery = 100;
    }

    public int getChBattery() {
        return chBattery;
    }

    public void startMotor() {
        if (statusM.equals("motor off") && chBattery > 10) {
            chBattery--;
            statusM = "motor on";
        } else {
            statusM = "motor off";
        }
    }

    public String getStatusM() {
        return statusM;
    }

    private boolean isStatusM() {
        if (statusM.equals("motor on")) {
            return true;
        }
        return false;
    }

    public String getCurrentComm() {
        return status;
    }

    public void goFront() {
        if(isStatusM()) {
            status = "go front";
            consumBat();
        }
    }

    public void goUp() {
        if(isStatusM()) {
            status = "go up";
            consumBat();
        }
    }

    public void goDown() {
        if(isStatusM()) {
            status = "go down";
            consumBat();
        }
    }

    public void turnLeft() {
        if(isStatusM()) {
            status = "turn left";
            consumBat();

        }
    }

    public void turnRight() {
        if(isStatusM()) {
            status = "turn right";
            consumBat();
        }
    }

    private void consumBat() {
        --chBattery;
        warnBat(chBattery);
        emerLend(chBattery);
    }

    private void warnBat(int chBattery) {
        if (chBattery < 20) {
            status = status + " Battery is low!";
        }
    }

    private void emerLend(int chBattery) {
        if (chBattery < 5) {
            status = "Emergency lending!";
        }
    }
}
