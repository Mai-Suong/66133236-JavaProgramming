package msuong;

public class ChuongTrinhChinh {

	public static void main(String[] args) {
		NhanVien nv1 = new NhanVien("001", "Sam Thi Mai Suong", 1000000);
//		nv1.hienThiThongTin();
		System.out.println(nv1.toString());
		NhanVienVanPhong nvvp1 = new NhanVienVanPhong("002", "Sam Thi Mai", 1800000, 2, 30000);
		System.out.println(nvvp1.toString());
	
	}
	

}
