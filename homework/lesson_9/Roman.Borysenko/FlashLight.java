public class FlashLight {

    private int battery;
    private String name;

    public FlashLight(int battery, String name) {

        this.name = name;
        this.battery = battery;
    }

    public FlashLight() {

        battery = 3;
        name = "Test";
    }

    public void setFunctionFlashLight(int function) {

        if (getFunctionFlashLight(function) == 1) {

            switch (function) {

                case 1:
                    System.out.println("White light");
                    break;

                case 2:
                    System.out.println("Red light");
                    break;

                case 3:
                    System.out.println("Blink light");
                    break;
            }
        }
        else {
            System.out.println("Not enough battery for this function");
        }
    }

    public int getFunctionFlashLight(int setbattery) {

        if(setbattery <= battery) {
            return 1;
        }
            return 0;
    }

    public void getInfo() {

        System.out.println("name: " + name + " count of batterry: " + battery);
    }
}
