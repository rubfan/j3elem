import java.util.Arrays;
import java.util.Scanner;

public class HomeworkLesson8 {

	public static void main(String[] args) {
		System.out.println("Task #1");
		System.out.println("Условие: ");
		System.out.println("Сделайте сортировку выборкой и посчитайте количество операций");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter amount of numbers: ");
		int n = scan.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter " + n + " numbers");
		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		selectionSort(arr);
		
		System.out.println();
		System.out.println("Task #2");
		System.out.println("Условие: ");
		System.out.println("Есть 2 упорядоченных массива, нужно получить 3-ий массив, обьединяющий 2 предыдущих не " +
				"нарушая возрастающий порядок");
		int array1[] = {1, 3, 4, 8, 9, 10, 11, 13, 45, 89, 456};
		int array2[] = {2, 4, 5, 6, 7, 12, 44, 46, 335};
		merge(array1, array2);

		System.out.println();
		System.out.println("Task #3");
		System.out.println("Условие: ");
		System.out.println("Определить сложность заданого алгоритма");
		levelOfDifficulty();

		System.out.println();
		System.out.println("Task #4");
		System.out.println("Условие: ");
		System.out.println("Определить, в отсортированом по возрастанию, массиве, наличие 2-ух чисел сумма которых, " +
				"равна заданому числу");
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Enter amount of numbers: ");
		int m = scan1.nextInt();
		int arr3[] = new int[m];
		System.out.println("Enter " + m + " numbers");
		for (int j = 0; j < n; j++) {
			arr3[j] = scan1.nextInt();
		}
		System.out.println("Enter the sum: ");
		int sum = scan1.nextInt();
		scan1.close();
		sumOfNumbers(arr3, sum);
	}

	public static void selectionSort(int[] array) {
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			int min = array[i];
			int minIndex = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < min) {
					min = array[j];
					minIndex = j;
				}
			}
			if (i != minIndex) {
				int tmp = array[i];
				array[i] = array[minIndex];
				array[minIndex] = tmp;
				count++;
			}
		}
		System.out.println(Arrays.toString(array) + " Amount of operations: " + count);
	}

	public static void merge(int[] arr1, int[] arr2) {
		int[] result = new int[arr1.length + arr2.length];
		int i = 0, j = 0, l = 0;
		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] < arr2[j]) {
				result[l] = arr1[i];
				i++;
			} 
			else {
				result[l] = arr2[j];
				j++;
			}
			l++;
		}
		while (i < arr1.length) {
			result[l] = arr1[i];
			i++;
			l++;
		}
		while (j < arr2.length) {
			result[l] = arr2[j];
			j++;
			l++;
		}
		System.out.println(Arrays.toString(result));
	}

	public static void levelOfDifficulty() {
		int k = 0;
		int n = 10;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				for (int z = j + 1; z < n; z++) {
					k++;
				}
			}
		}
		System.out.println("The level difficulty is: " + k + " operations." + " So it's about O(n3)");
	}

	public static void sumOfNumbers(int[] arr, int sum) {
		int firstNumberIndex = 0;
		int lastNumberIndex = arr.length - 1;
		int neededElement;
		Boolean flag = false;
		for (int i = 0; i < arr.length; i++) {
			neededElement = sum - arr[i];
			flag = binarySearch(arr, firstNumberIndex, lastNumberIndex, neededElement);
		}
		if(flag == true) {
			System.out.println("True, there are two numbers, whose sum  is " + sum);
		}
		if(flag == false) {
			System.out.println("There's no such numbers in the array, whose sum is " + sum);
		}
	}

	public static Boolean binarySearch(int[] array, int first, int last, int findElem) {
		int position;
		Boolean mark = false;
		position = (first + last) / 2;
		while((array[position] != findElem) && (first != last)) {
			if(array[position] > findElem) {
				last = position - 1;
			}
			else {
				first = position + 1;
			}
			position = (first + last) / 2;
		}
		if(array[position] == findElem) {
			mark = true;
		}
		return mark;
	}
}
