package Exception_Handling;

import java.util.Scanner;

public class Vowels {
	String name;
	int count=0;
	public Vowels(String name) {
		this.name=name;
		
	}
	
	public static boolean isVowels(String s) {
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
				return true;
			}
		}return false;
	}
	
	
	public static void main(String[] args) {
	
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter String : ");
		String name=sc.next();
		try {
			if(isVowels(name)) {
				System.out.println("The String contains vowels");
			}
			else {
				NoVowelFoundException ne = new NoVowelFoundException("The Strign does not contains vowels");
				throw ne;
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			sc.close();
		}

	}

}
