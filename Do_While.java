package tuhocjava;

import java.util.Scanner;

import org.w3c.dom.ls.LSOutput;

public class Do_While {
	public static void main(String[] args) {
		// Ví dụ kiểm tra điểm từ 0 - 10
		Scanner sc = new Scanner(System.in);
		double diem;
		
		// Thực hiện Do_While
		do {
			System.out.println("Nhập điểm (0 - 10): ");
			diem = sc.nextDouble();
		 
		if(diem < 0 || diem > 10) {
			System.out.println("Điểm không hợp lệ! Nhập lại");
		}
		//Kiểm tra điều kiện 
	} while(diem >= 0 || diem < 9);
		System.out.println("Điểm hợp lệ là: " + diem);
		sc.close();
		
	
}
	

}
