import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class HomeworkLesson6 {

    public static void main(String[] args) {
		fourDigitsNumbers();
		firstElements();
		positiveElements();
		firstTwentyElements();
		sumFirstElements();
		findMinAndMaxElements();
		sumEvenAndOddElements();
		happyTickets();
		binaryNumbers();
		fiveMinimalElements();
		addAllTheDigits();
    }

    public static void fourDigitsNumbers() {
		ArrayList<Integer> numberList = new ArrayList<Integer>();
		int number = 1000;
		while (number <= 9999) {
			numberList.add(number);
			number += 3;
		}
		System.out.println("Task 1: ");
		System.out.println("Wanted numbers are: " + numberList);
	}

	public static void firstElements() {
		ArrayList<Integer> elementsList = new ArrayList<Integer>();
		int number = 1;
		int quantityOfElements = 55;
		for(int i = 0; i < quantityOfElements; i++) {
			elementsList.add(number);
			number += 2;
		}
		System.out.println("Task 2: ");
		System.out.println("Wanted numbers are: " + elementsList);
	}

	public static void positiveElements() {
		ArrayList<Integer> positiveElementsList = new ArrayList<Integer>();
		int number = 90;
		while(number >= 0) {
			positiveElementsList.add(number);
			number -= 5;
		}
		System.out.println("Task 3: ");
		System.out.println("Wanted numbers are: " + positiveElementsList);
	}

	public static void firstTwentyElements() {
    	ArrayList<Integer> elementsList = new ArrayList<Integer>();
    	int number = 2;
    	int quantityOfNumbers = 20;
    	for(int i = 0; i < quantityOfNumbers; i++) {
    		elementsList.add(number);
    		number *= 2;
		}
		System.out.println("Task 4: ");
		System.out.println("Wanted numbers are: " + elementsList);
	}

	public static void sumFirstElements() {
    	ArrayList<Integer> elementsList = new ArrayList<Integer>();
    	Scanner scan = new Scanner(System.in);
		System.out.println("Task 5: ");
    	System.out.println("Enter numbers: ");
		while(scan.hasNextInt()) {
			elementsList.add(scan.nextInt());
		}
		System.out.println("Enter quantity of numbers: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		for (int i = 0; i < n; i++ ) {
			sum += elementsList.get(i);
		}
		System.out.println("Sum is:" + sum);
    }

	public static void findMinAndMaxElements() {
		ArrayList<Integer> elementsList = new ArrayList<Integer>();
		Scanner scan = new Scanner(System.in);
		System.out.println("Task 6: ");
		System.out.println("Enter numbers: ");
		while(scan.hasNextInt()) {
			elementsList.add(scan.nextInt());
		}
		int min = elementsList.get(0);
		int max = elementsList.get(0);
		for (int i = 0; i < elementsList.size(); i++ ) {
			min = Math.min(min, elementsList.get(i));
			max = Math.max(max, elementsList.get(i));
		}
		System.out.println("Minimum number is: " + min);
		System.out.println("Maximum number is: " + max);
	}

	public static void sumEvenAndOddElements() {
		ArrayList<Integer> elementsList = new ArrayList<Integer>();
		Scanner scan = new Scanner(System.in);
		System.out.println("Task 7: ");
		System.out.println("Enter numbers: ");
		while(scan.hasNextInt()) {
			elementsList.add(scan.nextInt());
		}
		int sumEven = 0;
		int sumOdd = 0;
		for (int i = 0; i < elementsList.size(); i++ ) {
			if(elementsList.get(i) % 2 == 0) {
				sumEven += elementsList.get(i);
			}
			else if(elementsList.get(i) % 2 != 0) {
				sumOdd += elementsList.get(i);
			}
		}
		System.out.println("Sum of even numbers is:" + sumEven);
		System.out.println("Sum of odd numbers is: " + sumOdd);
	}

	public static void happyTickets() {
		int quantity = 0;
		int minNumber = 100000;
		int maxNumber = 999999;
    	for(int i = minNumber; i <= maxNumber; i++) {
			int number1 = i / 100000;
			int number2 = (i % 100000) / 10000;
			int number3 = (i % 10000) / 1000;
			int number4 = (i % 1000) / 100;
			int number5 = (i % 100) / 10;
			int number6 = i % 10;
			if((number1 + number2 + number3) == (number4 + number5 + number6)) {
				quantity ++;
			}
		}
		System.out.println("Task 8: ");
    	System.out.println("Quantity of happy tickets is: " + quantity);
	}

	public static void binaryNumbers() {
    	Scanner scan = new Scanner(System.in);
    	System.out.println("Task 9: ");
    	System.out.println("Enter a positive number: ");
    	int number = scan.nextInt();
		System.out.println("This number as a binary one:" + Integer.toBinaryString(number));
	}

	public static void fiveMinimalElements() {
		ArrayList<Integer> elementsList = new ArrayList<Integer>();
		Scanner scan = new Scanner(System.in);
		System.out.println("Task 10: ");
		System.out.println("Enter numbers: ");
		String firstFiveMinimal = "";
		while (scan.hasNextInt()) {
			elementsList.add(scan.nextInt());
		}
		Collections.sort(elementsList);
		for(int i = 0; i < 5; i++) {
			firstFiveMinimal += (elementsList.get(i) + " ");
		}
		System.out.println("First five minimal numbers are: " + firstFiveMinimal);
	}

	public static void addAllTheDigits() {
		int middleNumber = 0;
		int finalDigit = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Task 11: ");
		System.out.println("Enter a number: ");
		for(int number = scan.nextInt();number != 0; number /= 10) {
			middleNumber += (number % 10);
		}
		if (middleNumber >= 10) {
			for(int i = middleNumber; i != 0; i /= 10) {
				finalDigit += (i % 10);
			}
		}
		else {
			finalDigit = middleNumber;
		}
		System.out.println("Final single digit after addition of all number's digits is: " + finalDigit);
	}

}

