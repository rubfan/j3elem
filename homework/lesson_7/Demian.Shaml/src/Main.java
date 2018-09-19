/**
 * @author DemianSH
 */

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Triangle func = new Triangle();

        System.out.println();
        System.out.print("Please, entry size for Pascal's triange: ");
        int sizeTr = func.errorInput();
        System.out.println();
        int [][] trianArr = func.getArray(sizeTr);
        int mid = func.getMiddleArray(trianArr);
        trianArr[0][mid] = 1;
        func.fillArray(trianArr, mid);
        func.printTriangle(trianArr);
        System.out.println("\n");

        System.out.println("Please, entry size of array:");
        System.out.println();
        System.out.print(" -length high: ");
        int i = func.errorInput();
        System.out.print(" -length width: ");
        int j = func.errorInput();
        System.out.println();
        Spiral sp = new Spiral(i, j);
        int[][] spiral = sp.getFilledArray();

        for (int [] array : spiral){
            System.out.println(Arrays.toString(array));
        }
    }
}
