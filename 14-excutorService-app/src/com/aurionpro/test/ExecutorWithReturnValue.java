package com.aurionpro.test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.aurionpro.model.RandomNumberGenerator;
import com.aurionpro.model.Task;

public class ExecutorWithReturnValue {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		int processor =Runtime.getRuntime().availableProcessors();

		ExecutorService service1 = Executors.newScheduledThreadPool(processor);

		for(int i = 0 ; i< 10;i++) {
		Future<Integer> future =	service1.submit( new RandomNumberGenerator());
			System.out.println(future.get());
		}
	
		service1.shutdown();
		
		
		
		System.out.println("\n");
		List<RandomNumberGenerator> generators = new ArrayList<>();
	
		generators.add(new RandomNumberGenerator());
		generators.add(new RandomNumberGenerator());
		generators.add(new RandomNumberGenerator());
		generators.add(new RandomNumberGenerator());
		generators.add(new RandomNumberGenerator());
		
		ExecutorService service = Executors.newScheduledThreadPool(processor);
		List<Future<Integer>> futures =service.invokeAll(generators);
		for(Future future : futures)
			System.out.println(future.get());
		
		
		System.out.println("\n");
		System.out.println(service.invokeAny(generators));
		
	
	
	}
	
	

}
