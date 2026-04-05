package msuong;

public class SinhVienNTU {
	private String hovaTen;
	private String Lop;
	
	public SinhVienNTU(String hovaTen, String Lop) {
		this.hovaTen = hovaTen;
		this.Lop = Lop;
	}
	public static String TEN_TRUONG = "ĐẠI HỌC NHA TRANG";
	
	public static void Hi() {
		System.out.println("Hi, I'm an NTU Student");
		
	}
	public void Hello() {
		System.out.println("Hello, I am an NTU Student: \nTen la: " + hovaTen + "\nLop: " + Lop);
	}
	
	public String getHovaTen() {
		return hovaTen;
	}
	public void setHovaTen(String hovaTen) {
		this.hovaTen = hovaTen;
	}
	public String getLop() {
		return Lop;
	}
	public void setLop(String lop) {
		Lop = lop;
	}
	public static String getTEN_TRUONG() {
		return TEN_TRUONG;
	}
	public static void setTEN_TRUONG(String tEN_TRUONG) {
		TEN_TRUONG = tEN_TRUONG;
	}
}
