public class Lesson7 {
    public static void main(String[] args) {

        System.out.println(" Pascal's triangle ");
        System.out.println();
        System.out.println(riangle(7));
        System.out.println();
        System.out.println("Filling a 2-dimensional array in a spiral");
        System.out.println();
        System.out.println(spiral(5, 5));

    }

    public static int[][] riangle(int n) {

        int d = n * 2;
        int[][] array = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                if (j == 0 || j == i) {
                    array[i][j] = 1;
                } else {
                    array[i][j] = array[i - 1][j - 1] + array[i - 1][j];
                }

                String b = " %" + d + "d";
                if (j == 0) {
                    System.out.printf(b, array[i][j]);
                } else {
                    System.out.printf("%4d", array[i][j]);
                }
            }
            System.out.println();
            d -= 2;
        }
        return array;
    }

    public static int[][] spiral(int m, int n) {

        int s = 1;
        int[][] array = new int[m][n];

        for (int y = 0; y < n; y++) {
            array[0][y] = s;
            s++;
        }
        for (int x = 1; x < m; x++) {
            array[x][n - 1] = s;
            s++;
        }
        for (int y = n - 2; y >= 0; y--) {
            array[m - 1][y] = s;
            s++;
        }
        for (int x = m - 2; x > 0; x--) {
            array[x][0] = s;
            s++;
        }

        int c = 1;
        int d = 1;

        while (s < m * n) {
            while (array[c][d + 1] == 0) {
                array[c][d] = s;
                s++;
                d++;
            }

            while (array[c + 1][d] == 0) {
                array[c][d] = s;
                s++;
                c++;
            }

            while (array[c][d - 1] == 0) {
                array[c][d] = s;
                s++;
                d--;
            }

            while (array[c - 1][d] == 0) {
                array[c][d] = s;
                s++;
                c--;
            }
        }
        for (int x = 0; x < m; x++) {
            for (int y = 0; y < n; y++) {
                if (array[x][y] == 0) {
                    array[x][y] = s;
                }
            }
        }
        for (int x = 0; x < m; x++) {
            for (int y = 0; y < n; y++) {
                if (array[x][y] < 10) {
                    System.out.print(array[x][y] + ",  ");
                } else {
                    System.out.print(array[x][y] + ", ");
                }
            }
            System.out.println("");
        }
        return array;
    }
}