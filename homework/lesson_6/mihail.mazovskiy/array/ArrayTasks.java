package array;

import java.util.Scanner;

/**
 * Created by m_maz on 03.09.2018.
 */
public class ArrayTasks {
    private static Integer[] generateArray(Integer n) {
        Integer[] array = new Integer[n];
        Integer randomMin = -100;
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

    public static void nElementSum() {
        Integer[] array = generateArray(20);
        printArray(array);
        System.out.print("Input amount of elements of array to summarize:");
        Scanner scanner = new Scanner(System.in);
        Integer elementsAmount = scanner.nextInt();
        Integer sumOfElements = 0;
        if (elementsAmount <= array.length)
            {
                for (int i =0; i < elementsAmount; i++) {
                    sumOfElements = sumOfElements + array[i];
                }
                String result = "Sum of " + elementsAmount + " elements: " + sumOfElements;
                System.out.println(result);
            }
        else System.out.println("Elements amount bigger than array elements");

    }

    private static Integer getMinOfArray(Integer[] array) {
        Integer min = array[0];
        for (int i = 0; i < array.length; i++)
            if (min >= array[i])
                min = array[i];
        return min;
    }

    private static Integer getMaxOfArray(Integer[] array) {
        Integer max = array[0];
        for (int i = 0; i < array.length; i++)
            if (max <= array[i])
                max = array[i];
        return max;
    }

    public static void getMinAndMax() {
        Integer[] array = generateArray(20);
        printArray(array);
        String result = null;
        result = "Minimum digit is: " + getMinOfArray(array) + " Maximum digit is: " + getMaxOfArray(array);
        System.out.println(result);
    }

    public static void oddAndEvenSum() {
        Integer[] array = generateArray(20);
        printArray(array);
        Integer oddSum = 0;
        Integer evenSum = 0;
        for (int i = 0; i < array.length; i++)
            if (array[i]%2 == 0)
                evenSum = evenSum + array[i];
            else oddSum = oddSum + array[i];
        String result = null;
        result = "Sum of odd digits is: " + oddSum + " Sum of even digits is: " + evenSum;
        System.out.println(result);
    }

    public static void firstFiveMinElements() {
        Integer[] array = generateArray(20);
        printArray(array);
        array = bubbleSort(array);
        System.out.print("First five min elements:");
        for (int i =0; i <5; i++)
        System.out.print(" " + array[i]);
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
}
