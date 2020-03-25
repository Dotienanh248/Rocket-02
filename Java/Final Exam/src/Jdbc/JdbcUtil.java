package Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Properties;

/**
 * This class is JdbcUtil. 
 * 
 * @Description: .
 * @author: DoTienAnh
 * @create_date: Mar 25, 2020
 * @version: 1.0
 * @modifer: DoTienAnh
 * @modifer_date: Mar 25, 2020
 */
public class JdbcUtil {
	
	private static JdbcUtil instance;
	private Connection connection;
	private Statement statement;
	private PreparedStatement prepared;
	
	/**
	 * This method is design pattern singleton to get object JDBCManager. 
	 * 
	 * @Description: .
	 * @author: DoTienAnh
	 * @create_date: Mar 25, 2020
	 * @version: 1.0
	 * @modifer: DoTienAnh
	 * @modifer_date: Mar 25, 2020
	 */
	public static JdbcUtil getInstance() {
		if (null == instance) {
			instance = new JdbcUtil();
		}
		return instance;
	}
	
	/**
	 * Constructor for class JdbcUtil.
	 * Not allow Object use JdbcUtil can create new JDBCManager()
	 * @Description: .
	 * @author: DoTienAnh
	 * @create_date: Mar 25, 2020
	 * @version: 1.0
	 * @modifer: DoTienAnh
	 * @modifer_date: Mar 25, 2020
	 */
	public JdbcUtil() {
	}
	
	/**
	 * This method connects database with CONNECTION_URL.
	 * 
	 * @Description: .
	 * @author: DoTienAnh
	 * @create_date: Mar 25, 2020
	 * @version: 1.0
	 * @modifer: DoTienAnh
	 * @modifer_date: Mar 25, 2020
	 */
	private boolean connect() {
		try {
			// if connect is null or close then connect again
			if (null == connection || connection.isClosed()) {
				// register the driver class with DriverManager
				Class.forName(Constant.DRIVER_SQL_NAME);

				// set username & password SQL
				Properties properties = new Properties();
				properties.setProperty("user", Constant.DATABASE_USERNAME);
				properties.setProperty("password", Constant.DATABASE_PASSWORD);

				// open connect
				connection = DriverManager.getConnection(Constant.CONNECTION_STRING, properties);
			}
			return true;
		} catch (SQLException e) {
			System.out.println(Constant.ERROR_CONNECT_DATABASE_STR);
			System.out.println(e);
		} catch (ClassNotFoundException e) {
			System.out.println(Constant.ERROR_DRIVER_NAME);
			System.out.println(e);
		}
		return false;
	}
	
}
