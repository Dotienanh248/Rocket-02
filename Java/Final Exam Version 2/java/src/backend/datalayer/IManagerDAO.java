//
package backend.datalayer;

import entity.Manager;

/**
 * This class is interface of ManagerDAO. 
 * 
 * @Description: .
 * @author: DoTienAnh
 * @create_date: Mar 30, 2020
 * @version: 1.0
 * @modifer: DoTienAnh
 * @modifer_date: Mar 30, 2020
 */
public interface IManagerDAO {
	
	boolean insertManager(Manager manager);

}
