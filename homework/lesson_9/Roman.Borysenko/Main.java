public class Main {

    public static void main(String[] args) {

    FlashLight f, f1;
    f = new FlashLight();
    f1 = new FlashLight(2, "flash");
    f.getInfo();
    f.setFunctionFlashLight(3);
    f1.getInfo();
    f1.setFunctionFlashLight(3);
    }
}
