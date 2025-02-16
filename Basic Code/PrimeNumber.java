package basic_code;

import java.util.Iterator;

public class PrimeNumber {

	
		
		public static boolean isPrime(int num) {
			for (int i = 2; i < num/2; i++) {
				if(num%i==0) {
					return false;
				}
				
			}return true;
			
		}
	public static void main (String[] args) {
		int number=27;
		
		if(isPrime(number)) {
			System.out.println("Prime ");
		}else {
			System.out.println("Not prime");
		}
	}
		

	}


