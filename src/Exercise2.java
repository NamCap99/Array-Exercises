import java.util.Scanner;

public class Exercise2 {
//	declared final static int MIN, MAX
	final static int MIN = -100;
	final static int MAX = 100;
	
//	Enter array
	public static int[] enterArray(int number) {
		int arr[] = new int[number];
		
		for(int i = 0 ; i< arr.length; i++) {
			arr[i] = MIN +(int)(Math.random() * ((MAX - MIN) + 1) ); 
		}
		
		return arr;
	}
	
//	print out array
	public static void printOutArray(int []arr) {
		System.out.println("The array is: ");
		for(int arrayNumber:arr) {
			System.out.print(arrayNumber + " ");
		}
		System.out.println();
		printOutPositiveNumber(arr);
		System.out.println();
		printTheFirstNegativeNumberInArray(arr);
	}
	
//	print out all positive numbers in array
	public static void printOutPositiveNumber(int[] arrPositive) {
		System.out.println("All positive number in array is: ");
		for(int i =0; i<arrPositive.length; i++) {
			if(arrPositive[i] >0) {
				System.out.print(arrPositive[i] + " ");
			}
		}
	}
	
//	print out the array in range [x,y]
	public static void arrayInRange(int[] arr,Scanner scanner) {
		System.out.print("The array between ");
		int x = scanner.nextInt();
		System.out.print("And ");
		int y = scanner.nextInt();
		System.out.println("is: ");
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] >= x && arr[i] <=y) {
				System.out.print(arr[i]+" ");
			}
		}
	}
	
//	find the first negative number in the array, and find the index of this negative number
	public static void printTheFirstNegativeNumberInArray(int [] arrFirstNegativeNumber) {
		System.out.print("The first negative number in the array is: ");
		for(int i = 0; i<arrFirstNegativeNumber.length; i++) {
			if(arrFirstNegativeNumber[i] <0) {
				System.out.println(arrFirstNegativeNumber[i] + ", index = " + i);
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter length of the array here: ");
		int arrayLenth = scanner.nextInt();
		int arr[] = enterArray(arrayLenth);
		printOutArray(arr);
		arrayInRange(arr, scanner);
		
		scanner.close();
	}
}
