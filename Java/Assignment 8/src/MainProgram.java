//
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * This class is main. 
 * 
 * @Description: .
 * @author: DoTienAnh
 * @create_date: Mar 28, 2020
 * @version: 1.0
 * @modifer: DoTienAnh
 * @modifer_date: Mar 28, 2020
 */
public class MainProgram {
	
	static Random random = new Random();
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Function function = new Function();
		List<Bee> bee = new ArrayList<>();
		
		while (true) {
			System.out.println("**********MENU**********");
			System.out.println("1. Create bee list.");
			System.out.println("2. Attack Bee.");
			System.out.println("3. Exit.");
			System.out.print("Please choose: ");
			int choose = ScannerUtil.readInt(scanner, "Please input data as INTEGER!: ");

			switch (choose) {
			case 1:
				function.removeList(bee);
				function.createBeeList(bee);
				function.showStatus(bee);
				break;
			case 2:
				if (bee == null) {
					System.out.println("PLEASE CREATE LIST BEE FIRST!");
					break;
				} else {
					function.attackBee(bee);
					function.showStatus(bee);
					break;
				}
			case 3:
				System.exit(0);
			default:
				System.out.println("------------------------------");
				System.out.println("PLEASE CHOOSE FROM 1 --> 3!");
				break;
			}

		}
	}

}
