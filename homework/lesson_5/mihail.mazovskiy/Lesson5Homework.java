import java.util.Scanner;

/**
 * Created by m_maz on 01.09.2018.
 */
public class Lesson5Homework {
    public static void main(String[] args) {
        String consoleInput="";
        while(!(consoleInput.toLowerCase().equals("exit".toLowerCase()))) {
            System.out.println("1. Calculator");
            System.out.println("2. Tip calculator");
            System.out.println("Input 'exit' to exit ");
            System.out.print("Input number of the task: ");
            Scanner input = new Scanner(System.in);
            consoleInput = input.nextLine();
            switch (consoleInput) {
                case "1" :    calculator(args);
                    break;
                case "2" :    tipCalculator();
                    break;
                default: System.out.println("Quality of service input error");
                    break;
            }
            System.out.println("");
        }
    }

    private static void calculator(String[] args) {
//  Variables inicialization in method - begin
        String operation = null;
        Integer firstOperand = null;
        Integer secondOperand = null;
//  Variables inicialization in method - end
//  Variables inicialization from command console - begin
/*
        String operation = args[1];
        Integer firstOperand = Integer.parseInt(args[0]);
        Integer secondOperand = Integer.parseInt(args[2]);
*/
//  Variables inicialization from command console - end
//  Variables input from console - begin
        System.out.print("Input first operand: ");
        Scanner input = new Scanner(System.in);
        firstOperand = input.nextInt();
        System.out.print("Input operation: ");
        operation = input.next();
        if (!(operation.toLowerCase().trim().equals("abs"))) {
            System.out.print("Input second operand: ");
            secondOperand = input.nextInt();
        }
//  Variables input from console - end
        switch (operation) {
            case "+" :  System.out.println("Result: " + (firstOperand + secondOperand));
                break;
            case "-" :  System.out.println("Result: " + (firstOperand - secondOperand));
                break;
            case "*" :  System.out.println("Result: " + (firstOperand * secondOperand));
                break;
            case "/" :  if(secondOperand.equals(0))
                            System.out.println("Can not divide on zero");
                        else System.out.println("Result: " + ((float)firstOperand / secondOperand));
                break;
            case "abs" :  System.out.println("Result: " + (Math.abs(firstOperand)));
                break;
            default : System.out.println("Operator input error");
                break;
        }
    }

    private static void tipCalculator() {
        Scanner input = new Scanner(System.in);
        System.out.print("Input restaurant bill amount: ");
        Integer billAmount = input.nextInt();
        System.out.print("Input quality of service (terrible, poor, good, great, excellent): ");
        String serviceQuality = input.next().toLowerCase().trim();
        switch (serviceQuality) {
            case "terrible":    System.out.println(billAmount);
                break;
            case "poor" :    System.out.println("Amount of bill with tip: " + (billAmount+billAmount/100*5));
                break;
            case "good" :    System.out.println("Amount of bill with tip: " + (billAmount+billAmount/100*10));
                break;
            case "great" :    System.out.println("Amount of bill with tip: " + (billAmount+billAmount/100*15));
                break;
            case "excellent" :    System.out.println("Amount of bill with tip: " + (billAmount+billAmount/100*20));
                break;
            default : System.out.println("Quality of service input error");
                break;
        }
    }
}
