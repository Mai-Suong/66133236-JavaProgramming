package msuong;

public class NhanVien {
	private String maNV;
	private String hoten;
	private double luongCoBan;
	
	// khoi tao 
	public NhanVien () {
		
	}
	public NhanVien (String maNhanVien, String HoTen, double LuongCB) {
		maNV = maNhanVien;
		hoten = HoTen;
		luongCoBan = LuongCB;
		
	}
	public double tinhLuong () {
		return luongCoBan;
	}
	//public String toString () {
		//return "NhanVien [maN=" + maNV + ", hoten=" + hoten + ", luongCoBan= ]" + luongCoBan ];
	}
//}
