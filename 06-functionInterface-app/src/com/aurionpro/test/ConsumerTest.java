package com.aurionpro.test;

import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class ConsumerTest {

	public static void main(String[] args) {
		
		Consumer<Integer> factorialConsumer =(number)->{
			int fact =1 ;
			
			for(int i = 1; i<=number;i++) 
				fact *= i;
			
			System.out.println(fact);
		};
		
		
		factorialConsumer.accept(5);
		
		BiConsumer<Integer,Integer> factorialBiConsumer =(number1,number2)->{
			int sum =0;
			sum = number1+number2;
			
			System.out.println(sum);
			
		};
		factorialBiConsumer.accept(2, 3);
		
		
		
		Supplier<Integer> randomNumberSupplier =()-> (new Random()).nextInt();
	
		System.out.println(randomNumberSupplier.get());
		
		
		Predicate<Integer> evenPredicate=(number)->{
				if(number%2  ==0)
					return true;
				return false;
		};
		
		System.out.println(evenPredicate.test(2));
		
		
		BiPredicate<Integer,Integer> evenBPredicate=(number1,number2)->{
				if(number1 < number2) // number 1 should be smaller than number 2
					return true;
				return false;
		};
		System.out.println(evenBPredicate.test(2,3));
		
		
		
		Function<Integer,Boolean> isNegativeFunction=(number)->{
			if(number>0)
				return false;
			return true;
			
		};
		System.out.println(isNegativeFunction.apply(-3));
		
		BiFunction<Integer,Integer,Boolean> isNegativeBiFunction=(number1,number2)->{
			if(number1>0 & number2 >0)
				return false;
			return true;
			
		};
		
	}
	
}