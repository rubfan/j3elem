import java.util.Scanner;

public class Lesson4Homework {
    public static void main(String[] args){
        String Input="";
        while(!(Input.toLowerCase().equals("Выход".toLowerCase()))) {
            System.out.println("1. Найти минимальное из трех чисел");
            System.out.println("2. Найти среди трех чисел минимальное и максимальное");
            System.out.println("3. Найти минимальное из трех чисел");
            System.out.println("4. Чсло четное или нечетное");
            System.out.println("5. Проверка деления без остатка");
            System.out.println("6. Найти ближайшее число к 10");
            System.out.println("7. Расчет аренды квартиры");
            System.out.println("Наберите 'выход' для завершения программы");
            System.out.println("Введите номер задачи: ");
            Scanner input = new Scanner(System.in);
            Input = input.next();
            if (Input.equals("1"))
                MinFromThree();
            if (Input.equals("2"))
                MinAndMax();
            if (Input.equals("3"))
                MinFromThreeAll();
            if (Input.equals("4"))
                modulus2();
            if (Input.equals("5"))
                modulus();
            if (Input.equals("6"))
                closeTo();
            if (Input.equals("7"))
                rent();
            System.out.println("");
        }
    }
    private static int getMin(int[] integers){
        if (integers[0] <= integers[1] && integers[0] <= integers[2]){
            return integers[0];
        }
        if (integers[1] <= integers[0] && integers[1] <= integers[2]){
            return integers[1];
        }
        return integers[2];
    }
    private static int getMax(int[] integers){
        if (integers[0] >= integers[1] && integers[0] >= integers[2]){
            return integers[0];
        }
        if (integers[1] >= integers[0] && integers[1] >= integers[2]){
            return integers[1];
        }
        return integers[2];
    }
    private static int[] getDigits(){
        Scanner input = new Scanner(System.in);
        int[] integers = new int[3];
        System.out.print("Введите первое число: ");
        String Input =  input.next();
        integers[0] =Integer.parseInt(Input);
        System.out.print("Введите второе число: ");
        Input =  input.next();
        integers[1] =Integer.parseInt(Input);
        System.out.print("Введите третье число: ");
        Input =  input.next();
        integers[2] =Integer.parseInt(Input);
        return integers;
    }
    private static void MinFromThreeAll(){
        int[] integers = getDigits();
        if (integers[0] < integers[1] && integers[0] < integers[2]){
            System.out.println("Минимальные из трех чисел "+ integers[0]);
        }
        if (integers[1] < integers[0] && integers[1] < integers[2]){
            System.out.println("Минимальные из трех чисел "+ integers[1]);
        }
        if (integers[2] < integers[0] && integers[2] < integers[1]){
            System.out.println("Минимальные из трех чисел "+ integers[2]);
        }
        if (integers[0] == integers[1] && integers[0]<integers[2]){
            System.out.println("Минимальные из трех чисел "+ integers[0] + " и " + integers[1]);
        }
        if (integers[0] == integers[2] && integers[0]<integers[1]){
            System.out.println("Минимальные из трех чисел "+ integers[0] + " и " + integers[2]);
        }
        if (integers[1] == integers[2] && integers[1]<integers[0]){
            System.out.println("Минимальные из трех чисел "+ integers[1] + " и " + integers[2]);
        }
        if (integers[0] == integers[1] && integers[0]==integers[2]){
            System.out.println("Все числа одинаковые");
        }
    }
    private static void MinFromThree() {
        int[] integers = getDigits();
        System.out.println("Минимальное число: " +getMin(integers));
    }
    private static void MinAndMax() {
        int[] integers = getDigits();
        System.out.println("Минимальное число: " +getMin(integers));
        System.out.println("Максимальное число: " +getMax(integers));
    }
    private static void modulus2() {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите число: ");
        String Input =  input.next();
        int integers =Integer.parseInt(Input);
        if (integers%2==0)
            System.out.println("Четное");
        else System.out.println("Нечетное");
    }
    private static void modulus() {
        int[] integers = new int[2];
        Scanner input = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        String Input =  input.next();
        integers[0] =Integer.parseInt(Input);
        System.out.print("Введите второе число: ");
        Input =  input.next();
        integers[1] =Integer.parseInt(Input);
        if (integers[0]%integers[1]==0)
            System.out.println("Делится без остатка");
        else System.out.println("Не делится без остатка");
    }
    private static void closeTo() {
        int[] integers = new int[2];
        Scanner input = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        String Input =  input.next();
        integers[0] =Integer.parseInt(Input);
        System.out.print("Введите второе число: ");
        Input =  input.next();
        integers[1] =Integer.parseInt(Input);
        if (10 - integers[0] > 10 - integers[1])
            System.out.println("Ближайшее число "+integers[1]);
        if (10 - integers[0] < 10 - integers[1])
            System.out.println("Ближайшее число "+integers[0]);
        if (10 - integers[0] == 10 - integers[1])
            System.out.println("Числа одинаково близки");
    }
    private static void rent() {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите число дней: ");
        String Input =  input.next();
        int integers =Integer.parseInt(Input);
        if(integers<=5)
            System.out.println("Ареда составит "+ integers*40 +" гривен");
        if(integers>5&&integers<=7)
            System.out.println("Ареда составит "+ (integers*40-20) +" гривен");
        if(integers>7)
            System.out.println("Ареда составит "+ (integers*40-50) +" гривен");
    }
}
