import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

public class SomeSupport {
    Scanner input = new Scanner(System.in);
    void taskOne(int n) {
        System.out.println("result your query:");
        for (int i = 1000; i < n; i += 3) {
            System.out.print(i + ", ");
        }
    }

    void taskTwo() {
        System.out.println("result your query:");
        for (int i = 1; i < 56; i += 2) {
            System.out.print(i + ", ");
        }
    }

    void taskThree() {
        System.out.println("result your query:");
        for (int i = 90; i > 0; i -= 5) {
            System.out.print(i + ", ");
        }
    }

    void taskFour() {
        int count = 0;
        int i = 2;
        System.out.println("result your query:");
        while (count < 20) {
            i *= 2;
            System.out.print(i + ", ");
            count++;
        }
    }

    int[] randomArray(int length) {
        Random num = new Random();
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = num.nextInt(100) - 30;
        }
        return array;
    }

    void amounthElemAr(int array[]) {
        int result = 0;
        for (int i = 0; i < 6; i++) {
            result = result + array[i];
        }
        System.out.println("result your query: " + result);
    }

    int[] amounthEvenOdd(int array[]) {
        int even = 0;
        int odd = 0;
        int[] result = new int[2];
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                even += array[i];
                result[0] = even;
            } else {
                odd += array[i];
                result[1] = odd;
            }
        }
        return result;
    }

    void printAmounthEvenOdd(int array[]) {
        System.out.println("Amounth evens numbers: " + array[0]);
        System.out.println("Amounth odd numbers: " + array[1]);
    }

    int[] minMaxVal(int array[]) {
        int[] minMax = new int[2];
        int min = array[0];
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min < array[i]) {
                min = array[i];
            }
            if (max > array[i]) {
                max = array[i];
            }
        }
        minMax[0] = min;
        minMax[1] = max;
        return minMax;
    }

    void printMinMaxVal(int[] array) {
        System.out.println("This is minimal values of array: " + array[0]);
        System.out.println("This is maximal values of array: " + array[1]);
    }

    int luckyTicket() {
        int until = 100000;
        int to = 999999;
        String pars;
        int count = 0;
        int[] resl = new int[to - until];
        for (int i = until; i <= to; i++) {
            pars = String.valueOf(i);
            int part1 = (int) pars.charAt(0) + (int) pars.charAt(1) + (int) pars.charAt(2);
            int part2 = (int) pars.charAt(3) + (int) pars.charAt(4) + (int) pars.charAt(5);
            if (part1 == part2) {
                resl[count] = i;
                count++;
            }
        }
        resl = Arrays.copyOf(resl, count);
        return count;
        //return resl;
    }

    String toBinary(int num) {
        String binary = "";
        while (num > 0) {
            if (num % 2 > 0) {
                binary += "1";
            } else {
                binary += "0";
            }
            num = num / 2;
        }
        binary = recursionString(binary);
        return binary;
    }

    String recursionString(String a) {
        String rec = "";
        for (int i = a.length() - 1; i >= 0; i--) {
            rec += a.charAt(i);
        }
        return rec;
    }

    int[] someMinVal(int[] array, int num) {
        int cb;
        for(int n = 0; n < num; n++){
            for(int i = array.length -1; i > n; i--){
                if(array[i] < array[i-1]){
                    cb = array[i];
                    array[i] = array[i-1];
                    array[i-1] = cb;
                }
            }
        }

        array = Arrays.copyOf(array, num);
        return array;
    }

    int numberOp(int num) {

        int res = num;
        String result = String.valueOf(res);
        int length = result.length();
        while (length > 1) {
            res = calcNumb(res, length);
            result = String.valueOf(res);
            length = result.length();
        }

        return res;
    }

    int calcNumb(int num, int length) {
        int j = 1;
        int resl = 0;
        for (int i = 0; i < length; i++) {
            resl += (num / j) % 10;
            j *= 10;
        }
        return resl;
    }

    void showMenu (){
        System.out.println();
        System.out.println("1. Four different variations of the cycle <for> (Task 1-4)");
        System.out.println("2. Some operations of array(Task 5-7, 10)");
        System.out.println("3. Lucky tickets (Task 8)");
        System.out.println("4. Switch number to binary (Task 9)");
        System.out.println("5. Task 11");
        System.out.println();
    }

    public int errorInput() {
        do {
            if (!input.hasNextInt()) {
                System.out.println("This isn't correct value for calculation!");
                System.out.print("Please try again: ");
                input.next();
            }
        } while (!input.hasNextInt());
        return input.nextInt();
    }
}
