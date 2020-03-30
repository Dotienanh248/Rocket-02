//
package backend.businesslayer;

import entity.Manager;
import backend.datalayer.IManagerDAO;
import backend.datalayer.ManagerDAO;

/**
 * This class is manager service. 
 * 
 * @Description: .
 * @author: DoTienAnh
 * @create_date: Mar 30, 2020
 * @version: 1.0
 * @modifer: DoTienAnh
 * @modifer_date: Mar 30, 2020
 */
public class ManagerService implements IManagerService{
	
	private IManagerDAO dao;

	public ManagerService() {
		dao = new ManagerDAO();
	}

	@Override
	public boolean insertManager(Manager manager) {
			return dao.insertManager(manager);
	}

}
