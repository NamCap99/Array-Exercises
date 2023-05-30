import java.util.Scanner;

public class Exercise12 {
	final static int MIN = -100; 
	final static int MAX = 100;
	
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
	
//	run in array with increasing number
	public static void runArray(int []arr) {
		int head = 0;
		int maxLength = 0, maxHead = 0;
		do {
			int i, len = 1;
			for (i = head; i<arr.length - 1 && arr[i] < arr[i+1]; i++) {
				len++;
			}
			if(len > maxLength) {
				maxLength = len;
				maxHead = head;
			}
			head = i + 1;
		}while(head < arr.length);
		System.out.println("\nLongest run is: ");
		for(int i =0; i<maxLength; i++) {
			System.out.print(arr[maxHead + i]+ " ");
		}
	}

	
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter range of array: ");

		int range = scanner.nextInt();
		int arrayInMain[] = enterArray(range);
		printArray(arrayInMain);
		runArray(arrayInMain);
		scanner.close();
	}
}
