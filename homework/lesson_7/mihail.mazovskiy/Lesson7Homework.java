import java.util.Scanner;

public class Lesson7Homework {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
        System.out.print("Input size of Pascal's triangle (20 max): ");
	    Integer number =  scanner.nextInt();
        if (number <= 20) {
            Integer[][] pascalArray = pascalTriangleGenerator(number);
            pascalTriangleArrayPrinter(pascalArray);
        }
        else System.out.println("Size of array is too big");
        System.out.print("Input size of array: ");
        Integer size = scanner.nextInt();
        Integer[][] array = new Integer[size][size];
        System.out.println(size);
        Integer[] startPoint = {0, 0};
        Integer counter = 1;
        array = spiralArrayInput(array, size, startPoint, counter);
        printArray(array);
    }

    private static Integer[][] pascalTriangleGenerator(Integer number) {
        Integer[][] pascalTriangleArray = new Integer[number][number];
        for (int i = 0; i < number; i++)
            for (int j = 0; j < number; j++) {
                if (i + j <= number)
                    if (i == 0 || j == 0)
                        pascalTriangleArray[i][j] = 1;
                    else pascalTriangleArray[i][j] = pascalTriangleArray[i - 1][j] + pascalTriangleArray[i][j - 1];
                else pascalTriangleArray[i][j] = 0;
            }
       return pascalTriangleArray;
    }

    private static void pascalTriangleArrayPrinter(Integer[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i][j] != 0) {
                    if (array[i][j] > 0 && array[i][j] < 10)
                        System.out.print(array[i][j] + "     ");
                    if (array[i][j] > 9 && array[i][j] < 100)
                        System.out.print(array[i][j] + "    ");
                    if (array[i][j] > 99 && array[i][j] < 1000)
                        System.out.print(array[i][j] + "   ");
                    if (array[i][j] > 999 && array[i][j] < 10000)
                        System.out.print(array[i][j] + "  ");
                    if (array[i][j] > 9999 && array[i][j] < 100000)
                        System.out.print(array[i][j] + " ");
                    if (array[i][j] > 99999 && array[i][j] < 1000000)
                        System.out.print(array[i][j] + " ");
                }
            }
            System.out.println("");
        }
    }

    private static Integer[][] spiralArrayInput(Integer[][] array, Integer size, Integer[] startpoint,
                                                Integer counter) {
        int i = startpoint[0];
        int j = startpoint[1];
        for (; i < size; i++) {
            array[i][j] = counter;
            counter++;

        }
        i--;
        for (j = j + 1; j < size; j++) {
            array[i][j] = counter;
            counter++;
        }
        j--;
        for (i = i -1; i >= startpoint[0]; i--) {
            array[i][j] = counter;
            counter++;
        }
        i++;
        for (j = j -1; j >= startpoint[1] + 1; j--) {
            array[i][j] = counter;
            counter++;
        }
        startpoint[0] = startpoint[0] + 1;
        startpoint[1] = startpoint[1] + 1;
        if (startpoint[0] < size)
            array = spiralArrayInput(array, size - 1, startpoint, counter);
        return array;
    }
    private static void printArray(Integer[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j< array.length; j++)
                System.out.print(array[i][j] + "   ");
            System.out.println();
        }
    }
}
