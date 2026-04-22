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
		sc.nextLine();
			// goi vao bien hs3
		hs3.setTuoiHS(tuoiHS3);

		// Hoi nguoi dung nhap vao lop
		System.out.println("Moi nhap lop hoc sinh 3: ");
		String lopHS3 = sc.nextLine();
			// goi vao bien hs3
		hs3.setLopHS(lopHS3);
		
		//in hoc sinh ra man hinh
		System.out.print(hs3.toString());

		
		//3.a Nhap ds n hoc sinh
		ArrayList<HocSinh> dsHS = new ArrayList<HocSinh>();
			//nhap n
		int N = 4; //nhap n tu ban phim
		
		for (int i=0; i<N; i++) {
			HocSinh hsi = new HocSinh();
			
			// Hoi nguoi dung nhap vao ten
			System.out.println("\nMoi nhap ten hoc sinh: " + i);
			String tenHSi = sc.nextLine();
			hsi.setTenHS(tenHSi);
			
			// Hoi nguoi dung nhap vao ten
			System.out.println("Moi nhap tuoi hoc sinh: " + i);
			short tuoiHSi = sc.nextShort();
			sc.nextLine();
			hsi.setTuoiHS(tuoiHSi);
			
			// Hoi nguoi dung nhap vao ten
			System.out.println("Moi nhap lop hoc sinh: " + i);
			String lopHSi = sc.nextLine();
			hsi.setLopHS(lopHSi);
			
				//dua vao ds
			dsHS.add(hsi);
		}
		
		
		//In ra 
		for (int i = 0; i < N; i++) {
			System.out.println(dsHS.get(i).toString());
			
		}
		//4
			//bo sung them
		System.out.println("Nhap hoc sinh them");
		HocSinh hsThem = new HocSinh();
		
		//nhap tu ban phim
		System.out.println("Nhap ten can them: ");
		hsThem.setTenHS(sc.nextLine());
		
		System.out.println("Nhap tuoi can them: ");
		hsThem.setTuoiHS(sc.nextShort());
		sc.nextLine();
		
		System.out.println("Nhap lop ban can them: ");
		hsThem.setLopHS(sc.nextLine());
		// them vao ds
		dsHS.add(hsThem);
			// xuat ra 
		for (int i = 0; i < dsHS.size(); i++) {
			System.out.println(dsHS.get(i).toString());
		}
		
		
		//5 
			//tim va xoa hoc sinh ten Hoa
		System.out.println("Tim va xoa ban ten Hoa");
		for (int i=0; i<dsHS.size(); i++) {
			// dung equalsIgnoreCase de gõ Hoa hay hoa may cung hieu
			if (dsHS.get(i).getTenHS().equals("Hoa")) {
				dsHS.remove(i);
				System.out.println("Da xoa ban Hoa!");
				break;
			}
		}
			//xuat lai ds 
		System.out.println("Danh sach cuoi cung la: ");
		for (int i=0; i<dsHS.size(); i++) {
			System.out.println(dsHS.get(i).toString());
		}
	}

}
