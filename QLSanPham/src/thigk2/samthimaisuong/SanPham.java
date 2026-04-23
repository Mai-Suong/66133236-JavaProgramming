package thigk2.samthimaisuong;

public class SanPham {
	private String maSP;
	private String tenSP;
	private String loaiSP;
	private double giaBan;
	
	//ham khoi tao khong tham so
	public SanPham() { }
	
	// ham khoi tao co tham so
	public SanPham(String maSP, String tenSP, String loaiSP, double giaBan) {
		this.maSP = maSP;
		this.tenSP = tenSP;
		this.loaiSP = loaiSP;
		this.giaBan = giaBan;
	}

	// cac getter va setter
	public String getMaSP() {
		return maSP;
	}

	public void setMaSP(String maSP) {
		this.maSP = maSP;
	}

	public String getTenSP() {
		return tenSP;
	}

	public void setTenSP(String tenSP) {
		this.tenSP = tenSP;
	}

	public String getLoaiSP() {
		return loaiSP;
	}

	public void setLoaiSP(String loaiSP) {
		this.loaiSP = loaiSP;
	}

	public double getGiaBan() {
		return giaBan;
	}

	public void setGiaBan(double giaBan) {
		this.giaBan = giaBan;
	}

	//phuog thuc toString
	@Override
	public String toString() {
		return "Ma san pham: " + maSP + "\nTen san pham: " + tenSP + "Loai san pham: " + loaiSP + "Gia ban: " + giaBan;
	}		
}
