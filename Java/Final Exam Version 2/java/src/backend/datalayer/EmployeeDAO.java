//
package backend.datalayer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import entity.Employee;
import resources.DatabaseConnection;

/**
 * This class is EmoloyeeDAO. 
 * 
 * @Description: .
 * @author: DoTienAnh
 * @create_date: Mar 30, 2020
 * @version: 1.0
 * @modifer: DoTienAnh
 * @modifer_date: Mar 30, 2020
 */
public class EmployeeDAO implements IEmployeeDAO {
	
	@Override
	public boolean insertEmployee(Employee employee) {
		Connection myConn = null;
		ResultSet myRs = null;
		PreparedStatement myPs = null;
		myConn = DatabaseConnection.openConnection();

		try {
			String sql = "INSERT INTO Employee (IdUser, ProjectName, Skill) VALUES (?,?,?)";

			myPs = myConn.prepareStatement(sql);

			myPs.setInt(1, employee.getUser().getIdUser());
			myPs.setString(2, employee.getProjectName());
			myPs.setString(3, employee.getProSkill());

			myPs.executeUpdate();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DatabaseConnection.closeAll(myConn, myPs, myRs);
		}
		return false;
	}


}
