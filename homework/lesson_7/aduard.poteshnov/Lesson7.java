import java.util.Scanner;

public class Lesson7{

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("HomeWork after Lesson7");
        System.out.println("Next Options is available");
        System.out.println("1. Display Paskal Square with custom size from 2 to 30");
        System.out.println("2. Display Paskal Triangle with custom size from 2 to 30");
        System.out.println("Note: That will be triangle with curve side. " +
                "I'm too lazy for build cute picture in console");
        System.out.println("3. Display Paskal Triangle with custom size from 2 to 30");
        System.out.println("4. Fill custom 2d array in snake's stile");

        switch (Integer.valueOf(scanner.nextLine())) {
            case 1: {
                System.out.println("Enter wanted size from 2 to 30");
                int size = Integer.valueOf(scanner.nextLine());
                while (size < 2 & size > 30) {
                    System.out.println("Something went wrong, please enter size again" +
                            "remember, the value should be more then 2 and less then 30");
                    size = Integer.valueOf(scanner.nextLine());
                }
                paskalSqare(size);
                break;
            }
            case 2: {
                System.out.println("Enter wanted size from 2 to 30");
                int size = Integer.valueOf(scanner.nextLine());
                while (size < 2 & size > 30) {
                    System.out.println("Something went wrong, please enter size again" +
                            "remember, the value should be more then 2 and less then 30");
                    size = Integer.valueOf(scanner.nextLine());
                }
                paskalSquareV2(size);
                break;
            }
            case 3 : {
                System.out.println("Enter wanted size from 2 to 30");
                int size = Integer.valueOf(scanner.nextLine());
                while (size < 2 & size > 30) {
                    System.out.println("Something went wrong, please enter size again" +
                            "remember, the value should be more then 2 and less then 30");
                    size = Integer.valueOf(scanner.nextLine());
                }
                paskalSquareV3(size);
                break;
            }
            case 4: {
                System.out.println("Enter wanted size of one side of square");
                int size = Integer.valueOf(scanner.nextLine());
                snakeStile(size);
                break;
            }
            default:
        }
    }


    static void paskalSqare(int size) {
        int sizeY = size;
        int sizeX = size;
        int[][] square = new int[sizeY][sizeX];

        for (int row = 0; row < sizeX; row++) {
            for (int col = 0; col < sizeY; col++) {
                if (col == 0) {
                    square[row][col] = 1;
                } else {
                    if (row == 0) {
                        square[row][col] = 1;
                    } else {
                        square[row][col] = square[row - 1][col] + square[row][col - 1];
                    }
                }
            }
        }
        for (int row = 0; row < sizeX; row++) {
            for (int col = 0; col < sizeY; col++) {
                System.out.print(square[row][col] + " ");
            }
            System.out.println();
        }
    }

    static void paskalSquareV2(int size) {
        int sizeY = size;
        int sizeX = (size * 2) - 1;
        String[][] square = new String[sizeY][sizeX];

        for (int y = 0; y < sizeY; y++) {
            int positionOfLastElement = y * 2;
            for (int x = 0; x < sizeX; x++) {
                if (x <= positionOfLastElement) {
                    if (x == 0) {
                        square[y][x] = String.valueOf(1);
                    } else {
                        if ((x % 2) != 0) {
                            square[y][x] = "0";
                        } else {
                            if (y > 1) {
                                int sum = Integer.valueOf(square[y - 1][x]) + Integer.valueOf(square[y - 1][x - 2]);
                                square[y][x] = String.valueOf(sum);
                            } else {
                                square[y][x] = String.valueOf(1);
                            }
                        }
                    }
                } else {
                    square[y][x] = "0";
                }
            }
        }

        for (int y = 0; y < sizeY; y++) {
            for (int x = 0; x < sizeX; x++) {
                if (Integer.valueOf(square[y][x]) == 0) {
                    System.out.printf("");
                } else {
                    System.out.print(square[y][x]);
                }
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

    static void paskalSquareV3(int size) {
        int sizeY = size;
        int sizeX = (size * 2) - 1;
        int[][] square = new int[sizeY][sizeX];

        for (int y = 0; y < sizeY; y++) {
            int positionOfLastElement = y * 2;
            for (int x = 0; x < sizeX; x++) {
                if (x <= positionOfLastElement) {
                    if (x == 0) {
                        square[y][x] = 1;
                    } else {
                        if ((x % 2) != 0) {
                            square[y][x] = 0;
                        } else {
                            if (y > 1) {
                                int sum = square[y - 1][x] + square[y - 1][x - 2];
                                square[y][x] = (sum);
                            } else {
                                square[y][x] = 1;
                            }
                        }
                    }
                } else {
                    square[y][x] = 0;
                }
            }
        }

        for (int y = 0; y < sizeY; y++) {
            System.out.format("%"+(size - y)*2+"s",""); //not understand how it works, stolen from net
            for (int x = 0; x < sizeX; x++) {
                if ((square[y][x]) == 0) {
                    System.out.printf("");
                } else {
                    System.out.printf("%4d", square[y][x]);
                }
            }
            System.out.println();
        }
    }

}