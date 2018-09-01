public class Task1 {

    public static void main(String[] args) {

        int min = Integer.parseInt(args[0]);
        for (int i = 1; i < 3; i++) {

            if (Integer.parseInt(args[i]) < min) {
                min = Integer.parseInt(args[i]);
            }

        }
        System.out.println("min value: " + min);
    }
}
