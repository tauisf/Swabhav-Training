package com.aurionpro.test;

import com.aurionpro.model.A;
import com.aurionpro.model.B;
import com.aurionpro.model.C;

public class runtimePolymorphismTest {

	public static void main(String[] args) {
		A objA =  new A();
		objA.method();
		
		B objB =  new B();
		objB.method();
		
		objA =	objB;
		objA.method();
		
		
		A objAb =  new B();
		objAb.method();
		
		
		
		A objAc =  new C();
		objAc.method();
		
	}

}