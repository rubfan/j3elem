import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
                                        // README
// When you start this program in the console you should to do next:
// First Value choosing position of the function
// Next Values are parameters which you send to the console
//For example: java LessonFour 1 5 8 2, Where (1) - number of function, (5/8/2) - parameters.
// Good Luck
public class LessonFour {
    public static void main(String[] args){
        int FirstArg=0;
		MainMenu();
       FirstArg=Integer.valueOf(args[0]);
        

             if (FirstArg == 1) {
                 TaskOne(args[1], args[2], args[3]);
             }
				if (FirstArg == 2) {
					TaskTwo(args[1], args[2], args[3]);
				}
					if (FirstArg == 3) {
						TaskThree(args[1], args[2], args[3]);
					}
						if (FirstArg == 4) {
							TaskFour(args[1]);
						}
							if (FirstArg == 5) {
								TaskFive(args[1], args[2]);
							}
								if (FirstArg == 6) {
									TaskSix(args[1], args[2]);
								}
									if (FirstArg == 7) {
										TaskSeven(args[1]);
									}

    }


    public static void MainMenu() {

        System.out.println("1. Finde MinValue, press 1.");         //...
        System.out.println("2. Finde MinValue and MaxValue, press 2."); //...
        System.out.println("3. Finde one or few min values, press 3.");
        System.out.println("4. Is this value is even or not, press 4.");
        System.out.println("5. Division two values on each other, press 5.");
        System.out.println("6. Which value is closer to 10, press 6.");
        System.out.println("7. Room), press 7.");
    }

    public static void TaskOne(String a, String b, String c) {
       int[] mass = {Integer.valueOf(a),Integer.valueOf(b), Integer.valueOf(c)};
        Arrays.sort(mass);
        System.out.println("Your MinValue is: " + mass[0]);                             
    }                                                                            

   public static void TaskTwo(String a, String b, String c) {
        int[] mass = {Integer.valueOf(a),Integer.valueOf(b), Integer.valueOf(c)};

        int min = mass[0];
        int max = mass[0];
		
        for (int ValueTaskTwo = 0; ValueTaskTwo < mass.length; ValueTaskTwo++) {
            if (min > mass[ValueTaskTwo]) min = mass[ValueTaskTwo];
        }
        System.out.println("Your MinValue is: " + min);
        for (int ValueTaskTwo = 0; ValueTaskTwo < mass.length; ValueTaskTwo++) {
            if (max < mass[ValueTaskTwo]) max = mass[ValueTaskTwo];
        }
        System.out.println("Your MaxValue is: " + max);

    }                              

    public static void TaskThree(String a, String b, String c) {
        int[] mass = {Integer.valueOf(a),Integer.valueOf(b), Integer.valueOf(c)};

        for (int i = mass.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (mass[j] > mass[j + 1]) {
                    int tmp = mass[j];
                    mass[j] = mass[j + 1];
                    mass[j + 1] = tmp;
                }
            }
        }

        System.out.println(" ");
        System.out.println("Your MinValues are: " + mass[0] + " " + mass[1]);

    }                            

    public static void TaskFour(String a) {
        int[] mass = {Integer.valueOf(a)};

        if (mass[0] % 2 == 0)
            System.out.println("Value " + mass[0] + " is even");
        else
            System.out.println("Value " + mass[0] + " is not even");

    }                              

    public static void TaskFive(String a, String b) {
        int[] mass = {Integer.valueOf(a),Integer.valueOf(b)};

        if (mass[0] % mass[1] == 0)
            System.out.println("Result: " + mass[0] + "/" + mass[1] + "=" + mass[0] / mass[1]);
        else
            System.out.println("It has remainder of devision, sorry ^_^");
    }                               

    public static void TaskSix(String a, String b) {
        int[] mass = {Integer.valueOf(a),Integer.valueOf(b)};
        int ResOne, ResTwo;
        ResOne = 10 - mass[0];
        ResTwo = 10 - mass[1];
        if (ResOne > ResTwo)
            System.out.println("FirstValue " + mass[0] + " is closer to 10 than SecondValue " + mass[1]);
		else
			System.out.println("SecondValue " + mass[1] + " is closer to 10 than FirstValue " + mass[0]);
    }

    public static void TaskSeven(String a) {

        int CostByOneDay = 40;
        int SevenValue = Integer.valueOf(a);
        if (SevenValue <= 5)
            System.out.println("You should to pay = " + CostByOneDay * SevenValue+"$");
				if (SevenValue > 5 && SevenValue < 7)
					System.out.println("You should to pay = " + (CostByOneDay * SevenValue - 20)+"$");
						if (SevenValue > 7)
							System.out.println("You should to pay = " + (SevenValue * CostByOneDay - 50)+"$");

    }

}
