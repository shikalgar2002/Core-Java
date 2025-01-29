package arays;

public class Second_largest {
	public static boolean isSorted(int arr[]) {
		for (int i = 1; i < arr.length; i++) {
			if(arr[i]<arr[i-1]) {
				return false;
			}
		}  return true;
	}

	public static void main(String[] args) {
		int num[] = {13,11,12,15,16};
		System.out.println("The original array is:");
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]+" ");
		}
		System.out.println();
		
		
		int temp=0;
		for(;;) {
			for (int i = 0; i < num.length-1; i++) {
				if(num[i]>num[i+1]) {
					temp=num[i];
					num[i]=num[i+1];
					num[i+1]=temp;
					break;
				}
			}
			if(isSorted(num)) {
			break;
	}
		}
		System.out.println("The sorted array is ");
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]+" ");
		}
		System.out.println("The second largest element from an array is: ");
		System.out.println(num[num.length-2]+" ");
	}
}
