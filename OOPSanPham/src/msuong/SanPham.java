package msuong;

public class SanPham {
	private String maSP;
	private String tenSP;
	private double gia;
	private int soLuong;
	
	public SanPham() {
		maSP = "01";
		tenSP = "banh";
		gia = 10000;
		soLuong = 10;
	}
	
	public SanPham(String MaSP, String TenSP, double DonGia, int SoLuong) {
		super();
		maSP = MaSP;
		tenSP = TenSP;
		gia = DonGia;
		soLuong = SoLuong;
	}

	public String getMaSP() {
		return maSP;
	}

	public void setMaSP(String MaSP) {
		if(maSP == null) maSP = "error!";
		else maSP = MaSP;
	}

	public String getTenSP() {
		return tenSP;
	}

	public void setTenSP(String TenSP) {
		tenSP = TenSP;
	}

	public double getGia() {
		return gia;
	}

	public void setGia(double DonGia) {
		if (gia > 0) gia = DonGia;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int SoLuong) {
		if (soLuong >= 0) soLuong = SoLuong;
	}
	public double tinhThanhTien() {
		return gia * soLuong;
	}
	public void hienThiThongTin() {
		System.out.println("Ma san pham: " + maSP);
		System.out.println("Ten san pham: " + tenSP);
		System.out.println("Don gia: " + gia);
		System.out.println("So luong san pham: " + soLuong);
		System.out.println("Thanh tien: " + tinhThanhTien());


	}
	
	

}
