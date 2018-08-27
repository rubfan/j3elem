import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("1) Find the minimum from three values (All three numbers from arguments were used)");
        System.out.println("Min value is: " + minAndMaxOfThree(args[0], args[1], args[2])[0]);
        System.out.println();

        System.out.println("2) Find the maximum from three values (All three numbers from argument were used)");
        System.out.println("Max value is: " + minAndMaxOfThree(args[0], args[1], args[2])[2] + " and Min value is: " + minAndMaxOfThree(args[0], args[1], args[2])[0]);
        System.out.println();

        System.out.println("3) Find the minimum from three values. If minimum values is more than one, all of it should be displayed (All three numbers from arguments were used)");
        System.out.print("Min value(s) is: " + minAndMaxOfThree(args[0], args[1], args[2])[0] + " ");
        if (Integer.valueOf(minAndMaxOfThree(args[0], args[1], args[2])[0]) == Integer.valueOf(minAndMaxOfThree(args[0], args[1], args[2])[1])) {
            System.out.print(minAndMaxOfThree(args[0], args[1], args[2])[1] + " ");
            if (Integer.valueOf(minAndMaxOfThree(args[0], args[1], args[2])[0]) == Integer.valueOf(minAndMaxOfThree(args[0], args[1], args[2])[2])) {
                System.out.print(minAndMaxOfThree(args[0], args[1], args[2])[2]);
            }
        }
        System.out.println();
        System.out.println();

        System.out.println("4) Check value is it even or odd? (Only First value from arguments was used)");
        System.out.println("The values which entered like first argument is " + oddOrEven(args[0]));
        System.out.println();

        System.out.println("5) Can the first value be divided on second value without residue (First and Second arguments were used)");
        System.out.println(division(args[0], args[1]));
        System.out.println();

        System.out.println("6) Which number is closer to ten (First and Second arguments were used)");
        System.out.println(closerToTen(args[0], args[1]));
        System.out.println();

        System.out.println("7) How much money do you spend on apartment rent after some days. (Number of days get from First argument. 1 day cost 40 UAH, after 5+ days discount is 20 UAH and after 7+ days discount is 50 UAH");
        System.out.println(apartmentRentCost(args[0]));
    }

    static String[] minAndMaxOfThree(String a, String b, String c) {
        int[] minMaxValueSorted = {Integer.valueOf(a), Integer.valueOf(b), Integer.valueOf(c)};
        Arrays.sort(minMaxValueSorted);
        String[] minMaxValue = new String[3];
        for (int i = 0; i < 3; i++) {
            minMaxValue[i] = String.valueOf(minMaxValueSorted[i]);
        }
        return minMaxValue;
    }

    static String oddOrEven(String oddOrEven) {
        String result;
        int a = Integer.valueOf(oddOrEven);
        if ((a % 2) == 0) {
            result = "even";
        } else result = "odd";

        return result;
    }

    static String division(String a, String b) {
        String result;
        int residue = Integer.valueOf(a) % Integer.valueOf(b);
        if (residue == 0) {
            result = ("No residue after division " + a + " on " + b);
        } else result = ("Residue after division " + a + " on " + b + " is: " + residue);
        return result;
    }

    static String closerToTen(String a, String b) {
        String result;
        if (Math.abs(Integer.valueOf(a) - 10) == Math.abs(Integer.valueOf(b) - 10)) {
            result = ("Both entered values on the same distance from ten. The distance is: " + Math.abs(Integer.valueOf(a) - 10));
        } else {
            if (Math.abs(Integer.valueOf(a) - 10) < Math.abs(Integer.valueOf(b) - 10)) {
                result = ("Value " + a + " is closer to ten than value " + b);
            } else result = ("Value " + b + " is closer ten than value " + a);
        }
        return result;
    }

    static String apartmentRentCost(String a){
        int oneDayCost = 40;
        int discount = 0;
        int countOfDays = Integer.valueOf(a);

        if(countOfDays >= 5){
            discount = 20;
        }
        if(countOfDays >= 7){
            discount = 50;
        }

        String result = ("You will rent apartment for " + countOfDays + " day(s) and you will be billed " + ((countOfDays * oneDayCost) - discount) + " UAH");
        return result;
    }
}


