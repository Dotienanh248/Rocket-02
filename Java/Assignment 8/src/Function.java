//
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * This class is Function. 
 * 
 * @Description: .
 * @author: DoTienAnh
 * @create_date: Mar 28, 2020
 * @version: 1.0
 * @modifer: DoTienAnh
 * @modifer_date: Mar 28, 2020
 */
public class Function {
	
	Random random = new Random();
	Scanner scanner = new Scanner(System.in);
	
	/**
	 * 
	 * This method is used to  remove elements of list Bee.
	 *
	 * @Description: .
	 * @author: DoTienAnh
	 * @create_date: Mar 28, 2020
	 * @version: 1.0
	 * @modifer: DoTienAnh
	 * @modifer_date: Mar 28, 2020
	 * @param bee
	 */
	public void removeList(List<Bee> bee) {
		bee.clear();
	}
	
	/**
	 * 
	 * This method is used create a list of bees.
	 *
	 * @Description: create bee list.
	 * @author: DoTienAnh
	 * @create_date: Mar 28, 2020
	 * @version: 1.0
	 * @modifer: DoTienAnh
	 * @modifer_date: Mar 28, 2020
	 * @param bee
	 */
	public void createBeeList(List<Bee> bee) {
//		List<Bee> bee = new ArrayList<>();
		int n=random.nextInt(11);
		for(int i=0; i<n; i++) {
			int r=random.nextInt(3);
			if(r==0) {
				Queen queen = new Queen();
				bee.add(queen);
			} else if(r==1) {
				Drone drone = new Drone();
				bee.add(drone);
			} else {
				Worker worker = new Worker();
				bee.add(worker);
			}
		}
		System.out.println("THE BEE LIST IS:");
	}
	
	/**
	 * 
	 * This method is used to attack bee .
	 *
	 * @Description: .
	 * @author: DoTienAnh
	 * @create_date: Mar 28, 2020
	 * @version: 1.0
	 * @modifer: DoTienAnh
	 * @modifer_date: Mar 28, 2020
	 * @param bee
	 */
	public void attackBee(List<Bee> bee) {
		for (Bee bees : bee) {
			if(bees instanceof Drone) {
				Drone drone = (Drone) bees;
				if(drone.checkHealthStatus()==true)
					bees.damge(new Random().nextInt(81));
			}
			
			if(bees instanceof Queen) {
				Queen queen = (Queen) bees;
				if(queen.checkHealthStatus()==true)
					bees.damge(new Random().nextInt(81));
			}
			
			
			if(bees instanceof Worker) {
				Worker worker = (Worker) bees;
				if(worker.checkHealthStatus()==true)
					bees.damge(new Random().nextInt(81));
			}

		}
		System.out.println("ATTACK SUCCESSFULLY!");
	}
	
	/**
	 * This method is show status of bees .
	 *
	 * @Description: .
	 * @author: HuongLT
	 * @create_date: Mar 28, 2020
	 * @version: 1.0
	 * @modifer: DoTienAnh
	 * @modifer_date: Mar 28, 2020
	 */
	public void showStatus(List<Bee> bee) {
		int i = 1;
		for (Bee bee1 : bee) {
			if(bee1 instanceof Drone)
				System.out.print(i +":"+ " Drone: ");
			else if(bee1 instanceof Queen)
				System.out.print(i +":"+ " Queen: ");
			else
				System.out.print(i +":"+ " Worker: ");
			i++;
			System.out.println(bee1.getHealth());
			if(bee1.checkHealthStatus()==false)
				System.out.println("Da chet");
		}
		System.out.println("------------------------------\n");
	}
	
}
