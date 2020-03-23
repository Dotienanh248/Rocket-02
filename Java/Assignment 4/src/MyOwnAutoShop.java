public class MyOwnAutoShop {
	public static void main(String[] agrs) {
		
//		 a) Tạo 1 instance của class Sedan và khởi tạo tất cả các thuộc tính với giá trị thích hợp.
//		Sử dụng phương thức super(...) trong hàm khởi tạo để khởi tạo các thuộc tính của class cha.
		Sedan sedan = new Sedan(300, 500d, "Red", 15);
		
//		b) Tạo 2 instance của class Ford và khởi tạo tất cả các thuộc tính với giá trị thích hợp.
//		Sử dụng phương thức super(...) trong hàm khởi tạo để khởi tạo các thuộc tính của class cha.
		Ford ford1 = new Ford(350, 500d, "Yellow", 2020, 100);
		Ford ford2 = new Ford(300, 450d, "Red", 2019, 90);
		
//		c) Tạo 1 instance của class Car và khởi tạo tất cả các thuộc tính với giá trị thích hợp.
		Car car = new Car(200, 300d, "Blue");
		
//		d) Hiển thị giá sale của tất cả các instance.
		System.out.println("Sale price of car: " + car.getSalePrice());
		System.out.println("Sale price of sedan: " + sedan.getSalePrice());
		System.out.println("Sale price of ford1: " + ford1.getSalePrice());
		System.out.println("Sale price of ford2: " + ford2.getSalePrice());
	}

}