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

    int [] [] arr = new int [val+ 1] [val + 1];

    for (i = 0; i < arr.length; i++){

    	for (int j = 0; j < arr[i].length; j++){
    		if (j>0){

    		arr[i][j] = arr[i-1][j-1] + arr [i-1][j]
    	} else { 
    		arr[i][j] = 1;
    	}

    	System.out.print(arr[i][j] + " ");
    	
    	}

    	System.out.println();
    }
    }

    private static void errorShow() {

        System.out.println("ERROR, check input data.");
    }
}
