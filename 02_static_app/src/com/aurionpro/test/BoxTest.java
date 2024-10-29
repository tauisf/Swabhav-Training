package com.aurionpro.test;

import com.aurionpro.models.Box;

public class BoxTest {

	public static void main(String[] args) {
		Box box1 = new Box();
		
		box1.display();
		box1.increment();
		box1.display();
		
		Box box2 = new Box();
		
		box2.display();
		box2.increment();
		box2.display();
	}

}
