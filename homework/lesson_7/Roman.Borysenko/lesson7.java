import java.util.Random;
import java.util.Scanner;

public class lesson7 {

    public static void main(String[] args) {

        int type = 0;
        int s,count;
        int[][] mas;
        Random r = new Random();
        while (type != 3) {
            System.out.println("1. Pascal triangle");
            System.out.println("2. Spiral input array");
            System.out.println("3. Exit");
            type = new Scanner(System.in).nextInt();
            System.out.println();
            switch (type) {

                case 1:
                    mas = new int[15][15];
                    System.out.println("Array: ");
                    count = setPascalArray(mas);
                    printPascal(mas,count);
                    break;

                case 2:
                    System.out.println("Please Enter size of array:");
                    int n;
                    n = new Scanner(System.in).nextInt();
                    mas = new int[n][n];
                    System.out.println();
                    System.out.println("Array: ");
                    setSpiralArray(mas);
                    for (int i = 0; i < mas.length; i++) {
                        for (int j = 0; j < mas.length; j++) {
                            System.out.print(mas[i][j] + "\t");
                        }
                        System.out.println();
                    }
                    System.out.println();
                    break;

                case 3:
                    return;

                default:
                    System.out.println("Error!!!!");
                    System.out.println();
            }
        }
    }

    static int setPascalArray(int[][] mas) {

        int n,j;
        n = mas.length / 2;
        for(int i = 0; i < n + 1; i++) {
            mas[i][n - i] = mas[i][n + i] = 1;
            if(i > 1) {
                j = n - i + 2;
                while( j <  n + i - 1) {
                    mas[i][j] = mas[i - 1][j - 1] + mas[i - 1][j + 1];
                    j += 2;
                }
            }
        }
        n++;

        return n;
    }

    static void printPascal(int[][] mas, int count) {

        for (int i = 0; i < count; i++) {
            for (int j = 0; j < mas.length; j++) {
                if(mas[i][j] > 0) {
                    System.out.print(mas[i][j] + " ");
                    if(String.valueOf(mas[i][j]).length() == 1) {
                        System.out.print(" ");
                    }
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    static void setSpiralArray(int[][] mas) {

        int s = 1;
        int p = mas.length / 2;
        int n;
        for(int i = 1; i <= p; i++) {
            n = mas.length - i + 1;
            for(int j = i - 1; j < n; j++) {
                mas[i - 1][j] = s++;
            }
            for(int j = i; j < n; j++) {
                mas[j][mas.length - i] = s++;
            }
            n -= 2;
            for(int j = n; j >= i - 1; j--) {
                mas[mas.length - i][j] = s++;
            }
            for(int j = n; j >= i; j--) {
                mas[j][i - 1] = s++;
            }
        }
        if(mas.length % 2 == 1) {
            mas[p][p] = mas.length * mas.length;
        }
    }
}
    
