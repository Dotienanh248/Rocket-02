package From;

/**
 * This class is RegisterInput. 
 * 
 * @Description: .
 * @author: DoTienAnh
 * @create_date: Mar 25, 2020
 * @version: 1.0
 * @modifer: DoTienAnh
 * @modifer_date: Mar 25, 2020
 */
public class RegisterUserInput {
	
	
	private String firstName;
	private String lastName;
	private String phone;
	private String email;
	private String password;
	
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	
	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}
	
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	
	/**
	 * @param firstName the firstName to set
	 * @return
	 */
	public RegisterUserInput setFirstName(String firstName) {
		this.firstName = firstName;
		return this;
	}

	/**
	 * @param lastName the lastName to set
	 * @return
	 */
	public RegisterUserInput setLastName(String lastName) {
		this.lastName = lastName;
		return this;
	}
	
	/**
	 * @param phone the phone to set
	 * @return
	 */
	public RegisterUserInput setPhone(String phone) {
		this.phone = phone;
		return this;
	}

	/**
	 * @param email the email to set
	 * @return
	 */
	public RegisterUserInput setEmail(String email) {
		this.email = email;
		return this;
	}

	/**
	 * @param password the password to set
	 * @return
	 */
	public RegisterUserInput setPassword(String password) {
		this.password = password;
		return this;
	}
	
}
