public class Main {

    public static void main(String[] args) {

        //Задание 1
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10);
        }
        System.out.println("Задание 1 \nНаши случайные числа");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println("\nНаше наименьшее число: ");
        int varS = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < varS) {
                varS = arr[i];
            }
        }
        System.out.print(varS);

        System.out.println("\n------------");

        //Задание 2

        System.out.println("\nЗадание 2 \nНаше наименьшее и наибольшее число: ");
        int varB = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > varB) {
                varB = arr[i];
            }
        }
        System.out.print(varS + ", " + varB);

        System.out.println("\n------------");

        //Задание 3

        System.out.println("\nЗадание 3 \nНаше наименьшее и повторяющиеся число: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == varS) {
                System.out.print("[" + i + "]" + "  " + arr[i] + ", ");
            }
        }

        System.out.println("\n------------");

        //Задание 4

        System.out.println("\nЗадание 4 \nЧетное / не четное ");


        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i] % 2;
            if (temp == 0) {
                System.out.println(arr[i] + "<--- Число четное");
            } else {
                System.out.println(arr[i] + "<--- Число не четное");
            }

        }

        System.out.println("\n------------");

        //Задание 5

        System.out.println("\nЗадание 5 \nДаны 2 числа... ");

        int number1 = 19;
        int number2 = 3;
        int numberRes;

        numberRes = number1 % number2;
        if (numberRes == 0) {
            System.out.println("Число " + number1 + " и число " + number2 + " " +
                    "\nрезулльтат без остатка " + "(" + numberRes + ")");
        } else {
            System.out.println("Число " + number1 + " и число " + number2 +
                    " \nрезулльтат с остатком " + "(" + numberRes + ")");
        }

        System.out.println("\n------------");

        //Задание 6

        System.out.println("\nЗадание 6 \nНайти ближайшее к 10... ");

        int firstNumber = 0, secondNumber = 20, mainNumber = 10, var1, var2;

        var1 = Math.abs(mainNumber - firstNumber);
        var2 = Math.abs(mainNumber - secondNumber);
        System.out.println("Первое число: " + firstNumber + ", " + " Второе число: " + secondNumber);
        if (var1 < var2) {
            System.out.println("Ближе первое число " + "(" + firstNumber + ")");
        }

        if (var1 > var2) {
            System.out.println("Ближе второе число " + "(" + secondNumber + ")");
        }
        if (var1 == var2) {
            System.out.println("Числа одинаковые");
        }


        System.out.println("\n------------");

        //Задание 7 (конечно правильнее бы было сделать метод...)


        System.out.println("\nЗадание 7 \nаренда квартиры... ");

        int apartmenttRentDays = 4;
        int costAptForOneDay = 40;
        int saleMoreFiveDays = 20;
        int saleMoreSevenDays = 50;
        int saleLessFiveDays = 0;
        int totalAmount;

        if (apartmenttRentDays >= 7) {
            totalAmount = costAptForOneDay * apartmenttRentDays - saleMoreSevenDays;
            System.out.println("Съемщик жил 7 дней или более и получил скидку в размере 50 грн" +
                    "\nРасчет: \nкол-во дней " + "\t\t" + apartmenttRentDays +
                    "\nцена в сутки: " + "\t\t" + costAptForOneDay + " UAH" +
                    "\nскидка в размере " + "\t" + saleMoreSevenDays + " UAH" +
                    "\n---" +
                    "\nИтого \t\t\t\t" + totalAmount + " UAH");
        }
        if (apartmenttRentDays >= 5 && apartmenttRentDays < 7) {
            totalAmount = costAptForOneDay * apartmenttRentDays - saleMoreFiveDays;
            System.out.println("Съемщик жил 5 дней или более и получил скидку в размере 20 грн" +
                    "\nРасчет: \nкол-во дней " + "\t\t" + apartmenttRentDays +
                    "\nцена в сутки: " + "\t\t" + costAptForOneDay + " UAH" +
                    "\nскидка в размере " + "\t" + saleMoreFiveDays + " UAH" +
                    "\n---" +
                    "\nИтого \t\t\t\t" + totalAmount + " UAH");
        }
        if (apartmenttRentDays < 5) {
            totalAmount = apartmenttRentDays * costAptForOneDay - saleLessFiveDays;
            System.out.println("Съемщик жил менее 5 дней и не получил скидку" +
                    "\nРасчет: \nкол-во дней " + "\t\t" + apartmenttRentDays +
                    "\nцена в сутки: " + "\t\t" + costAptForOneDay + " UAH" +
                    "\nскидка в размере " + "\t" + saleLessFiveDays + " UAH" +
                    "\n---" +
                    "\nИтого \t\t\t\t" + totalAmount + " UAH");
        }

    }
}