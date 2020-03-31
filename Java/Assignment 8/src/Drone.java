//

/**
 * This class is Drone. 
 * 
 * @Description: .
 * @author: DoTienAnh
 * @create_date: Mar 28, 2020
 * @version: 1.0
 * @modifer: DoTienAnh
 * @modifer_date: Mar 28, 2020
 */
public class Drone extends Bee {
	
	public boolean checkHealthStatus() {
		super.checkHealthStatus();
		if(getHealth() < 50) {
			return false;
		} else {
			return true;
		}
	}

}
