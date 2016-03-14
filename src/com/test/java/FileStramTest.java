package com.test.java;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileStramTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	static void readByteFile(){
		try {
			FileOutputStream out = new FileOutputStream("F:\\java\\stream.txt");
			String str = "testfilestream";
			byte[] buffer = str.getBytes();
			out.write(buffer);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
		

}
