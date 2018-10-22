public class Task1 {

    public static void main(String[] args) {
        int[] numbers = {10, 3, 4, 8, 15, 47, 34, 85, 12, 23, 41, 56, 12, 49, 94};
        System.out.println("Minimum value = " + minValue(numbers));

    }

    private static int minValue(int[] numbers) {

        int min = Integer.MAX_VALUE;

        int count = 0;


        for (int i = 0; i < numbers.length; i++) {

            min = numbers[i];

            for (int j = 0; j < numbers.length; j++) {

                count++;

                if (numbers[j] < min) {

                    min = numbers[j];
                }
            }

        }

        System.out.println("Number of operations: " + count);

        return min;
    }
}
