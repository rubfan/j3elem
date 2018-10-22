import java.util.Arrays;

public class MassJoin {


    public void start (String[] args) {

        int[] a = {1, 3, 5};

        int[] b = {2, 4, 8, 9, 12};

        int[] c = new int[a.length + b.length];

        c = union2Arr(a, b);

        arrShow(c);
    }

    public int[] union2Arr(int[] a, int[] b) {

        int[] c = new int[a.length + b.length];

        int[] temp = new int[c.length];

        for (int i = 0; i < c.length; i++) {

            if (i < a.length) {

                temp[i] = a[i];

            } else {

                temp[i] = b[i - a.length];
            }
            System.out.print(temp[i] + " ");

        }
        System.out.println();

        c = sortingArr(temp);

        return c;
    }

    public int[] sortingArr(int[] arr) {

        Arrays.sort(arr);

        return arr;
    }

    private void arrShow(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");

        }

    }

}

