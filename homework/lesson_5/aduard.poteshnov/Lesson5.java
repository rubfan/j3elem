import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Lesson5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Long firstValue;
        Long secondValue;

        System.out.println("There is simple calculator for operations with two integers," +
                " available options listed below");
        System.out.println();

        System.out.println("Choose one of it:");
        System.out.println("1) Addition of first and second values");
        System.out.println("2) Subtraction of two values");
        System.out.println("3) Multiplication of two values");
        System.out.println("4) Division of two values(first on second");
        System.out.println("5) Modulo of division first value on the second");
        System.out.println("6) The absolute value of a number");
        System.out.println("7) Or tips calculation");
        System.out.println();
        System.out.println("Please enter number of chosen row");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                if (args.length != 0) {
                    firstValue = Long.valueOf(args[0]);
                    secondValue = Long.valueOf(args[1]);
                } else {
                    System.out.print("Enter the first number");
                    firstValue = scanner.nextLong();
                    System.out.print("\nEnter the second number");
                    secondValue = scanner.nextLong();
                }
                System.out.println("\nResult of addition is " + firstValue + " + " + secondValue + " =" +
                        " " + (firstValue + secondValue));
                break;
            case 2:
                if (args.length != 0) {
                    firstValue = Long.valueOf(args[0]);
                    secondValue = Long.valueOf(args[1]);
                } else {
                    System.out.print("Enter the first number");
                    firstValue = scanner.nextLong();
                    System.out.print("\nEnter the second number");
                    secondValue = scanner.nextLong();
                }
                System.out.println("\nResult of subtraction is: " + firstValue + " - " + secondValue + " =" +
                        " " + (firstValue - secondValue));
                break;
            case 3:
                if (args.length != 0) {
                    firstValue = Long.valueOf(args[0]);
                    secondValue = Long.valueOf(args[1]);
                } else {
                    System.out.print("Enter the first number");
                    firstValue = scanner.nextLong();
                    System.out.print("\nEnter the second number");
                    secondValue = scanner.nextLong();
                }
                System.out.println("\nResult of multiplication is: " + firstValue + " * " + secondValue + " =" +
                        " " + (firstValue * secondValue));
                break;
            case 4:
                if (args.length != 0) {
                    firstValue = Long.valueOf(args[0]);
                    secondValue = Long.valueOf(args[1]);
                } else {
                    System.out.print("Enter the first number");
                    firstValue = scanner.nextLong();
                    System.out.print("\nEnter the second number");
                    secondValue = scanner.nextLong();
                    while (secondValue == 0) {
                        System.out.println("\nОшибка деления на ОООООО");
                        System.out.println("Please enter second number again. It shouldn't be zero");
                        secondValue = scanner.nextLong();
                    }
                }
                System.out.println("Result of division is: " + firstValue + " / " + secondValue + " =" +
                        " " + (firstValue / secondValue));
                break;
            case 5:
                if (args.length != 0) {
                    firstValue = Long.valueOf(args[0]);
                    secondValue = Long.valueOf(args[1]);
                } else {
                    System.out.print("Enter the first number");
                    firstValue = scanner.nextLong();
                    System.out.print("\nEnter the second number");
                    secondValue = scanner.nextLong();
                }
                System.out.println("\nModulo of division is: " + firstValue + " % " + secondValue + " =" +
                        " " + (firstValue % secondValue));
                break;
            case 6:
                if (args.length != 0) {
                    firstValue = Long.valueOf(args[0]);
                } else {
                    System.out.print("Enter the first number:");
                    firstValue = scanner.nextLong();
                }
                System.out.println("\nThe absolute value of the entered number is: " + Math.abs(firstValue));
                break;
            case 7:
                if (args.length != 0) {
                    System.out.println("Sorry, but this is not working with console arguments, " +
                            "please start app without arguments and try chose it row again");
                } else {
                    Long sum;
                    Integer rate;

                    System.out.print("Please enter sum from your check:");
                    sum = scanner.nextLong();

                    System.out.println("\nPlease rate the quality of service:");
                    System.out.println("1) terrible");
                    System.out.println("2) poor");
                    System.out.println("3) good");
                    System.out.println("4) great");
                    System.out.println("5) excellent");
                    System.out.print("Enter your choice:");
                    rate = scanner.nextInt();
                    System.out.println();

                    System.out.println(tipsCounter(sum, rate));
                }
                break;
            default:
                System.out.println("Something went wrong, looks like you enter incorrect data, " +
                        "please restart app and don't do mistake again");
        }
        System.out.println();
        System.out.println();
        System.out.println("Thank's for using. You also can start this app with console arguments");
        System.out.println("But some options won't work in this mode");
    }

    private static String tipsCounter(Long sum, int rate) {
        String result = " ";
        BigDecimal pay;
        BigDecimal tip;

        switch (rate) {
            case 1:
                pay = BigDecimal.valueOf(sum).setScale(2, RoundingMode.DOWN);
                tip = BigDecimal.valueOf(0).setScale(2, RoundingMode.DOWN);
                result = "In this case we can recommend you to add 0%," +
                        " it will be " + tip + "UAH and total sum with tips will be: " + pay + "UAH";
                break;
            case 2:
                pay = BigDecimal.valueOf(sum * 1.05).setScale(2, RoundingMode.DOWN);
                tip = BigDecimal.valueOf(sum * 0.05).setScale(2, RoundingMode.DOWN);
                result = "In this case we can recommend you to add 5%," +
                        " it will be " + tip + "UAH and total sum with tips will be: " + pay + "UAH";
                break;
            case 3:
                pay = BigDecimal.valueOf(sum * 1.1).setScale(2, RoundingMode.DOWN);
                tip = BigDecimal.valueOf(sum * 0.1).setScale(2, RoundingMode.DOWN);
                System.out.println("In this case we can recommend you to add 10%," +
                        " it will be " + tip + "UAH and total sum with tips will be: " + pay + "UAH");
                break;
            case 4:
                pay = BigDecimal.valueOf(sum * 1.15).setScale(2, RoundingMode.DOWN);
                tip = BigDecimal.valueOf(sum * 0.15).setScale(2, RoundingMode.DOWN);
                result = "In this case we can recommend you to add 15%," +
                        " it will be " + tip + "\"UAH and total sum with tips will be: " + pay + "UAH";
                break;
            case 5:
                pay = BigDecimal.valueOf(sum * 1.2).setScale(2, RoundingMode.DOWN);
                tip = BigDecimal.valueOf(sum * 0.2).setScale(2, RoundingMode.DOWN);
                result = "In this case we can recommend you to add 20%," +
                        " it will be " + tip + "\"UAH and total sum with tips will be: " + pay + "UAH";
                break;
            default:
                result = " ";
        }
        return result;
    }
}