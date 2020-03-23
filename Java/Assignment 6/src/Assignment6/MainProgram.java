package Assignment6;
import Assignment7.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MainProgram {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<Employee> emp = new ArrayList<>();
				
		System.out.print("Enter the employee number: ");
		int n = scanner.nextInt();
		
		System.out.println("\n" + "Enter the information for each employee ");
		for(int i=0; i<n; i++) {
			System.out.print("\n Enter employee information " + (i + 1) + ":  \n");
			System.out.print("Employee is (1-Professor/ 2-Officer): ");
			int choose = scanner.nextInt();
			if(choose == 1) {
				Professor p = new Professor();
				p.input();
				p.setAllowance();
				p.setSalary();
				emp.add(p);
			} else {
				Officer o = new Officer();
				o.input();
				o.setAllowance();
				o.setSalary();
				emp.add(o);
			}
		}
		
		System.out.println("--------------------------------------------------");
		System.out.println("The information the employee has just entered is: ");
		for(int i=0; i<n; i++) {
			System.out.print("\n Enter employee information " + (i + 1) + ":  \n");
			emp.get(i).print();
		}		
		
		int choose;
		do {
			System.out.println("\n--------------------------------------------------");
			System.out.println("Selection (1-Search/ 2-List of all the professors): ");
			choose = scanner.nextInt();
			if(choose == 1) {
				Search s = new Search();
				s.input();
				for(int i=0; i<n; i++) {
					if(emp.get(i) instanceof Officer) {
						Officer o = (Officer) emp.get(i);
						if(s.fristName.equalsIgnoreCase(o.fristName) && s.lastName.equalsIgnoreCase(o.lastName) && s.department.equalsIgnoreCase(o.department)) {
							System.out.println("\n Employee to look for is: ");
							o.print();
						}
					} else if(i>=n) {
						System.out.println("Not found");
					}
				}
			} else if(choose == 2) {
				System.out.println("A list of all the professors and sort them by name");	
//				ListOfAllTheProfessors l = new ListOfAllTheProfessors();
//				for(int i=0; i<n; i++) {
//					l.sort(p1, p2);
//				}
				for(int i=0; i<n; i++) {
					if(emp.get(i) instanceof Professor) {
					Professor p = (Professor) emp.get(i);
					System.out.print("\n Enter employee information " + (i + 1) + ":  \n");
					p.print();
					}
				}	
			}
		} while (choose>=1 && choose<=2);
	}

}
