package arays;

public class ArraySort {
	public static boolean isSorted(int arr[]){
		for (int i = 0; i < arr.length-1; i++) {
			if(arr[i]>arr[i+1]) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[]= {23,56,12,89,43};
		int num1[]= {1,2,3,4,5};
	
		if(isSorted(num1)) {
			System.out.println("sorted");
		}else {
			System.out.println("Not sorted");
		}
	
	}

}
