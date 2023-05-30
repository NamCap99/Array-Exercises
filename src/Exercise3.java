import java.util.Scanner;

public class Exercise3 {
	final static int MIN = -100;
	final static int MAX = 100;
//	enter array
	public static int [] enterArray(int n) {
		int arr[] = new int [n];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = MIN + (int)(Math.random()* ((MAX-MIN)+1) );
		}
		
		return arr;
	}
	
//	print out array
	public static void printOutArray(int arr[]) {
		System.out.println("The array is: ");
		for(int a: arr) {
			System.out.print(a + " ");
		}
		System.out.println();
	}
	
//	print out all negative numbers in array
	public static void printOutNegativeNumbersInArray(int arr[]) {
		System.out.println("All negative number(s) in array is: ");
		for(int a: arr) {
			if(a < 0) {				
				System.out.print(a + " ");
			}
		}
		System.out.println();
	}
	
//	find the first potive number in array
	public static int printOutFirstPositiveNumber(int arr[]) {
		int firstPositiveNumber = 0;
		System.out.println();
		for(int i = 0; i<arr.length; i++) {
			if(arr[i]>0) {
				firstPositiveNumber = arr[i];
				System.out.println("The first positive number is: "+firstPositiveNumber);
				break;
			}
		}
		
		return firstPositiveNumber;
	}
	
//	find the smallest positive number in array
	public static void smallestPotiveNumber(int arr[]) {
		int smallestPositiveNumber = 0;
		for(int i = 0; i < arr.length; i++) {
			for( int j = i+1; j<arr.length; j++) {
				if(arr[i] > arr[j]) {
					smallestPositiveNumber = arr[i];
					arr[i] = arr[j];
					arr[j] = smallestPositiveNumber;
				}
			}
		}
		System.out.println("Smallest positive number is: "+smallestPositiveNumber);
	}
	
//	find the smallest number in array
	public static void printOutSmallestNumber(int arr[]) {
		int min_posotive_number = arr[0];
		int minIndex = 0;
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] > 0 && arr[i] < min_posotive_number) {
				min_posotive_number = arr[i];
				minIndex = i;
			}
		}
		System.out.println("the smallest number is: "+min_posotive_number+", in index "+minIndex);
	}
	
	public static void main(String []args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the range of array: ");
		int range = scanner.nextInt();
		
		int arrInMain[] = enterArray(range);
		printOutArray(arrInMain);
		System.out.println("----------------");
		printOutNegativeNumbersInArray(arrInMain);
		System.out.println("----------------");
		printOutFirstPositiveNumber(arrInMain);
		System.out.println("----------------");
		printOutSmallestNumber(arrInMain);
		System.out.println("----------------");
		smallestPotiveNumber(arrInMain);
		
		scanner.close();
	}
}
