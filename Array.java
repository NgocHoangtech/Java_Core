package tuhocjava;

import java.util.Scanner;

public class Array {
public static void main(String[] args) {
	// Ví dụ về mảng nhập điểm cho 5 sinh viên và in ra
	Scanner sc = new Scanner(System.in);
	// Khai báo mảng
	int [] diem = new int[5]; // Tạo mảng 5 phần tử
	
	// Nhập điểm
	for(int i = 0; i < diem.length; i++) {
		System.out.println("Nhập điểm sinh viên " + (i + 1) + ":");
		diem[i] = sc.nextInt();
	}
	
	// In ra điểm đã nhập
	System.out.println("Các điểm đã nhập: ");
	for(int i = 0; i < diem.length; i++) {
		System.out.println("Sinh viên " + (i + 1) + ":" + diem[1]);
	}
	sc.close();
}
}
