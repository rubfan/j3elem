/**
 * @author DemianSH
 */

public class Main {

    public static void main(String[] args) {
        Calculation calc = new Calculation();
        int num;
        int choose;

        System.out.println();
        System.out.println("Hello this is program for calculation some input values. ");
        System.out.println();
        calc.showChoose();
        System.out.println();
        System.out.print("Please choose what you want to use: ");
        choose = calc.errorInput();

        switch (choose) {
            case 1:
                System.out.println();
                System.out.println("Welcome, you use args[0] = " + args[0] + ", and args[1] = " + args[1] + ".");
                calc.setCalcAgrs0(args[0]);
                calc.setCalcArgs1(args[1]);

                while (true) {
                    do {
                        calc.showOperation();
                        num = calc.errorInput();
                        calc.chooseOperationArgs(num);
                    } while (calc.isVaild(num));
                    //Exit from programm
                    if (num == 7) {
                        break;
                    }
                }
                break;

            case 2:
                while (true) {
                    do {
                        calc.showOperation();
                        num = calc.errorInput();
                        calc.chooseOperation(num);
                    } while (calc.isVaild(num));
                    //Exit from programm
                    if (num == 7) {
                        break;
                    }
                }
                break;

            case 3:
                System.out.println();
                calc.showTips();
                int nb = calc.errorInput();
                calc.tipsCalc(nb);
                break;
        }
    }
}
