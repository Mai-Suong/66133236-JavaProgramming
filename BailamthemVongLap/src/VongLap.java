import java.util.Iterator;
import java.util.Scanner;

public class VongLap {

	public static void main(String[] args) {
		// Tính tổng các số chẵn trong khoảng từ 1 đến n
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhap so nguyen n: ");
		int n = sc.nextInt();
		int tong = 0;
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) {
				tong += i;
			}
		}
		System.out.println("Tổng các số chẵn từ 1 đến " + n + " là: " + tong);
		sc.close();

	}

}
