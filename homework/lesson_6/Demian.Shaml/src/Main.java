/**
 * @author DeshameSH
 */

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SomeSupport sup = new SomeSupport();
        Scanner in = new Scanner(System.in);
        String input;

        sup.showMenu();
        System.out.print("Please, choose what you want to view: ");
        input = in.nextLine();

        switch(input){
            case "1":
                System.out.println();
                System.out.print("From this operation please enter the value until 1000 to which to calculate");
                int ts1 = sup.errorInput();
                System.out.println();
                System.out.println("This cycle for task - 1\n");
                sup.taskOne(ts1);
                System.out.println("\n");
                System.out.println("This cycle for task - 2\n");
                sup.taskTwo();
                System.out.println("\n");
                System.out.println("This cycle for task - 3\n");
                sup.taskThree();
                System.out.println("\n");
                System.out.println("This cycle for task - 4\n");
                sup.taskFour();
                System.out.println("\n");
                break;

            case "2":
                System.out.println();
                System.out.println("Please, entery length of the array (recommended length is 10)");
                int lenArr = sup.errorInput();
                int[] array = new int[lenArr];
                System.out.println("this is our random array:");
                array = sup.randomArray(lenArr);
                System.out.println(Arrays.toString(array));
                System.out.println();
                System.out.println("This is amounth of elements our array. ");
                sup.amounthElemAr(array);
                System.out.println();
                int[] amounthEvenOdd = new int[2];
                amounthEvenOdd = sup.amounthEvenOdd(array);
                sup.printAmounthEvenOdd(amounthEvenOdd);
                System.out.println();
                int[] minMaxVal = new int[2];
                minMaxVal = sup.minMaxVal(array);
                sup.printMinMaxVal(minMaxVal);
                System.out.println();
                System.out.print("Please, entry number minimal elements of the array what you will see: ");
                int minNumArr = sup.errorInput();
                System.out.println();
                System.out.print("Some minimal values of the array: ");
                System.out.println(Arrays.toString(sup.someMinVal(array, minNumArr)));
                break;

            case "3":
                System.out.println();
                System.out.print("The number of the lucky tickets until 100000 to 999999: ");
                System.out.println(sup.luckyTicket());
                System.out.println();
                break;

            case "4":
                System.out.println();
                System.out.print("please enter number for switch to binary :");
                int num4 = sup.errorInput();
                System.out.println();
                System.out.print("The binary number: ");
                System.out.println(sup.toBinary(num4));
                break;

            case "5":
                System.out.println();
                System.out.print("Please enter number for calculate:");
                int num5 = sup.errorInput();
                System.out.println();
                System.out.print("result your query: ");
                System.out.println(sup.numberOp(num5));
                break;

            default:
                System.out.println("\nPlease, choose correct task");
                break;
        }
    }
}
