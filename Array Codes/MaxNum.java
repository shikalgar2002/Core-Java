package arays;

public class MaxNum {

	public static void main(String[] args) {
		int number[]= {12,4,7,3,9};
		int max=0;
		int min=number[0];
		
		System.out.println("Maximum number of array");
		for(int i =0;i<number.length;i++) {
			if(max<=number[i]) {
				max=number[i];
			}
		}
		System.out.println(max);
		System.out.println("Minimum number of array");
		for(int i =0;i<number.length;i++) {
			if(min>=number[i]) {
				min=number[i];
			}
		}
		System.out.println(min);
	}

}