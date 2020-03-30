//
package entity;

import java.util.Scanner;
import utils.*;

/**
 * This class is manager. 
 * 
 * @Description: .
 * @author: DoTienAnh
 * @create_date: Mar 30, 2020
 * @version: 1.0
 * @modifer: DoTienAnh
 * @modifer_date: Mar 30, 2020
 */
public class Manager {
	
	private User user;
	private int idManager;
	private int expInYear;
	
	/**
	 * @return the User
	 */
	public User getUser() {
		return user;
	}
	
	/**
	 * @param User the User to set
	 */
	public void setUser(User user) {
		this.user = user;
	}

	/**
	 * @return the IdManager
	 */
	public int getIdManager() {
		return idManager;
	}
	
	/**
	 * @param IdManager the IdManager to set
	 */
	public void setIdManager(int idManager) {
		this.idManager = idManager;
	}
	
	/**
	 * @return the ExpInYear
	 */
	public int getExpInYear() {
		return expInYear;
	}
	
	/**
	 * @param ExpInYear the ExpInYear to set
	 */
	public void setExpInYear(int expInYear) {
		this.expInYear = expInYear;
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
	 * @param user
	 */
	public void input(User user) {
		Scanner scanner = new Scanner(System.in);
		this.user = user;
		do {
			System.out.println("ExpInt: ");
			expInYear = ScannerUtil.readInt(scanner, "Please input data as INTEGER! \nPlease input again: ");
		} while (expInYear > 20 || expInYear < 0);

	}

}
