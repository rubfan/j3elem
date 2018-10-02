package hillel;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("The first object:");
        Flashlight fl = new Flashlight();
        System.out.println("Flashlighter is " + fl.getStatus());
        fl.setBattery(3);
        System.out.println("battery: " + fl.getBattery());
        fl.pressButt();
        fl.pressButt();
        fl.pressButt();
        fl.pressButt();

        System.out.println();
        System.out.println("The second object:\n");
        ToyPlane tp = new ToyPlane();
        tp.rechargeBat();
        System.out.println("The battery of the plane is " + tp.getChBattery());
        tp.startMotor();
        System.out.println(tp.getStatusM());
        tp.goFront();
        System.out.println("move to " + tp.getCurrentComm());
        tp.goUp();
        System.out.println("move to " + tp.getCurrentComm());
        tp.goDown();
        System.out.println("move to " + tp.getCurrentComm());
        tp.startMotor();
        System.out.println(tp.getStatusM());

        System.out.println();
        System.out.println("The third object:\n");
        Bank b = new Bank();
        b.creatCl("Tomas", "Greed");
        b.creatCl("Mia", "Angel");
        b.creatCl("Stuart", "Roland");
        b.creatCl("Marry", "Ocean");
        b.showallCl();
        System.out.println();
        b.transact(0, "Rent fee");
        b.transact(3, "payment througth terminal");
        b.transact(3, "monet transfer");
        b.transact(1, "payment throught terminal");
        b.showAllTransact();
        System.out.println();
        b.delClient(1);
        b.delClient(2);
        System.out.println("Clients of the bank:");
        b.showallCl();
        System.out.println();
        System.out.println("Archive of the clients:");
        b.showallArch();

    }
}
