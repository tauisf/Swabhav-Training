package com.trying.test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;



public class FileOutputStream {

	public static void main(String[] args) {
		  List<String> contents = Arrays.asList("apple", "banana", "cherry", "date"); 

//		  try {
//			    FileOutputStream fos = new FileOutputStream("output");
//			    ObjectOutputStream oos = new ObjectOutputStream(fos); 
//			    for(String content : contents) {
//			    oos.write(content); 
//			    oos.close(); 
//			    }
//			} catch(Exception ex) {
//			    ex.printStackTrace();
//			}
//			
		  
		  try (BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"))) { 
	            for (String line : contents) { 
	                // Write each element of the list 
	                // to a new line in the output.txt file 
	                bw.write(line); 
	                bw.newLine(); 
	            } 
	        } catch (IOException e) { 
	            // Print the stack trace  
	            // if an IO exception occurs 
	            e.printStackTrace(); 
	        } 
	    } 
	}


