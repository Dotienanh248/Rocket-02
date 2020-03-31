//

/**
 * This class is Queen. 
 * 
 * @Description: .
 * @author: DoTienAnh
 * @create_date: Mar 28, 2020
 * @version: 1.0
 * @modifer: DoTienAnh
 * @modifer_date: Mar 28, 2020
 */
public class Queen extends Bee {
	
	public boolean checkHealthStatus() {
		super.checkHealthStatus();
		if(getHealth() < 20) {
			return false;
		} else {
			return true;
		}
	}

}
