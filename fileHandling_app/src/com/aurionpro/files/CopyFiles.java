package com.aurionpro.files;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFiles {

	public static void main(String[] args) throws IOException  {
		String path = "C:\\Users\\user\\Desktop\\swabhavaurotraning\\core java\\fileHandling_app\\src\\com\\aurionpro\\files\\demo"; 
		FileInputStream inputStream = new FileInputStream(path);
		FileOutputStream outputStream =  new FileOutputStream("Demo2");
		int ch;
		
		while((ch= inputStream.read())!= -1) {
			outputStream.write(ch); 
			
		
		}
		System.out.print("File Copied Scuccesfully");
		outputStream.close();
		inputStream.close();
	}
}
