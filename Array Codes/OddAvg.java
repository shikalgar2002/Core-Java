package arays;

import java.util.Scanner;

public class OddAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int oddCnt=0;
		int sum=0;
		int num[]= new int[10];
		
		for (int i = 0; i < num.length; i++) {
			System.out.println("Enter the numbers: ");
			num[i]=sc.nextInt();
		}
		
		System.out.println("The array is: ");
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]+" ");
		}
		
		System.out.println();
		for (int i = 0; i < num.length; i++) {
			if(num[i]%2==1) {
				oddCnt++;
				sum=sum+num[i];
			}
		}
		if(oddCnt!=0)
		System.out.println("The average of odd number is:"+sum/oddCnt);
		else
			System.out.println("No odd numbers");
	}

}
