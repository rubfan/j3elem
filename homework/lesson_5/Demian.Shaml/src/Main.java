/**
 * @author DemianSH
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculation calc = new Calculation();
        Scanner in = new Scanner(System.in);
        int num;

        for (; ; ) {
            do {
                calc.showOperation();
                // to check input other type
                do {
                    if (!in.hasNextInt()) {
                        System.out.println("This isn't correct value for calculation!");
                        System.out.print("Please try again: ");
                        in.next();
                    }
                } while (!in.hasNextInt());
                num = in.nextInt();
                calc.chooseOperation(num);
            } while (calc.isVaild(num));
            //Exit from programm
            if (num == 7) {
                break;
            }
        }
    }
}
