public class Door {
    boolean dorOpen = false;
    boolean isLocked = false;

    public boolean openDoor() {

        if ((dorOpen == false) && (isLocked == false)) {

            dorOpen = true;
            System.out.println("Door is open");

        } else if ((dorOpen == true) && (isLocked == false)) {

            System.out.println("Door is alredy open");
            dorOpen = false;

        } else {

            System.out.println("Door is locked, unable to open");
            dorOpen = false;
        }

        return dorOpen;
    }
}
