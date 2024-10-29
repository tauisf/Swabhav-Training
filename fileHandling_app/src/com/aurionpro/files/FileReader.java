package com.aurionpro.files;

import java.io.FileInputStream;

import java.io.IOException;


public class FileReader {

	public static void main(String[] args) throws IOException {
		String path = "C:\\Users\\user\\Desktop\\swabhavaurotraning\\core java\\fileHandling_app\\src\\com\\aurionpro\\files\\demo"; 
		FileInputStream inputStream = new FileInputStream(path);
		int ch;
		int countChar = 0;
		int countWords = 1;
		int countLines = 1;
		while((ch= inputStream.read())!= -1) {
			if((char)ch != ' ' ) {
			countChar++;
			}
			if((char)ch == ' ' || (char)ch == '\t' || (char)ch == '\n') {
				countWords++;
				
			}
			if((char)ch == '\n') {
				countLines++;
			}
		}
		System.out.println("The Number of the Chars in files is: "+countChar);
		System.out.println("The Number of the Words in files is: "+countWords);
		System.out.println("The Number of the Lines in files is: "+countLines);
		inputStream.close();

	}

}
