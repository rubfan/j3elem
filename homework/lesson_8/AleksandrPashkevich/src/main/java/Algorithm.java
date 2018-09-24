//(n * (n-1) * (n-2)/3! = O(n^3)/3!

public class Algorithm {

    public static void main(String[] args) {

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

        int rez = k;
    }
}
