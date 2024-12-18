package com.aurionpro.tdd;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AreaCalculatorTest {

	private AreaCalculator calculator;
	
	@BeforeEach
	void init() {
		calculator =  new AreaCalculator();
	}
	 @Test
	    void testCalculateAreaOfCircle() {
	       
	      
	        assertEquals(78.5,  calculator.CalculateAreaOfCircle(5), "Calculate area of Circle");
	    }

	    @Test
	    void testCalculateAreaOfRectangle() {
	      
	      
	        assertEquals(20,  calculator.CalculateAreaOfRectangle(4, 5),"Calculate area of Rectangle");
	    }

	    @Test
	    void testCalculateAreaOfSquare() {
	      
	      
	        assertEquals(16, calculator.CalculateAreaOfSquare(4), "Calculate area of Square");
	    }
	}

