//
package backend.businesslayer;

import java.util.List;
import backend.datalayer.IUserDAO;
import backend.datalayer.UserDAO;
import entity.User;

/**
 * This class is UserService. 
 * 
 * @Description: .
 * @author: DoTienAnh
 * @create_date: Mar 30, 2020
 * @version: 1.0
 * @modifer: DoTienAnh
 * @modifer_date: Mar 30, 2020
 */
public class UserService implements IUserService{
	
	private IUserDAO dao;

	public UserService() {
		dao = new UserDAO();
	}

	@Override
	public List<User> getAllUser() {
		return dao.getAllUser();
	}

	@Override
	public boolean insertUser(User user) throws Exception {
		return dao.insertUser(user);
	}

	@Override
	public boolean login(String email, String passWord) {
		return dao.login(email, passWord);
	}

	@Override
	public User getUserByEmail(String email) {
		return dao.getUserByEmail(email);
	}

}
