package com.aurionpro.oops_poc_test;


abstract class Bike{  
	  abstract void run();  
	}  

class Honda4 extends Bike{  
	void run(){
		System.out.println(" Honda is running safely");
		}  

	}  

class Splendor extends Bike{  
	void run(){
		System.out.println(" Splendor is running safely");
		}  

	}  

public class Abstraction {
	public static void main(String args[]){ 
	 Bike obj = new Honda4();  
	 obj.run(); 
	
	
	}
	
	
}
