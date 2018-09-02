import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

        int sum,n,type = 0;
        int[] a, b, c;
        while(type != 4) {
            System.out.println("1. Time for operation sorting");
            System.out.println("2. Array copy");
            System.out.println("3. Get sum elements in array");
            System.out.println("4. Exit");
            type = new Scanner(System.in).nextInt();
            System.out.println();
            switch(type) {

                case 1:
                    System.out.println("Please enter size of first array: ");
                    n = new Scanner(System.in).nextInt();
                    System.out.println();
                    a = new int[n];
                    setArray(a,n);
                    System.out.println("Please enter size of second array: ");
                    n = new Scanner(System.in).nextInt();
                    System.out.println();
                    a = new int[n];
                    setArray(a,n);
                    break;

                case 2:
                    a = new int[]{1,3,5,7,9,11,13,18};
                    b = new int[]{2,6,10,12,14,17};
                    System.out.println("First array: ");
                    printArray(a);
                    System.out.println("Second array: ");
                    printArray(b);
                    c = getArray(a,b);
                    System.out.println("Third array: ");
                    printArray(c);
                    break;

                 case 3:
                    a = new int[]{1,3,5,7,9,11,13,18};
                    System.out.println("Array: ");
                    printArray(a);
                    System.out.println("Please Enter sum: ");
                    sum = new Scanner(System.in).nextInt();
                    System.out.println();
                    getSum(a,sum);
                    System.out.println();
                    break;

                case 4:
                    return;

                default:
                    System.out.println("Error!!!!");
                    System.out.println();
            }

        }
    }

    static void printArray(int[] a) {

        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.println();
    }

    static int[] getArray(int[] a, int[] b) {

        int size = a.length + b.length;
        int[] c = new int[size];
        System.arraycopy(a,0,c, 0,a.length );
        System.arraycopy(b,0,c, a.length ,b.length);
        Arrays.sort(c);

        return c;
    }

    static void getSum(int[] a, int sum) {

        for(int i = 0; i < a.length - 1; i++) {
            for(int j = i + 1; j < a.length; j++) {
                if(a[i] + a[j] == sum) {
                System.out.println(a[i] + " + " + a[j] + " = " + sum + " : true");
                return;
                }
            }
        }
        System.out.println("false");
    }

    static void getMinValue(int[] a) {

        int count = 0;
        int min = a[0];
        long start, end;
        start = System.currentTimeMillis();
        for(int i = 1; i < a.length; i++) {
            if(a[i] < min) {
                min = a[i];
            }
            count++;
        }
        end = System.currentTimeMillis() - start;
        System.out.println("Min value: " + min + " count operations: " + count + " time execute: " + end + " ms");
        System.out.println();
    }

    static void setArray(int[] a, int n) {

        IntStream f;
        f = IntStream.generate(() -> ThreadLocalRandom.current().nextInt(30)).limit(n);
        a = f.toArray();
        System.out.println("Array: ");
        for(int i =0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.println();
        getMinValue(a);
    }



}
