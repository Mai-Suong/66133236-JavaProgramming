package thigk2.samthimaisuong;

import java.util.Scanner;

public class ChuViDienTich {

	public static void main(String[] args) {
		//nhập dữ liệu từ bàn phím
		Scanner sc = new Scanner(System.in);
		
		//a. Hỏi người dùng về thông tin về tọa độ góc Tren-Trái(x1, y1) và Dưới-Phải(x2, y2) của hình chữ nhật
		System.out.println("Nhập tọa độ hình chữ nhật");
		
		System.out.println("Nhập x1: ");
		double x1 = sc.nextDouble();
		sc.nextLine();
		System.out.println("Nhập y1: ");
		double y1 = sc.nextDouble();
		sc.nextLine();
		
		System.out.println("Nhập x2: ");
		double x2 = sc.nextDouble();
		sc.nextLine();
		System.out.println("Nhập y2: ");
		double y2 = sc.nextDouble();
		sc.nextLine();
		
		//tính chiều dài và chiều rộng
		// dùng Math.abs để lấy giá trị tuyệt đối, tránh số âm
		double chieuDai = Math.abs(x2 - x1);
		double chieuRong = Math.abs(y2 - y1);
		
		//b. Tính toán và xuất kết quả
		double chuVi = (chieuDai + chieuRong) * 2;
		double dienTich = chieuDai * chieuRong;
		
		System.out.println("Kết quả");
		System.out.println("Chiều dài = " + chieuDai);
		System.out.println("Chiều rộng = " + chieuRong);
		System.out.println("Chu vi hình chữ nhật = " + chuVi);
		System.out.println("Diện tích hình chữ nhật = " + dienTich);
	}

}
