package msuong;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DocStreamLuong {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fInput = new FileInputStream("Baitho.txt");
		
		
//		Khai bao bien doi tuong InputStreamReader
		InputStreamReader input = new InputStreamReader(fInput);
		
//		khai bao bien doi tuong buffer
		BufferedReader buffe = new BufferedReader(input);
		
//		In mot cau huong dan de nguoi dung biet can lam gi
		//System.out.print("Moi nhap mot chuoi bat ky: ");
		
//		doc du lieu tu ban phim, cat vao bien chuoi
		//String lineDocDuLieu = buffe.readLine();
		
		//doc du lieu tu file, cat vao bien chuoi 
		String line1 = buffe.readLine();
//		in ra dong doc du lieu cua file txt
		System.out.print(line1);
		
//		in ra dong doc du lieu
		//System.out.print(lineDocDuLieu);
		
	}

}
