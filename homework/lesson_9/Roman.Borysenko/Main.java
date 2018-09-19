public class Main {

    public static void main(String[] args) {

        FlashLight f, f1;
        f = new FlashLight();
        f1 = new FlashLight(2, "flash");
        f.getInfo();
        f.setFunctionFlashLight(3);
        f1.getInfo();
        f1.setFunctionFlashLight(3);
        System.out.println();

        Printer p = new Printer("HP 1080");
        p.setPrinting(p.setCountListDocument(10),5);
        System.out.println();

        CashMachine cash = new CashMachine("Maria 304");
        String[][] check = new String[][]{{"Apple ", "8.0","9.0"},{"Banana", "2.0","15.0"}};
        cash.printOrder(1);
        cash.printOrder(2);
        System.out.println();
        cash.checkRun(100);
        cash.printingCheck(check);
    }
}
