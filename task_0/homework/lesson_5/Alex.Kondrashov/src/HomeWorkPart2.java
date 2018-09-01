import java.util.Scanner;

public class HomeWorkPart2 {


    public static void main(String[] args) {

        // Small calculator

        String multiplication = "1 multiplication";
        String divide = "2 divide";
        String addition = "3 addition";
        String subtraction = "4 subtraction";
        String remainderOfDivision = "5 remainder of division";

        Scanner myScanner = new Scanner(System.in);

        System.out.println("Choose your operation: ");
        System.out.println(multiplication);
        System.out.println(divide);
        System.out.println(addition);
        System.out.println(subtraction);
        System.out.println(remainderOfDivision);

        double firstOperand;
        double secondOperand;

        System.out.print("\n");

        int choose = myScanner.nextInt();

        while (choose <= 0 || choose >= 6) {
            System.out.println("You entered wrong digit, please try again");
            choose = myScanner.nextInt();
        }

        if (args.length != 0) {
            firstOperand = Double.valueOf(args[0]);
            secondOperand = Double.valueOf(args[1]);
        } else {
            System.out.print("\nEnter first number: ");
            firstOperand = myScanner.nextDouble();

            System.out.print("Enter second number: ");
            secondOperand = myScanner.nextDouble();
        }

        System.out.println("");

        switch (choose) {
            case 1:
                System.out.println("Result is: " + calcMultiplicatin(firstOperand, secondOperand));
                break;
            case 2:
                System.out.println("Result is: " + calcDivide(firstOperand, secondOperand));
                break;
            case 3:
                System.out.println("Result is: " + calcAddition(firstOperand, secondOperand));
                break;
            case 4:
                System.out.println("Result is: " + calcSubtraction(firstOperand, secondOperand));
                break;
            case 5:
                System.out.println("Result is: " + calcRemainderOfDivision(firstOperand, secondOperand));
                break;
            default:
                System.out.println("fignya vubrana");
        }


        // Tip money

        System.out.println("-----------");
        System.out.println("\nTip's helper");

        System.out.println("\nEnter your total amount: ");
        double qosTotalAmount = myScanner.nextDouble();

        System.out.println("\nChoose number QoS\n ");
        System.out.println("1 Terrible (0%)");
        System.out.println("2 Poor (5%)");
        System.out.println("3 Good (10%)");
        System.out.println("4 Great (15%)");
        System.out.println("5 Ecellent (20%)");
        System.out.println("");

        int qosChoose = myScanner.nextInt();

        while (qosChoose <= 0 || qosChoose >= 6) {
            System.out.println("You entered wrong digit, please try again");
            qosChoose = myScanner.nextInt();
        }

        switch (qosChoose) {
            case 1:
                System.out.println("You must give: " + tip0(qosTotalAmount) + "$ tips");
                break;
            case 2:
                System.out.println("You must give: " + tip5(qosTotalAmount) + "$ tips");
                break;
            case 3:
                System.out.println("You must give: " + tip10(qosTotalAmount) + "$ tips");
                break;
            case 4:
                System.out.println("You must give: " + tip15(qosTotalAmount) + "$ tips");
                break;
            case 5:
                System.out.println("You must give: " + tip20(qosTotalAmount) + "$ tips");
                break;
            default:
                System.out.println("fignya vubrana");
        }

    }


    static double calcMultiplicatin(double a, double b) {
        double temp = a * b;
        return temp;
    }

    static double calcDivide(double a, double b) {
        double temp;
        if (a == 0 || b == 0) {
            System.out.println("You are looser, you can't to divide to zero");
            return temp = 0;
        } else
            temp = a / b;
        return temp;
    }

    static double calcAddition(double a, double b) {
        double temp = a + b;
        return temp;
    }

    static double calcSubtraction(double a, double b) {
        double temp = a - b;
        return temp;
    }

    static double calcRemainderOfDivision(double a, double b) {
        double temp = a % b;
        return temp;
    }

    static double tip0(double a) {
        double temp = 0;
        return temp;
    }

    static double tip5(double a) {
        double temp = a * 0.05;
        return temp;
    }

    static double tip10(double a) {
        double temp = a * 0.1;
        return temp;
    }

    static double tip15(double a) {
        double temp = a * 0.15;
        return temp;
    }

    static double tip20(double a) {
        double temp = a * 0.2;
        return temp;
    }

}
