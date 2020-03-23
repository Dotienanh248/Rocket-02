package Assignment6;
import java.util.Scanner;

public abstract class Employee {
	
	public String fristName;
	public String lastName;
	protected float allowance;
	protected float salaryMultiplier;
	protected float salary;
	
	public void input() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Frist name: ");
		fristName = scanner.nextLine();
		System.out.print("Last name: ");
		lastName = scanner.nextLine();
		
		System.out.print("Salary multiplier: ");
		salaryMultiplier = scanner.nextFloat();	
	}
	
	public void print() {
		System.out.println("Full name: " + fristName + " " + lastName);
		System.out.println("Salary multiplier: " + salaryMultiplier);
	}
	
	public abstract void setAllowance() ;

	public abstract void setSalary();
}
