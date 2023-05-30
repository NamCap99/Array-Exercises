import java.util.Scanner;

public class Exercise11 {
	final static int MIN = -100; 
	final static int MAX = 100;
//	condition
	public static int enterNumber(Scanner scanner) {
		System.out.println("Enter range of array: ");
		int number;
		do {
			System.out.println("Number must be even number and bigger than 2");		
			number = scanner.nextInt();

		}while(number % 2 != 0 || number < 2 );
		
		return number;
	}
//	enter array
	public static int[] enterArray(int number) {
		int arr[] = new int [number];
		
		for(int i = 0; i<arr.length; i++) {
			arr[i] = MIN + (int)(Math.random() * ((MAX-MIN )+1));
		}
		
		return arr;
	}

//	print array
	public static void printArray(int []arr) {
		System.out.println("Array is:");
		for(int a: arr) {
			System.out.print(a+ " ");
		}
	}
//	isEqual array
	public static boolean isEqual(int arr1[], int arr2[]) {
		for(int i = 0; i<=arr1.length; i++) {
			if(arr1[i] != arr2[i]) {
				return false;
			}
		}
		return true;
	}
//	count shuffle
	public static int countShuffle(int arr1[], int arr2[]) {
		int count = 0;
		
		do {
			arr2 = shuffle(arr2);
			printArray(arr2);
			count++;
		}while(!isEqual(arr1, arr2));
		
		return count;
	}
	public static int[] shuffle(int []arr) {
		int tam[] = new int[arr.length];

		for(int i = 0; i<(arr.length)/2; i++) {
			tam[2 * i] = arr[i];
			tam[2 * i + 1] = arr[(arr.length) /2 + i];
		}
		arr= tam;
		
		return arr;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);		
		int range = enterNumber(scanner);
		int arrayInMain[] = enterArray(range);
		int b[] = arrayInMain;
		printArray(arrayInMain);
		arrayInMain = shuffle(arrayInMain);
		System.out.println("\nNew Array");
		printArray(arrayInMain);
		b=shuffle(arrayInMain);
		int count = countShuffle(arrayInMain, b);
		System.out.println("Can count lan" + count);
		scanner.close();
	}
}
