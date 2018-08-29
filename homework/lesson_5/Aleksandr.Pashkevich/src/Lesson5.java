import java.util.Scanner;

public class Lesson5 {

    public static void main(String[] args) {
        try {
            String task = args[0];
            switch (task) {
                case "calcDemo":
                    calculator(15, 12);
                    break;

                case "calcConsole":
                    calcConsole();
                    break;

                case "calcConsolePlus":
                    calculator(Integer.parseInt(args[1]), Integer.parseInt(args[2]));
                    break;

                case "fee":
                    feeCount(Integer.parseInt(args[1]));
                    break;

                default:
                    errorShow();

            }

        } catch (Exception e) {

            errorShow();

        }
    }

    private static void errorShow() {

        System.out.println("ERROR, check your input data.");

        System.out.println("Lesson5 <task> <input value>");

        System.out.println("task 1: calcDemo");

        System.out.println("task 2: calcConsole");

        System.out.println("task 3: calcConsolePlus");

        System.out.println("task 4: fee");

    }

    private static int multiplication(int val1, int val2) {

        return val1 * val2;

    }

    private static float division(float val1, float val2) {

        return val1 / val2;

    }

    private static int deduction(int val1, int val2) {

        return val1 - val2;

    }

    private static int addition(int val1, int val2) {

        return val1 + val2;

    }

    private static int restOfDiv(int val1, int val2) {

        return val1 % val2;

    }

    private static int module(int val) {

        return Math.abs(val);
    }

    private static void calculator(int val1, int val2) {

        System.out.println(val1 + " + " + val2 + " = " + addition(val1, val2));

        System.out.println(val1 + " - " + val2 + " = " + deduction(val1, val2));

        System.out.println(val1 + " * " + val2 + " = " + multiplication(val1, val2));

        System.out.println(val1 + " / " + val2 + " = " + division(val1, val2));

        System.out.println(val1 + " % " + val2 + " = " + restOfDiv(val1, val2));

        System.out.println("| " + val1 + " | = " + module(val1));

        System.out.println("| " + val2 + " | = " + module(val2));
    }

    private static void calcConsole() {

        Scanner in = new Scanner(System.in);

        System.out.print(" Enter first value: ");

        int val1 = in.nextInt();

        System.out.print("\n Enter seckond value: ");

        int val2 = in.nextInt();

        System.out.println();

        calculator(val1, val2);

    }

    private static void feeCount(float summ) {

        float amountOfFee;

        float[] quality = {0, 5, 10, 15, 20};

        System.out.println("1: terrible;");

        System.out.println("2: poor;");

        System.out.println("3: good;");

        System.out.println("4: excellent;");

        System.out.println();

        System.out.println();

        for (int i = 0; i < quality.length; i++) {

            amountOfFee = summ / 100 * quality[i];

            System.out.println(i + ": " + amountOfFee + " UAH");
        }
        Scanner in = new Scanner(System.in);

        System.out.print("Would you like to count amount of money? (yes / no): ");

        String ask = in.next();

        if (ask.equals("yes")) {

            System.out.print("Enter the number of quality: ");

            Integer myFee = in.nextInt();

            if (myFee > 4) {

                System.out.println("Wrong input");

            } else {

                double fullSumm = summ + (summ / 100 * quality[myFee]);

                String s = Double.toString(fullSumm);

                System.out.println("Amount of money to pay: " + s.substring(0, 4) + " UAH");
            }
        }
    }
}
