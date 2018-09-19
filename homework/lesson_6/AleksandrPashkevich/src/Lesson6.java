package ua.hillel.jp3.homework;

public class Lesson6 {


    public static void main(String[] args) {


        try {

            switch (args[0]) {

                case "order1000":
                    order1000();
                    break;

                case "orderFirst55":
                    orderFirst55();
                    break;

                case "orderPositive":
                    orderPositive();
                    break;
                case "orderFirst20":
                    orderFirst20();
                    break;

                case "sumFirstNElement":
                    sumFirstNElement(Integer.parseInt(args[1]), Integer.parseInt(args[2]));
                    break;

                case "min-max":
                    minMaxMass(Integer.parseInt(args[1]));
                    break;

                case "even-odd":
                    evenOddSumm(Integer.parseInt(args[1]));
                    break;

                case "happyTicket":
                    happyTickets();
                    break;

                case "toBinary":
                    toBinary(Integer.parseInt(args[1]));
                    break;

                case "first5":
                    first5(Integer.parseInt(args[1]));
                    break;

                case "toOneDigit":
                    toOneDigit(args[1]);
                    break;

                default:
                    System.out.println("Check input data.");
                    break;


            }

        } catch (Exception e) {

            errorShow();

        }

    }

    private static void order1000() {

        for (int i = 1000; i < 9999; i += 3) {

            System.out.print(i + ", ");

        }

        System.out.println("");

    }

    private static void orderFirst55() {

        int orderNumber = 1;

        for (int i = 0; i < 55; i++) {

            System.out.print(orderNumber + ", ");

            orderNumber += 2;
        }

        System.out.println("");

    }

    private static void orderPositive() {

        int value = 90;

        while (value >= 0) {

            System.out.print(value + ", ");

            value -= 5;
        }

        System.out.println();

    }

    private static void orderFirst20() {

        int value = 1;

        for (int i = 0; i < 20; i++) {

            value *= 2;

            System.out.print(value + ", ");
        }
        System.out.println();
    }

    private static int[] massCreation(int length) {

        int[] mass = new int[length];

        for (int i = 0; i < mass.length; i++) {

            mass[i] = (int) (Math.random() * 100);
        }

        return mass;
    }

    private static void sumFirstNElement(int length, int n) {

        int[] mass = massCreation(length);

        int massSum = 0;

        System.out.println();

        System.out.println("Massive length = " + mass.length);

        if (n <= mass.length) {

            System.out.print("Massive : { ");

            for (int i = 0; i < mass.length; i++) {

                System.out.print(mass[i] + ", ");

            }


            for (int i = 0; i < n; i++) {

                massSum = massSum + mass[i];

            }

            System.out.print(" } \n");

            System.out.println("Summ of " + n + " values = " + massSum);

        } else if (n > mass.length) {

            System.out.println("ERROR, n should be less the massive length");

        }


    }

    private static void minMaxMass(int length) {

        int[] mass = massCreation(length);

        System.out.println();

        System.out.print("Massive : { ");

        int minVal = mass[1];

        int maxVal = mass[1];

        for (int i = 0; i < mass.length; i++) {

            System.out.print(mass[i] + ", ");

            if (minVal < mass[i]) {

                minVal = mass[i];
            }

            if (maxVal > mass[i]) {

                maxVal = mass[i];
            }
        }

        System.out.println("}");

        System.out.println();

        System.out.println("max value of massive: " + maxVal);

        System.out.println("min value of massive: " + minVal);

        System.out.println();
    }

    private static void evenOddSumm(int length) {

        int[] mass = massCreation(length);

        System.out.println();

        System.out.print("Massive : {");

        for (int i = 0; i < mass.length; i++) {

            System.out.print(mass[i] + ", ");

        }

        System.out.println("\b\b}");

        System.out.println();

        int evenValue = 0;

        int oddValue = 0;

        for (int i : mass) {

            if ((i % 2) == 0) {

                evenValue = evenValue + i;

            } else {

                oddValue = oddValue + i;
            }
        }

        System.out.println("Summ of even values: " + evenValue);

        System.out.println("Summ of odd values: " + oddValue);

        System.out.println();
    }

    private static void happyTickets() {

        int happyCount = 0;

        for (int i = 0; i < 1000000; i++) {

            int a = i / 100000;

            int b = ((i % 100000) / 10000);

            int c = ((i % 10000) / 1000);

            int d = ((i % 1000) / 100);

            int e = ((i % 100)) / 10;

            int f = i % 10;

            if ((a + b + c) == (d + e + f)) {

                System.out.println(a + "" + b + "" + c + "" + d + "" + e + "" + f);

                happyCount++;
            }

        }

        System.out.println();

        System.out.println("Number of happy tickets: " + happyCount);
    }

    private static void toBinary(int val) {

        String out = "";

        int val1 = val;

        int rest;

        while (val >= 1) {

            rest = val % 2;

            out = rest + out;

            val = val / 2;
        }
        System.out.println(val + "in 10th = " + out + " in 2th");
    }

    private static void first5(int length) {

        int[] mass = massCreation(length);
        System.out.println();

        System.out.print("Massive: { ");

        for (int i = 0; i < mass.length; i++) {

            System.out.print(mass[i] + ", ");
        }
        System.out.println("\b\b }");

        for (int j = 0; j < 5; j++) {

            int minVal = mass[0];

            for (int i = 0; i < mass.length; i++) {

                if ((mass[i] < minVal) & (mass[i] < 1000)) {

                    minVal = mass[i];

                    mass[i] = 9999999;
                }


            }
            System.out.println("Minimal value " + (j + 1) + " = " + minVal);
        }
    }

    private static void toOneDigit(String valString) {

        int valLength = valString.length();

        int val = 0;

        while (valLength > 1) {

            for (int i = 0; i < valLength; i++) {

                int j = i + 1;

                int digit = Integer.parseInt(valString.substring(i, j));

                val = val + digit;

                System.out.print(digit + " + ");

            }
            valString = Integer.toString(val);

            valLength = valString.length();

            val = 0;

            System.out.print("\b\b = ");

        }


        System.out.println(Integer.parseInt(valString.substring(0, 1)));

    }

    private static void errorShow() {

        System.out.println("ERROR, check your input data.");

        System.out.println("Lesson6 <task> <input value>");

        System.out.println("task 1: order1000");

        System.out.println("task 2: orderFirst55");

        System.out.println("task 3: orderPositive");

        System.out.println("task 4: orderFirst20");

        System.out.println("task 5: sumFirstNElement");

        System.out.println("task 6: max-min");

        System.out.println("task 7: even-odd");

        System.out.println("task 8: happyTicket");

        System.out.println("task 9: toBinary");

        System.out.println("task 10: first5");

        System.out.println("task 11: toOneDigit");

    }
}