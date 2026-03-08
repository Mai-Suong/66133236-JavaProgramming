
public class chuongtrinhChinh {

	public static void main(String[] args) {
		ChuNhat cn1 = new ChuNhat(12,10);
		ChuNhat cn2 = new ChuNhat();
		ChuNhat hv = new ChuNhat(10, 10);
		
		double cn2_dai = cn2.getDai();
		double cn2_rong = cn2.getRong();
		
		System.out.print("Hinh CN2 co chieu dai la ");
		System.out.println(cn2_dai);
		System.out.println("Hinh CN2 co chieu rong la " + cn2_rong);
		
		cn2.setDai(20);
		System.out.println("Sau khi thay doi chieu dai la ");
		cn2_dai = cn2.getDai();
		cn2_rong = cn2.getRong();
		System.out.println("Hinh CN2 co chieu dai la " + cn2_dai);
		System.out.println("Hinh CN2 co chieu rong la " + cn2_rong);
		
		System.out.print(cn2.toString());
	}

}
