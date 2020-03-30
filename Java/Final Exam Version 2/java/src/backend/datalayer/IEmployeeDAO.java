//
package backend.datalayer;

import entity.Employee;

/**
 * This class is interface of EmployeeDAO. 
 * 
 * @Description: .
 * @author: DoTienAnh
 * @create_date: Mar 30, 2020
 * @version: 1.0
 * @modifer: DoTienAnh
 * @modifer_date: Mar 30, 2020
 */
public interface IEmployeeDAO {
	
	boolean insertEmployee(Employee employee);

}
