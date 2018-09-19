
public class Main {
    public static void main(String[] args) {
        Functional func = new Functional();

        System.out.println();
        System.out.print("Please, entry size of the array: ");
        int sizeArSelect = func.errorInput();
        int[] array = func.getRandomArray(sizeArSelect);
        System.out.println();
        System.out.println("This's our the random array:");
        func.printArray(array);
        System.out.println();
        System.out.println("after used sort of selection our array:");
        int[] sortSelection = func.sortSelection(array);
        func.printArray(sortSelection);
        System.out.println();
        int countNumb = func.getCountSelect();
        System.out.println("Number operation for sort of selection: " + countNumb + "\n");
        System.out.println("as soon as, this algorithm has O(n^2).");
        System.out.print("If we up entry params on 10, we we'll see number operation: ");
        int countNumAft = countNumb * (int) Math.pow(10, 2);
        System.out.println(countNumAft);
        System.out.println();

        System.out.print("Please, entry size of the first array: ");
        int sizeFirs = func.errorInput();
        System.out.print("Please, entry size of the second array: ");
        int sizeSecond = func.errorInput();
        System.out.println();
        int[] arrFirst = func.getRandomArray(sizeFirs);
        int[] arrSecond = func.getRandomArray(sizeSecond);
        arrFirst = func.sortSelection(arrFirst);
        System.out.println("This's our the first array(alredy sorted):");
        func.printArray(arrFirst);
        System.out.println();
        arrSecond = func.sortSelection(arrSecond);
        System.out.println("This's our the second array(alredy sorted):");
        func.printArray(arrSecond);
        System.out.println();

        int[] arrThird = func.concArr(arrFirst, arrSecond);
        System.out.println("This's the third array(combined of the first and the second array):");
        func.printArray(arrThird);
        System.out.println();
        int[] arrThirdIns = func.sortInsert(arrThird);
        System.out.println("after used sort of insertion our array:");
        func.printArray(arrThirdIns);
        System.out.println();

        int[] arrThirdMerge = func.mergeArray(arrFirst, arrSecond);
        System.out.println("as soon as that sort of insertion has O(n^2).");
        System.out.println("We will try merge our array, beacuse this algorithm has O(n)" + "\n");
        System.out.println("after used merge our array:");
        func.printArray(arrThirdMerge);
        System.out.println();

        System.out.print("Please, entry size of the forth array: ");
        int sizeForth = func.errorInput();
        System.out.println();
        int[] arrForth = func.getRandomArray(sizeForth);
        arrForth = func.sortInsert(arrForth);
        System.out.println("This's our the forth array: ");
        func.printArray(arrForth);
        System.out.println();
        func.checkElemArray(arrForth);
        System.out.println();

        System.out.println("Difficutly this algorithm is O(n^3).");
        System.out.print("The number of operation: ");
        func.algorithm();
    }
}
