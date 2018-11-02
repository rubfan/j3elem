import java.util.Scanner;

public class Lesson7 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("HomeWork after Lesson7");
        System.out.println("Next Options is available");
        System.out.println("1. Display Paskal Triangle with custom size from 2 to 33");
        System.out.println("2. Fill custom 2d array in snake's stile");

        switch (Integer.valueOf(scanner.nextLine())) {
            case 1: {
                System.out.println("Enter wanted size from 2 to 33");
                int size = Integer.valueOf(scanner.nextLine());
                while (size < 2 & size > 33) {
                    System.out.println("Something went wrong, please enter size again" +
                            "remember, the value should be more then 2 and less then 33");
                    size = Integer.valueOf(scanner.nextLine());
                }
                paskalSqare(size);
                break;
            }

            case 2: {
                System.out.println("Enter wanted size of one side of square");
                int size = Integer.valueOf(scanner.nextLine());
                snakeStile(size);
                break;
            }
            default:
        }
    }


    static void paskalSqare(int size) {

        int[][] square = new int[size][];

        for (int i = 0; i < square.length; i++) {
            square[i] = new int[i + 1];
        }

        for (int y = 0; y < size; y++) {
            for (int x = 0; x < square[y].length; x++) {
                if (x == 0) {
                    square[y][x] = 1;
                } else {
                    if (x == (square[y].length - 1)) {
                        square[y][x] = 1;
                    } else {
                        square[y][x] = square[y - 1][x] + square[y - 1][x - 1];
                    }
                }
            }
        }


        int lV = (String.valueOf(square[size - 1][size / 2]).length()) + 1; //lV = LongestValue
        if ((lV % 2) == 1) {
            lV = lV + 1;
        }

        for (int y = 0; y < size; y++) {
            System.out.format("%" + (size - y) * (lV / 2) + "s", "");
            for (int x = 0; x < square[y].length; x++) {
                System.out.printf("%" + lV + "d", square[y][x]);
            }
            System.out.println();
        }

    }


    static void snakeStile(int size) {
        int sizeY = size;
        int sizeX = size;
        int[][] snakeSquare = new int[sizeY][sizeX];
        int maxValue = size * size;
        int stepCounter = 1;
        int posY = 0;
        int posX = 0;
        int turnRight = 0;

        for (int i = 0; i < size; i++) {
            for (int z = 0; z < size; z++) {
                snakeSquare[i][z] = 0;
            }
        }

        while (stepCounter <= maxValue) {
            snakeSquare[posY][posX] = stepCounter;

            if (stepCounter == maxValue) break;

            switch (turnRight) {
                case 0: {
                    if ((posX + 1) == size) {
                        stepCounter--;
                        turnRight++;
                        posX--;
                    } else {
                        if ((snakeSquare[posY][posX + 1]) != 0) {
                            stepCounter--;
                            turnRight++;
                            posX--;
                        }
                    }
                    posX++;
                }
                break;
                case 1: {
                    if ((posY + 1) == size) {
                        stepCounter--;
                        turnRight++;
                        posY--;
                    } else {
                        if ((snakeSquare[posY + 1][posX]) != 0) {
                            stepCounter--;
                            turnRight++;
                            posY--;
                        }
                    }
                    posY++;
                }
                break;
                case 2: {
                    if ((posX - 1) < 0) {
                        stepCounter--;
                        turnRight++;
                        posX++;
                    } else {
                        if ((snakeSquare[posY][posX - 1]) != 0) {
                            stepCounter--;
                            turnRight++;
                            posX++;
                        }
                    }
                    posX--;
                }
                break;
                case 3: {
                    if ((posY - 1) < 0) {
                        turnRight++;
                        posY++;
                    } else {
                        if ((snakeSquare[posY - 1][posX]) != 0) {
                            stepCounter--;
                            turnRight++;
                            posY++;
                        }
                    }
                    posY--;
                }
                break;

            }

            if (turnRight == 4) turnRight = 0;

            stepCounter++;
        }


        for (int y = 0; y < size; y++) {
            for (int x = 0; x < size; x++) {
                System.out.printf("%4d", snakeSquare[y][x]);

            }
            System.out.println();
        }
    }

}