package msuong;

public class CTChinh {

	public static void main(String[] args) {
		// in ra ten truong cua sinh vien NTU
		System.out.println(SinhVienNTU.TEN_TRUONG);
//		in ra Hi
		SinhVienNTU.Hi();
		
		SinhVienNTU sv1 = new SinhVienNTU("Tran Van Le", "CNPM_2");
		SinhVienNTU sv2 = new SinhVienNTU("Nguyen Van Manh", "HTTT_1");
		
		sv1.Hello();
		sv2.Hello();
	}

}
