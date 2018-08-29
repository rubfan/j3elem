import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        calculator("|",12, 15);
        calculatorInput();
        calculatorInputCmd(args[0], args [1], args[2]);
        tips(118, "excellent");
    }

    private static int addition(int a, int b) {

        return a + b;

    }

    private static int substraction(int a, int b) {

        return a - b;

    }

    private static int multiplication(int a, int b) {

        return a * b;

    }

    private static float division(float a, float b) {

        return a / b;

    }

    private static int remOfTheDivision(int a, int b) {

        return a % b;

    }

    private static float absValue(float a) {

        a = Math.abs(a);

        return(a);

    }

    private static void calculator(String add, int a, int b) {

        if (add.equals("+"))
            System.out.println("Результат сложения = " + addition(a, b));

        else if (add.equals("-"))
            System.out.println("Результат вычитания = " + substraction(a, b));
        else if (add.equals("*"))
            System.out.println("Результат умножения = " + multiplication(a, b));
        else if (add.equals("/"))
            System.out.println("Результат деления = " + division(a, b));
        else if (add.equals("%"))
            System.out.println("Результат остатка от деления = " + remOfTheDivision(a, b));
        else if (add.equals("|"))
            System.out.println("Модуль первого значения = " + absValue(a));

        else System.out.println("Операция не поддерживается");
    }

    private static void calculatorInput() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Введите операцию:" );
        String inputAdd = scan.next();

        System.out.println("Введите первое значение:");
        int firstValue = scan.nextInt();

        System.out.println("Введите второе значение:");
        int secondValue = scan.nextInt();

        calculator(inputAdd, firstValue, secondValue);

    }

    private static void calculatorInputCmd(String add, String a, String b) {

        int firstValue = Integer.parseInt(a);
        int secondValue = Integer.parseInt(b);

        calculator(add, firstValue, secondValue);

    }

    private static void tips(int a, String b) {

        if (b.equals("terrible"))
            System.out.println("Сумма чаевых составляет: 0");

        else if (b.equals("poor"))
            System.out.println("Сумма чаевых составляет: " + a * 0.05 + " UAH");
        else if (b.equals("good"))
            System.out.println("Сумма чаевых составляет: " + a * 0.1 + " UAH");
        else if (b.equals("great"))
            System.out.println("Сумма чаевых составляет: " + a * 0.15 + " UAH");
        else if (b.equals("excellent"))
            System.out.println("Сумма чаевых составляет: " + a * 0.2 + " UAH");

        else System.out.println("Введите корректные данные");
    }
}