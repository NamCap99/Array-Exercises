import java.util.Scanner;

public class Exericse10 {
	final static int MIN = -100;
	final static int MAX = 100;
//	enter array
	public static int []enterArray(int n){
		int arr[] = new int[n];
		
		for(int i = 0; i< arr.length; i++) {
			arr[i] = MIN + (int)(Math.random() * ((MAX - MIN) -1));
		}
		
		return arr;
	}
//	print array
	public static void printArray(int arr[]) {
		System.out.println("The array is: ");
		for(int a: arr) {
			System.out.print(a + " ");
		}
	}
//	when number % 4 == 0 && number % 10 == 6 --> print that number in array
	public static int printNumber( int arr[]) {
		int count =0;
		System.out.println();
		System.out.println("Value % 4 = 0 and value % 10 = 6.");
		for (int i = 0; i<arr.length; i++) {
			if(arr[i] % 4 == 0 && Math.abs(arr[i])%10 == 6) {
				System.out.println("Value is: "+arr[i] + " ");
				count++;
			}
		}
		
		return count;
	}
	
//	when number = odd --> number x 2 
	public static void oddNumberTimes2(int arr[]) {
		System.out.println();
		System.out.println("When number is odd, that index value will times itself by 2.\nNew array is:");
		for(int i = 0; i< arr.length; i++) {
			if(arr[i] %2 != 0) {
				arr[i] *= arr[i];
			}
			System.out.print(arr[i] + " ");
		}
//		System.out.println("New array is: ");
	}
	
	
	public static void main(String[] agrs) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter range of array: ");
		int range = scanner.nextInt();
		int array_in_main[] = enterArray(range);
		printArray(array_in_main);
		int count = printNumber(array_in_main);
		System.out.println();
		System.out.println("==> Array has "+ count + " index when value % 4 = 0 and value % 10 = 6.");
		oddNumberTimes2(array_in_main);
		
		scanner.close();
	}
}
