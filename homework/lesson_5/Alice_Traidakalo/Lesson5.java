package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lesson5 {

    public static void main(String[] args) {
        try {
            System.out.println("Enter the operation: 'Test', 'Console' or 'Tip'.");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String operation = reader.readLine();
            int firstOperand = 15;
            int secondOperand = 12;
            switch (operation){
                case "Test":
                   calculation(firstOperand, secondOperand);
                   break;
                case "Console":
                    console();
                    break;
                case "Tip":
                    tip();
                    break;
                    default:
                        System.out.println("Please choose one of the proposed operations.");
            }
        } catch (Exception e){
            System.out.println("Please enter correct data.");
        }
    }

    private static int multiplication(int num1, int num2){
        return num1 * num2;
    }

    private static double division(double num1, double num2){
        return num1 / num2;
    }

    private static int addition(int num1, int num2){
        return num1 + num2;
    }

    private static int subtraction(int num1, int num2){
        return num1 - num2;
    }

    private static int remainderOfTheDivision(int num1, int num2){
        return num1 % num2;
    }

    private static int absoluteValue(int num){
        return Math.abs(num);
    }

    private static void calculation(int num1, int num2) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the operation: *, /, +, -, %, abs num1, abs num2");
        String operation = reader.readLine();
        switch (operation) {
            case "*":
            System.out.println("Multiplication: " + num1 + " * " + num2 + " = " + multiplication(num1, num2));
            break;
            case "/":
            System.out.println("Division: " + num1 + " / " + num2 + " " + " = " + division(num1, num2));
            break;
            case "+":
            System.out.println("Addition: " + num1 + " + " + num2 + " " + " = " + addition(num1, num2));
            break;
            case "-":
            System.out.println("Subtraction: " + num1 + " - " + num2 + " " + " = " + subtraction(num1, num2));
            break;
            case "%":
            System.out.println("Remainder of the division: " + num1 + " % " + num2 + " " + " = " + remainderOfTheDivision(num1, num2));
            break;
            case "abs num1":
            System.out.println("The absolute value of a number 1: " + "|" + num1 + "|" + " = " + absoluteValue(num1));
            break;
            case "abs num2":
            System.out.println("The absolute value of a number 2: " + "|" + num2 + "|" + " = " + absoluteValue(num2));
            break;
            default:
                System.out.println("Please choose one of the proposed operations.");
        }
    }

    private static void console() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the first number");
        int num1 = new Integer(reader.readLine());
        System.out.println("Enter the second number");
        int num2 = new Integer(reader.readLine());
        calculation(num1,num2);
    }

    private static void tip(){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter invoice amount");
        try {
            double amount = new Double(reader.readLine());
            System.out.println("Enter service lvl:" + "\nterrible;" + "\npoor;" + "\ngood;" + "\ngreat;" + "\nexcellent;");
            String service = reader.readLine();
            switch (service){
                case "terrible":
                    System.out.println(amount);
                    break;
                case "poor":
                    System.out.println(amount + amount/100 * 5);
                    break;
                case "good":
                    System.out.println(amount + amount/100 * 10);
                    break;
                case "great":
                    System.out.println(amount + amount/100 * 15);
                    break;
                case "excellent":
                    System.out.println(amount + amount/100 * 20);
                    break;
                    default:
                        System.out.println("Enter the correct information about the service");
            }
        } catch (Exception e){
            System.out.println("Enter the correct amount data.");
        }
    }
}