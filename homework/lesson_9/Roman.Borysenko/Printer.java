public class Printer {

    private String name;
    private int countListDocument;
    private int listRemainder;

    public Printer(String name) {

        this.name = name;
    }

    public void setPrinting(int countList, int remainder) {

        int i = 1;
        while(remainder > 0 && countList > 0) {
            countList--;
            remainder--;
            System.out.println("Printing " + i + " page");
            i++;
        }
        if( countList > 0) {
            System.out.println("Please insert some paper at printer!!!");
        }
    }

    public int setCountListDocument(int count) {

        return count;
    }
}
