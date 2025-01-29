package arays;
import java.util.Scanner;
public class CopyArray {
	public static void copy(String arr[]) {
		String[] n= new String[arr.length];
		for (int i = 0; i < n.length; i++) {
			n[i]=arr[i];
		}
		System.out.println("The copied element of array in another array");
		for (int i = 0; i < n.length; i++) {
			System.out.println(n[i]+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] arr =new String[5];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter five String values");
			arr[i]=sc.next();
		}
			System.out.println("Array is: ");
			for (int i = 0; i < arr.length; i++) {
				System.out.println(arr[i]);
			}
			
			copy(arr);
			
			
		
	}

}
