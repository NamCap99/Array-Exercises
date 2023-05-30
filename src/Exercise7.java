import java.util.Scanner;

public class Exercise7 {
	final static int MIN = -100;
	final static int MAX = 100;
//	enter array
	public static int []enterArray(int a) {
		int array[] = new int[a];
		for(int i = 0; i<array.length; i++) {
			array[i] = MIN + (int)(Math.random()* ((MAX - MIN)+1) );
		}
		
		return array;
	}
//	print array
	public static void printArray(int []a) {
		System.out.println("The array is: ");
		for(int arr: a) {
			System.out.print(arr+ " ");
		}
	}
	
//	add element
	public static int[] addElement(int a[], Scanner scanner) {
		int k;
		System.out.println();
		do {
			System.out.println("Enter index for k from 0 to "+a.length);
			k = scanner.nextInt();
		}while(k < 0 || k >a.length );
		
		System.out.print("Enter value need to add in array: x = ");
		int x = scanner.nextInt();
		int []newArray = new int[a.length +1];
		for(int i = 0; i<newArray.length; i++) {
			if(i < k) {
				newArray[i] = a[i];
			}
			else if( i == k) {
				newArray[i] = x;
			}
			else if(i > k) {
				newArray[i] = a[i-1]; 
			}
		}
		a = newArray; // gán mảng tạm về cho mảng gốc
		
		return a;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the range of array: ");
		int range = scanner.nextInt();
		
		int []arrayInMain = enterArray(range);
		printArray(arrayInMain);
		arrayInMain = addElement(arrayInMain, scanner);
		printArray(arrayInMain);
		
		scanner.close();
	}
}
