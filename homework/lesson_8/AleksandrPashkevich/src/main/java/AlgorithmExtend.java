public class AlgorithmExtend {

    public int algCheck(int n) {

        int k = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int z = j + 1; z < n; z++) {

                    k++;

                }

            }

        }


        return k;
    }
}
