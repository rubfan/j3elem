public class Television {
    private String name;
    private String model;
    private String color;
    private Boolean turnedOn;
    private int mode;
    private int channel;

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

    void setTurnedOn(Boolean turnedOn) {
        this.turnedOn = turnedOn;
    }

    Boolean getTurnedOn() {
        return turnedOn;
    }

    void setMode(int mode) {
        if((mode > 0) && (mode < 5)) {
            this.mode = mode;
            switch (mode) {
                case 1:
                    showFromUsb();
                    break;
                case 2:
                    showAvSignal();
                    break;
                case 3:
                    showDtvSignal();
                    break;
                case 4:
                    showHdmiSignal();
                    break;
            }
        }
        else {
            System.out.println("This Tv doesn't have this mode. Please pick the mode between 1 and 4");
        }
    }

    int getMode() {
        return mode;
    }

    void setChannel(int channel) {
        if ((channel >= 0) && (channel < 1000)) {
            this.channel = channel;
        }
        else {
            System.out.println("Chanel's number should be from 0 to 999");
        }
    }

    int getChannel() {
        return channel;
    }

    void showFromUsb() {
        setTurnedOn(true);
        System.out.println("Tv-set shows from USB drive");
    }

    void showAvSignal() {
        setTurnedOn(true);
        System.out.println("Tv-set shows AV signal");
        }

    void showDtvSignal(){
        setTurnedOn(true);
        System.out.println("Tv-set shows DTV signal");
    }

    void showHdmiSignal() {
        setTurnedOn(true);
        System.out.println("Tv-set shows HDMI signal");
    }

    void showChannel() {
        setTurnedOn(true);
        int chan = getChannel();
        System.out.println("Tv-set shows " + chan + " channel.");
    }

    void showInfo() {
        System.out.println("Tv's name: " + name + ".Model is: " + model + ".Color is: " + color + ".Tv is on: " +
                turnedOn + ".Tv's mode " + mode + ".Channel is: " + channel);
    }

    public static void main(String[] args) {
        Television tv = new Television();
        tv.setName("Sony");
        tv.setColor("Silver");
        tv.setModel("Rx-f45");
        tv.setTurnedOn(false);
        tv.setMode(2);
        tv.setChannel(45);
        tv.showInfo();
    }
}

