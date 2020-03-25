package Dto;

import com.sun.glass.ui.View;

import View.UserView;

/**
 * This class is LoginDto. 
 * 
 * @Description: .
 * @author: DoTienAnh
 * @create_date: Mar 25, 2020
 * @version: 1.0
 * @modifer: DoTienAnh
 * @modifer_date: Mar 25, 2020
 */
public class LoginDto {
	
	private String account, fullName;
	
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
	public LoginDto setAccount(String account) {
		this.account = account;
		return this;
	}

	/**
	 * @param role the role to set
	 * @return
	 */

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
	public LoginDto setFullName(String fullName) {
		this.fullName = fullName;
		return this;
	}
	
	/**
	 * Constructor for class LoginDto.
	 * 
	 * @Description: .
	 * @author: DoTienAnh
	 * @create_date: Mar 25, 2020
	 * @version: 1.0
	 * @modifer: DoTienAnh
	 * @modifer_date: Mar 25, 2020
	 */
	public LoginDto(UserView view) {
		account = view.getAccount();
		fullName = view.getFullName();
	}

	public UserView toEntity(LoginDto dto) {
		return new UserView()
				.setAccount(dto.getAccount())
				.setFullName(dto.getFullName());
	}

}
