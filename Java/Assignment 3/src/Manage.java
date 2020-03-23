import java.util.Random;

public class Manage {
	public static void main(String[] args) {
		
		//Tạo tên của sinh viên:
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
		
		
		//Tạo ID của sinh viên:
		int ID = 1000000;
		String[] studentsID = new String[10];
		for(int i=0; i<10; i++) {
			studentsID[i] = "SV" + ID;
			ID ++;
		}
		
		
		//Tạo ngày sinh của sinh viên:
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

		//Question 1: Tạo điểm của sinh viên:
		//Taọ điểm theo yêu cầu mỗi môn
		float[] RA = new float[10];
		float[] SD = new float[10];
		float[] CP = new float[10];
		float[] CUT = new float[10];
		float[] FMT = new float[10];
		float[] AVG = new float[10];
		
		for(int i=0; i<10; i++) {
			if(i==0) {
				int point = random.nextInt(2) + 8;
				if(point<10) {
					RA[i] = point + 1;
					SD[i] = point;
					CP[i] = point + 1;
					CUT[i] = point + 1;
					FMT[i] = point;
				} else {
					RA[i] = SD[i] = CP[i] = CUT[i] = FMT[i] = point;
				}
			} else if(i<=3) {
				int point = random.nextInt(2) + 5;
				if(point<7) {
					RA[i] = point + 1;
					SD[i] = point;
					CP[i] = point + 1;
					CUT[i] = point + 1;
					FMT[i] = point;
				} else {
					RA[i] = SD[i] = CP[i] = CUT[i] = FMT[i] = point;
				}
			} else if(i<=6) {
				int point = random.nextInt(1) + 3;
				if(point<4) {
					RA[i] = point + 1;
					SD[i] = point;
					CP[i] = point + 1;
					CUT[i] = point + 1;
					FMT[i] = point;
				} else {
					RA[i] = SD[i] = CP[i] = CUT[i] = FMT[i] = point;
				}
			} else if(i<=8) {
				int point = random.nextInt(1) + 1;
				if(point<2) {
					RA[i] = point + 1;
					SD[i] = point;
					CP[i] = point + 1;
					CUT[i] = point + 1;
					FMT[i] = point;
				} else {
					RA[i] = SD[i] = CP[i] = CUT[i] = FMT[i] = point;
				}
			}
		}
		
		//Tạo điểm cho từng sinh viên
		for(int j=0; j<10; j++) {
			int markRA=random.nextInt(10);
			int markSD=random.nextInt(10);
			int markCP=random.nextInt(10);
			int markCUT=random.nextInt(10);
			int markFMT=random.nextInt(10);
			
			float a=RA[j];
			RA[j]=RA[markRA];
			RA[markRA]=a;
			
			float b=SD[j];
			SD[j]=SD[markSD];
			SD[markSD]=b;
			
			float c=CP[j];
			CP[j]=CP[markCP];
			CP[markCP]=c;
			
			float d=CUT[j];
			CUT[j]=CUT[markCUT];
			CUT[markCUT]=d;
			
			float e=FMT[j];
			FMT[j]=FMT[markFMT];
			FMT[markFMT]=e;
			
			AVG[j]=(RA[j]+SD[j]+CP[j]+CUT[j]+FMT[j])/5; 
		}
		
	//Question 2: In thông tin trên ra màn hình (sắp xếp theo điểm trung bình):
	//Sắp xếp theo điểm trung bình
	float temp = AVG[0];
	for(int i=0; i<9; i++) {
		for(int j=1; j<10; j++)
			if(AVG[i] < AVG[j]) {
				temp = AVG[i];
				AVG[i] = AVG[j];
				AVG[j] = AVG[i];
			}
	}
	//In thông tin ra màn hình
	System.out.println("|-----------------|-----------|------------|----|----|----|---|---|---|");
	System.out.println("|    Full Name    |     ID    | Brith Date | RA | SD | CP |CUT|FMT|AVG|");
	System.out.println("|-----------------|-----------|------------|----|----|----|---|---|---|");
	for(int i=0; i<10; i++) {
		System.out.println("|"+fullName[i]+"   | "+studentsID[i]+" |  "+brithDate[i]+" | "+RA[i]+"| "+SD[i]+"| "+CP[i]+"|"+CUT[i]+"|"+FMT[i]+"|"+AVG[i]+"|" );
	}
	System.out.println("-----------------------------------------------------------------");
	}
}
