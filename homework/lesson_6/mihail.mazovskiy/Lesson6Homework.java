import array.ArrayTasks;
import digits.DigitsTasks;
import row.RowTasks;

import java.util.Scanner;

/**
 * Created by m_maz on 03.09.2018.
 */
public class Lesson6Homework {
    public static void main(String[] args) {
        String consoleInput="";
        while(!(consoleInput.toLowerCase().equals("exit".toLowerCase()))) {
            System.out.println("1. Task 1");
            System.out.println("2. Task 2");
            System.out.println("3. Task 3");
            System.out.println("4. Task 4");
            System.out.println("5. Task 5");
            System.out.println("6. Task 6");
            System.out.println("7. Task 7");
            System.out.println("8. Task 8");
            System.out.println("9. Task 9");
            System.out.println("10. Task 10");
            System.out.println("11. Task 11");
            System.out.println("Input 'exit' to exit ");
            System.out.print("Input number of the task: ");
            Scanner input = new Scanner(System.in);
            consoleInput = input.nextLine();
            switch (consoleInput) {
                case "1" :    RowTasks.firstTask();
                    break;
                case "2" :    RowTasks.secondTask();
                    break;
                case "3" :    RowTasks.thirdTask();
                    break;
                case "4" :    RowTasks.fourthTask();
                    break;
                case "5" :    ArrayTasks.nElementSum();
                    break;
                case "6" :    ArrayTasks.getMinAndMax();
                    break;
                case "7" :    ArrayTasks.oddAndEvenSum();
                    break;
                case "8" :    DigitsTasks.luckyNumbers();
                    break;
                case "9" :    DigitsTasks.convertToBinary();
                    break;
                case "10" :   ArrayTasks.firstFiveMinElements();
                    break;
                case "11" :   DigitsTasks.taskEleven();
                    break;
                default: System.out.println("Quality of service input error");
                    break;
            }
            System.out.println("");
        }




        //        RowTasks.firstTask();
//        RowTasks.secondTask();
//        RowTasks.thirdTask();
//        RowTasks.fourthTask();
        ArrayTasks.nElementSum();
        ArrayTasks.getMinAndMax();
        ArrayTasks.oddAndEvenSum();
        ArrayTasks.firstFiveMinElements();
//        DigitsTasks.convertToBinary();
//        DigitsTasks.taskEleven();
//        DigitsTasks.luckyNumbers();
    }
}
