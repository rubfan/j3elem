import java.util.Arrays;

public class lesson4 {

    public static void main(String[] args) {

        System.out.println(minOfThree(1, 15, 47));
        System.out.println(minAndMaxOfThreeFinding(3, -1, 8));
        System.out.println(minOfThreeWithRepeatFinding(1, -2, -2));
        System.out.println(evenOddChecking(456));
        System.out.println(divisionChecking(5, 15));
        System.out.println(closerToTenChecking(12, 15)); //расчитано на положительные значения
        System.out.println(apartmentLeaseCalculating(6));


    }

    private static String minOfThree(int a, int b, int c) {
        String result = "";
        if ((a < b) && (a < c))
            result = ("Минимально число из 3-х: " + a);

        else if ((b < a) && (b < c))
            result = ("Минимально число из 3-х: " + b);

        else result = ("Минимально число из 3-х: " + c);

        return result;
    }

    private static String minAndMaxOfThreeFinding(int a, int b, int c) {

        int minimum;
        int maximum;

        if ((a < b) && (a < c))
            minimum = a;
            else if ((b < a) && (b < c))
                minimum = b;
            else minimum = c;

        if ((a > b) && (a > c))
            maximum = a;
            else if ((b > a) && (b > c))
                maximum = b;
            else maximum = c;

        String s = ("Минимальное значение: " + minimum + "," + " Максимально значение: " + maximum);

        return s;
    }
    private static String minOfThreeWithRepeatFinding(int a, int b, int c) {

        String result = "";
        int [] mas = {a, b, c};

        Arrays.sort(mas);

        int first = mas[0];
        int second = mas[1];
        int third = mas[2];

        if (second != first )
            result = ("Минимальное значение: " + first);
            else if ((second == first) && (third!=first))
                result = ("Минимальные значения: " + first + ", " + second);
            else if (third == first)
                result = ("Минимальные значения: " + first + ", " + second + ", " + third);

        return result;
    }

    private static String evenOddChecking(int a) {

        String result = "";
        int z = a%2;

        if (z==0)
            result = ("Введенное число - четное");
        else result = ("Введенное число - НЕчетное");

        return result;
    }

    private static String divisionChecking(int a, int b) {

        String result = "";
        int z = a%b;

        if (z==0)
            result = ("Введенное число делится без остатка");
        else result = ("Введенное число НЕ делится без остатка");

        return result;
    }

    private static String closerToTenChecking(int a, int b) {
        String result = "";

        int first = a - 10;
        int second = b - 10;

        if (first < 0)
            first = -first;
        if (second < 0)
            second = -second;

        if (first < second)
            result = ("Ближайшее к 10: " + a);
            else if (first == second)
                result = ("Ближайшими к 10 являются оба введенных числа" );
        else result = ("Ближайшее к 10: " + b);

        return result;
    }

    private static String apartmentLeaseCalculating(int a) {

        int dayCost = 40;
        int costSum;

        if ((a > 5) && (a < 7))
            costSum = a * dayCost - 20;
            else if (a > 7)
                costSum = a * dayCost - 50;
        else costSum = a * dayCost;

        String result = "Стоимость аренды составляет: " + costSum + " UAH";

        return result;
    }

}