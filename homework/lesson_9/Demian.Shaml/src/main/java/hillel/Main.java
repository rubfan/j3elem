package hillel;

public class Main {
    public static void main(String[] args) {
        Flashlight fl = new Flashlight();
        System.out.println("Flashlighter is " + fl.getStatus());
        fl.setBattery(3);
        System.out.println("battery: " + fl.getBattery());
        fl.pressButt();
        fl.pressButt();
        fl.pressButt();
        fl.pressButt();


    }
}
