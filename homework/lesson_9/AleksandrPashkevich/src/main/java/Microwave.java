public class Microwave {

    public boolean heat(int time) {
        boolean isHot;

        if (time > 2) {
            isHot = true;
            System.out.println("Food is hot.");
        } else {
            isHot = false;
            System.out.println("Food is cold.");
        }
        return isHot;
    }

    public boolean cook(int time) {
        boolean isCooked;

        if (time <= 10) {

            isCooked = false;
            System.out.println("Food is not cooked.");

        } else {

            isCooked = true;
            System.out.println("Food is ready;");

        }

        return isCooked;

    }
}
