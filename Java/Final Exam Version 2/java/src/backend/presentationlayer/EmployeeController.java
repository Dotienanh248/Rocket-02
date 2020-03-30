//
package backend.presentationlayer;

import backend.businesslayer.EmployeeService;
import backend.businesslayer.IEmployeeService;
import entity.Employee;

/**
 * This class is . 
 * 
 * @Description: EmployeeController.
 * @author: DoTienAnh
 * @create_date: Mar 30, 2020
 * @version: 1.0
 * @modifer: DoTienAnh
 * @modifer_date: Mar 30, 2020
 */
public class EmployeeController {
	
	private IEmployeeService service;

	public EmployeeController() {
		service = new EmployeeService();
	}

	/**
	 * 
	 * @Description: EmployeeController.
	 * @author: DoTienAnh
	 * @create_date: Mar 30, 2020
	 * @version: 1.0
	 * @modifer: DoTienAnh
	 * @modifer_date: Mar 30, 2020
	 * @param manager
	 * @return
	 */
	public boolean insertEmployee(Employee employee) {
		return service.insertEmployee(employee);
	}

}
