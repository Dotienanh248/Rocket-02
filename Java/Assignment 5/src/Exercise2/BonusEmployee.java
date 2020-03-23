package Exercise2;
import java.io.File;

public abstract class Employee {
	private String name, address;
	
	protected int basicSalary;
	
	public String getName() {
		return name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public int getBasicSalary() {
		return basicSalary;
	}
	
	public void setAddress(String add) {
		address = add;
	}
	
	public void setName(String nm) {
		name = nm;
	}
		
	public void setBasicSalary(int sal) {
		basicSalary = sal;
	}
		
	public abstract int getMonthlySalary();
}

//a) Tạo class NormalEmploye
class NormalEmployee extends Employee {
	@Override
	public int getMonthlySalary() {
		return basicSalary;
	}
}

//b) Tạo class BonusEmployee
class BonusEmployee  extends Employee {
	private int bonusSalary;
	
	public int getBonusSalary() {
		return bonusSalary;
	}
	
	public void setBonusSalary(int bonusSalary) {
		this.bonusSalary = bonusSalary;
	}
	
	@Override
	public int getMonthlySalary() {
		return basicSalary + bonusSalary;
	}
	
	public static void main(String[] args) {
		BonusEmployee a = new BonusEmployee();
		a.setBasicSalary(2000);
		a.setBonusSalary(10);
		System.out.println(a.getMonthlySalary());
		
		File oldfile = new File("F:\\VTI\\Rocket-02\\Java\\Assignment 5\\src\\Exercise2\\Employee.java");
		File newfile = new File("F:\\VTI\\Rocket-02\\Java\\Assignment 5\\src\\Exercise2\\BonusEmployee.java");
		if (oldfile.renameTo(newfile)) {
            System.out.println("Rename succesful");
        } else {
            System.out.println("Rename failed");
        }
	}
}