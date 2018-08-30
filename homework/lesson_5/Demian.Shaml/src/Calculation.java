/**
 * @author DemianSh
 * This class calculate math operation to Main class
 */

import java.util.Scanner;

public class Calculation {

    Scanner in = new Scanner(System.in);

    public static int amonthValue(int val1, int val2) {
        int result = val1 + val2;
        return result;
    }

    public static int subtractionValue(int val1, int val2) {
        int result = val1 - val2;
        return result;
    }

    public static int multiplicationValue(int val1, int val2) {
        int result = val1 * val2;
        return result;
    }

    public static int divisionValue(int val1, int val2) {
        int result = val1 / val2;
        return result;
    }

    public static int absValue(int val) {
        int result = +val;
        return result;
    }

    public static int divisionRemainder(int val1, int val2) {
        int result = val1 % val2;
        return result;
    }

    public void chooseOperation(int num) {
        switch (num) {
            case 1:
                System.out.println("Amouth");
                System.out.print("Please input first operand: ");
                errorInput();
                int firOpAm = in.nextInt();
                System.out.print("Please input second operand: ");
                errorInput();
                int secOpAm = in.nextInt();
                System.out.print("result this easy operation is: ");
                System.out.println(Calculation.amonthValue(firOpAm, secOpAm));
                break;

            case 2:
                System.out.println("Subtraction");
                System.out.print("Please input first operand: ");
                errorInput();
                int firOpSb = in.nextInt();
                System.out.print("Please input second operand: ");
                errorInput();
                int secOpSb = in.nextInt();
                System.out.print("result this easy operation is: ");
                System.out.println(Calculation.subtractionValue(firOpSb, secOpSb));
                break;

            case 3:
                System.out.println("Multiplication");
                System.out.print("Please input first operand: ");
                errorInput();
                int firOpMl = in.nextInt();
                System.out.print("Please input second operand: ");
                errorInput();
                int secOpMl = in.nextInt();
                System.out.print("result this easy operation is: ");
                System.out.println(Calculation.multiplicationValue(firOpMl, secOpMl));
                break;

            case 4:
                System.out.println("Division");
                System.out.print("Please input first operand: ");
                errorInput();
                int firOpDv = in.nextInt();
                System.out.print("Please input second operand: ");
                errorInput();
                int secOpDv = in.nextInt();
                System.out.print("result this easy operation is: ");
                System.out.println(Calculation.divisionValue(firOpDv, secOpDv));
                break;

            case 5:
                System.out.println("Abs");
                System.out.print("Please intput operand what you want to modulate: ");
                errorInput();
                int op = in.nextInt();
                System.out.print("result this easy operation is: ");
                System.out.println(Calculation.absValue(op));
                break;

            case 6:
                System.out.println("Remainder after division");
                System.out.print("Please input first operand: ");
                errorInput();
                int firOpRm = in.nextInt();
                System.out.print("Please input second operand: ");
                errorInput();
                int secOpRm = in.nextInt();
                System.out.print("result this easy operation is: ");
                System.out.println(Calculation.divisionRemainder(firOpRm, secOpRm));
                break;

            case 7:
                System.out.println("Exit");
                break;

            default:
                System.out.println("You choose invaild operation!");
                System.out.println("Please input correct number!");
                System.out.println();
                break;
        }
    }

    public void showOperation() {
        System.out.println("Hello!!");
        System.out.println("1. Amounth");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Divison");
        System.out.println("5. Abs");
        System.out.println("6. Remainder after division");
        System.out.println("7. Exit");
        System.out.println();
        System.out.print("Plese choose number operation what you want to calculation: ");
    }

    public boolean isVaild(int num) {
        if (num < 1 || num > 6) {
            return false;
        } else {
            return true;
        }
    }

    public void errorInput() {
        do {
            if (!in.hasNextInt()) {
                System.out.println("This isn't correct value for calculation!");
                System.out.print("Please try again: ");
                in.next();
            }
        } while (!in.hasNextInt());
    }
}
