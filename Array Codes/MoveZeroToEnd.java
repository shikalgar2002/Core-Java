package arays;

public class MoveZeroToEnd {
	
	public static void zero(int arr[]) {
		int index=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]!=0) {
				arr[index++]=arr[i];
			}
		}
		while(index<arr.length) {
			arr[index++]=0;
		}
		System.out.println();
		System.out.println("Array after moving zero to end: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		int num[]= {0,2,0,4,5};
		System.out.println("Origina array is: ");
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i]+" ");
		}
		zero(num);
		
	}

}
