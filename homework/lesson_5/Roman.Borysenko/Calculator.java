import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        double firstOperand;
        double secondOperand;
        String operation;
        int type =0;

        while(type != 4) {
            System.out.println("1: Static calculator");
            System.out.println("2: Calculator from keyboard");
            System.out.println("3: Calculator with parameters from command line");
            System.out.println("4: Exit");
            type = new Scanner(System.in).nextInt();
            switch (type) {

                case 1:
                    firstOperand = -15;
                    secondOperand = 8;
                    System.out.println("First parameter:" + firstOperand + " SecondOperand: " + secondOperand);
                    System.out.println("Multiplication: " + getValueOfOperation("multiplication",
                            firstOperand, secondOperand));
                    System.out.println("Division: " +
                            getValueOfOperation("division", firstOperand, secondOperand));
                    System.out.println("Additioanal: " +
                            getValueOfOperation("additioanal", firstOperand, secondOperand));
                    System.out.println("Subtraction: " +
                            getValueOfOperation("subtraction", firstOperand, secondOperand));
                    System.out.println("Remaind Of  The Division: " +
                            getValueOfOperation("remaindofdivision", firstOperand, secondOperand));
                    System.out.println("Module:  First Parameter " + getModule(firstOperand) +
                            " Second Parameter: " + getModule(secondOperand));
                    System.out.println();
                    break;

                case 2:
                    System.out.println("Please Enter operation (division, multiplication, " + "" +
                            "additioanal, subtraction remaindofdivision, module): ");
                    operation = new Scanner(System.in).next();
                    System.out.println("Please Enter first parameter:");
                    firstOperand = new Scanner(System.in).nextDouble();
                    if (operation.equals("module")) {
                        System.out.println("Module: " + getModule(firstOperand));
                    } else {
                        System.out.println("Please Enter second parameter:");
                        secondOperand = new Scanner(System.in).nextDouble();
                        if(getValueOfOperation(operation, firstOperand, secondOperand) == null) {
                            System.out.println("Wrong operation!!!!");
                            System.out.println("Please Enter operation (division, multiplication, " + "" +
                                    "additioanal, subtraction remaindofdivision, module): ");
                            operation = new Scanner(System.in).next();
                        }
                        System.out.println(operation + ": " +
                                getValueOfOperation(operation, firstOperand, secondOperand));
                    }
                    System.out.println();
                    break;

                case 3:
                    operation = args[0];
                    firstOperand = Double.parseDouble(args[1]);
                    secondOperand = Double.parseDouble(args[2]);
                    System.out.println("First parameter:" + firstOperand +
                            " Second parameter: " + secondOperand);
                    if (operation.equals("module")) {
                        System.out.println("Module: " + getModule(firstOperand) + getModule(secondOperand));
                    } else {
                        System.out.println(operation + ": " +
                                getValueOfOperation(operation, firstOperand, secondOperand));
                    }
                    System.out.println();
                    break;

                case 4:
                    return;

            }
        }
    }

    static Double  getValueOfOperation(String operation, double a, double b) {

        Double c = null;
        switch ( operation ) {
            case "multiplication":
                c = a * b;
                break;
            case "division":
                c = a / b;
                break;
            case "additioanal":
                c = a + b;
                break;
            case "subtraction":
                c = a - b;
                break;
            case "remaindofdivision":
                c = a % b;
                break;
        }

        return c;
    }

    static Double getModule(double a) {

        return Math.abs(a);
    }
}

