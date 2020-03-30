//
package backend.businesslayer;

import java.util.List;
import entity.User;

/**
 * This class is interface of UsersService. 
 * 
 * @Description: .
 * @author: DoTienAnh
 * @create_date: Mar 30, 2020
 * @version: 1.0
 * @modifer: DoTienAnh
 * @modifer_date: Mar 30, 2020
 */
public interface IUserService {
	
	/**
	 * 
	 * This method is get all user .
	 *
	 * @Description: .
	 * @author: DoTienAnh
	 * @create_date: Mar 30, 2020
	 * @version: 1.0
	 * @modifer: DoTienAnh
	 * @modifer_date: Mar 30, 2020
	 * @return
	 */
	List<User> getAllUser();

	/**
	 * 
	 * This method is create user .
	 *
	 * @Description: .
	 * @author: DoTienAnh
	 * @create_date: Mar 30, 2020
	 * @version: 1.0
	 * @modifer: DoTienAnh
	 * @modifer_date: Mar 30, 2020
	 * @param user
	 * @return
	 * @throws Exception
	 */
	boolean insertUser(User user) throws Exception;

	/**
	 * 
	 * This method is login .
	 *
	 * @Description: .
	 * @author: DoTienAnh
	 * @create_date: Mar 30, 2020
	 * @version: 1.0
	 * @modifer: DoTienAnh
	 * @modifer_date: Mar 30, 2020
	 * @param email
	 * @param passWord
	 * @return
	 */
	boolean login(String email, String passWord);

	/**
	 * This method is get an user by email .
	 *
	 * @Description: .
	 * @Description: .
	 * @author: DoTienAnh
	 * @create_date: Mar 30, 2020
	 * @version: 1.0
	 * @modifer: DoTienAnh
	 * @modifer_date: Mar 30, 2020
	 * @param email
	 * @return
	 */
	User getUserByEmail(String email);

}
