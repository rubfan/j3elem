public class Task3 {

    public static void main(String[] args) {

//(n * (n-1) * (n-2)/3!
        AlgorithmExtend alg = new AlgorithmExtend();

        int n = (int) (Math.random() * 10 + 3);
        int calc = n*(n-1) *(n - 2)/6;
        int k = alg.algCheck(n);
        System.out.println("n = " + n + ", ((n)(n-1)(n-2)/3! = " + calc);
        System.out.println("Actual value: " + k);

        if (calc == k){

            System.out.println("formula looks working!");
        }


    }

}
