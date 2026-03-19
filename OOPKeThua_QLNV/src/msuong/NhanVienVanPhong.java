package msuong;

public class NhanVienVanPhong extends NhanVien{
	private double sogioLamThem;
	private double luongThemGio;
	public NhanVienVanPhong(String maNhanVien, String HoTen, double LuongCB, double sogioLamThem, double luongThemGio) {
		super(maNhanVien, HoTen, LuongCB);
		this.sogioLamThem = sogioLamThem;
		this.luongThemGio = luongThemGio;
	}
	@Override
	public double tinhLuong () {
		return super.getLuongCoBan() + sogioLamThem*luongThemGio;
	}
	@Override 
	public void hienThiThongTin() {
		System.out.println("So gio lam them: " + sogioLamThem);
		System.out.println("Luong moi gio lam them: " + luongThemGio);
		System.out.println("Luong duoc nhan: " + tinhLuong());
	}
	@Override 
	public String toString() {
		String chuoiXuat=super.toString();
		chuoiXuat = chuoiXuat + "\nSo gio lam them: " + sogioLamThem;
		chuoiXuat = chuoiXuat + "\nLuong moi gio lam them: " + luongThemGio;
		chuoiXuat = chuoiXuat + "\nLuong duoc nhan: " + tinhLuong();
		return chuoiXuat;
	}
	
	public double getSogioLamThem() {
		return sogioLamThem;
	}
	public void setSogioLamThem(double sogioLamThem) {
		this.sogioLamThem = sogioLamThem;
	}
	public double getLuongThemGio() {
		return luongThemGio;
	}
	public void setLuongThemGio(double luongThemGio) {
		this.luongThemGio = luongThemGio;
	}
	
	
}
