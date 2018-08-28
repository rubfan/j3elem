public class Main {
    public static void main(String[] args) {

        System.out.println("Value args[]: args[0]=" + args[0] + ", args[1]=" + args[1] + ", args[2]=" + args[2]);
        System.out.println();
        System.out.print("Minimal value args[]: ");
        System.out.println(minValue(args[0], args[1], args[2]));
        System.out.println();
        System.out.print("Maximal value ars[]: ");
        System.out.println(maxValue(args[0], args[1], args[2]));
        System.out.println();
        System.out.print("Repeat minimal value: ");
        System.out.println(repeatMinValue(args[0], args[1], args[2]));
        System.out.println();
        System.out.print("The args[1] - ");
        System.out.println(evenOrOdd(args[1]));
        System.out.println();
        System.out.println("The first value args[0]=" + args[0] + " the second value args[1]=" + args[1]);
        System.out.println(closerToTen(args[0], args[1]));
        System.out.println();
        System.out.print("The cost rent from apartment for 8 days: ");
        System.out.println(costRentApartm(8));
        System.out.println();
        System.out.print("When args[0] % args[1](" + args[0] + " % " + args[1] + ")" + " :");
        System.out.println(checkDivision(args[0], args[1]));

    }


    static String minValue(String val1, String val2, String val3) {
        String resl = "";
        if (Integer.valueOf(val1) <= Integer.valueOf(val2) && Integer.valueOf(val1) <= Integer.valueOf(val3)) {
            resl = val1;
        }
        if (Integer.valueOf(val2) <= Integer.valueOf(val1) && Integer.valueOf(val2) <= Integer.valueOf(val3)) {
            resl = val2;
        }
        if (Integer.valueOf(val3) <= Integer.valueOf(val1) && Integer.valueOf(val3) <= Integer.valueOf(val2)) {
            resl = val3;
        }
        return resl;
    }

    static String maxValue(String val1, String val2, String val3) {
        String resl = "";
        if (Integer.valueOf(val1) >= Integer.valueOf(val2) && Integer.valueOf(val1) >= Integer.valueOf(val3)) {
            resl = val1;
        }
        if (Integer.valueOf(val2) >= Integer.valueOf(val1) && Integer.valueOf(val2) >= Integer.valueOf(val3)) {
            resl = val2;
        }
        if (Integer.valueOf(val3) >= Integer.valueOf(val1) && Integer.valueOf(val3) >= Integer.valueOf(val2)) {
            resl = val3;
        }
        return resl;
    }

    static String repeatMinValue(String val1, String val2, String val3) {
        String resl = "";
        String rept = "";
        if (Integer.valueOf(val1) <= Integer.valueOf(val2) && Integer.valueOf(val1) <= Integer.valueOf(val3)) {
            //if the value is minimal
            resl = val1;
            if (Integer.valueOf(val1) == Integer.valueOf(val2) || Integer.valueOf(val1) == Integer.valueOf(val3)) {
                //if the value meets once
                rept = val1;
            }
            if (Integer.valueOf(val1) == Integer.valueOf(val2) && Integer.valueOf(val1) == Integer.valueOf(val3)) {
                //if the value meets twice
                rept = val1 + " " + val1;
            }
        }
        if (Integer.valueOf(val2) <= Integer.valueOf(val1) && Integer.valueOf(val2) <= Integer.valueOf(val3)) {
            resl = val2;
            if (Integer.valueOf(val2) == Integer.valueOf(val1) || Integer.valueOf(val2) == Integer.valueOf(val3)) {
                rept = val2;
            }
            if (Integer.valueOf(val2) == Integer.valueOf(val1) && Integer.valueOf(val2) == Integer.valueOf(val3)) {
                rept = val2 + " " + val2;
            }
        }
        if (Integer.valueOf(val3) <= Integer.valueOf(val1) && Integer.valueOf(val3) <= Integer.valueOf(val2)) {
            resl = val3;
            if (Integer.valueOf(val3) == Integer.valueOf(val1) || Integer.valueOf(val3) == Integer.valueOf(val2)) {
                rept = val3;
            }
            if (Integer.valueOf(val3) == Integer.valueOf(val1) && Integer.valueOf(val3) == Integer.valueOf(val2)) {
                rept = val3 + " " + val3;
            }
        }
        resl = resl + " " + rept;
        return resl;
    }

    static String evenOrOdd(String val) {
        String res = "";
        if ((Integer.valueOf(val) % 2) == 0) {
            res = "is even";
        } else {
            res = "is odd";
        }
        return res;
    }

    static String closerToTen(String val1, String val2) {
        int value1 = 10 - Integer.valueOf(val1);
        int value2 = 10 - Integer.valueOf(val2);
        String res = "";
        if (value1 < value2) {
            res = "The first value closer to ten";
        }
        if (value2 < value1) {
            res = "The second value closer to ten";
        }
        if (value1 == value2) {
            res = "The both value closer to ten";
        }
        return res;
    }

    static int costRentApartm(int day) {
        int costRent = 40;
        int discMoreFive = 20;
        int discMoreSeven = 50;
        int reslRent = 0;

        if (day <= 5) {
            reslRent = costRent * day;
        }
        if (day > 5) {
            reslRent = costRent * day;
            reslRent = reslRent - discMoreFive;
        }
        if (day > 7) {
            reslRent = costRent * day;
            reslRent = reslRent - discMoreSeven;
        }
        return reslRent;
    }

    static String checkDivision(String val1, String val2) {
        String resl = "";
        if ((Integer.valueOf(val1) % Integer.valueOf(val2) == 0)) {
            resl = "At division is no remainder";
        } else {
            resl = "At division is a remainder";
        }
        return resl;
    }
}

