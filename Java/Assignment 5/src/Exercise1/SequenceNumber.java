package Exercise1;
import java.util.Scanner;

public class SequenceNumber {
	
	private int[] array;
	
	public void input() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap cac phan tu cua mang: ");
		for(int i=0; i<array.length; i++) {
			System.out.printf("a[%d] = ", i);
			array[i] = scanner.nextInt();
		}
	}
	
	public void print() {
		System.out.print("Cac phan tu cua mang la: ");
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
	
	public SequenceNumber(int n) {
		this.array = new int[n];
	}

}
