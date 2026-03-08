
public class ChuNhat {
	private double dai;
	private double rong;
	
	public ChuNhat() {
		dai = 5;
		rong = 7;
	}
	public ChuNhat(double dai, double rong) {
		this.dai = dai;
		this.rong = rong;
		
	}
	double getDai() {
		return dai;
	}
	double getRong() {
		return rong;
	}
	void setDai(double cdai) {
		dai = cdai;
	}
	void setRong(double crong) {
		rong = crong;
	}
	// phương thức tostring
	public String toString() {
		String s = "Hinh nay co chieu dai = " + dai + " va chieu rong = " + rong;
		return s;
	}

}
