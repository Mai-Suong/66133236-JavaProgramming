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
		System.out.print("Nhập tên sản phẩm mới");
		SanPham spMoi = new SanPham();
		
		System.out.print("Nhập mã sản phẩm: ");
		spMoi.setMaSP(sc.nextLine());
		
		System.out.print("Nhập tên sản phẩm: ");
		spMoi.setTenSP(sc.nextLine());
		
		System.out.print("Nhập loại sản phẩm: ");
		spMoi.setLoaiSP(sc.nextLine());
		
		System.out.print("Nhập giá bán sản phẩm: ");
		spMoi.setGiaBan(sc.nextDouble());
		sc.nextLine(); // dọn dẹp bộ nhớ dệm sau khi nhập số
		
		dsSP.add(spMoi);
		
		//in lai ra man hinh danh sach cac san pham
		System.out.print("Tất cả sản phẩm");
		for (SanPham sp : dsSP) {
			System.out.print(sp.toString());
		}
		
		//in lai ra danh sach cac san pham co loai la "Thực phẩm chức năng"
		System.out.print("Danh sach thực phẩm chức năng");
		for (SanPham sp : dsSP) {
			// dùng equalsIgnoreCase để so sánh chuỗi chứ không phân biệt hoa thường
			if (sp.getLoaiSP().equalsIgnoreCase("Thực phẩm chức năng")) {
				System.out.print(sp.toString());
			}
		}
		
	}

}
