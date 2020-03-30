//
package backend.businesslayer;

import entity.Employee;
import backend.businesslayer.IEmployeeService;
import backend.datalayer.IEmployeeDAO;
import backend.datalayer.EmployeeDAO;

/**
 * This class is employee service. 
 * 
 * @Description: .
 * @author: DoTienAnh
 * @create_date: Mar 30, 2020
 * @version: 1.0
 * @modifer: DoTienAnh
 * @modifer_date: Mar 30, 2020
 */
public class EmployeeService implements IEmployeeService {
	
	private IEmployeeDAO dao;

	public EmployeeService() {
		dao = new EmployeeDAO();
	}

	@Override
	public boolean insertEmployee(Employee employee) {
		return dao.insertEmployee(employee);
	}

}
