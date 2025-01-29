package arays;

public class DuplicateArr {
	
	public static boolean isDup(int arr1[], int  arr2[]) {
	
		for(int i=0;i<arr1.length;i++ ) {
	
			if(arr1[i]!=arr2[i]) {
			return false;
		}
		}
		
		return true;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr1[]= {1,2,3,4,5};
		int arr2[]= {1,2,3,4,5};
		
		if(isDup(arr1,arr2)) {
			System.out.println("Same");
		}else {
			System.out.println("Not same");
		}
	}

}
