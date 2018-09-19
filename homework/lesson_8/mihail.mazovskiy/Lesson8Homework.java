import java.util.Scanner;

/**
 * Created by m_maz on 10.09.2018.
 */
public class Lesson8Homework {
    public static void main(String[] args) {
        Integer[] array1 = generateArray(15);
        Integer[] array2 = generateArray(5);
        array1 = bubbleSort(array1);
        array2 = bubbleSort(array2);
        printArray(array1);
        printArray(array2);
        Integer[] mergedArray = mergeArray(array1, array2);
        printArray(mergedArray);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input digit to compare with sum of two elements: ");
        Integer digit = Integer.parseInt(scanner.next());
        sumOfTwoDigits(array1, digit);
    }

    private static Integer[] generateArray(Integer n) {
        Integer[] array = new Integer[n];
        Integer randomMin = 0;
        Integer randomMax = 100;
        int pointer = 0;
        while (pointer < array.length) {
            array[pointer] = (randomMin + (int) (Math.random() * ((randomMax - randomMin) + 1)));
            pointer++;
        }
        return array;
    }

    private static void printArray(Integer[] array) {
        int i = 0;
        System.out.println("Array:");
        while (i < array.length) {
            System.out.print(array[i] + " ");
            i++;
        }
        System.out.println();
    }

    private static Integer[] bubbleSort(Integer[] array)
    {
        boolean isAlreadySorted = false;
        for (int i = 0; i < array.length - 1 && !isAlreadySorted; i++)
        {
            isAlreadySorted = true;
            for (int j = 0; j < array.length - i - 1; j++)
            {
                if (array[j] > array[j + 1])
                {
                    swap(array, j, j + 1);
                    isAlreadySorted = false;
                }
            }
        }
        return array;
    }

    private static void swap(Integer[] array, Integer leftIndex, Integer rightIndex)
    {
        array[leftIndex] ^= array[rightIndex];
        array[rightIndex] ^= array[leftIndex];
        array[leftIndex] ^= array[rightIndex];
    }

    private static Integer[] mergeArray(Integer[] array1, Integer[] array2) {
        Integer[] mergedArray = new Integer[array1.length + array2.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (j < array1.length && k < array2.length) {
            if (array1[j] <= array2[k]) {
                mergedArray[i] = array1[j];
                i++;
                j++;
            }
            else {
                mergedArray[i] = array2[k];
                i++;
                k++;
            }
        }
        while (j < array1.length) {
            mergedArray[i] = array1[j];
            j++;
            i++;
        }
        while (k < array2.length) {
            mergedArray[i] = array2[k];
            k++;
            i++;
        }
        return mergedArray;
    }

    private static void sumOfTwoDigits(Integer[] array, Integer digit) {
        Integer i = 0;
        Integer j = 0;
        boolean sumIsTrue = false;
        while (i < array.length && !sumIsTrue) {
            j = i + 1;
            while (j < array.length && !sumIsTrue) {
                if (array[i] + array[j] == digit)
                    sumIsTrue = true;
                j++;
            }
            i++;
        }
        if (sumIsTrue)
            System.out.println("Sum of two elements equals to digit is true");
        else
            System.out.println("Sum of two elements equals to digit is false");
    }

    private static Integer[] selectionSort(Integer[] array) {
        for (int min = 0; min < array.length - 1; min++) {
            int least = min;
            for (int j = min + 1; j < array.length; j++) {
                if (array[j] < array[least])
                    least = j;
            }
            int tmp = array[min];
                array[min] = array[least];
                array[least] = tmp;
            }
        return array;
    }
}
