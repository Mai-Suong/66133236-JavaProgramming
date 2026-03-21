package msuong;

public class ChuongTrinhChinh {

	public static void main(String[] args) {
		SanPham sp1 = new SanPham();
		SanPham sp2 = new SanPham("01", "Banh", 12000, 2);
		sp1.hienThiThongTin();
		sp2.hienThiThongTin();

	}

}
