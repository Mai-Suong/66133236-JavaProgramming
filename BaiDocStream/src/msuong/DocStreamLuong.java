package msuong;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DocStreamLuong {

	public static void main(String[] args) throws IOException {
//		Khai bao bien doi tuong InputStreamReader
		InputStreamReader input = new InputStreamReader(System.in);
		
//		khai bao bien doi tuong buffer
		BufferedReader buffe = new BufferedReader(input);
		
//		In mot cau huong dan de nguoi dung biet can lam gi
		System.out.print("Moi nhap mot chuoi bat ky: ");
		
//		doc du lieu tu ban phim, cat vao bien chuoi
		String lineDocDuLieu = buffe.readLine();
		
//		in ra dong doc du lieu
		System.out.print(lineDocDuLieu);
	}

}
