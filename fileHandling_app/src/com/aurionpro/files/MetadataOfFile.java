package com.aurionpro.files;

import java.io.*;
import java.io.IOException;

public class MetadataOfFile {

	public static void main(String[] args)throws IOException  {
		String path = "C:\\Users\\user\\Desktop\\swabhavaurotraning\\core java\\fileHandling_app\\src\\com\\aurionpro\\files"; 
		File Demo = new File(path);
		 
		if(Demo.isFile()) {
			System.out.println("It is file ");
			System.out.println("The Path od the file is: "+Demo.getPath());
			System.out.println("The Path od the file is: "+Demo.length());
			
			System.out.println("The Permission for Reading the File: "+Demo.canRead());
			System.out.println("The Permission for Writing the file: "+Demo.canWrite());
			System.out.println("The Permission for Executing the file: "+Demo.canExecute());
		}else if(Demo.isDirectory()) {
			
			 File[] array =  Demo.listFiles();
			 int countFiles = 0  ;
			 for(int i =0 ; i< array.length; i++) {
				 countFiles++;
			 }
			 System.out.println("The  Number of file in Directory: "+countFiles);

		}else {
			System.out.println("Something went wrong !!");
		}
	}

}
