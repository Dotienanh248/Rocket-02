import java.util.Random;

public class Manage {
	public static void main(String[] args) {
		
		//Question 1: Tạo tên của sinh viên:
		String[] firstName = new String[] {
				"Do", "Trinh", "Nong", "Pham", "Bui", "Ha", "Vu"
		};
		String[] middleName = new String[] {
				"Tien", "Khanh", "The", "Thu", "Huyen", "Van", "Manh"
		};
		String[] lastName = new String[] {
				"Anh", "Huyen", "Nhat", "Hoai", "Trang", "Tien", "Kien"
		};
		String[] fullName = new String[10];
		Random random = new Random();
		
		for(int i=0; i<10; i++) {
			int numberFristName = random.nextInt(7);
			int numverMidderName = random.nextInt(7);
			int numberLastName = random.nextInt(7);
			fullName[i] = firstName[numberFristName] + " " + middleName[numverMidderName] + " " + lastName[numberLastName];
		}
		
		
		//Question 2: Tạo ID của sinh viên:
		int ID = 1000000;
		String[] studentsID = new String[10];
		for(int i=0; i<10; i++) {
			studentsID[i] = "SV" + ID;
			ID ++;
		}
		
		
		//Question 3: Tạo ngày sinh của sinh viên:
		String[] brithDate = new String[10];
		for(int i=0; i<10; i++) {
			int brithMonth = 2 + random.nextInt(10);
			int brithDay = 0;
			switch(brithMonth) {
			case 2:
				brithDay = 1 + random.nextInt(27);
				break;
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				brithDay = 1 + random.nextInt(30);
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				brithDay = 1 + random.nextInt(29);
				break;
			}
			brithDate[i] = brithDay + "/" + brithMonth + "/" + "1991";
		}
		
		
		//Question 4: In thông tin trên ra màn hình:
		System.out.println("|     " + "Full Name" + "     |    " + "ID" + "     |    " + "Brith Date" + "|");
		System.out.println("|===================|===========|==============|");
		for(int i=0; i<10; i++) {
			System.out.println("|" + fullName[i] + "     |     " + studentsID[i] + "  |    " + brithDate[i] + "|");
		}
	}
}
