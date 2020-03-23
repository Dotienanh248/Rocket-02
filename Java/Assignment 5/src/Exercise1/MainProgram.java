package Exercise1;
import java.util.Scanner;

import java.util.Scanner;

import sun.print.resources.serviceui;

public class MainProgram {
	
	public static void main(String[] args) {
		System.out.print("Nhap so phan tu cua mang: ");
		Scanner scanner = new Scanner(System.in);
		int length = scanner.nextInt();
		
		QuickSort sn =new QuickSort(length);
		sn.input();
		sn.print();
	}

}
