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
                int sum = firstOperand + secondOperand;
		System.out.println("Addition = " + sum);
            case "substraction":
                int differ = firstOperand - secondOperand;
		System.out.println("Substraction = " + differ);
            case "multiplication":
                int mult = firstOperand * secondOperand;
		System.out.println("Multiplication = " + mult);
            case "division":
		double div = firstOperand / secondOperand;
                System.out.println("Division = " + div);
            case "absolute":
                System.out.println("Absolute of: number 1: " + Math.abs(firstOperand) + ", number 2: " +
                    Math.abs(secondOperand));
            case "mod":
		int mod = firstOperand % secondOperand;
                System.out.println("Mod = " + mod);
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
                int sum = firstOperand + secondOperand;
		System.out.println("Addition = " + sum);
                break;
            case "-":
		int differ = firstOperand - secondOperand;
                System.out.println("Substraction = " + differ);
                break;
            case "*":
		int mult = firstOperand * secondOperand;
                System.out.println("Multiplication = " + mult);
                break;
            case "/":
		double div = firstOperand / secondOperand;
                System.out.println("Division = " + div);
                break;
            case "absolute":
                System.out.println("Absolute of: number 1 : " + Math.abs(firstOperand) + ", number 2:" +
                    Math.abs(secondOperand));
                break;
            case "mod":
		int mod = firstOperand % secondOperand;
                System.out.println("Mod = " + mod);
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
		int sum = firstOperand + secondOperand;    
                System.out.println("Addition = " + sum);
                break;
            case "-":
		int differ = firstOperand - secondOperand;
                System.out.println("Substraction = " + differ);
                break;
            case "*":
		int mult = firstOperand * secondOperand;
                System.out.println("Multiplication = " + mult);
                break;
            case "/":
		double div = firstOperand / secondOperand;
                System.out.println("Division = " + div);
                break;
            case "absolute":
                System.out.println("Absolute of: number 1: " + Math.abs(firstOperand) + ", number 2:" +
                    Math.abs(secondOperand));
                break;
            case "mod":
		int mod = firstOperand % secondOperand;
                System.out.println("Mod = " + mod);
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
		double tipsTerrible = amount * tipsForTerrible / 100;    
                System.out.println("Tips amount is: " + tipsTerrible);
                break;
            case "poor":
		double tipsPoor = amount * tipsForPoor / 100;
                System.out.println("Tips amount is: " + tipsPoor);
                break;
            case "good":
		double tipsGood = amount * tipsForGood / 100;
                System.out.println("Tips amount is: " + tipsGood);
                break;
            case "great":
		double tipsGreat = amount * tipsForGreat / 100;
                System.out.println("Tips amount is: " + tipsGreat);
                break;
            case "excellent":
		double tipsExcellent = amount * tipsForExcellent / 100;
                System.out.println("Tips amount is: " + tipsExcellent);
                break;
        }
    }

}
