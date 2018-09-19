import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Input your task choice (1-11): ");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice) {

            case 1:
                firstTask();
                break;

            case 2:
                secondTask();
                break;

            case 3:
                thirdTask();
                break;

            case 4:
                fourthTask();
                break;

            case 5:
                fifthTask();
                break;

            case 6:
                sixthTask();
                break;

            case 7:
                seventhTask();
                break;

            case 8:
                eightthTask();
                break;

            case 9:
                ninthTask();
                break;

            case 10:
                tenthTask();
                break;

            case 11:
                eleventhTask();
                break;
        }
    }

    private static void firstTask() {

        for(int i = 1000; i <= 9999; i += 3) {
            System.out.println(i);
        }
    }

    private static void secondTask() {

        int i = 0;
        int k = 1;

        while (i < 55) {
            i ++;
            System.out.println(k);
            k+=2;

        }
    }

    private static void thirdTask() {

        for (int i = 90; i >= 0; i -= 5) {

            System.out.println(i);

        }
    }

    private static void fourthTask() {

        int i = 0;
        int k = 2;

        while (i < 20) {
            i++;
            System.out.println(k);
            k *= 2;

        }
    }

    private static void fifthTask() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("How much array positions do you like to sum? (from 1 to 100) ");
        int n = scanner.nextInt();

        int[] arr = new int[100];
        int sum = 0;

        for(int i = 0; i < arr.length; i++) {

            arr[i] = i;
        }

        for(int i = 0; i <= n; i++) {

            sum += arr[i];
        }

        System.out.println("The sum of the " + n + " array positions = " + sum);

    }

    private static void sixthTask() {

        int[] arr = new int[100];

        for(int i = 0; i < arr.length; i++) {

            arr[i] = i;
        }

        Arrays.sort(arr);

        int min = arr[0];
        int max = arr[arr.length - 1];

        System.out.println("Minimal value of array is: " + min);
        System.out.println("Maximum value of array is: " + max);

    }

    private static void seventhTask() {

        int[] arr = new int[10];
        int oddSum = 0;
        int evenSum = 0;

        for(int i = 0; i < arr.length; i++) {

            arr[i] = i;
        }

        for(int i = 0; i < arr.length; i++) {

            int tmp;
            tmp = arr[i];
            int even;
            even = tmp % 2;

            if(even == 0)
                evenSum += tmp;
            else
                oddSum += tmp;
        }

        System.out.println("Odd array values summary = " + oddSum);
        System.out.println("Even array values summary = " + evenSum);
    }

    private static void eightthTask() {

        int firstSum;
        int secondSum;

        for(int i = 100000; i <= 999999; i++) {

            String s = String.valueOf(i);
            char[] chars = s.toCharArray();

            firstSum = chars[0] + chars[1] + chars[2];
            secondSum = chars[3] + chars[4] + chars[5];

            if(firstSum == secondSum)
                System.out.println("Lucky ticket number is: " + i);
        }
    }

    private static void ninthTask() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the decimal value:");
        int n;
        n = scanner.nextInt();

        String binary;
        binary = Integer.toBinaryString(n);

        System.out.println(binary);
    }

    private static void tenthTask() {

        int[] arr = new int[10];

        for(int i = 0; i < arr.length; i++) {

            arr[i] = i;
        }

        Arrays.sort(arr);

        for(int i = 0; i < 5; i ++) {

            System.out.println(arr[i]);
        }
    }

    private static void eleventhTask() {

        int result = 0;
        int result2 = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the decimal value(maximum 9 digits):");
        int n;
        n = scanner.nextInt();

        String s;
        s = String.valueOf(n);
        char[] chars = s.toCharArray();

        for(int i = 0; i < chars.length; i++) {

            String stmp = String.valueOf(chars[i]);
            int tmp = Integer.parseInt(stmp);
            result += tmp;
        }

        if(result >= 10) {

            String s2;
            s2 = String.valueOf(result);
            char[] chars2 = s2.toCharArray();

            for(int k = 0; k < chars2.length; k++) {

                String stmp2 = String.valueOf(chars2[k]);
                int tmp2 = Integer.parseInt(stmp2);
                result2 += tmp2;
            }
        }
        System.out.println(result2);
    }
}



