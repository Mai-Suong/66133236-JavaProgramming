package msuong;

import java.io.*;

public class DocGhiFile {

	public static void main(String[] args) throws IOException {

		String str;
		FileWriter fw = null;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			fw = new FileWriter("D:\\text.txt");
		}
		catch(IOException exc) {
			System.out.print("Khong the mo file");
		}
		
		System.out.print("Nhap ('stop' de ket thuc chuong trinh).");
		do {
			System.out.print(": ");
			str = br.readLine();
			if (str.compareTo("stop") == 0) break;
			str = str + "\r\n";
			fw.write(str);
		} while (str.compareTo("stop") != 0);
		
		fw.close();
	}

}
