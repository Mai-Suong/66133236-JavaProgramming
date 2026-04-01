package msuong;

import java.util.ArrayList;
import java.util.Scanner;

public class CTChinh {

	public static void main(String[] args) {
		//2.a Tao moi 2 hsinh
		HocSinh hs1 = new HocSinh();
		
		String tenHS1 ="Nguyen Van Le";
		hs1.setTenHS(tenHS1);
		
		short tuoiHS1 = 10;
		hs1.setTuoiHS(tuoiHS1);
		
		String lopHS1 = "lop 5B";
		hs1.setLopHS(lopHS1);
		
		HocSinh hs2 = new HocSinh("Le Van An", (short)18, "12A");
		// in ra man hinh 
		System.out.println(hs1.toString());
//		System.out.println(hs2.toString());
		
		System.out.println("Ten hoc sinh 2 la: " +hs2.getTenHS());
		System.out.println("Tuoi hoc sinh 2 la: " +hs2.getTuoiHS());
		System.out.println("Lop hoc sinh 2 la: " +hs2.getLopHS());
		
		
		//2.b Nhap du lieu tu BAN PHIM
		Scanner sc = new Scanner(System.in);
			//Nhap du lieu cho hoc sinh t3
		HocSinh hs3 = new HocSinh();
		
			// Hoi nguoi dung nhap vao ten
		System.out.print("Moi nhap ten hoc sinh 3: ");
		String tenHS3 = sc.nextLine();
			// goi vao bien hs3
		hs3.setTenHS(tenHS3);
		
		// Hoi nguoi dung nhap vao tuoi
		System.out.print("Moi nhap tuoi hoc sinh 3: ");
		short tuoiHS3 = sc.nextShort();
			// goi vao bien hs3
		hs3.setTuoiHS(tuoiHS3);

		// Hoi nguoi dung nhap vao lop
		System.out.print("Moi nhap lop hoc sinh 3: ");
		String lopHS3 = sc.nextLine();
			// goi vao bien hs3
		hs3.setLopHS(lopHS3);
		
		//in hoc sinh ra man hinh
		System.out.print(hs3.toString());

		
		//3.a Nhap ds n hoc sinh
		ArrayList<HocSinh> dsHS = new ArrayList<HocSinh>();
			//nhap n
		int N = 3; //nhap n tu ban phim
		
		for (int i=0; i<N; i++) {
			HocSinh hsi = new HocSinh();
			
			// Hoi nguoi dung nhap vao ten
			System.out.print("Moi nhap ten hoc sinh: " + i);
			String tenHSi = sc.nextLine();
			hsi.setTenHS(tenHSi);
			
			// Hoi nguoi dung nhap vao ten
			System.out.print("Moi nhap ten hoc sinh: " + i);
			short tuoiHSi = sc.nextShort();
			hsi.setTuoiHS(tuoiHSi);
			
			// Hoi nguoi dung nhap vao ten
			System.out.print("Moi nhap ten hoc sinh: " + i);
			String lopHSi = sc.nextLine();
			hsi.setLopHS(lopHSi);
			
				//dua vao ds
			dsHS.add(hsi);
		}
		
		
		//In ra 
		for (int i = 0; i < N; i++) {
			System.out.print(dsHS.get(i).toString());
			
		}
		//4
			//bo sung them
		HocSinh hsThem = new HocSinh();
			//nhap tu ban phim
		
		dsHS.add(hsThem);
			// xuat ra 
		
			// in ra
		for (int i = 0; i < N; i++) {
			System.out.print(dsHS.get(i).toString());
		}
		
		
		//5 
			//tim va xoa hoc sinh ten Hoa
		for (int i=0; i<N; i++) {
			HocSinh hsTim = new HocSinh();
			if (hsTim.getTenHS() == "Hoa") {
				dsHS.remove(hsTim);
				break;
			}
		}
			//xuat lai ds 
		for (int i=0; i<N; i++) {
			System.out.print(dsHS.get(i).toString());
		}
	}

}
