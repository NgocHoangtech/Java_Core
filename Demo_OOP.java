package tuhocjava;


public class Demo_OOP {
	public static void main(String[] args) {
		SinhVien sinhVienA = new SinhVien("Nguyen Van A", "TinHoc A", "19-02-1996"); 
		SinhVien sinhVienB = new SinhVien();
		sinhVienB.setHoten("Nguyen Van B");
		sinhVienB.setLop("TinHoc A");
		sinhVienB.setNgaysinh("02-22-2000");
		
//		GiaoVien giaoVienA = new GiaoVien();
//		giaoVienA.setHoten("Giao Vien A");
//		System.out.println("Kiểm tra " + giaoVienA.getHoten());
		
		HieuTruong hieuTruongA = new HieuTruong("Nguyen Van Hieu Truong A", "Khong co lop", "1990-02-03");
//		hieuTruongA.setHoten("Hieu Truong A");
		System.out.println("Kiểm tra " + hieuTruongA.getHoten());
//		
//		System.out.println("Kiểm tra " + sinhVienA.hoten);
//		System.out.println("Kiểm tra " + sinhVienA.lop);
//		System.out.println("Kiểm tra " + sinhVienA.ngaysinh);
//		
//		System.out.println("Kiểm tra " + sinhVienB.hoten);
	}

}
class GiaoVien extends SinhVien {
	String lopGiangDay;
	String chucVu;
	
	public GiaoVien(String hoten, String ngaysinh,  String lop) {
		// TODO Auto-generated constructor stub
		super(hoten, lop, ngaysinh);
	}
}

class HieuTruong  extends GiaoVien {
	String hoten;
	String lop;
	String ngaysinh;
	String quanLy;
	public HieuTruong(String hoten, String lop, String ngaysinh) {
		// TODO Auto-generated constructor stub
		super(hoten, ngaysinh, lop) ;// Đại diện cho Class Cha 
	}
}

/*
 * Cú pháp tạo đối tương: Class ten_doi_tuong
 */
class SinhVien{
	// Các đối tượng của sinh viên
	String hoten;
	String lop;
	String ngaysinh;
	
	// Phương thức khởi tạo
	public SinhVien(String hoten, String lop, String ngaysinh) // Tham số có giá trị truyền vào
	{
		// TODO Auto-generated constructor stub
		this.hoten = hoten;
		this.lop = lop;
		this.ngaysinh = ngaysinh;
	}
	
	public SinhVien() {} // Phương thức khởi tạo ko có tham số 
	
	// Cách thứ 2 đó là dùng get và set 
	/*
	 * Get sẽ lấy ra giá trị
	 * Set sẽ gán giá trị 
	 */
	public String getHoten() {
		return hoten;
	}

	public void setHoten(String hoten) {
		this.hoten = hoten;
	}

	public String getLop() {
		return lop;
	}

	public void setLop(String lop) {
		this.lop = lop;
	}

	public String getNgaysinh() {
		return ngaysinh;
	}

	public void setNgaysinh(String ngaysinh) {
		this.ngaysinh = ngaysinh;
	}
	
	
	
	
	
}