import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lesson8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        Random r = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(100);
        }
        System.out.println("Selection sorting");
        System.out.println(Arrays.toString(array));
        selectionSort(array);
        System.out.println(Arrays.toString(array));
        System.out.println("Complexity of algorithms = O(n^2), n = array length ");
        System.out.println();
        System.out.println("Merging two arrays");

        int[] a = {1,2,4,5};
        int[] b = {6,7,8,9};

        System.out.println("Merged Arrays " + Arrays.toString(mergeTwoArrays(a,b)));
        System.out.println();
        System.out.println("Complexity of algorithms = O(n + m); n = a.length; m = b.length ");
        System.out.println();
        System.out.println("Sum of numbers in an array");
        System.out.println("Enter amount : ");

        int sum = scanner.nextInt();

        System.out.println("Sum " + sum + " " + sum(array, sum));
        System.out.println();
        System.out.println("public class Algorithm {\n" +
                "    public static void main(String[] args) {\n" +
                "        int k = 0;\n" +
                "        int n = 10;\n" +
                "        for (int i = 0; i < n; i++) {\n" +
                "            for (int j = i + 1; j < n; j++) {\n" +
                "                for (int z = j + 1; z < n; z++) {\n" +
                "                    k++;\n" +
                "                }\n" +
                "            }\n" +
                "        }\n" +
                "        System.out.println(\"The result is \" + k);\n" +
                "    }\n" +
                "} " +
                "\n" +
                "Complexity of algorithms = O(n^3)");

    }
    public static int[] mergeTwoArrays(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];
        int aIndex =0 ;
        int bIndex=0;
        for (int i = 0; i < result.length; i++) {
            if (aIndex < a.length && bIndex < b.length) {
                if (a[aIndex] < b[bIndex]) {
                    result[i] = a[aIndex];
                    aIndex++;
                } else {
                    result[i] = b[bIndex];
                    bIndex++;
                }
            } else if (aIndex < a.length) {
                result[i] = a[aIndex];
                aIndex++;
            } else {
                result[i] = b[bIndex];
                bIndex++;
            }
        }
        return result;
    }
    public static void selectionSort(int[] a) {
        int min, temp;
        for (int index = 0; index < a.length - 1; index++) {
            min = index;
            for (int scan = index + 1; scan < a.length; scan++) {
                if (a[scan] < a[min])
                    min = scan;
            }
            temp = a[min];
            a[min] = a[index];
            a[index] = temp;
        }
    }
    public static boolean sum(int[] a, int sum) {
        int max = Arrays.binarySearch(a, sum + 1 - a[0]);
        if (max < 0) max = Math.min(-max - 1, a.length - 1);

        int min = Arrays.binarySearch(a, sum / 2);
        if (min < 0) min = Math.min(-min - 2, a.length - 1);

        for (int i = max; i > min; i--) {
            int s = Arrays.binarySearch(a, 0, i, sum - a[i]);
            if (s >= 0) {

            }
            return true;
        }
        return false;
    }
}
