package com.aurionpro.test;

import com.aurionpro.model.ISayable;

public class Sayabletest {

	public static void main(String[] args) {
		ISayable sayable =()->System.out.println("Lamda Function");

		sayable.say();
		
		ISayable sayable1 = new ISayable() {

			@Override
			public void say() {
				
				System.out.println("I am Anonymus");
			}
			
			
		};
		sayable1.say();
		sayable1.say1();
	}

}
