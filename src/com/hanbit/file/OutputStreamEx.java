package com.hanbit.file;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class OutputStreamEx {
	public static void main(String[] args) {
		
		try {
			File f = new File("test.txt");
			if(!f.exists()) {
				f.mkdirs();
			}
			FileOutputStream fos = new FileOutputStream("test.txt");
			String message = "Hello world!";
			fos.write(message.getBytes());
			
		} catch (Exception err) {
			err.printStackTrace();
		}
	}
}
