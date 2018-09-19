package ua.hillel.odesa.je3;

public class Main {

    public static void main(String[] args) {

        try {

            showSumm(Integer.parseInt(args[0]), Integer.parseInt(args[1]));

        } catch (Exception e) {

            System.out.println("Check input value!");

        }
    }

    private static void showSumm(int val1, int val2) {

        int rez = val1 + val2;

        System.out.println(val1 + " + " + val2 + " = " + rez);

    }

}
