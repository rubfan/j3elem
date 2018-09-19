/*
     кассовый аппарат
*/
public class CashMachine {

    String model;
    int order;
    String[] tovar;

    public CashMachine(String name) {
        model = name;
    }

    public void printOrder(int order) {

        switch(order) {

            case 1:
                System.out.println("Printing X-order");
                break;

            case 2:
                System.out.println("Printing Z-order");
                break;

            case 3:
                System.out.println("Printing time order");
        }
    }

    public void printingCheck(String[][] tovar) {

        Double count, quantity, sum;
        System.out.println("Printing check:");
        System.out.println();
        for(int i = 0; i < tovar.length; i++ ) {
            count = Double.parseDouble(tovar[i][1]);
            quantity = Double.parseDouble(tovar[i][1]);
            sum = count * quantity;
            System.out.println("\t" + tovar[i][0] + ":   " + count + "   " + quantity + "  = " +  sum);
        }
    }

    /* прогон чековой    ленты" */

    public void checkRun(int countRow) {

        System.out.println("check tun on " + countRow + " rows");
    }
}
