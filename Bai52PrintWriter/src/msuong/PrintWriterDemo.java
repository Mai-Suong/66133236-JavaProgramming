package msuong;

import java.io.*;

public class PrintWriterDemo {

	public static void main(String[] args) {
		PrintWriter pr = new PrintWriter(System.out, true);
		int i = 10;
		double d = 123.56;
		double r = i + d;
		
		pr.println("Using a PrintWriter");
		pr.println(i);
		pr.println(d);
		pr.println(i + " + " + d + " = " + r);
	}

}
