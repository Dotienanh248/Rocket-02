//
package backend.datalayer;

import java.util.List;

import entity.User;

/**
 * This class is interface of UserDAO. 
 * 
 * @Description: .
 * @author: DoTienAnh
 * @create_date: Mar 30, 2020
 * @version: 1.0
 * @modifer: DoTienAnh
 * @modifer_date: Mar 30, 2020
 */
public interface IUserDAO {
	
	//Login
	boolean login(String email, String password);
	// get al user
	List<User> getAllUser();
	//insert user
	boolean insertUser(User user) throws Exception;
	// get users by email
	User getUserByEmail(String email);

}
