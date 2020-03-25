package From;

/**
 * This class is LoginInput. 
 * 
 * @Description: .
 * @author: DoTienAnh
 * @create_date: Mar 25, 2020
 * @version: 1.0
 * @modifer: DoTienAnh
 * @modifer_date: Mar 25, 2020
 */
public class LoginInput {
	
	private String account;
	private String password;
	
	/**
	 * @return the account
	 */
	public String getAccount() {
		return account;
	}
	
	/**
	 * @param account the account to set
	 * @return 
	 */
	public LoginInput setAccount(String account) {
		this.account = account;
		return this;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 * @return 
	 */
	public LoginInput setPassword(String password) {
		this.password = password;
		return this;
	}

}
