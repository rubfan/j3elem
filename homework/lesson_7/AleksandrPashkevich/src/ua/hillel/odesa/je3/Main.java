package ua.hillel.odesa.je3;

public class Main {

    public static void main(String[] args) {

        try {
            switch (args[0]) {
                case "paskal":
                    paskalTriangle(Integer.parseInt(args[1]));
                    break;
                    
                case "spiral":
                    spiral(Integer.parseInt(args[1]));
                    break;

                default:
                    System.out.println("Check input data");
            }

        } catch (Exception e) {

            errorShow();

        }


    }

    private static void paskalTriangle(int val) {

        int[][] arr = new int[val + 1][val + 1];

        for (int i = 1; i < arr.length; i++) {

            int temp = arr.length - i;

            paneShow(temp + 1);

            for (int j = 0; j < i; j++) {

                if (j > 0) {

                    arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];

                } else {

                    arr[i][j] = 1;
                }

                System.out.print(arr[i][j] + " ");

            }

            System.out.println();
        }
    }


    private static void paneShow(int i) {

        for (int l = i; l > 0; --l) {

            System.out.print(" ");
        }
    }

    private static void spiral(int number) {

        int line = 0;

        int col = 0;

        int[][] masive = new int[number][number];

        int doX = 1;

        int doY = 0;

        int directionChange = 0;

        int steps = number;

        for (int i = 0; i < number * number; i++) {

            masive[line][col] = i + 1;

            if (--steps == 0) {

                steps = number * (directionChange % 2) +

                        number * ((directionChange + 1) % 2) -

                        (directionChange / 2 - 1) - 2;

                int temp = doX;

                doX = -doY;

                doY = temp;

                directionChange++;
            }
            col += doX;

            line += doY;
        }

        for (int i = 0; i < number; i++) {

            for (int j = 0; j < number; j++) {

                System.out.print(masive[i][j] + "\t");

            }
            System.out.println();
        }


    }

    private static void errorShow() {

        System.out.println("ERROR, check input data.");

    }
}
