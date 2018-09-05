import java.util.Scanner;

public class Cash {

    public static void main(String[] args) {

        int service;
        double cash;
        System.out.println("1. Terrible(0%)");
        System.out.println("2. Poor(5%)");
        System.out.println("3. Good(10%)");
        System.out.println("4. Great(15%)");
        System.out.println("5. Excelent(20%)");
        System.out.println("Please Enter number of service:");
        service = new Scanner(System.in).nextInt();
        System.out.println("Please enter cash");
        cash = new Scanner(System.in).nextDouble();
        System.out.println("You must pay: " + getAddCash(service,cash));

    }

    static double getAddCash(int a, double b) {

        switch(a) {
            case 2:
                b +=  b*0.05;
                break;
            case 3:
                b +=  b*0.1;
                break;
            case 4:
                b +=  b*0.15;
                break;
            case 5:
                b +=  b*0.2;
                break;
        }

        return b;
    }

}
