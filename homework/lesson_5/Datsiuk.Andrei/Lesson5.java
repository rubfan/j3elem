import java.util.Scanner;

public class Lesson5 {
    static Scanner num = new Scanner(System.in);
    private static int args0, args1;
    public static void showChoose(){
        System.out.println("Select variables :");
        System.out.println();
        System.out.println("1. Variable from the keyboard ");
        System.out.println("2. The first argument ");
        System.out.println("3. The second argument ");
    }
    public static void canculator(char operator) {
        switch (operator) {
            case '+':
                System.out.println("+");
                showChoose();
                int ch = number();
                int value1 = argsOrInt(ch);
                showChoose();
                int ch1 = number();
                int value2 = argsOrInt(ch1);
                System.out.println("Addition = " + addition(value1, value2));
                break;

            case '*':
                System.out.println("*");
                showChoose();
                int mch = number();
                int Mvalue1 = argsOrInt(mch);
                showChoose();
                int mch1 = number();
                int Mvalue2 = argsOrInt(mch1);
                System.out.println("Multiplication = " + multiplication(Mvalue1, Mvalue2));
                break;

            case '-':
                System.out.println("-");
                showChoose();
                int sch = number();
                int Svalue1 = argsOrInt(sch);
                showChoose();
                int sch1 = number();
                int Svalue2 = argsOrInt(sch1);
                System.out.println("Subtraction = " + subtraction(Svalue1, Svalue2));
                break;

            case '/':
                System.out.println("/");
                showChoose();
                int dch = number();
                int Dvalue1 = argsOrInt(dch);
                showChoose();
                int dch1 = number();
                int Dvalue2 = argsOrInt(dch1);
                System.out.println("Division = " + division(Dvalue1, Dvalue2));
                break;

            case '%':
                System.out.println("%");
                showChoose();
                int rch = number();
                int Rvalue1 = argsOrInt(rch);
                showChoose();
                int rch1 = number();
                int Rvalue2 = argsOrInt(rch1);
                System.out.println("Remainder Of Division = " + remainderOfDivision(Rvalue1, Rvalue2));
                break;
            default:
                System.out.println("Invalid input");
        }
        System.out.println();
        System.out.println( "Amount of tips");
        System.out.println("Enter the full amount : ");
        double fullamout = num.nextDouble();

        System.out.println("Select service ");
        System.out.println();
        System.out.println("1 Terrible - 0%");
        System.out.println("2 Poor - 5%");
        System.out.println("3 Good -10%");
        System.out.println("4 Great -15%");
        System.out.println("5 Excellent -20)");
        System.out.println();

        int service = num.nextInt();

        switch (service) {
            case 1:
                System.out.println("You must give: " + percent0(fullamout));
                break;

            case 2:
                System.out.println("You must give: " +  percent5(fullamout));
                break;

            case 3:
                System.out.println("You must give: " +  percent10(fullamout));
                break;

            case 4:
                System.out.println("You must give: " + percent15(fullamout));
                break;

            case 5:
                System.out.println("You must give: " +percent20(fullamout));
                break;

            default:
                System.out.println("Invalid input");
        }
    }
    public static double percent0 (double a){
        double res = a * 0;
        return res;
    }
    public static double percent5 (double a){
        double res = a * 0.05;
        return res;
    }
    public static double percent10 (double a){
        double res = a * 0.1;
        return res;
    }
    public static double percent15 (double a){
        double res = a * 0.15;
        return res;
    }
    public static double percent20 (double a){
        double res = a * 0.2;
        return res;
    }
    public static int number(){
        int in = num.nextInt();
        return in;
    }
    public static int argsOrInt (int v1) {
        switch (v1) {
            case 1:
                System.out.printf("Enter the variable from the keyboard :");
                int result = number();
                return result;

            case 2:
                System.out.println("First argument ");
                int result0 = args0;
                return result0;

            case 3:
                System.out.println("Second argument ");
                int result1 = args1;
                return result1;

            default:
                System.out.printf("Repeat");
                int ch = number();
                return argsOrInt(ch);
        }
    }
    public static int addition(int v1, int v2) {
        int res = v1 + v2;
        return res;
    }
    public static int multiplication (int v1, int v2){
        int res = v1*v2;
        return res ;
    }
    public static int subtraction (int v1, int v2) {
        int res = v1 - v2;
        return res;
    }
    public static int division (int v1, int v2) {
        int res = v1 / v2;
        return res;
    }
    public static int remainderOfDivision(int v1, int v2) {
        int res = v1 % v2;
        return res;
    }
    public static void setArgs0(String v1){
        args0 = Integer.parseInt(v1);
    }

    public static void setArgs1(String v2) {
        args1 = Integer.parseInt(v2);
    }

}









