package From;

/**
 * This class is RegisterManager. 
 * 
 * @Description: .
 * @author: DoTienAnh
 * @create_date: Mar 25, 2020
 * @version: 1.0
 * @modifer: DoTienAnh
 * @modifer_date: Mar 25, 2020
 */
public class RegisterManager {
	
	private int id;
	private int expInYear;
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * @param id the id to set
	 * @return 
	 */
	public RegisterManager setId(int id) {
		this.id = id;
		return this;
	}
	
	/**
	 * @return the expInYear
	 */
	public int getExpInYear() {
		return expInYear;
	}
	
	/**
	 * @param expInYear the expInYear to set
	 * @return 
	 */
	public RegisterManager setExpInYear(int expInYear) {
		expInYear = expInYear;
		return this;
	}
		
}
