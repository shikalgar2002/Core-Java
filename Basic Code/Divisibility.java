// Write a program to check the divisibility of a number

package BasicCode;
public class Divisibility {

	public static void main(String[] args) {
		int n=4;
		int count=0;
		
		for (int i=1;i<=40;i++) {
			if(i%4==0) {
				System.out.print(i+" ");
				count++;
			}
		}
		System.out.println();
		System.out.println("Total count of number which is divisible by 4: "+count);

	}

}
