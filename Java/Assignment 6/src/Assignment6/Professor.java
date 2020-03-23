package Assignment6;
import java.util.Scanner;

public class Professor extends Employee {
	
	private String faculty;
	private int academicDegree;
	private int monthlyTeachingTime;
	
	public void input() {
		super.input();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Faculty: ");
		faculty = scanner.nextLine();
		
		do {
			System.out.print("Academic degree (1-bachelor/ 2-master/ 3-doctor): ");
			academicDegree = scanner.nextInt();
		} while (academicDegree>3 || academicDegree<1);
		
		System.out.print("Monthly teaching time (hours): ");
		monthlyTeachingTime = scanner.nextInt();
	}
	
	public void setAllowance() {
		if(academicDegree == 1) {
			allowance = 300;
		} else if (academicDegree == 2) {
			allowance = 500;
		} else {
			allowance = 1000;
		}
	}
	
	public void setSalary() {
		salary = salaryMultiplier * 730 + allowance + monthlyTeachingTime * 45;
	}
	
	public void print() {
//		super.print();
		setAllowance();
		setSalary();
		System.out.println("Full name: " + fristName +" "+ lastName);
		System.out.println("Faculty: " + faculty);
		System.out.println("Academic degree (1-bachelor/ 2-master/ 3-doctor): " + academicDegree);
		System.out.println("Allowance: " + allowance);
		System.out.println("Monthly teaching time (hours): " + monthlyTeachingTime);
		System.out.println("Salary multiplier: " + salaryMultiplier);
		System.out.println("Salary: " + salary);
	}

}
