package com.company;

public class Main {

    public static void main(String[] args) {

        int[] mas,mas1;
        int a3,a4;
        a3 = Integer.parseInt(args[3]);
        a4 = Integer.parseInt(args[4]);
        mas = new int[3];
        for (int i = 0; i < 3; i++) {
            mas[i] = Integer.parseInt(args[i]);
        }

        System.out.println("Массив чисел: " + mas[0] + " " + mas[1] + " " + mas[2]);
        System.out.println("Минимальное значение: " + getMinValue(mas));
        System.out.println("Минимальное значение: " + getMinValue(mas) + " Максимальное значение: " + getMaxValue(mas));
        mas1 = getMinValues(mas);
        System.out.print("Минимальные значение: " );
        for(int i=0; i< mas1[1];i++) {
           System.out.print(mas1[0] + " ");
        }
        System.out.println();
        for(int i =0; i < mas.length; i++) {
            if(getChet(mas[i],2) == 1) {
                System.out.print(mas[i] + " - четное число ");
            }
            else {
                System.out.print(mas[i] + " - не четное число ");
            }
        }
        System.out.println();

        System.out.print("Первое число: " + a3 + " делится на  второе число: " + a4);
        if(getChet(a3,a4) == 1) {
            System.out.println(" - без остатка");
        }
        else {
            System.out.println(" - c остатком");
        }
        System.out.println(Integer.parseInt(args[3]));
        System.out.println("Из 2 чисел: " + a3 +  " " + a4 + " ближе: "  + getValueCloseTo10(a3,a4));
        System.out.println("стоимость квартиры за " + args[5] + " дней составляет: " + setCash(Integer.parseInt(args[5])) + " грн.");
    }


    static int getMinValue(int[] m) {
        int min = m[0];
        for(int i = 1; i < m.length; i++) {
            if(m[i] < min) {
                min = m[i];
            }
        }

        return min;
    }

    static int getMaxValue(int[] m)
    {
        int max = m[0];
        for(int i = 1; i < m.length; i++) {
            if(m[i] > max) {
                max = m[i];
            }
        }

        return max;
    }

    static int[] getMinValues(int[] m)
    {
        int[] m1 = new int[2];
        int min = getMinValue(m);
        int j = 0;
        for(int i = 0; i < m.length;i++) {
            if(m[i] == min) {
                j++;
            }
        }
        m1[0] = min;
        m1[1] = j;

        return m1;
    }

    static int getChet(int a, int b)
    {
        if(a % b == 0) {
            return 1;
        }
        else {
            return 0;
        }
    }

    static int getValueCloseTo10(int a1, int a2)
    {
       if(Math.abs(10 - a1) < Math.abs(10 - a2)) {
           return a1;
       }
       else {
           return a2;
       }
    }

    static long setCash(int a)
    {
        long cash = 40 * a;
        if(a > 7) {
            cash -= 50;
        }
        else {
            if(a > 5) {
                cash -= 20;
            }
        }
        return cash;
    }
    }
