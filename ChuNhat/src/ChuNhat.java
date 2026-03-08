
public class ChuNhat {
	private double dai;
	private double rong;
	
	public ChuNhat() {
		dai = 5;
		rong = 7;
	}
	public ChuNhat(double cdai, double crong) {
		dai = cdai;
		rong = crong;
		
	}
	double getDai(double cdai) {
		return cdai;
	}
	double getRong(double crong) {
		return crong;
	}
	void setDai(double cdai) {
		dai = cdai;
	}
	void setRong(double crong) {
		rong = crong;
	}

}
