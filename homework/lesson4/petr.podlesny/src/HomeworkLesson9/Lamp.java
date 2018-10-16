
public class Lamp {
    private String name;
    private String model;
    private String color;
    private String size;
    private int maxBatteryCapacity;
    private int battery;
    private Boolean conditionOn;

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    void setModel(String model) {
        this.model = model;
    }

    String getModel() {
        return model;
    }

    void setColor(String color) {
        this.color = color;
    }

    String getColor() {
        return color;
    }

    void setSize(String size) {
        this.size = size;
    }

    String getSize() {
        return size;
    }

    void setMaxBatteryCapacity(int maxBatteryCapacity) {
        if(maxBatteryCapacity > 0){
            this.maxBatteryCapacity = maxBatteryCapacity;
        }
        else {
            System.out.println("Max battery capacity can't be negative number, or 0.");
        }
    }

    int getMaxBatteryCapacity() {
        return maxBatteryCapacity;
    }

    void setBattery(int battery) {
        if((battery >= 0) && (battery <= getMaxBatteryCapacity())) {
            this.battery = battery;
            switch (battery) {
                case 1:
                    shinesWhite();
                    break;
                case 2:
                    shinesRed();
                    break;
                case 3:
                    blinks();
                    break;
            }
        }
        else {
            System.out.println("This particular lamp has only from 1 to 3 batteries");
        }
    }

    int getBattery() {
        return battery;
    }

    void setConditionOn(Boolean conditionOn) {
        this.conditionOn = conditionOn;
    }

    Boolean getConditionOn() {
        return conditionOn;
    }

    void shinesWhite() {
        setConditionOn(true);
        System.out.println("Lights White");
    }

    void shinesRed() {
        setConditionOn(true);
        System.out.println("Lights Red");
    }

    void blinks() {
        setConditionOn(true);
        System.out.println("Blinks");
    }

    void turnedOff() {
        setConditionOn(false);
        System.out.println("Lamp doesn't light");
    }

    void turnedOn() {
        setConditionOn(true);
        System.out.println("Lamp is on");
    }

    void addBattery() {
        int batteries = getBattery();
        int maxBatteryCapac = getMaxBatteryCapacity();
        if ((batteries < maxBatteryCapac) && (batteries >= 0)) {
            batteries++;
            setBattery(batteries);
        }
        else {
            System.out.println("Wrong amount of batteries");
        }

    }

    void removeBattery() {
        int batteries = getBattery();
        int maxBatteryCapac = getMaxBatteryCapacity();
        if ((batteries > 0) && (batteries <= maxBatteryCapac)) {
            batteries--;
            setBattery(batteries);
        }
        else {
            System.out.println("Wrong amount of batteries");

        }
    }

    void info() {
        System.out.println("Name is: " + name + ". Model is: " + model + ". Color is: " + color + ". Size is: " +
                size + ". Lamp is turned on: " + conditionOn + ". Battery: " + battery);
    }

    public static void main(String[] args) {
        Lamp lamp = new Lamp();
        lamp.setName("Sati");
        lamp.setModel("NX-42");
        lamp.setColor("Black");
        lamp.setSize("Medium");
        lamp.setMaxBatteryCapacity(3);
        lamp.setBattery(3);
        lamp.shinesRed();
        lamp.shinesWhite();
        lamp.blinks();
        lamp.removeBattery();
        lamp.shinesRed();
        lamp.blinks();
        lamp.addBattery();
        lamp.addBattery();
        lamp.removeBattery();
        lamp.turnedOn();
        lamp.info();
    }
}
