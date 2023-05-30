import java.util.Scanner;

public class Exercise9 {
	final static int MIN = -100;
	final static int MAX = 100;
//	enter array
	public static int []enterArray(int a){
		int arr[] = new int[a];
		
		for(int i = 0; i<arr.length; i++) {
			arr[i] = MIN +(int)(Math.random()* ((MAX-MIN)+1));
		}
		
		return arr;
	}
//	print array
	public static void printArray(int []arr) {
		System.out.println("The array is: ");
		for(int a: arr) {
			System.out.print(a+" ");
		}
	}
	
//	get index value
//	public static int getIndexValue(int arr[], Scanner scanner) {
//		System.out.print("Enter index you want to delete: ");
//		int index = scanner.nextInt();
//		for(int i = 0; i<arr.length; i++) {
//			if(index == i) {
//				System.out.println(index);
////				break;
//			}else {
//				System.out.println("Wrong input. System out!");
//				break;
//			}
//		}
//		
//		return index;
//	}
	
//	delete value in array
	public static int [] deleteValue(int arr[], Scanner scanner) {
		int newArray[] = new int[arr.length -1];
		int index;
		System.out.println();
		do {
			System.out.print("Enter index you want to delete: ");
			index = scanner.nextInt();
		}while(index < 0 || index >= arr.length);

/** giá trị i là cho newArray, giá trị j là cho array gốc arr[]
 * lúc này logic được hiểu là khi mà xóa trị muốn xóa (j) từ array gốc = index,
 * thì chúng ta sẽ ko lấy giá trị index muốn xóa đó, mà chúng ta tiếp tục đi tiếp j++
 * và rồi gán giá trị tiếp theo của arr[j] cho giá trị newArray[i] đó, và cứ thế tiếp tục đến hết array thì chúng ta có array mới.
 * Sau đó chúng ta gán giá trị của array mới = array cũ => array cũ lúc này được cập nhật lại với giá trị đã xóa. 
 * 
 * */
		for(int i = 0, j =0; i<arr.length -1; i++, j++) {
			if(j == index) {
//				khi mà giá trị i của array gốc = index (vị trí index muốn xóa), thì chúng ta không lấy giá trị j = i đó 
//				mà chúng ta tăng lên j ++ là tăng lên 1. Nghĩa là chúng ta cho j đi tiếp để lấy giá trị tiếp theo đó và skip
//				giá trị j=i kia đi. Chúng ta chọn j++ là bởi vì j đang theo new array, do đó cần tăng j++ chứ không phải i++.
				j++;
			}
			newArray[i] = arr[j];
		}
		arr = newArray; // gán lại cho mảng gốc
		return arr;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the range of array: ");
		int range = scanner.nextInt();
		int arrayInMain[] = enterArray(range);
		printArray(arrayInMain);
		int newArray[] = deleteValue(arrayInMain, scanner);
		printArray(newArray);
		
		scanner.close();
	}
}
