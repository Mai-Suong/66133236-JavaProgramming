public class TienLuong {

	public static void main(String[] args) {
		float gioLam = 8.5f;
		float luongmotGio = 23.4f;		
		float tongLuong = gioLam*luongmotGio;
		if (gioLam > 40) {
			tongLuong = (40 * luongmotGio) + (40 - gioLam);
		} else 
			tongLuong = luongmotGio * gioLam;
		// in ket qua
		System.out.println("So gio lam la: " + gioLam + "gio");
		System.out.println("Luong moi gio la: " + luongmotGio + "k");
		System.out.println("Tong luong la: " + tongLuong + "k");
		
	}

}
