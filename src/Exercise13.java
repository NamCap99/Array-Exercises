import java.util.Scanner;

public class Exercise13 {
//	get value for array
	public static int []arr(Scanner scanner){
		System.out.print("Enter range for array: ");
		int range = scanner.nextInt();
		int array[] = new int[range];
		for(int i=0; i<array.length; i++) {
			System.out.println("Enter value for index array ["+ i+"] is: ");
			array[i] = scanner.nextInt();
		}
		
		return array;
	}
//	print array
	public static void printArray(int []arr) {
		System.out.println("Array is: ");
		for(int a: arr) {
			System.out.print(a + " ");
		}
	}
//	check array is balance or not
	public static boolean balanceArray(int arr[]) {
//		for(int i = )
		for(int i = 0; i< arr.length /2 - 1; i++) {
			if(arr[i] != arr[arr.length - 1 -i ]) {
				return false;
			}
		}
		
		return true;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int arrayInMain[] = arr(scanner);
		printArray(arrayInMain);
		boolean check = balanceArray(arrayInMain);
		if(check) {
			System.out.println("Array is balance");
			printArray(arrayInMain);
		}else {
			System.out.println("Array is not balance");
		}
		scanner.close();
	}
}
