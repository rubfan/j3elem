package ua.hillel.odesa.je3;

public class Main {

    public static void main(String[] args) {

        try {
            switch (args[0]) {
                case "paskal":
                    paskalTriangle(Integer.parseInt(args[1]));
                    break;
                case "spiral":

                    break;

                default:
                    System.out.println("Check input data");
            }

        } catch (Exception e) {

            errorShow();

        }


    }

    private static void paskalTriangle(int val) {

    
    }

    private static void errorShow() {

        System.out.println("ERROR, check input data.");
    }
}
