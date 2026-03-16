package msuong;

import java.util.ArrayList;
import java.util.Scanner;

public class runMain {

	public static void main(String[] args) {
		//Khai bao bien
		ArrayList<Integer> dsSoNguyen = new ArrayList<Integer>();
		// a. Nhap 10 phan tu tu ban phim
		Scanner BanPhim = new Scanner(System.in);
		// nhap 1 ptu
	for (int i = 0; i < 10; i++) {
		System.out.print("Moi nhao phan tu thu" + i + ":");
		Integer tam = BanPhim.nextInt();
		// thêm vào cuối ds
		dsSoNguyen.add(tam);
	}
	// b. In ra ds vua nhap
	System.out.print("Danh sach vua nhap la");
	for (int i = 0; i < dsSoNguyen.size(); i++) {
		// lay gtri ptu o vtri i, cat vao bien tam
		Integer tam = dsSoNguyen.get(i);
		System.out.println(tam + " ");
	}
	// cach khac 
	// for (Integer x: dsSoNguyen) {
	// 		System.out.print(x + " ");
	
	// c. Dem so ptu chan
	int slptChan = 0;
	for (Integer x: dsSoNguyen) {
		if (x % 2 == 0) slptChan++;
	}
	System.out.println("So phan tu chan la:" + slptChan);
	// cach khac
	//for (int i = 0; i < dsSoNguyen.size(); i++) {
		//Integer tam = dsSoNguyen.get(i);
		//if (tam % 2 == 0) slptChan = slptChan + 1;
	//}
	
	// d. Tinh tong cac ptu: Thuat toan cong don
	int TongAll = 0;
	for (Integer x: dsSoNguyen) {
		TongAll = TongAll + x;
		
	}
	System.out.println("Tong tat ca cac phan tu la:" + TongAll);

	}
}
