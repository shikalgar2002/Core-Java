package arays;

public class OddEven {

	public static void main(String[] args) {
		int arr[]= {23,12,34,45,78};
		int evencnt=0;
		int oddcnt=0;
//		System.out.println("Even Numbers");
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%2==0) {
				evencnt++;
//				
			}else if (arr[i]%2==1) {
				oddcnt++;
			}
			
		}
		
		System.out.println(evencnt+oddcnt);
		
	}

}
