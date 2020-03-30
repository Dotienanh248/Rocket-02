//
package backend.datalayer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import entity.Manager;
import resources.DatabaseConnection;

/**
 * This class is . 
 * 
 * @Description: .
 * @author: DoTienAnh
 * @create_date: Mar 30, 2020
 * @version: 1.0
 * @modifer: DoTienAnh
 * @modifer_date: Mar 30, 2020
 */
public class ManagerDAO implements IManagerDAO{
	
	@Override
	public boolean insertManager(Manager manager) {
		Connection myConn = null;
		ResultSet myRs = null;
		PreparedStatement myPs = null;
		myConn = DatabaseConnection.openConnection();

		try {
			String sql = "INSERT INTO Manager (IdUser, ExpInYear) VALUES (?,?)";
			myPs = myConn.prepareStatement(sql);
			myPs.setInt(1, manager.getUser().getIdUser());
			myPs.setInt(2, manager.getExpInYear());

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
