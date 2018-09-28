public class SumInArr {


    public void main(String[] args) {

        int[] a = {1, 5, 7, 9, 12};

        System.out.println(isSumExist(a, 12));

        System.out.println(isSumExist(a, 3));
    }

    public boolean isSumExist(int[] arr, int sum) {

        boolean rez = false;

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length; j++) {

                int temp = 0;

                if (arr[i] != arr[j]) {

                    temp = arr[i] + arr[j];

                    if (temp == sum) {

                        rez = true;
                    }
                }
            }

        }
        return rez;
    }


}


