public class Main {
    public static void main(String[] args) {
        System.out.println("Value args[]: args[0]=" + args[0] + ", args[1]=" + args[1] + ", args[2]=" + args[2]);
        System.out.println("Find the min of three value");
        System.out.println();
        System.out.print("Minimal value args[]: ");
        System.out.println(minValueOfThree(args[1], args[2], args[0]));
        System.out.println();
        System.out.println("Find the max of three value");
        System.out.print("Maximal value args[]: ");
        System.out.println();
        System.out.println(maxValueOfThree(args[0], args[1], args[2]));
        System.out.println();
        System.out.println("Find the minimal of three value, if the minimal ones we derive them somewhat");
        System.out.println("All minimal value args{}:");
        System.out.println(allMinimal(args[0], args[1], args[2]));
        System.out.println();
        System.out.println("Even or not even");
        System.out.println(oddOrEven(args[0]));
        System.out.println();
        System.out.println("Determine whether the first number is divided by the second without a remainder");
        System.out.println(division(args[0], args[1]));
        System.out.println();
        System.out.println("Find the closest to 10 of the 2 given numbers");
        System.out.println(closerToTen(args[0], args[1]));
        System.out.println();
        System.out.println("Apartment rent for a specified number of days");
        System.out.println(rentCost(3));


    }

    static String minValueOfThree(String v1, String v2, String v3) {
        String res = "";
        if (Integer.valueOf(v1) <= Integer.valueOf(v2) && Integer.valueOf(v1) <= Integer.valueOf(v3)) {
            res = v1;
        }
        if (Integer.valueOf(v2) <= Integer.valueOf(v1) && Integer.valueOf(v2) <= Integer.valueOf(v3)) {
            res = v2;
        }
        if (Integer.valueOf(v3) <= Integer.valueOf(v1) && Integer.valueOf(v3) <= Integer.valueOf(v2)) {
            res = v3;
        }
        return res;
    }

    static String maxValueOfThree(String v1, String v2, String v3) {
        String res = "";
        if (Integer.valueOf(v1) >= Integer.valueOf(v2) && Integer.valueOf(v1) >= Integer.valueOf(v3)) {
            res = v1;
        }
        if (Integer.valueOf(v2) >= Integer.valueOf(v1) && Integer.valueOf(v2) >= Integer.valueOf(v3)) {
            res = v2;
        }
        if (Integer.valueOf(v3) >= Integer.valueOf(v1) && Integer.valueOf(v3) >= Integer.valueOf(v2)) {
            res = v3;
        }
        return res;
    }

    static String allMinimal(String v1, String v2, String v3) {
        String res = "";
        String rep = "";
        if (Integer.valueOf(v1) <= Integer.valueOf(v2) && Integer.valueOf(v1) <= Integer.valueOf(v3)) {
            res = v1;
            if (Integer.valueOf(v1) == Integer.valueOf(v2) || Integer.valueOf(v1) == Integer.valueOf(v3)) {
                rep = v1;
            }
            if (Integer.valueOf(v1) == Integer.valueOf(v2) && Integer.valueOf(v1) == Integer.valueOf(v3)) {
                rep = v1 + " " + v1;
            }
        }
        if (Integer.valueOf(v2) <= Integer.valueOf(v1) && Integer.valueOf(v2) <= Integer.valueOf(v3)) {
            res = v2;
            if (Integer.valueOf(v2) == Integer.valueOf(v1) || Integer.valueOf(v2) == Integer.valueOf(v3)) {
                rep = v2;
            }
            if (Integer.valueOf(v2) == Integer.valueOf(v1) && Integer.valueOf(v2) == Integer.valueOf(v3)) {
                rep = v2 + " " + v2;
            }
        }
        if (Integer.valueOf(v3) <= Integer.valueOf(v1) && Integer.valueOf(v3) <= Integer.valueOf(v2)) {
            res = v3;
            if (Integer.valueOf(v3) == Integer.valueOf(v1) || Integer.valueOf(v3) == Integer.valueOf(v2)) {
                rep = v3;
            }
            if (Integer.valueOf(v3) == Integer.valueOf(v1) && Integer.valueOf(v3) == Integer.valueOf(v2)) {
                rep = v3 + " " + v3;
            }
        }
        res = res + " " + rep;
        return res;
    }

    static String oddOrEven(String oddOrEven) {
        String res;
        int a = Integer.valueOf(oddOrEven);
        if ((a % 2) == 0) {
            res = "even";
        } else res = "odd";
        return res;
    }

    static String division(String v1, String v2) {
        String res;
        int residue = Integer.valueOf(v1) % Integer.valueOf(v2);
        if (residue == 0) {
            res = ("No residue" + v1 + " on " + v2);
        } else res = ("Residue" + v1 + " on " + v2 + " is: " + residue);
        return res;
    }

    static String closerToTen(String v1, String v2) {
        int value1 = 10 - Integer.valueOf(v1);
        int value2 = 10 - Integer.valueOf(v2);
        String res = "";
        if (value1 < value2) {
            res = "First value closer to ten";
        }
        if (value2 < value1) {
            res = "Second value closer to ten";
        }
        return res;
    }

    static int rentCost(int day) {
        int dayCost = 40;
        int discountFromFiveDays = 20;
        int discountFromSevenDays = 50;
        int rent = 0;
        if (day < 5) {
            rent = dayCost * day;
        }
        if (day > 5) {
            rent = dayCost * day;
            rent = rent - discountFromFiveDays;
        }
        if (day > 7) {
            rent = dayCost * day;
            rent = rent - discountFromSevenDays;
        }

        return rent;
    }
}



















