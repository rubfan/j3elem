package com.company;

import java.util.Arrays;

public class Lesson4 {
    public static void main(String[] args) {
        task1(12,34,5);
        task2(23,34,1);
        task3(21,21,45);
        task4(23);
        task5(45,12);
        task6(8,11);
        task7(6);
    }
        private static int task1(int a, int b, int c) {
        int min = 0;
            if(a < b && a < c)
            {
                min = a;
            }
            else if(b < c && b < a)
            {
                min = b;
            }
            else
                {
                min = c;
            }
            System.out.println("min task 1 = " + min);
            return 0;
        }

        private static int task2(int a, int b, int c){
        int[] mass = new int []{a, b, c};
            Arrays.sort(mass);
            System.out.print("min task 2 = " + mass[0] + "; ");
            System.out.print("average task 2 = " + mass[1] + "; ");
            System.out.println("max task 2 = " + mass[2] + "; ");
        return 0;
        }

        private static int task3(int a, int b, int c) {
            int[] mass = new int[]{a, b, c};
            Arrays.sort(mass);
            System.out.println((mass[0] == mass[1])? ("min task 3 = " + mass[0] + "; " + mass[1] + ";"):("min task 3 = " + mass[0] + ";"));
            return 0;
        }

        private static int task4(int a){
            System.out.println((a%2 == 0)? "task 4: the number is even." : "task 4: the number is not even.");
        return 0;
        }

        private  static int task5(int a, int b){
            System.out.println((a%b == 0)? "task 5: the number is divisible." : "task 5: the number is not divisible without a remainder.");
        return 0;
        }

        private static int task6(int a, int b){
        int num1 = Math.abs(b - 10);
        int num2 = Math.abs(a - 10);
            System.out.println("task 6: closer to 10, the number is " + ((num1 == num2)? "task 6: numbers equal" : (num1 > num2)? a : b));
            return 0;
    }

         private static int task7 (int days) {
        int price = 40, discount5Days = 20, discount7Days = 50;
        if(days <= 5)
        {
            System.out.println("task 7: payment - " + (days * price));
        }
        else if (days > 5 && days <= 7)
        {
            System.out.println("task 7: payment - " + (days * price - discount5Days));
        }
        else if(days > 7)
        {
            System.out.println("task 7: payment - " + (days * price - discount7Days));
        }
        return 0;
         }
    }


