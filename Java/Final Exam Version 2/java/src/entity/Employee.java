//
package entity;

import java.util.Scanner;
import utils.*;

/**
 * This class is employee. 
 * 
 * @Description: .
 * @author: DoTienAnh
 * @create_date: Mar 30, 2020
 * @version: 1.0
 * @modifer: DoTienAnh
 * @modifer_date: Mar 30, 2020
 */
public class Employee {
	
	private User user;
	private int idEmployee;
	private String projectName;
	private String proSkill;
	
	/**
	 * @return the User
	 */
	public User getUser() {
		return user;
	}
	
	/**
	 * @param User the User to set
	 */
	public void setUser(User user) {
		this.user = user;
	}
	
	/**
	 * @return the IdEmployee
	 */
	public int getIdEmployee() {
		return idEmployee;
	}
	
	/**
	 * @param IdEmployee the IdEmployee to set
	 */
	public void setIdEmployee(int idEmployee) {
		this.idEmployee = idEmployee;
	}
	
	/**
	 * @return the ProjectName
	 */
	public String getProjectName() {
		return projectName;
	}
	
	/**
	 * @param ProjectName the ProjectName to set
	 */
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	/**
	 * @return the ProSkill
	 */
	public String getProSkill() {
		return proSkill;
	}
	
	/**
	 * @param ProSkill the ProSkill to set
	 */
	public void setProSkill(String proSkill) {
		this.proSkill = proSkill;
	}
	
	/**
	 * 
	 * This method is used to input data.
	 *
	 * @Description: .
	 * @author: DoTienAnh
	 * @create_date: Mar 30, 2020
	 * @version: 1.0
	 * @modifer: DoTienAnh
	 * @modifer_date: Mar 30, 2020
	 * @param user
	 */
	public void input(User user) {
		Scanner scanner = new Scanner(System.in);
		this.user = user;
		System.out.println("Project Name: ");
		projectName = Check.readProjectName(scanner, "Please input data as String! \nPlease input again: ");
		System.out.println("Pro Skill:");
		proSkill = ScannerUtil.readString(scanner, "Please input data as String! \nPlease input again: ");
	}

}
