import java.util.Random;
import java.util.Scanner;

public class lesson7 {

    public static void main(String[] args) {

        int type = 0;
        int s;
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
                    mas = new int[10][10];
                    System.out.println("Array: ");
                    setFirstRowArray(mas, r);
                    setSecondRowArray(mas);
                    for (int i = 0; i < mas.length; i++) {
                        for (int j = 0; j < mas.length; j++) {
                            System.out.print(mas[i][j] + "\t");
                        }
                        System.out.println();
                    }
                    System.out.println();
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

    static void setFirstRowArray(int[][] mas, Random r) {

        mas[0][0] = 1;
        mas[0][mas.length - 1] = 1;
        for (int i = 1; i < mas.length - 1; i++) {
            mas[0][i] = r.nextInt(10);
        }
    }

    static void setSecondRowArray(int[][] mas) {

        for (int j = 1; j < mas.length; j++) {
            mas[j][0] = 1;
            mas[j][mas.length - 1] = 1;
            for (int i = 1; i < mas.length - 1; i++) {
                mas[j][i] = mas[j - 1][i - 1] + mas[j - 1][i];
            }
        }
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
    
