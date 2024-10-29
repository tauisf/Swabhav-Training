package com.aurionpro.oops_poc_test;

class Animal1{  
	void eat(){
		System.out.println("eating...");}  
	}

class Dog1 extends Animal1{  
	void bark(){
		System.out.println("barking...");}  
	}  
class SmallDog extends Dog1{  
	void walk(){
		System.out.println("Walking...");}  
	}  

public class MultilevelInhertirance {

	public static void main(String[] args) {
		SmallDog cat = new SmallDog();
		cat.bark();
		cat.eat();
		cat.walk();
		
		 
	}

}
