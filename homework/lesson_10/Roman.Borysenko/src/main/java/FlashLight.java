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

    public String setFunctionFlashLight(int function) {

        String str = "";
        if (getFunctionFlashLight(function) == 1) {

            switch (function) {

                case 1:
                    str = "White light";
                    break;

                case 2:
                    str = "Red light";
                    break;

                case 3:
                    str = "Blink light";
                    break;
            }
        }
        else {
            str = "Not enough battery for this function";
        }
        System.out.println(str);
        System.out.println();

        return str;
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