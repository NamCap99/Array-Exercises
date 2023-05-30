import java.util.Scanner;

public class Exercise1 {
//	enter array
	public static int[] enterArray(int a, Scanner scanner) {
		int arr[] = new int[a];

		System.out.println("Enter index of array here: ");

		for (int i = 0; i < arr.length; i++) {
			System.out.print("arr[" + i + "] = ");
			arr[i] = scanner.nextInt();
		}
		sumAllEvenNumber(arr);
		sumAllNegativeNumber(arr);

		return arr;
	}
	
//	Sum all even number
	public static int sumAllEvenNumber(int a[]) {
		int sum =0;
		for(int arr: a) {
			if(arr % 2 ==0) {
				sum +=arr;				
			}
		}
		System.out.println("Total even number in the array is: " + sum);
		return sum;
	}
//	sum all negative number
	public static int sumAllNegativeNumber(int a[]) {
		int sum = 0;
		int count_negative_number = 0;
		for(int arr: a) {
			if(arr<0) {
				sum +=arr;
				count_negative_number++;
			}
		}
		System.out.println("Total of all negative number in the array is: " + sum + ", with "
				+ count_negative_number + " negative number(s).");
		return sum;
	}

//	print array with for i
	public static void printOutArray(int a[]) {
		System.out.println("Print out the array with for loop:");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

//	print array with for each
	public static void printOutArrayWithForEach(int a[]) {
		System.out.println("Print out the array with for each: ");
		for(int arr: a) {
			System.out.print(arr+" ");
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your array length: ");
		int arrayNumber = scanner.nextInt();

		int arr[] = enterArray(arrayNumber, scanner);
		printOutArray(arr);
		printOutArrayWithForEach(arr);
		
		scanner.close();
	}
}
