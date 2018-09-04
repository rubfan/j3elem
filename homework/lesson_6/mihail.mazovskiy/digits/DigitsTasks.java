package digits;

import java.util.Scanner;

/**
 * Created by m_maz on 04.09.2018.
 */
public class DigitsTasks {
    public static void convertToBinary() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number to convert to binary: ");
        Integer number = scanner.nextInt();
        String result = "Number in binary: " + Integer.toString(number, 2);
        System.out.println(result);
    }

    public static void taskEleven() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number to make task (2147483647 max): ");
        Integer number = scanner.nextInt();
        Integer[] array = splitNumberToArray(number);
        Integer result = 0;
        while (array.length > 1) {
            result = 0;
            for (int i = 0; i < array.length; i++)
                result = result + array[i];
            array = splitNumberToArray(result);
        }
        System.out.println("Result :" + result);
    }

    private static Integer[] splitNumberToArray(Integer number) {
        String strNumber = Integer.toString(number);
        Integer[] digitsArray = new Integer[strNumber.length()];
        for (int i = 0; i < strNumber.length(); i++)
            digitsArray[i] = Character.getNumericValue(strNumber.charAt(i));
        return digitsArray;
    }

    public static void luckyNumbers() {
        for (int i = 100000; i <= 999999; i++) {
            Integer[] array = splitNumberToArray(i);
            if (isLucky(array))
                System.out.println(i + " is lucky number");
        }
    }

    private static Boolean isLucky(Integer[] array) {
        Integer leftSide = 0;
        Integer rightSide = 0;
        for (int i = 0; i < array.length / 2; i++)
            leftSide = leftSide + array[i];
        for (int i = array.length / 2; i < array.length; i++)
            rightSide = rightSide + array[i];
        if (leftSide == rightSide)
            return true;
        else return false;
    }
}
