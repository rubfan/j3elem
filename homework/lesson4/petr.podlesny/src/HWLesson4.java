public class HWLesson4{
    public static void main(String[] args) {
        HWLesson4 taskSolution = new HWLesson4();
        String argum[] = {args[0], args[1], args[2]};
        taskSolution.findMin(argum);
        taskSolution.findMinMax(argum);
        taskSolution.showAllMin(argum);
        taskSolution.checkEvenOddNumber(args[0]);
        taskSolution.dividingNumbers(args[0], args[1]);
        taskSolution.findClosestNumberTo10(args[0], args[1]);
        taskSolution.calcPrice(args[0]);
    }

    void findMin(String args[]) {
        int[] arr = new int[args.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(args[i]);
        }
        int minimum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            minimum = Math.min(minimum, arr[i]);
        }
        System.out.println("Задача №1:");
        System.out.println("Наименьшее число: " + minimum);
    }

    void findMinMax(String args[]) {
        int[] arr = new int[args.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(args[i]);
        }
        int minimum = arr[0];
        int maximum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            minimum = Math.min(minimum, arr[i]);
            maximum = Math.max(maximum, arr[i]);
        }
        System.out.println("Задача №2:");
        System.out.println("Наименьшее число: " + minimum);
        System.out.println("Наибольшее число: " + maximum);
    }

    void showAllMin(String args[]) {
        int[] arr = new int[args.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(args[i]);
        }
        int minimum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            minimum = Math.min(minimum, arr[i]);
        }
        System.out.println("Задача №3:");
        System.out.println("Наименьшее(ие) число(а): ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == minimum) {
                System.out.println(arr[i] + " ");
            }
        }
    }

    void checkEvenOddNumber(String argument) {
        int number = Integer.parseInt(argument);
        System.out.println("Задача №4:");
        if (number == 0) {
            System.out.println("Введенное число " + number + " является 0");
        } else if (number % 2 == 0) {
            System.out.println("Введенное число " + number + " является чётным");
        } else {
            System.out.println("Введенное число " + number + " является нечётным");
        }
    }

    void dividingNumbers(String argument1, String argument2) {
        int number1 = Integer.parseInt(argument1);
        int number2 = Integer.parseInt(argument2);
        System.out.println("Задача №5:");
        if (number2 != 0) {
            if (number1 % number2 == 0) {
                System.out.println("Введенное число " + number1 + " делится на число " + number2 + " без остатка");
            } else {
                System.out.println("Введенное число " + number1 + " делится на число " + number2 +
                        " с остатком, равным: " + (number1 % number2));
            }
        } else {
            System.out.println("Второе введенное число " + number2 + " является 0, введите другое число");
        }
    }

    void findClosestNumberTo10(String argument1, String argument2) {
        int number1 = Integer.parseInt(argument1);
        int number2 = Integer.parseInt(argument2);
        int checkNumber = 10;
        System.out.println("Задача №6:");
        int diff1 = Math.abs(Math.abs(number1) - checkNumber);
        int diff2 = Math.abs(Math.abs(number2) - checkNumber);
        if (diff1 < diff2) {
            System.out.println("Число " + number1 + " ближе к контрольному числу 10");
        } else if (diff1 > diff2) {
            System.out.println("Число " + number2 + " ближе к контрольному числу 10");
        } else {
            System.out.println("Числа " + number1 + " и " + number2 + " равноотдаленные от контрольного числа 10");
        }
    }

     void calcPrice(String quantity){
        int quantityOfDays = Integer.parseInt(quantity);
        int priceForADay = 40;
        int discountFor5 = 20;
        int discountFor7 = 50;
        System.out.println("Задача №7:");
        if (quantityOfDays < 0) {
            System.out.println("Количество дней не может быть отрицательным");
        } else {
            int totalPrice = priceForADay * quantityOfDays;
            if (quantityOfDays > 5 && quantityOfDays <= 7) {
                totalPrice -= discountFor5;
            }
            else if (quantityOfDays > 7) {
                totalPrice -= discountFor7;
            }
            System.out.println("Общая стоимость равна: " + totalPrice);
        }
    }

}
