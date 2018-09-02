import java.util.Scanner;

public class HomeworkLesson5 {

    public static void main(String[] args) {
        String data[] =  {args[0], args[1], args[2]};
        calcWithoutInput();
        calcWithInput();
        calcWithConsoleInput(data);
        tipsCalculation();
    }

    public static void calcWithoutInput() {
        int firstOperand = 15;
        int secondOperand = 12;
        String operation = "multiplication";
        System.out.println("Задача 1: ");
        switch (operation) {
            case "addition":
                System.out.println("Addition = " + (firstOperand + secondOperand));
            case "substraction":
                System.out.println("Substraction = " + (firstOperand - secondOperand));
            case "multiplication":
                System.out.println("Multiplication = " + (firstOperand * secondOperand));
            case "division":
                System.out.println("Division = " + ((double)firstOperand / secondOperand));
            case "absolute":
                System.out.println("Absolute of: number 1: " + Math.abs(firstOperand) + ", number 2: " +
                    Math.abs(secondOperand));
            case "mod":
                System.out.println("Mod = " + (firstOperand % secondOperand));
        }
    }

    public static void calcWithInput() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Задача 2: ");
        System.out.println("Введите операцию (+, -, *, /, absolute, mod): ");
        String operation = scan.next();
        System.out.println("Введите первое число: ");
        int firstOperand = scan.nextInt();
        System.out.println("Введите второe число: ");
        int secondOperand = scan.nextInt();
        switch (operation) {
            case "+":
                System.out.println("Addition = " + (firstOperand + secondOperand));
                break;
            case "-":
                System.out.println("Substraction = " + (firstOperand - secondOperand));
                break;
            case "*":
                System.out.println("Multiplication = " + (firstOperand * secondOperand));
                break;
            case "/":
                System.out.println("Division = " + ((double)firstOperand / secondOperand));
                break;
            case "absolute":
                System.out.println("Absolute of: number 1 : " + Math.abs(firstOperand) + ", number 2:" +
                    Math.abs(secondOperand));
                break;
            case "mod":
                System.out.println("Mod = " + (firstOperand % secondOperand));
        }
    }

    public static void calcWithConsoleInput(String args[]) {
        int[] arr = new int[args.length];
        int firstOperand = Integer.parseInt(args[0]);
        String operation = args[1];
        int secondOperand = Integer.parseInt(args[2]);
        System.out.println("Задача 3: ");
        switch (operation) {
            case "+":
                System.out.println("Addition = " + (firstOperand + secondOperand));
                break;
            case "-":
                System.out.println("Substraction = " + (firstOperand - secondOperand));
                break;
            case "*":
                System.out.println("Multiplication = " + (firstOperand * secondOperand));
                break;
            case "/":
                System.out.println("Division = " + ((double)firstOperand / secondOperand));
                break;
            case "absolute":
                System.out.println("Absolute of: number 1: " + Math.abs(firstOperand) + ", number 2:" +
                    Math.abs(secondOperand));
                break;
            case "mod":
                System.out.println("Mod = " + (firstOperand % secondOperand));
        }
    }

    public static void tipsCalculation() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Задача 4: ");
        System.out.println("Введите сумму чека:  ");
        int amount = scan.nextInt();
        System.out.println("Введите уровень обслуживания (terrible, poor, good, great, excellent): ");
        String serviceLevel = scan.next();
        int tipsForTerrible = 0;
        int tipsForPoor = 5;
        int tipsForGood = 10;
        int tipsForGreat = 15;
        int tipsForExcellent = 20;
        switch (serviceLevel) {
            case "terrible":
                System.out.println("Tips amount is: " + (double)amount * tipsForTerrible / 100);
                break;
            case "poor":
                System.out.println("Tips amount is: " + (double)amount * tipsForPoor / 100);
                break;
            case "good":
                System.out.println("Tips amount is: " + (double)amount * tipsForGood / 100);
                break;
            case "great":
                System.out.println("Tips amount is: " + (double)amount * tipsForGreat / 100);
                break;
            case "excellent":
                System.out.println("Tips amount is: " + (double)amount * tipsForExcellent / 100);
                break;
        }
    }

}
