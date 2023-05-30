import java.util.Scanner;

public class Exercise8 {
	final static int MIN = -100;
	final static int MAX = 100;
//	enter array
	public static int []enterArray(int a, Scanner scanner){
		int array[] = new int[a];
		
		for(int i = 0; i<array.length; i++) {
			System.out.print("Index "+ i +" is: ");
			array[i] = scanner.nextInt();
		}
		
		return array;
	}
//	print array
	public static void printArray(int arr[]) {
		System.out.println("The array is: ");
		for(int a: arr) {
			System.out.print(a + " ");
		}
	}
	
//	count number of value
	public static int countNumberOfValue(int arr[], int x) {
		int count = 0;
		
		for( int a: arr) {
			if(a == x) {
				count++;
			}
		}
		
		return count;
	}
	
//	delete value
	public static int[] deleteValue(int arr[], int x) {
		int count = countNumberOfValue(arr, x);
		if(count > 0) {
			int newArray[] = new int[arr.length - count];
			int j = 0;
			for(int i = 0; i<arr.length; i++) {
				if(arr[i] != x) {
					newArray[j++] = arr[i];
				}
			}
			arr = newArray;
		}
		
		return arr;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter array range here: ");
		int range = scanner.nextInt();
		int arrayInMain[] = enterArray(range, scanner);
		printArray(arrayInMain);
		System.out.print("Remove value: ");
		int value = scanner.nextInt();
		arrayInMain = deleteValue(arrayInMain, value);
		printArray(arrayInMain);
		
		scanner.close();
	}
}
