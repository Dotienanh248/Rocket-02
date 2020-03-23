package Assignment7;
import Assignment6.*;
import java.util.Scanner;

public class Search extends Officer {
	
	public void input() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Frist name: ");
		fristName = scanner.nextLine();
		System.out.print("Last name: ");
		lastName = scanner.nextLine();
		
		System.out.print("Department: ");
		department = scanner.nextLine();	
	}
	
}
