import java.util.Scanner;

public class arrayExercise1 {
//	enter array
	public static int[] enterArray(int n,Scanner scanner) {

		int arr[] = new int[n] ;
		System.out.println("Enter the index 0 to "+n+" of array");
		for(int i = 0; i < n; i++) {
			System.out.print("a[" + i + "] = ");
			arr[i] = scanner.nextInt();
		}
		System.out.println();
		
		return arr;
	}
//	print out array with for index
	public static void printOutWithForI(int a[]) {
		System.out.println("Print out the array with for index: ");
		for( int i = 0; i<a.length; i++) {
			System.out.print(a[i]+" ");
		}
		
	}
//	print out array with for each
	public static void printOutWithForEach(int a[]) {
		System.out.println("Print out the array with for each: ");
		for(int i:a) {
			System.out.print(i+ " ");
		}
	}
	
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number n = ");
		int n = scanner.nextInt();
		int a[] = enterArray(n, scanner);
		printOutWithForI(a);
		printOutWithForEach(a);
		
		scanner.close();
	}
}
