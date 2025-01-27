package arrays;

public class EvenandOdd {

	public static void main(String[] args) {
		int arr[] = {2,3,4,5,6,7,8};
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		
		System.out.println();
		System.out.println("Even numbers :");

		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%2==0) {
				System.out.print(arr[i]);
			}
		}
		System.out.println();
		System.out.println("ODD numbers: ");
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%2==1) {
				System.out.print(arr[i]);
			}
		}
	}

}
