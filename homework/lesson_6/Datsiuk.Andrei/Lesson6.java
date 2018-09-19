import java.util.Scanner;

public class Lesson6 {
    static Scanner num = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] array = {1,2,3,4,5,6,7,8,9,10};

        System.out.println("All four-digit numbers of the sequence 1000 1003 1006 1009 1012 1015 ...");
        System.out.println(fourDigitNubers(1000, 3));
        System.out.println();
        System.out.println("The first 55 elements of the sequence 1 3 5 7 9 11 13 15 17 ...:");
        System.out.println(firstFiftyfive(1, 2));
        System.out.println("All non negative elements of the sequence 90 85 80 75 70 65 60 ....");
        System.out.println(nonNegative(90, 5));
        System.out.println();
        System.out.println("The first 20 elements of the sequence  2 4 8 16 32 64 128 ….");
        System.out.println(firstTwentyElements(2, 2));
        System.out.println();
        System.out.println("Find the sum of the first n elements of the array");
        System.out.println("Array  size ");
        System.out.println("The sum of array elements is = " + sumArrays(number()));
        System.out.println();
        System.out.println("Minimum and maximum array element");
        printArray(array);
        System.out.println("The minimum element of the array " + minimum(array));
        System.out.println("Еhe maximum element of the array " + maximum(array));
        System.out.println();
        System.out.println("The sum of all even elements of the array " +sumEven(array));
        System.out.println("The sum of all odd elements of the array " +sumOdd(array));
        System.out.println();
        System.out.println("Repeated addition of all digits");
        System.out.println("Enter the number");
        int n = scanner.nextInt();
        System.out.println("Result = " + ( n=(1+(n-1)%9)));
        System.out.println();
        System.out.println("Converting a number to a binary number system");
        System.out.println("Enter the number ");
        Integer number = scanner.nextInt() ;
        String convert = Integer.toBinaryString(number);
        System.out.println(convert);
        System.out.println();
        System.out.println("Output the first 5 minimal elements of an array");
        System.out.println("The first 5 minimal elements of the array" +fiveMinOfArray(array));
        System.out.println();
        System.out.println("Happy tickets from 100000 to 999999");
        luckyTicket(1);

    }
    public static String fourDigitNubers(int a , int step ) {
        String res = "";
        while (a / 10000 == 0) {
            res = res + a + "";
            a = a + step;
        }
        return res;
    }
    public static String firstFiftyfive (int a, int step){
        String res = "";
        for (int i=0;i<55;i++){
            res = res + a + "";
            a = a + step ;
        }
        return res;
    }
    public static String  nonNegative (int a , int step ){
        String res = "";
        while (a >= 0){
            res = res + a +"";
            a = a - step ;
        }
        return res;
    }
    public static String  firstTwentyElements(int a , int step ){
        String res = "";
        for (int i=0;i<20;i++){
            res = res + a + "";
            a = a *step ;
        }
        return res ;
    }
    public static int number(){
        int in = num.nextInt();
        return in;
    }
    public static int sumArrays (int a ) {
        int[] array = new int[a];
        int sum = 0;
        for (int i = 0; i < a; i++) {
            System.out.println("Enter the elements of the array");
            array[i] = number();
        }
        for (int num : array) {
            sum = sum + num;
        }
        return sum;
    } public static int minimum(int[] a) {
        int min = a[0];
        for (int i = 1; i < a.length; i++)
            min = Math.min(min, a[i]);
        return min;
    }
    public static int maximum(int[] a) {
        int max = a[0];
        for (int i = 1; i < a.length; i++)
            max = Math.max(max, a[i]);
        return max;
    }
    public static int sumEven(int[] a) {
        int sum = 0;
        for (int i : a)
            sum += i % 2 == 0 ? i : 0;
        return sum;
    }
    public static int sumOdd(int[] a) {
        int sum = 0;
        for (int i : a)
            sum += i % 2 != 0 ? i : 0;
        return sum;
    }
    public static void printArray(int[] a) {
        System.out.print("Array  size: { ");
        for (int i : a)
            System.out.print(i + " ");
        System.out.println("}");
    }
    public static int luckyTicket (int a) {
        int sum = 0;
        for (int k = 000001; k <= 999999; k++) {
            int num1 = k / 100000;
            int num2 = (k % 100000) / 10000;
            int num3 = (k % 10000) / 1000;
            int num4 = (k % 1000) / 100;
            int num5 = (k % 100) / 10;
            int num6 = k % 10;

            if (num1 + num2 + num3 == num4 + num5 + num6) {
                sum ++;
            }
            System.out.println( sum + " happy tickets ");
        }
        return sum;
    }
    public static String fiveMinOfArray(int[] a) {
        String res = "";
        int[] sortArray = sotr(a);
        for (int i = 0; i < 5; i++)
            res += sortArray[i] + " ";
        return res ;
    }
    public static int[] sotr (int[] a) {
        for (int i = 0; i < a.length; ++i) {
            for (int j = a.length - 1; j > i; --j) {
                if (a[j] < a[j - 1]) {
                    int t = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = t;
                }
            }
        }
        return a;
    }
}


