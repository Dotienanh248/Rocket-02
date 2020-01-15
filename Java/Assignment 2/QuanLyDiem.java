import java.util.Random;

public class QuanLyDiem {
	public static void main(String[] args) {
		// 1. Tạo tên của sinh viên:
		String[] ho = {"Dinh","Trieu","Ngo","Tran","Lang","Luong","Hoang","Cu","Nguyen"};
		String[] dem = {"Thanh","Ha","Hai","Lo","Hoang","Hanh","Nhung","Ba","Van"};
		String[] ten = {"Duong","Duc","Chi","Bao","Chung","Giang","Danh","Huy","Anh"};
		String[] hovaten = new String[10];
		Random random = new Random();
		for(int i=1; i<=10; i++) {
			int numberFirstname = random.nextInt(7);
			int numberMiddleName = random.nextInt(7);
			int numberName = random.nextInt(7);
			hovaten[i] = ho[numberFirstname]+" " + dem[numberMiddleName] +" "+ ten[numberName];
		}
		
		// 2. Tạo ID của sinh viên:
		int numberID = 1000000;
		String[] ID = new String[10];
		for(int i=1; i<=10; i++) {
			ID[i] = "SV" + numberID;
			numberID ++;
		}
		
		// 3. Tạo ngày sinh của sinh viên:
		String[] birthDate = new String[10];
		for(int i=0; i<10; i++){
			int birthMonth = 2 + random.nextInt(11);
			int birthDay = 0;
			switch (birthMonth){
			case 2:
				birthDay = 1+ random.nextInt(28);
				break;
			case 3:
				birthDay = 1+ random.nextInt(31);
				break;
			case 4:
				birthDay = 1+ random.nextInt(30);
				break;
			case 5:
				birthDay = 1+ random.nextInt(31);
				break;
			case 6:
				birthDay = 1+ random.nextInt(30);
				break;
			case 7:
				birthDay = 1+ random.nextInt(31);
				break;
			case 8:
				birthDay = 1+ random.nextInt(31);
				break;
			case 9:
				birthDay = 1+ random.nextInt(30);
				break;
			case 10:
				birthDay = 1+ random.nextInt(31);
				break;
			case 11:
				birthDay = 1+ random.nextInt(30);
				break;
			case 12:
				birthDay = 1+ random.nextInt(31);
				break;		
			}
			birthDate[i] = birthDay +"/" + birthMonth+"/" + "1991";
		}
		
		// 4. In thông tin trên ra màn hình:
		System.out.println("________________________________________________");
		System.out.println("Ho va ten		  ID		Date");
		System.out.println("_________________________________________________");
		for(int i=0; i<10; i++) {
			System.out.println(hovaten[i] + ID[i] + birthDate[i] );
		}
		System.out.println("_________________________________________________");
		
	}
}