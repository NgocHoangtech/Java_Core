package tuhocjava;
import java.util.Scanner;
public class Loop_While {
	public static void main(String[] args) {
		// Ví dụ kiểm tra nhập điểm cho đến khi nhập đúng ( 0 - 10 )
		Scanner sc = new Scanner(System.in);
		double diem; // Khai báo 
		
	    System.out.println("Nhập điểm từ (0 - 10): ");
	    diem = sc.nextDouble();
	    
	    // Kiểm tra
	    while(diem < 0 || diem > 10) // Điều kiện nhỏ hơn 0 hoặc lớn hơn 10 
	    { 
	    	System.out.println("Điểm không hợp lệ! Vui lòng nhập lại:");
	    	System.out.println("Nhập điểm từ (0 - 10): ");
	    	diem = sc.nextDouble();	
	    }
	    System.out.println("Điểm hợp lệ là: " + diem);
	    sc.close();
	}
}
