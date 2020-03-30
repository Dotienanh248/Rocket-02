//
package backend.presentationlayer;

import backend.businesslayer.IManagerService;
import backend.businesslayer.ManagerService;
import entity.Manager;

/**
 * This class is ManagerController.. 
 * 
 * @Description: .
 * @author: DoTienAnh
 * @create_date: Mar 30, 2020
 * @version: 1.0
 * @modifer: DoTienAnh
 * @modifer_date: Mar 30, 2020
 */
public class ManagerController {
	
	private IManagerService service;

	public ManagerController() {
		service = new ManagerService();
	}

	public boolean insertManager(Manager manager) {
		return service.insertManager(manager);
	}

}
