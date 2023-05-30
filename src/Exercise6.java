import java.util.Scanner;

public class Exercise6 {
	final static int MIN = -20;
	final static int MAX = 20;
//	Enter array
	public static int[] enterArray(int arr) {
		int array[] = new int [arr]; 
		
		for(int i = 0; i<array.length; i++) {
			array[i] = MIN + (int)(Math.random()* ((MAX- MIN)+1));
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
	
//	check condition if arr[i] > arr[i-1] => sum 2 number
	public static int sum(int a[]) {
		int sum = 0;
		for(int i = 1; i< a.length; i++) {
			if(a[i] > a[i-1]) {
				sum += a[i];
			}
		}
		System.out.println();
		System.out.println("Total sum of all 2 numbers when array[i] > array[i-1] is:" + sum);
		return sum;
	}
	
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter range of the array: ");
		int range = scanner.nextInt();
		int arrayInMain[] = enterArray(range);
		printArray(arrayInMain);
		sum(arrayInMain);
		
		scanner.close();
	}
}
