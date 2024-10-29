package com.aurionpro.oops_poc_test;

import com.aurionpro.poc_oop_model.Dog;
import com.aurionpro.poc_oop_model.AnimalPolymorphism;

public class RunTimePolymorphism {

	
	//upcasting 
	public static void main(String[] args) {
		AnimalPolymorphism smallDog = new Dog(); // creating object of dog class and assigning its 
		 							// refreence to parent class
		 smallDog.sound();
	}

}
