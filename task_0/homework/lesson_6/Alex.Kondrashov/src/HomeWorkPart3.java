import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        sequenceFromTo(1000, 10000, 3);
        sequenceFirstNElements(1, 55, 2);
        nonNegativeSequence(90, 5);
        sequenceFirstNElementsMultiply(2, 20, 2);
        sumArray(10);
        minAndMaxDigitArray(15);
        sumArrayEvenAndNonEven(25);
        happyTicket(100000, 999999);
        convertToBinaryNumber(484);
        firstMinNElementsOfAray(10, 5);
        program555555("222");
    }


    static void sequenceFromTo(int startSequence, int endSequence, int stepSequence) {
        for (int i = startSequence; i < endSequence; i += stepSequence) {
            System.out.println(i);
        }
    }

    static void sequenceFirstNElements(int startSequence, int nElements, int stepSequence) {
        int arr[] = new int[nElements];
        int temp = startSequence;
        for (int i = 0; i <= nElements - 1; i++) {
            arr[i] = temp;
            temp += stepSequence;
            System.out.println("№" + i + "--> " + arr[i]);
        }
    }

    static void nonNegativeSequence(int startSequence, int stepSequence) {
        for (int i = startSequence; i >= 0; i -= 5) {
            System.out.println(i);
        }
    }

    static void sequenceFirstNElementsMultiply(int startSequence, int nElements, int stepSequence) {
        int count = 1;
        int temp = startSequence;
        System.out.println("№" + count + " --> " + temp);
        while (count != nElements) {
            temp *= startSequence;
            count++;
            System.out.println("№" + count + " --> " + temp);
        }
    }

    static void sumArray(int lengthArray) {
        int arr[] = new int[lengthArray];
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10);
            System.out.println("#:" + i + " random digit is: " + arr[i]);
            temp += arr[i];
        }
        System.out.println("\nSum of the array is: " + temp);
    }

    static void minAndMaxDigitArray(int lengthArray) {
        int arr[] = new int[lengthArray];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
            System.out.println(arr[i]);
        }

        int tempMin = arr[0];
        int tempMax = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < tempMin) {
                tempMin = arr[i];
            }
            if (arr[i] > tempMax) {
                tempMax = arr[i];
            }
        }
        System.out.println("min value is: " + tempMin);
        System.out.println("max value is: " + tempMax);
    }

    static void sumArrayEvenAndNonEven(int lengthArray) {
        int arr[] = new int[lengthArray];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10);
            System.out.println(arr[i]);
        }
        int count = 0;
        int sumEven = 0;
        int sumNonEven = 0;
        while (count != arr.length) {
            if (arr[count] % 2 == 0) {
                sumEven += arr[count];
                count++;
            } else {
                sumNonEven += arr[count];
                count++;
            }
        }
        System.out.println("Четные числа " + sumEven);
        System.out.println("Не четные числа " + sumNonEven);

    }

    static void happyTicket(int digitBegin, int digitEnd) {
        int digit1;
        int digit2;
        int digit3;
        int sumDigit1Digit2Digit3;
        int digit4;
        int digit5;
        int digit6;
        int sumDigit4Digit5Digit6;

        for (int i = digitBegin; i <= digitEnd; i++) {
            digit1 = i / 100000;
            digit2 = i / 10000 % 10;
            digit3 = i / 1000 % 10;
            digit4 = i / 100 % 10;
            digit5 = i / 10 % 10;
            digit6 = i / 1 % 10;

            sumDigit1Digit2Digit3 = digit1 + digit2 + digit3;
            sumDigit4Digit5Digit6 = digit4 + digit5 + digit6;

            if (sumDigit1Digit2Digit3 == sumDigit4Digit5Digit6) {
                System.out.println("The tickets №: " + i + " is happy");
            }
        }
    }

    static void convertToBinaryNumber(int digit) {
        String temp = Integer.toBinaryString(digit);
        System.out.println(temp);
    }

    static void firstMinNElementsOfAray(int lengthArray, int NElements) {
        int arr[] = new int[lengthArray];
        System.out.println("Случайные числа: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10);
            System.out.print(arr[i] + ", ");
        }
        System.out.println("");

        Arrays.sort(arr);
        System.out.println("\nПервые пять минимальных элементов массива");
        for (int i = 0; i < NElements; i++) {
            System.out.print(arr[i] + ", ");
        }
    }

    static void program555555(String digit) {
        char arr[] = new char[digit.length()];
        arr = digit.toCharArray();
        int arrInt[] = new int[digit.length()];
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            arrInt[i] = Character.getNumericValue(arr[i]);
            temp += arrInt[i];
        }
        String secondString = String.valueOf(temp);
        char arrSecond[] = new char[secondString.length()];
        arrSecond = secondString.toCharArray();
        int arrInt2[] = new int[secondString.length()];
        int secondTemp = 0;
        for (int i = 0; i < arrSecond.length; i++) {
            arrInt2[i] = Character.getNumericValue(arrSecond[i]);
            secondTemp += arrInt2[i];
        }
        System.out.println("\n\nСумма числа равна: " + secondTemp);
    }
}