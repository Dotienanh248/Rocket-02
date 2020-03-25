//
package From;

/**
 * This class is Register Employee. 
 * 
 * @Description: .
 * @author: DoTienAnh
 * @create_date: Mar 25, 2020
 * @version: 1.0
 * @modifer: DoTienAnh
 * @modifer_date: Mar 25, 2020
 */
public class RegisterEmployee {
	
	private int id;
	private String projectName;
	private String proSkill;
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * @param id the id to set
	 * @return 
	 */
	public RegisterEmployee setId(int id) {
		this.id = id;
		return this;
	}
	
	/**
	 * @return the ProjectName
	 */
	public String getProjectName() {
		return projectName;
	}
	
	/**
	 * @param ProjectName the ProjectName to set
	 * @return 
	 */
	public RegisterEmployee setProjectName(String projectName) {
		this.projectName = projectName;
		return this;
	}
	
	/**
	 * @return the ProSkill
	 */
	public String getProSkill() {
		return proSkill;
	}
	
	/**
	 * @param ProSkill the ProSkill to set
	 * @return 
	 */
	public RegisterEmployee setProSkill(String proSkill) {
		this.proSkill = proSkill;
		return this;
	}

}
