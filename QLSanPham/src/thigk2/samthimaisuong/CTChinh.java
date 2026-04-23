package thigk2.samthimaisuong;

import java.util.Scanner;

public class CTChinh {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<SanPham> dsSP = new ArrayList<SanPham>();
		
		//hard-code 3 san pham vao danh sach
		dsSP.add(new SanPham("SP01", "VitaminC", "Thực phẩm chức năng", 15000));
		dsSP.add(new SanPham("SP02", "Bánh mì", "Thực phẩm", 10000));
		dsSP.add(new SanPham("SP03", "Dầu cá Omega 3", "Thực phẩm chức năng", 30000));
		
		//them moi mot san pham vao danh sach, cac thong tin nhap vao tu ban phim
		
		//in lai ra man hinh danh sach cac san pham
		
		//in lai ra danh sach cac san pham co loai la "Thực phẩm chức năng"
		
	}

}
