/**
 * @author DemianSh
 * This class calculate math operation to Main class
 */

import java.util.Scanner;

public class Calculation {

    Scanner in = new Scanner(System.in);
    private int calcAgrs0, calcArgs1;

    public int amonthValue(int val1, int val2) {
        int result = val1 + val2;
        return result;
    }

    public int subtractionValue(int val1, int val2) {
        int result = val1 - val2;
        return result;
    }

    public int multiplicationValue(int val1, int val2) {
        int result = val1 * val2;
        return result;
    }

    public double divisionValue(double val1, double val2) {
        double result = val1 / val2;
        return result;
    }

    public int absValue(int val) {
        int result = Math.abs(val);
        return result;
    }

    public int divisionRemainder(int val1, int val2) {
        int result = val1 % val2;
        return result;
    }

    public void chooseOperation(int num) {
        switch (num) {
            case 1:
                System.out.println();
                System.out.println("Amouth");
                System.out.println();
                System.out.print("Please input first operand: ");
                int firOpAm = errorInput();
                System.out.println();
                System.out.print("Please input second operand: ");
                int secOpAm = errorInput();
                System.out.println();
                System.out.print("result this easy operation is: ");
                System.out.println(amonthValue(firOpAm, secOpAm));
                break;

            case 2:
                System.out.println();
                System.out.println("Subtraction");
                System.out.println();
                System.out.print("Please input first operand: ");
                int firOpSb = errorInput();
                System.out.println();
                System.out.print("Please input second operand: ");
                int secOpSb = errorInput();
                System.out.println();
                System.out.print("result this easy operation is: ");
                System.out.println(subtractionValue(firOpSb, secOpSb));
                break;

            case 3:
                System.out.println();
                System.out.println("Multiplication");
                System.out.println();
                System.out.print("Please input first operand: ");
                int firOpMl = errorInput();
                System.out.println();
                System.out.print("Please input second operand: ");
                int secOpMl = errorInput();
                System.out.println();
                System.out.print("result this easy operation is: ");
                System.out.println(multiplicationValue(firOpMl, secOpMl));
                break;

            case 4:
                System.out.println();
                System.out.println("Division");
                System.out.println();
                System.out.print("Please input first operand: ");
                int firOpDv = errorInput();
                System.out.println();
                System.out.print("Please input second operand: ");
                int secOpDv = errorInput();
                System.out.println();
                System.out.print("result this easy operation is: ");
                System.out.println(divisionValue(firOpDv, secOpDv));
                break;

            case 5:
                System.out.println();
                System.out.println("Abs");
                System.out.println();
                System.out.print("Please intput operand what you want to modulate: ");
                int op = errorInput();
                System.out.println();
                System.out.print("result this easy operation is: ");
                System.out.println(absValue(op));
                break;

            case 6:
                System.out.println();
                System.out.println("Remainder after division");
                System.out.println();
                System.out.print("Please input first operand: ");
                int firOpRm = errorInput();
                System.out.println();
                System.out.print("Please input second operand: ");
                int secOpRm = errorInput();
                System.out.println();
                System.out.print("result this easy operation is: ");
                System.out.println(divisionRemainder(firOpRm, secOpRm));
                break;

            case 7:
                System.out.println();
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
        System.out.println();
        System.out.println("Aviable operations: ");
        System.out.println();
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

    /**
     * This method check type input values
     * @return correct input value
     */
    public int errorInput() {
        do {
            if (!in.hasNextInt()) {
                System.out.println("This isn't correct value for calculation!");
                System.out.print("Please try again: ");
                in.next();
            }
        } while (!in.hasNextInt());
        return in.nextInt();
    }

    public void showChoose() {
        System.out.println("1. Use arguments for input args[]");
        System.out.println();
        System.out.println("2. Use the method Scanner for input operands");
        System.out.println();
        System.out.println("3. Task for calculation tips");

    }

    public void chooseOperationArgs(int num) {
        switch (num) {
            case 1:
                System.out.println();
                System.out.println("Amouth");
                System.out.println();
                System.out.println("Your arg[0]: " + calcAgrs0);
                System.out.println();
                System.out.println("Your arg[1]: " + calcArgs1);
                System.out.println();
                System.out.print("result this easy operation is: ");
                System.out.println(amonthValue(calcAgrs0, calcArgs1));
                break;

            case 2:
                System.out.println();
                System.out.println("Subtraction");
                System.out.println();
                System.out.println("Your arg[0]: " + calcAgrs0);
                System.out.println();
                System.out.println("Your arg[1]: " + calcArgs1);
                System.out.println();
                System.out.print("result this easy operation is: ");
                System.out.println(subtractionValue(calcAgrs0, calcArgs1));
                break;

            case 3:
                System.out.println();
                System.out.println("Multiplication");
                System.out.println();
                System.out.println("Your arg[0]: " + calcAgrs0);
                System.out.println();
                System.out.println("Your arg[1]: " + calcArgs1);
                System.out.println();
                System.out.print("result this easy operation is: ");
                System.out.println(multiplicationValue(calcAgrs0, calcArgs1));
                break;

            case 4:
                System.out.println();
                System.out.println("Division");
                System.out.println();
                System.out.println("Your arg[0]: " + calcAgrs0);
                System.out.println();
                System.out.println("Your arg[0]: " + calcArgs1);
                System.out.println();
                System.out.print("result this easy operation is: ");
                System.out.println(divisionValue(calcAgrs0, calcArgs1));
                break;

            case 5:
                System.out.println();
                System.out.println("Abs");
                System.out.println();
                System.out.println("Your arg[0]: " + calcAgrs0);
                System.out.println();
                System.out.println("Your arg[0]: " + calcArgs1);
                System.out.println();
                System.out.print("result this easy operation is: ");
                System.out.print(absValue(calcAgrs0));
                System.out.print(", ");
                System.out.print(absValue(calcArgs1));
                break;

            case 6:
                System.out.println();
                System.out.println("Remainder after division");
                System.out.println("Your arg[0]: " + calcAgrs0);
                System.out.println();
                System.out.println("Your arg[0]: " + calcArgs1);
                System.out.println();
                System.out.print("result this easy operation is: ");
                System.out.println(divisionRemainder(calcAgrs0, calcArgs1));
                break;

            case 7:
                System.out.println();
                System.out.println("Exit");
                break;

            default:
                System.out.println("You choose invaild operation!");
                System.out.println("Please input correct number!");
                System.out.println();
                break;
        }

    }

    public void setCalcAgrs0(String val) {
        calcAgrs0 = Integer.parseInt(val);
    }

    public void setCalcArgs1(String val) {
        calcArgs1 = Integer.parseInt(val);
    }

    public void tipsCalc(int num) {
        switch (num) {
            case 1:
                System.out.println();
                excuses();
                System.out.print("Please input your amounth payment: ");
                int amPay = errorInput();
                System.out.println();
                System.out.println("Prepare for payment: " + amPay);
                break;

            case 2:
                System.out.println();
                excuses();
                System.out.print("Please input your amounth payment: ");
                int amPayPoor = errorInput();
                System.out.println();
                System.out.println("Prepare for payment: " + poorleCalc(amPayPoor));
                break;

            case 3:
                System.out.println();
                thnnx();
                System.out.print("Please input your amounth payment: ");
                int amPayGood = errorInput();
                System.out.println();
                System.out.println("Prepare for payment: " + goodleCalc(amPayGood));
                break;

            case 4:
                System.out.println();
                thnnx();
                System.out.print("Please input your amounth payment: ");
                int amPayGreat = errorInput();
                System.out.println();
                System.out.println("Prepare for payment: " + greatleCalc(amPayGreat));
                break;

            case 5:
                System.out.println();
                thnnx();
                System.out.print("Please input your amounth payment: ");
                int amPayEx = errorInput();
                System.out.println();
                System.out.println("Prepare for payment: " + exellCalc(amPayEx));
                break;
        }
    }

    public void showTips() {
        System.out.println();
        System.out.println("Please choose how you appraise our service ");
        System.out.println();
        System.out.println("1. Terrible");
        System.out.println();
        System.out.println("2. Poor");
        System.out.println();
        System.out.println("3. Good");
        System.out.println();
        System.out.println("4. Great");
        System.out.println();
        System.out.println("5. Excellent");
    }

    public void excuses() {
        System.out.println("We sorry so much, if you don't like our service");
        System.out.println("You can write in compliant book about your remarks");
        System.out.println();
    }

    public void thnnx() {
        System.out.println("We're glad so much what you are satisfied our service");
        System.out.println("You can write in compliant book about your remarks");
        System.out.println("We wait you visit again");
        System.out.println();
    }

    public double poorleCalc (double pay){
        double tip = 0.05;
        double result = pay + (pay * tip);
       return result;
    }

    public double goodleCalc (double pay){
        double tip = 0.1;
        double result = pay + (pay * tip);
        return result;
    }

    public double greatleCalc (double pay){
        double tip = 0.15;
        double result = pay + (pay * tip);
        return result;
    }

    public double exellCalc (double pay){
        double tip = 0.2;
        double result = pay + (pay * tip);
        return result;
    }
}
