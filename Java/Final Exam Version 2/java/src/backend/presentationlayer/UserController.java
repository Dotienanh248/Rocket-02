//
package backend.presentationlayer;

import java.util.List;
import backend.businesslayer.IUserService;
import backend.businesslayer.UserService;
import entity.User;

/**
 * This class is UsersController. 
 * 
 * @Description: .
 * @author: DoTienAnh
 * @create_date: Mar 30, 2020
 * @version: 1.0
 * @modifer: DoTienAnh
 * @modifer_date: Mar 30, 2020
 */
public class UserController {
	
	private IUserService service;

	public UserController() {
		service = new UserService();
	}

	/**
	 * 
	 * This method is get all users .
	 *
	 * @Description: .
	 * @author: DoTienAnh
	 * @create_date: Mar 30, 2020
	 * @version: 1.0
	 * @modifer: DoTienAnh
	 * @modifer_date: Mar 30, 2020
	 * @return
	 */
	public List<User> getAllUser() {
		return service.getAllUser();
	}

	/**
	 * 
	 * This method is create users.
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
	public boolean insertUser(User user) throws Exception {
		return service.insertUser(user);
	}

	/**
	 * 
	 * This method is login.
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
	public boolean login(String email, String passWord) {
		return service.login(email, passWord);

	}

	/**
	 * 
	 * This method is get users by email.
	 *
	 * @Description: .
	 * @author: HuongLT
	 * @create_date: Mar 27, 2020
	 * @version: 1.0
	 * @modifer: HuongLT
	 * @modifer_date: Mar 27, 2020
	 * @param email
	 * @return
	 */
	public User getUserByEmail(String email) {
		return service.getUserByEmail(email);
	}

}
