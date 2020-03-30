//
package entity;

import java.util.Scanner;

import utils.Check;
import utils.ScannerUtil;

/**
 * This class is User. 
 * 
 * @Description: .
 * @author: DoTienAnh
 * @create_date: Mar 30, 2020
 * @version: 1.0
 * @modifer: DoTienAnh
 * @modifer_date: Mar 30, 2020
 */
public class User {
	
	private int idUser;
	private String firstName;
	private String lastName;
	private String phone;
	private String email;
	private String password;
	
	public User() {
		super();
	}
	
	/**
	 * Constructor for class User.
	 * 
	 * @Description: .
	 * @author: DoTienAnh
	 * @create_date: Mar 30, 2020
	 * @version: 1.0
	 * @modifer: DoTienAnh
	 * @modifer_date: Mar 30, 2020
	 * @param idUser
	 * @param firstName
	 * @param lastName
	 * @param phone
	 * @param email
	 * @param password
	 */
	public User(int idUser, String firstName, String lastName, String phone, String email, String password) {
		super();
		this.idUser = idUser;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.email = email;
		this.password = password;
	}
	
	/**
	 * @return the IdUser
	 */
	public int getIdUser() {
		return idUser;
	}
	
	/**
	 * @param IdUser the IdUser to set
	 */
	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}
	
	/**
	 * @return the FirstName
	 */
	public String getFirstName() {
		return firstName;
	}
	
	/**
	 * @param FirstName the FirstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	/**
	 * @return the LastName
	 */
	public String getLastName() {
		return lastName;
	}
	
	/**
	 * @param LastName the LastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	/**
	 * @return the Phone
	 */
	public String getPhone() {
		return phone;
	}
	
	/**
	 * @param Phone the Phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	/**
	 * @return the Email
	 */
	public String getEmail() {
		return email;
	}
	
	/**
	 * @param Email the Email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the Password
	 */
	public String getPassword() {
		return password;
	}
	
	/**
	 * @param Password the Password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	/**
	 * 
	 * This method is used to input data.
	 *
	 * @Description: .
	 * @author: DoTienAnh
	 * @create_date: Mar 30, 2020
	 * @version: 1.0
	 * @modifer: DoTienAnh
	 * @modifer_date: Mar 30, 2020
	 */
	public void input() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("First Name: ");
		firstName = ScannerUtil.readString(scanner, "Please input data as String! \nPlease input again: ");
		System.out.println("Last Name: ");
		lastName = ScannerUtil.readString(scanner, "Please input data as String! \nPlease input again: ");
		System.out.println("Phone: ");
		phone = Check.readPhone(scanner, "Please input data as String! \nPlease input again: ");
		System.out.println("Email: ");
		email = Check.readEmail(scanner, "Please input data as String! \nPlease input again: ");
		System.out.println("Password: ");
		password = Check.readPassword(scanner, "Please input data as String! \nPlease input again: ");
	}

}
