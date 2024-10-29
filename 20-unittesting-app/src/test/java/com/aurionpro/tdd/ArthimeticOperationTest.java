package com.aurionpro.tdd;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;

class ArthimeticOperationTest {

	private ArthimeticOperation operation;
	
	@BeforeEach
	void init() {
		operation = 	new ArthimeticOperation();
	}
	@AfterAll
	 static void acknowledge() {
		System.out.println("All test case passed!");
	}
	
	@Test
	void testAddition() {
		
		assertEquals(10,operation.addition(5, 5));
		
	}

	@Test
	void testSubtraction() {
		
		assertEquals(0,operation.subtraction(5, 5));
	}

	@Test
	void testDivision() {
		
		assertThrows(ArithmeticException.class,()->operation.divison(5, 0) );
		}

}
