
import java.util.Scanner;

public class arrayWithOddNumber {
	
	final static int MIN = -1000;
	final static int MAX = 1000;
	
//	enter array
	public static int[] enterArray(int arr) {
		int array[] = new int [arr];
		for(int i = 0; i<array.length; i++) {
			array[i] = MIN + (int)(Math.random() * ((MAX - MIN) + 1) );
		}
		
		return array;
	}
//	print array
	public static void printArray(int arr[]) {
		System.out.print("The array is: ");
		for(int a: arr) {
			System.out.print(a+" ");
		}
		System.out.println();
	}
	
//	check condition
	public static boolean checkTheFirstNumberIsOdd(int x) {
		boolean oddNumber;
//		lay' gia' tri. tuye.t doi' cua x
		x = Math.abs(x);
		while(x >= 10) {
			x /= 10;
		}
		if(x % 2 != 0) {
			oddNumber = true;
		}
		else {
			oddNumber = false;
		}
		return oddNumber;
	}
//	liet ke phan tu
	public static void lietke(int a[]) {
		System.out.println("The value in array with first number is odd: ");
		for(int pt: a) {
			if(checkTheFirstNumberIsOdd(pt)) {
				System.out.print(pt + " ");
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the range of array: ");
		int range = scanner.nextInt();
		int arrayInMain[] = enterArray(range);
		printArray(arrayInMain);
		checkTheFirstNumberIsOdd(620);
		lietke(arrayInMain);
		scanner.close();
	}
}
