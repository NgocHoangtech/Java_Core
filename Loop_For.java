package tuhocjava;

public class Loop_For {
	public static void main(String[] args) {
		// Ví dụ in ra câu "Em hứa sẽ chép phạt 3000 lần ( lặp lại 3000 lần ) "
		for(int i = 1; i <= 3000; i++) {
			System.out.println("Em hứa sẽ chép phạt" + ":" +i);
		}
		
		// Ví dụ in ra bảng cửu chương từ 2 - 9
		// Khai báo For bên ngoài trước 
		for(int n = 2; n <= 9; n++) {
			// Khai báo for bên trong
			for(int j = 1; j <= 10; j++) {
			  // In ra bảng cửu chương
				System.out.println(n+ "x" +j+ "=" + (n * j));
			}
			System.out.println("-----");
		}
	}

}
