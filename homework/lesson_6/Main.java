import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        //OperationsWithNumbers.allFourDigitsNumbers();
        //OperationsWithNumbers.oddNumbers();
        //OperationsWithNumbers.degreeOfTwo();
        //OperationsWithNumbers.allPositivesFrom90till0();

        //OperationsWithArrays.sumFirstXArrayElements(50, 5);
        //OperationsWithArrays.minMaxArrayElements(50);
        //OperationsWithArrays.sumOfOddAndEvenElements(50);
        //OperationsWithArrays.luckyTickets();
        //Reserved for 9
        //Reserved for 10
        //OperationsWithArrays.eleven("555555");
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
        Random rnd = new Random(100);
        Integer[] arr = new Integer[lenght];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt();
        }

        return arr;
    }

    static void sumFirstXArrayElements(int arrLenght, int elementsNumber) {
        Integer[] arr = newArray(arrLenght);
        int result = 0;
        if (arr.length > elementsNumber) {
            for (int i = 0; i < elementsNumber; ) {
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
    }

    static void luckyTickets() {
        String[] allTickets = new String[899999];
        String[] luckyTickets = new String[899999];
        int luckyCounter = 0;
        for (int i = 0; i < allTickets.length; i++) {
            allTickets[i] = Integer.toString(i+100000);
        }

        for (int i = 0; i < allTickets.length; i++) {
            Integer[] separated = separator(allTickets[i]);
            int firstThree = separated[0] + separated[1] + separated[2];
            int secondThree = separated[3] + separated[4] + separated[5];
            if (firstThree == secondThree){
                luckyTickets[luckyCounter] = allTickets[i];
                luckyCounter++;
            }
        }

        for (int i = 0; i < luckyCounter; i++){
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

    static void eleven(String toBeSummed){
        String finalValue = sumOfNumbers(toBeSummed);
        while(separator(finalValue).length > 1){
            String value = sumOfNumbers(finalValue);
            finalValue = value;
        }
        System.out.println(finalValue);
    }

    private static String sumOfNumbers(String toSum){
        Integer[] separateToSum = separator(toSum);
        int sum = 0;
        for(int i = 0; i < separateToSum.length; i++){
            sum = sum + separateToSum[i];
        }
        String toBeSum = String.valueOf(sum);

        return toBeSum;
    }
}
