package Exception_Handling;

import java.util.Scanner;

public class EmployeeAcceptance {
	String name;
	float salary;
	float experience;
	
	
	

	public EmployeeAcceptance(String name, float salary, float experience) {
		super();
		this.name = name;
		this.salary = salary;
		this.experience = experience;
	}




	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name=sc.next();
		
		
		System.out.println("Enter the salary: ");
		float salary=sc.nextFloat();
		
		System.out.println("Enter the experience: ");
		float exp=sc.nextFloat();
		
		EmployeeAcceptance e= new EmployeeAcceptance(name, salary, exp);
		
		try {
			if(exp>0) {
				System.out.println("Accepted");
			}
			else {
				FresherNotFoundException ff= new FresherNotFoundException("We do not accept Fresher");
				throw ff;
				
			}
		} catch (Exception e2) {
			System.out.println(e2.getMessage());
		}
		finally {
			sc.close();
		}
	}

}
