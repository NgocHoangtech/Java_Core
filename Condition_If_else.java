package tuhocjava;

import java.util.Scanner;

public class Condition_If_else {
public static void main(String[] args) {
	// Kiểm tra điểm trung bình mình xếp loại học sinh gì
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Nhập điểm trung bình");
	double diemTrungBinh = sc.nextDouble();
	
	// Điều kiện if _ else
	if(diemTrungBinh >= 9 && diemTrungBinh < 10) {
		System.out.println("Học sinh xuất sắc");
	} else if(diemTrungBinh >= 8 && diemTrungBinh < 9) {
		System.out.println("Học sinh giỏi");
	} else if(diemTrungBinh >= 7 && diemTrungBinh <8) {
		System.out.println("Học sinh tiên tiến");
	} else if(diemTrungBinh >= 5 && diemTrungBinh < 6) {
		System.out.println("Học sinh trung bình");
	} else {
		System.out.println("Học sinh yếu");
	}
}
}
