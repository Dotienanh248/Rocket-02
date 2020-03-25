//
package View;

/**
 * This class is login view. 
 * 
 * @Description: .
 * @author: DoTienAnh
 * @create_date: Mar 25, 2020
 * @version: 1.0
 * @modifer: DoTienAnh
 * @modifer_date: Mar 25, 2020
 */
public class UserView {
	
	private String account,fullName;
	
	/**
	 * Constructor for class Logining.
	 * 
	 * @Description: .
	 * @author: DoTienAnh
	 * @create_date: Mar 25, 2020
	 * @version: 1.0
	 * @modifer: DoTienAnh
	 * @modifer_date: Mar 25, 2020
	 */
	
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
	public UserView setAccount(String account) {
		this.account = account;
		return this;
	}

	/**
	 * @return the fullName
	 */
	public String getFullName() {
		return fullName;
	}

	/**
	 * @param fullName the fullName to set
	 * @return 
	 */
	public UserView setFullName(String fullName) {
		this.fullName = fullName;
		return this;
	}

}
