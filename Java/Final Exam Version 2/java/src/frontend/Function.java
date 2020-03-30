//
package frontend;

import java.util.List;
import java.util.Scanner;

import backend.presentationlayer.EmployeeController;
import backend.presentationlayer.ManagerController;
import backend.presentationlayer.UserController;
import entity.Employee;
import entity.Manager;
import entity.User;
import utils.*;

/**
 * This class is function used in main program. 
 * 
 * @Description: .
 * @author: DoTienAnh
 * @create_date: Mar 30, 2020
 * @version: 1.0
 * @modifer: DoTienAnh
 * @modifer_date: Mar 30, 2020
 */
public class Function {
	
	static List<User> list;
	Scanner scanner = new Scanner(System.in);

	/**
	 * 
	 * This method is get all users.
	 *
	 * @Description: .
	 * @author: DoTienAnh
	 * @create_date: Mar 30, 2020
	 * @version: 1.0
	 * @modifer: DoTienAnh
	 * @modifer_date: Mar 30, 2020
	 */

	public void getAllUseers() {
		list = new UserController().getAllUser();
		for (User us : list) {
			System.out.println("First Name:\t" + us.getFirstName());
			System.out.println("Last Name:\t" + us.getLastName());
			System.out.println("Email:\t\t" + us.getEmail());
			System.out.println("Password:\t" + us.getPassword());
			System.out.println("--------------------------------");
		}
	}

	/**
	 * 
	 * This method is used to login.
	 *
	 * @Description: .
	 * @author: DoTienAnh
	 * @create_date: Mar 30, 2020
	 * @version: 1.0
	 * @modifer: DoTienAnh
	 * @modifer_date: Mar 30, 2020
	 */
	public void Login() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Username:");
		String email = Check.readEmail(scanner, "error");
		System.out.println("Password:");
		String password = Check.readPassword(scanner, "error");
		boolean bl = new UserController().login(email, password);
		if (bl) {
			System.out.println("Login successfully!");
		} else {
			System.out.println("Login failed!");
		}
	}

	/**
	 * 
	 * This method is create manager.
	 *
	 * @Description: .
	 * @author: DoTienAnh
	 * @create_date: Mar 30, 2020
	 * @version: 1.0
	 * @modifer: DoTienAnh
	 * @modifer_date: Mar 30, 2020
	 */
	public void insertManager() {

		User user = new User();
		Manager manager = new Manager();

		user.input();
		manager.input(user);

		boolean bl = false;
		try {
			bl = new UserController().insertUser(user);
		} catch (Exception e) {
			System.out.println("Create User failed! Email existed");
		}

		if (bl == true) {
			manager.setUser(new UserController().getUserByEmail(user.getEmail()));
			boolean bl1 = new ManagerController().insertManager(manager);
			if (bl1 == true) {
				System.out.println("Create Successfully!");
			} else {
				System.out.println("Create Manager failed!");
			}
		}
	}

	/**
	 * 
	 * This method is create employee.
	 *
	 * @Description: .
	 * @author: DoTienAnh
	 * @create_date: Mar 30, 2020
	 * @version: 1.0
	 * @modifer: DoTienAnh
	 * @modifer_date: Mar 30, 2020
	 */
	public void insertEmployee() {

		User user = new User();
		Employee emp = new Employee();

		user.input();
		emp.input(user);

		boolean bl = false;
		try {
			bl = new UserController().insertUser(user);
		} catch (Exception e) {
			System.out.println("Create User failed! Email existed");
		}
		if (bl == true) {
			emp.setUser(new UserController().getUserByEmail(user.getEmail()));
			boolean bl1 = new EmployeeController().insertEmployee(emp);
			if (bl1 == true) {
				System.out.println("Create Successfully!");
			} else {
				System.out.println("Create Employee failed!");
			}
		}
	}

}
