package row;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by m_maz on 03.09.2018.
 */
public class RowTasks {
    // Print on screen the row of digits (next digit is +3) starting from 1000 till less than 10000
    public static void firstTask() {
        Integer digit = 1000;
        while (digit < 10000) {
            System.out.println(digit);
            digit = digit + 3;
        }
        return;
    }

    //Print on screen the row of 55 firs digits (next digit is +2) starting from 1
    public static void secondTask() {
        Integer digit = 1;
        for (int i = 1; i <= 55; i++) {
            System.out.println(digit);
            digit = digit + 2;
        }
        return;
    }

    // Print on screen the row of digits (next digit is -5) starting from 90 till more or equal 0
    public static void thirdTask() {
        Integer digit = 90;
        while (digit >= 0) {
            System.out.println(digit);
            digit = digit - 5;
        }
        return;
    }
    //Print on screen the row of 55 firs digits (next digit is +2) starting from 1
    public static void fourthTask() {
        Integer digit = 1;
        for (int i = 1; i <= 20; i++) {
            System.out.println(digit);
            digit = digit * 2;
        }
        return;
    }

}
