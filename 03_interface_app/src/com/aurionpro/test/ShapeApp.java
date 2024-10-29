package com.aurionpro.test;

import com.aurionpro.model.Cricle;
import com.aurionpro.model.Rectangle;
import com.aurionpro.model.Triangle;

public class ShapeApp {

	public static void main(String[] args) {
		Cricle cricle = new Cricle(10);
		cricle.area();
		
		Rectangle rectangle  = new Rectangle(10,20);
		rectangle.area();
		
		Triangle triangle = new Triangle(10 ,20);
		triangle.area();
	}

}
