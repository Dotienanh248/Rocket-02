package Assignment6;
import java.util.Scanner;

public class Officer extends Employee {
	
	protected String department;
	private int workingTime;
	private int position;
		
	public void input() {
		super.input();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Department: ");
		department = scanner.nextLine();
		
		System.out.print("Working time (day): ");
		workingTime = scanner.nextInt();
		
		do {
			System.out.print("Position (1-staff/ 2-vice head/ 3-department head): ");
			position = scanner.nextInt();
		} while (position>3 || position<1);
	}
	
	public void setAllowance() {
		if(position == 1) {
			allowance = 500;
		} else if (position == 2) {
			allowance = 1000;
		} else {
			allowance = 2000;
		}
	}
	
	public void setSalary() {
		salary = salaryMultiplier * 730 + allowance + workingTime * 30;
	}
	
	public void print() {
//		super.print();
		setAllowance();
		setSalary();
		System.out.println("Full name: " + fristName + " " + lastName);
		System.out.println("Department: " + department);
		System.out.println("Working time (day): " + workingTime);
		System.out.println("Salary multiplier: " + salaryMultiplier);
		System.out.println("Allowance: " + allowance);
		System.out.println("Position (1-staff/ 2-vice head/ 3-department head): " + position);
		System.out.println("Salary: " + salary);
	}

}

