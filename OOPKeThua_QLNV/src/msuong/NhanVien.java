package msuong;

public class NhanVien {
	private String maNV;
	private String hoten;
	private double luongCoBan;
	
	// khoi tao 
	public NhanVien (String maNhanVien, String HoTen, double LuongCB) {
		maNV = maNhanVien;
		hoten = HoTen;
		luongCoBan = LuongCB;
		
	}
	public NhanVien() {
		super();
	}
	public double tinhLuong () {
		return luongCoBan;
	}
	@Override
	public String toString() {
		String chuoiXuat="";
		chuoiXuat = chuoiXuat + "Ma nv: " + maNV;
		chuoiXuat = chuoiXuat + "Ho ten: " + hoten;
		chuoiXuat = chuoiXuat + "Luong co ban: " + luongCoBan;
		return chuoiXuat;
//		return "NhanVien [maNV=" + maNV + ", hoten=" + hoten + ", luongCoBan=" + luongCoBan + "]";
	}
	public void hienThiThongTin() {
		System.out.println("Ma nv: " + maNV);
		System.out.println("Ho ten: " + hoten);
		System.out.println("Luong co ban: " + luongCoBan);
	}
	public String getMaNV() {
		return maNV;
	}
	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}
	public String getHoten() {
		return hoten;
	}
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	public double getLuongCoBan() {
		return luongCoBan;
	}
	public void setLuongCoBan(double luongCoBan) {
		this.luongCoBan = luongCoBan;
	}
	
	
}
