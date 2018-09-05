import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lesson6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Available options");
        System.out.println("1. View all numbers from 1000 to 9999 with step 3");
        System.out.println("2. View first 55 odd numbers");
        System.out.println("3. View degree of two");
        System.out.println("4. View all positive values from 90 to 0 with step 5");
        System.out.println("5. View sum of first X elements of rnd array");
        System.out.println("6. View mina and max value of random array");
        System.out.println("7. View sums of all odd and even values from rnd array");
        System.out.println("8. View all combination for lucky ticket when ticket code contains 6 digits");
        System.out.println("9. Convert number to binary presentation");
        System.out.println("10. View five min elements of rnd arr");
        System.out.println("11. Highlander number(sum of number digits till single digit result");

        System.out.println("Please enter your choice");

        switch (Integer.valueOf(scanner.nextLine())) {
            case 1: {
                OperationsWithNumbers.allFourDigitsNumbers();
                break;
            }
            case 2: {
                OperationsWithNumbers.oddNumbers();
                break;
            }
            case 3: {
                OperationsWithNumbers.degreeOfTwo();
                break;
            }
            case 4: {
                OperationsWithNumbers.allPositivesFrom90till0();
                break;
            }
            case 5: {
                System.out.println("Enter array lenght press enter than enter how many elem" +
                        "ents should be summed and press enter again");
                OperationsWithArrays.sumFirstXArrayElements(Integer.valueOf(scanner.nextLine()), Integer.valueOf(scanner.nextLine()));
                break;
            }
            case 6: {
                System.out.println("Enter array lenght");
                OperationsWithArrays.minMaxArrayElements(Integer.valueOf(scanner.nextLine()));
                break;
            }
            case 7: {
                System.out.println("Enter array lenght");
                OperationsWithArrays.sumOfOddAndEvenElements(Integer.valueOf(scanner.nextLine()));
                break;
            }
            case 8: {
                OperationsWithArrays.luckyTickets();
                break;
            }
            case 9: {
                System.out.println("Enter number to convert it to binary presentation");
                OperationsWithArrays.convertToBinary(Integer.valueOf(scanner.nextLine()));
                break;
            }
            case 10: {
                System.out.println("Enter array lenght press enter than enter how many" +
                        " elements should be displayed");
                OperationsWithArrays.xMinElems(Integer.valueOf(scanner.nextLine()),
                        Integer.valueOf(scanner.nextLine()));
                break;
            }
            case 11: {
                System.out.println("Enter random number");
                OperationsWithArrays.eleven(scanner.nextLine());
            }
            default:
                System.out.println("Something went wrong. Restart and do actions again wo mistakes");
        }
    }
}

class OperationsWithNumbers {

    static void allFourDigitsNumbers() {
        System.out.println("FourDigit Numbers with step +3 is:");
        for (int i = 1000; i < 9999; i = i + 3) {
            System.out.println(i);
        }
    }

    static void oddNumbers() {
        int odd = 1;
        for (int i = 0; i < 55; i++) {
            System.out.println(odd);
            odd = odd + 2;
        }
    }

    static void degreeOfTwo() {
        int degreeOfTwo = 2;
        for (int i = 0; i < 20; i++) {
            System.out.println(degreeOfTwo);
            degreeOfTwo = degreeOfTwo * 2;
        }
    }

    static void allPositivesFrom90till0() {
        for (int i = 90; i > 0; i = i - 5) {
            System.out.println(i);
        }
    }

}

class OperationsWithArrays {

    private static Integer[] newArray(int lenght) {
        Random rnd = new Random();
        Integer[] arr = new Integer[lenght];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(1000);
        }

        return arr;
    }

    static void sumFirstXArrayElements(int arrLenght, int elementsNumber) {
        Integer[] arr = newArray(arrLenght);
        int result = 0;
        if (arr.length > elementsNumber) {
            for (int i = 0; i < elementsNumber; i++) {
                result = result + arr[i];
            }
            System.out.println("The sum of the first " + elementsNumber + " array numbers is: " + result);
        } else System.out.println("You do something wrong. Start again and repeat actions without mistakes");
    }

    static void minMaxArrayElements(int arrLenght) {
        Integer[] arr = newArray(arrLenght);
        Arrays.sort(arr);
        System.out.println("The min value in created array is " + arr[0] + " and the max " +
                "value in your array is: " + arr[arrLenght - 1]);
    }

    static void sumOfOddAndEvenElements(int arrLenght) {
        Integer[] arr = newArray(arrLenght);
        int sumOfEven = 0;
        int sumOfOdd = 0;
        for (int i = 0; i < arrLenght; i++) {
            if ((arr[i] % 2) == 0) {
                sumOfEven = sumOfEven + arr[i];
            } else sumOfOdd = sumOfOdd + arr[i];
        }
        System.out.println("The sum of odd elements is: " + sumOfOdd);
        System.out.println("The sum of even elements is: " + sumOfEven);
    }

    static void luckyTickets() {
        String[] allTickets = new String[899999];
        String[] luckyTickets = new String[899999];
        int luckyCounter = 0;
        for (int i = 0; i < allTickets.length; i++) {
            allTickets[i] = Integer.toString(i + 100000);
        }

        for (int i = 0; i < allTickets.length; i++) {
            Integer[] separated = separator(allTickets[i]);
            int firstThree = separated[0] + separated[1] + separated[2];
            int secondThree = separated[3] + separated[4] + separated[5];
            if (firstThree == secondThree) {
                luckyTickets[luckyCounter] = allTickets[i];
                luckyCounter++;
            }
        }

        for (int i = 0; i < luckyCounter; i++) {
            System.out.println(luckyTickets[i]);
        }
    }

    private static Integer[] separator(String toSeparate) {
        char[] separation = toSeparate.toCharArray();
        Integer[] separated = new Integer[separation.length];
        for (int i = 0; i < separated.length; i++) {
            separated[i] = Character.getNumericValue(separation[i]);
        }
        return separated;
    }

    static void convertToBinary(int toConvert) {
        System.out.println(Integer.toBinaryString(toConvert));
    }


    static void xMinElems(int lenght, int howMany) {
        Integer[] arr = newArray(lenght);
        Arrays.sort(arr);
        for (int i = 0; i < howMany; i++) {
            System.out.println(arr[i]);
        }
    }

    static void eleven(String toBeSummed) {
        String value = sumOfNumbers(toBeSummed);
        while (separator(value).length > 1) {
            value = sumOfNumbers(value);
        }
        System.out.println(value);
    }

    private static String sumOfNumbers(String toSum) {
        Integer[] separateToSum = separator(toSum);
        int sum = 0;
        for (int i = 0; i < separateToSum.length; i++) {
            sum = sum + separateToSum[i];
        }
        return String.valueOf(sum);
    }
}
