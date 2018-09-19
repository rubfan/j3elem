import java.util.Scanner;

public class Triangle {
    Scanner in = new Scanner(System.in);

    public int[][] getArray(int size) {
        int[][] arraytr = new int[size][size * 2 + 1];
        return arraytr;
    }

    public int getMiddleArray(int[][] arraytr) {
        int mid = arraytr[0].length / 2;
        return mid;
    }

    public void fillArray(int array[][], int mid) {
        for (int i = 1; i < array.length; i++) {
            for (int j = mid - i; j < array[i].length - 1; j += 2) {
                array[i][j] = array[i - 1][j - 1] + array[i - 1][j + 1];
            }
        }
    }

    public void printTriangle(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println();
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == 0) {
                    System.out.print(" ");
                } else {
                    System.out.print(array[i][j]);
                }
            }
        }
    }

    public int errorInput() {
        do {
            if (!in.hasNextInt()) {
                System.out.println("This isn't correct value for calculation!");
                System.out.print("Please try again: ");
                in.next();
            }
        } while (!in.hasNextInt());
        return in.nextInt();
    }
}

