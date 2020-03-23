package Assignment7;
import java.util.Collection;

import Assignment6.*;

public abstract class ListOfAllTheProfessors extends Employee {
	public int sort(Employee p1, Employee p2) {
		return (p1.lastName.compareTo(p2.lastName));
	}
}
