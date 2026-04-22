package msuong;

public class HocSinh {
	//thuoc tinh
	private String tenHS;
	private short tuoiHS;
	private String lopHS;
	
	//ham tao
	public HocSinh() {
		
	}
	
	public HocSinh(String tenHS, short tuoiHS, String lopHS) {
		super();
		this.tenHS = tenHS;
		this.tuoiHS = tuoiHS;
		this.lopHS = lopHS;
	}


	//getter, setter
	public String getTenHS() {
		return tenHS;
	}

	public void setTenHS(String tenHS) {
		this.tenHS = tenHS;
	}

	public short getTuoiHS() {
		return tuoiHS;
	}

	public void setTuoiHS(short tuoiHS) {
		this.tuoiHS = tuoiHS;
	}

	public String getLopHS() {
		return lopHS;
	}

	public void setLopHS(String lopHS) {
		this.lopHS = lopHS;
	}

	//toString
	@Override
	public String toString() {
		return "Ten hoc sinh " + tenHS + "\ntuoi hoc sinh= " + tuoiHS + "\nlop hoc sinh= " + lopHS;
	}
	
}
