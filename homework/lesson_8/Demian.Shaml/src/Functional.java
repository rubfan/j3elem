import java.util.Arrays;
import java.util.Scanner;

public class Functional {
    Scanner input = new Scanner(System.in);
    int countSelect;

    public int[] getRandomArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 47);
        }
        return array;
    }

    public int[] sortSelection(int[] array) {
        int min;
        for (int i = 0; i < array.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < array.length; j++) {
                countSelect++;
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            swapElem(array, i, min);
        }
        return array;
    }

    public int getCountSelect(){
        return countSelect;
    }

    private void swapElem(int arr[], int index1, int index2) {
        int clipboard = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = clipboard;
    }

    public void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    public int[] concArr(int[] arrFirst, int[] arrSecond) {
        int fLeng = arrFirst.length;
        int sLeng = arrSecond.length;
        int[] arrThird = new int[fLeng + sLeng];
        System.arraycopy(arrFirst, 0, arrThird, 0, fLeng);
        System.arraycopy(arrSecond, 0, arrThird, fLeng, sLeng);
        return arrThird;
    }

    public int[] sortInsert(int[] array) {
        int clipboard;
        for (int i = 1; i < array.length; i++) {
            clipboard = array[i];
            int srOut = i;
            while (srOut > 0 && array[srOut - 1] >= clipboard) {
                array[srOut] = array[srOut - 1];
                --srOut;
            }
            array[srOut] = clipboard;
        }
        return array;
    }

    public int[] mergeArray(int[] firstArr, int[] secondArr){
        int[] thirdArr = new int[firstArr.length + secondArr.length];
        int firLen = 0;
        int secLen = 0;
        int thirdLen = 0;
        while(firLen < firstArr.length && secLen < secondArr.length){
            if(firstArr[firLen] < secondArr[secLen]){
                thirdArr[thirdLen++] = firstArr[firLen++];
            }else{
                thirdArr[thirdLen++] = secondArr[secLen++];
            }
        }
        while(firLen < firstArr.length){
            thirdArr[thirdLen++] = firstArr[firLen++];
        }
        while(secLen < secondArr.length){
            thirdArr[thirdLen++] = secondArr[secLen++];
        }
        return thirdArr;
    }

    private boolean getSumBoolean(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int check = array[i] + array[i + 1];
            for(int j = i + 2; j < array.length - 2; j++ ){
                if (check == array[j]){
                    return true;
                }
            }
        }
        return false;
    }

    public void checkElemArray(int[] array) {
        if (getSumBoolean(array)) {
            System.out.println("The array has amounth of some its elements ");
        } else {
            System.out.println("The array doesn't have amounth of some its elements");
        }
    }

    public int errorInput(){
        do {
            if (!input.hasNextInt()) {
                System.out.println("This isn't correct value for calculation!");
                System.out.print("Please try again: ");
                input.next();
            }
        } while (!input.hasNextInt());
        return input.nextInt();
    }

    public void algorithm (){
        int k = 0;
        int n = 10;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int z = j + 1; z < n; z++) {
                    k++;
                }
            }
        }
        System.out.println("The result is " + k);
    }
}
