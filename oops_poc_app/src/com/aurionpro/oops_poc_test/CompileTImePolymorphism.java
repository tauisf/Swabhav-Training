package com.aurionpro.oops_poc_test;

import com.aurionpro.poc_oop_model.MathsOperation;

public class CompileTImePolymorphism {

	public static void main(String[] args) {
		MathsOperation math = new MathsOperation();
        System.out.println(math.add(5, 10)); //  first method (int)
        System.out.println(math.add(5.5, 10.5)); //  second method (Double)
       
	}

}
